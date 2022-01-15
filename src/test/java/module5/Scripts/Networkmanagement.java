package module5.Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Networkmanagement {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		Boolean wifi = driver.getConnection().isWiFiEnabled();
		
		System.out.println(wifi);
		
		driver.toggleWifi();
		
Boolean airplane = driver.getConnection().isAirplaneModeEnabled();
		
		System.out.println(airplane);
		
		driver.toggleAirplaneMode();
		
Boolean mobile = driver.getConnection().isDataEnabled();
		
		System.out.println(mobile);		
		
		
		
		driver.toggleData();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
