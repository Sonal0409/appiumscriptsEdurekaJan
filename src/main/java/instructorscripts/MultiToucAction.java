package instructorscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;

public class MultiToucAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		

		DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		Thread.sleep(3000);
		
		TouchAction t= new TouchAction(driver);
		
		t.tap(PointOption.point(309,879)).perform();
		
		// Zoom out
		
		// Action perfomed by my finger 1
		TouchAction ta3= new TouchAction(driver).longPress(PointOption.point(540, 790))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(845, 350));
		
		// Action performed by finger 2
		
		TouchAction ta4= new TouchAction(driver).longPress(PointOption.point(410, 1579))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.moveTo(PointOption.point(180,1466));
			
		MultiTouchAction ma = new MultiTouchAction(driver);
		
		
		//ma.add(ta1).add(ta2).perform();
		
		Thread.sleep(2000);	
			
			
		ma.add(ta3).add(ta4).perform();
		
			
	}

}
