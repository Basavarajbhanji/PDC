package screens;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import utilities.CapabalitiesSet;

import java.net.URL;
import java.time.Duration;

import javax.mail.SendFailedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseScreen;

public class Add_Specimen extends BaseScreen {
	

	       public Add_Specimen(AppiumDriver driver) {
		super(driver);
		
	}
	       
	       
	       public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    	   driver = CapabalitiesSet.setup();

	    	// CapabalitiesSet.setup();
	    	   Thread.sleep(3000);
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"Specimen\"]")).click();
		        Thread.sleep(4000);
			WebElement popup = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		        if(popup.isDisplayed()) {
		        		popup.click();
		        		 
		        	
		        }

				//driver.findElement(By.xpath("com.android.packageinstaller:id/permission_allow_button")).click();
		        Thread.sleep(2000);
		        
		        

				driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"icon-button\"])[2]")).click();
		        Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"dome-0-0\"]")).sendKeys("Test");
		        Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"line-0-1\"]")).sendKeys("1");
		        Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"set-0-2\"]")).sendKeys("2");
		        Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"chamber-0-3\"]")).sendKeys("3");
		        Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"position-0-4\"]")).sendKeys("4");
		        Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Submit\"]")).click();
				System.out.println("App Launched!");
		       // driver.quit();
		}
	       
	    }
	 
	 
	 
	 
	 
	 
	 


