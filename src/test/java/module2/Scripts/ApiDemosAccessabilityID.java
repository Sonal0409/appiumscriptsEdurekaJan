package module2.Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosAccessabilityID {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo13Dec");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		// the address of server to which these cap are to be sent
		
	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	// Step 1: click on preference menu option
	
	// driver.findElement(usinglocatorname("value").actionmethod();
	
	driver.findElementByAccessibilityId("Preference").click();
	
	driver.findElementByAccessibilityId("3. Preference dependencies").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
