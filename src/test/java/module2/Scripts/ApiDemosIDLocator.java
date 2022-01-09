package module2.Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosIDLocator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoSonal");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		// the address of server to which these cap are to be sent
		
	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	
	// 1/ click on preference using ID locator--> but all elements on that page have same id
	
	driver.findElementsById("android:id/text1").get(9).click();
	
	Thread.sleep(1500);
	
	// 2 : click on preference dependencies
	
	driver.findElementsById("android:id/text1").get(2).click();
	
	Thread.sleep(1500);
	
	// 3: click on checkbox
	
	driver.findElementById("android:id/checkbox").click();
	
	Thread.sleep(1500);
	
	// 4. click on wifi setting using ID
	
	driver.findElementsById("android:id/title").get(2).click();
	
	Thread.sleep(1500);
	
	//5. Enter data in the inputfield
	
	driver.findElementById("android:id/edit").sendKeys("sonal");
	Thread.sleep(1500);
	
	//6. click on OK button
	
	driver.findElementById("android:id/button1").click();
	
	Thread.sleep(1500);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
