package module3.testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class NativeAppTest {
	
	// test anotation come options
	// priority
	
	AndroidDriver<MobileElement> driver;
	TouchAction ta;
	
	@Parameters({"dName","pName","pVersion","aPackage","aAcitvity","url"})
	
	@BeforeMethod
	public void OpenApp(String dName,String pName, String pVersion, 
			String aPackage, String aAcitvity, String url) throws MalformedURLException
	{
       DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,dName );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,pName );
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,pVersion );
		cap.setCapability("appPackage",aPackage );
		cap.setCapability("appActivity", aAcitvity);
		driver = new AndroidDriver<MobileElement>(new URL(url),cap);
		ta = new TouchAction(driver);
	}
	
	
	@Test(priority='1')
	public void Taptest() throws InterruptedException, MalformedURLException
	{

		Thread.sleep(3000);
		ta.tap(PointOption.point(515, 1000)).perform().tap(PointOption.point(515, 1000)).perform();
	}
	
	
	@Test(priority='2')
	public void tabElementTest() throws MalformedURLException, InterruptedException
	{
        
		Thread.sleep(3000);
		// to tap on an element -- using element Locator
		
		MobileElement e1=	driver.findElementByXPath("//android.widget.TextView[@text='Search here']");
			
			ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(e1))).perform();
			
		
	}
	
	@AfterMethod
	public void closeapp()
	{
		System.out.println("Method executed successfully");
	}
	
	
	
	
	

	
}
