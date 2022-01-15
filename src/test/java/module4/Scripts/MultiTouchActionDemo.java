package module4.Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MultiTouchActionDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		Thread.sleep(2000);
		
		TouchAction ta = new TouchAction(driver);
				
		ta.tap(PointOption.point(544,866)).perform();
		
		Thread.sleep(2000);
		
		// Create a touch Action object that will replicate gesture of first finger
		
		TouchAction ta1 = new TouchAction(driver).longPress(PointOption.point(544, 866))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(351, 368));
		
		// Create a touch Action object that will replicate gesture of 2nd finger
		
		TouchAction ta2 = new TouchAction(driver).longPress(PointOption.point(480, 1041))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
				.moveTo(PointOption.point(424, 1518));
		
		MultiTouchAction mta = new MultiTouchAction(driver);
		
		mta.add(ta1).add(ta2).perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
