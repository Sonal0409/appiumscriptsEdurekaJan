package module3.testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridAppTest {
	
	AndroidDriver<MobileElement> driver ;
	@BeforeClass
	public void startsession() throws MalformedURLException
	{

        DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		// chromeDriverExecutable details have to provided to work with webview
		cap.setCapability("chromedriverExecutable", "C:\\Grid\\chromedriver.exe");
	driver	= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
	}
	
	@Test(priority='1')
	public void HybridTest() throws InterruptedException
	{
		 Thread.sleep(7000);
		// native view
		driver.findElementByXPath("//android.widget.TextView[@text = 'Flipkart']").click();
		
		Thread.sleep(3000);
		Set<String> cns1 =	driver.getContextHandles();
	
	System.out.println(cns1);  // NATIVE_APP, WEBVIEW_chrome
	
	
	driver.context("WEBVIEW_chrome");
	
	
	driver.findElementByXPath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/a[1]/img").click();
		
	}
	
	@AfterClass
	public void closeApp()
	{
		System.out.println("Hybrid App test Completed");
	}
	
	
	
	
	
	
	
	
	
	

}
