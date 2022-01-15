package module5.Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ContactsDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities	cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		
		AndroidDriver<MobileElement>		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);


    	MobileElement e1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
		           .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                 ".scrollIntoView(new UiSelector().text(\"Y2\"))");
    	
    	e1.click();
    	
		
    	Thread.sleep(3000);
    	
    	

    	driver.findElementById("com.android.contacts:id/icon").click();
    	
    	Thread.sleep(5000);
    	
    	driver.findElementByAccessibilityId("End call").click();
    	
    	
    	Thread.sleep(2000);
    	
    	driver.findElementById("com.android.contacts:id/icon_alternate").click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hello everyone");
    	
    	driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}

}
