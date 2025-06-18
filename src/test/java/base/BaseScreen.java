package base;

import java.util.concurrent.TimeUnit;

import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumDriver;

public class BaseScreen {
	
	
	public static AppiumDriver driver;
	
	
	
	
	public BaseScreen(AppiumDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		this.driver = driver;
		
	}
	
	


}