package module5.Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApptest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    cap.setCapability("chromedriverExecutable","C:\\Grid\\chromedriver.exe");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		// Implicit wait
		
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.google.com/");
		// use devtools on your laptopb browser be giving chrome://inspect
		// you devices will be displayed with browser
		// click on inspect under the webapp you want to test
		// use inspector to inspect the elements
		
		driver.findElementByXPath("//input[@type='search']").sendKeys("Appium");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
// Explicit wait - for a particular element
	
		
	MobileElement e1 =	driver.findElementByXPath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/a/div[2]/div");
		
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	wait.until(ExpectedConditions.visibilityOf(e1));
	
	e1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
