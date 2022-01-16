package module5.Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformanceData {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	    cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		// chromeDriverExecutable details have to provided to work with webview
		cap.setCapability("chromedriverExecutable", "C:\\Grid\\chromedriver.exe");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		// Test the chrome app --> hybrid ---> native + web view
		
		Thread.sleep(7000);
		

		
		// native view
		driver.findElementByXPath("//android.widget.TextView[@text = 'Flipkart']").click();
		
		Thread.sleep(5000);
		
		// will return number and bnames of contexts that are open in the app right now
	Set<String> cns1 =	driver.getContextHandles();
	
	System.out.println(cns1);  // NATIVE_APP, WEBVIEW_chrome
		
	// switch to webView
	
	driver.context("WEBVIEW_chrome");
	
	// web View
		
	driver.findElementByXPath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/a[1]/img").click();
		
	
	
	List<String> li=	driver.getSupportedPerformanceDataTypes();
	
	
System.out.println(li);
		
		

System.out.println(driver.getPerformanceData("com.android.chrome","batteryinfo",5));
	

		
		
	}

}
