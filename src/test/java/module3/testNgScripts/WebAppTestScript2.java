package module3.testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebAppTestScript2 {
	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void startSession() throws MalformedURLException
	{
DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    cap.setCapability("chromedriverExecutable","C:\\Grid\\chromedriver.exe");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@Test(priority='1')
	public void webApptest()
	{
		driver.get("https://www.google.com/");
	
		driver.findElementByXPath("//input[@type='search']").sendKeys("Appium");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	@AfterClass
	public void stopsession()
	{
		System.out.println("webApp Testing complete");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
