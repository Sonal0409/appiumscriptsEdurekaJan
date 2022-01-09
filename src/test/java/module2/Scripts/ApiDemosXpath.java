package module2.Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosXpath {

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

MobileElement e1 = driver.findElementByXPath("//android.widget.TextView[@text='Views']");

e1.click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	
	Thread.sleep(2000);
	
	driver.findElementByXPath("//android.widget.TextView[@text='People Names']").click();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
