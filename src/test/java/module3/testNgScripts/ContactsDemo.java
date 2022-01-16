package module3.testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ContactsDemo {

	@Parameters({"dName","pName","pVersion","aPackage","aAcitvity","url"})
		
	@Test(priority='1')
	public void contactAppTest(String dName, String pName, 
			String pVersion, String aPackage, String aAcitvity, String url) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities	cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,dName );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,pName );
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,pVersion );
		cap.setCapability("appPackage",aPackage );
		cap.setCapability("appActivity",aAcitvity );
		
		AndroidDriver<MobileElement>		driver = new AndroidDriver<MobileElement>(new URL(url),cap);


    	MobileElement e1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
		           .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                 ".scrollIntoView(new UiSelector().text(\"Y2\"))");
    	
    	e1.click();
    	
		
    	Thread.sleep(3000);
    	
    	

    	driver.findElementById("com.android.contacts:id/icon").click();
    	
    	Thread.sleep(5000);
    	
    	driver.findElementByAccessibilityId("End call").click();
    	
    	
    	Thread.sleep(4000);
    	
    	driver.findElementById("com.android.contacts:id/icon_alternate").click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hello everyone");
    	
    	driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}

}
