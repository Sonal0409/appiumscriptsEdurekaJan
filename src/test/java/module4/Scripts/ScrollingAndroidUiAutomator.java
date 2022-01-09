package module4.Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollingAndroidUiAutomator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		Thread.sleep(2000);
		
		TouchAction ta = new TouchAction(driver);
		
		// tap on views
		
		ta.tap(PointOption.point(465,1784)).perform();
		
		// For scrolling lets use the UIautomator framework
		// Class : AndroidUIAutomator
		
		
		MobileElement e1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		".scrollIntoView(new UiSelector().text(\"Seek Bar\"))");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(e1))).perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
