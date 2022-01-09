package module4.Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeApiDemos {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
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
		
		Thread.sleep(2000);
		
		//scrolling 3 time or swipe
		
		for(int i=0; i<3;i++)
		{
		ta.longPress(PointOption.point(505,1392))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(469,585))
		.release()
		.perform();
		
		}
		
		
		// tap on seekbar
		
		
		MobileElement e1 = driver.findElementByAccessibilityId("Seek Bar");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(e1))).perform();
		
		
		Thread.sleep(2000);
		
		ta.longPress(new PointOption().withCoordinates(550, 272))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(new PointOption().withCoordinates(758, 272))
		.release()
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
