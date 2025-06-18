package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CapabalitiesSet {
	
	
	
	public static String APPIUM_PORT;
	public static int IMPLICIT_WAIT_TIME;
	public static int EXPLICIT_WAIT_TIME;
	public static String BASE_PKG;
	public static String APP_ACTIVITY;
	public static String APP_PATH;
	public static String BROWSER_NAME;
	//public static String PLATFORM_NAME;
	public static String PLATFORM_VERSION;
	public static String DEVICE_NAME;
	public static String UDID;
	public static String BUNDLE_ID;
	public static String APP;
	public static String NO_RESET;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static AndroidDriver driver;
	 public static UiAutomator2Options options = new UiAutomator2Options();
	
//	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
//	        //UiAutomator2Options options = new UiAutomator2Options();
//	        //options.setDeviceName("emulator-5554"); 
//	        //options.setApp("C:\\Users\\SPURGE\\eclipse-workspace\\PDC\\src\\main\\resources\\APK\\app-dev-release.apk"); 
////	        DesiredCapabilities capabilities = new DesiredCapabilities();
////	        
////
//	       // AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//	        
//	        UiAutomator2Options options = new UiAutomator2Options();
//	        options.setPlatformName("Android");
//	        options.setDeviceName("emulator-5554");
//	        options.setPlatformVersion("9");
//	        options.setAppPackage("com.eekifoods.dev");
//	        options.setAppActivity("com.eekifoods.MainActivity");
//
//	        //AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//	 }
//	 
	 public static AndroidDriver setup() throws MalformedURLException {
		 new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("Android");
	        options.setDeviceName("emulator-5554");
	        options.setPlatformVersion("9");
	        options.setAppPackage("com.eekifoods.dev");
	        options.setAppActivity("com.eekifoods.MainActivity");

	        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	        return driver;
	 }
	 
}
