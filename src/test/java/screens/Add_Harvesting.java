package screens;

import java.net.MalformedURLException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import utilities.CapabalitiesSet; 
import utilities.Scrolls;

public class Add_Harvesting extends BaseScreen{
	
	
	public Add_Harvesting(AppiumDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		for (int i = 1; i <= 50; i++) {
            System.out.println("Running test iteration: " + i);
		driver = CapabalitiesSet.setup();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Harvesting\"]")).click();
		Thread.sleep(2000);

		 try {
             WebElement popup = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
             if (popup.isDisplayed()) {
                 popup.click();
             }
         } catch (Exception e) {
             System.out.println("Permission popup not shown.");
         }
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰐕\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"domes-0-0\"]")).sendKeys("Harvesting");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"line-0-1\"]")).sendKeys("1"); //line
        Thread.sleep(1000);

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-weight-a-1-0\"]")).sendKeys("1");//total weight A
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"excess-weight-a-1-1\"]")).sendKeys("10");//excess weight a
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"loose-weight-a-1-2\"]")).sendKeys("15");//loose weight
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-bags-a-1-3\"]")).sendKeys("20");//total bags
       
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-weight-b-2-0\"]")).sendKeys("25");//total weight B
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"excess-weight-b-2-1\"]")).sendKeys("30");//excess weight B
        Thread.sleep(3000);

       Scrolls.swipeUp(2, (AndroidDriver) driver);
//        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", Map.of(
//        	    "left", 100, "top", 100, "width", 500, "height", 1000,
//        	    "direction", "up",
//        	    "percent", 0.75
//        	));

        Thread.sleep(2000);

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"loose-weight-c-3-2\"]")).sendKeys("35");//loose weight B
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-bags-c-3-3\"]")).sendKeys("40");//total bags
        Scrolls.swipeUp(1, (AndroidDriver) driver);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-weight-c-3-0\"]")).sendKeys("1");//total weight c
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"excess-weight-c-3-1\"]")).sendKeys("10");//excess weight c
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"loose-weight-c-3-2\"]")).sendKeys("15");//loose weight
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-bags-c-3-3\"]")).sendKeys("20");//total bags
        
        Scrolls.swipeUp(2, (AndroidDriver) driver);

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-weight-d-4-0\"]")).sendKeys("1");//total weight c
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"excess-weight-d-4-1\"]")).sendKeys("10");//excess weight c
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"loose-weight-d-4-2\"]")).sendKeys("15");//loose weight
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"total-bags-d-4-3\"]")).sendKeys("20");//total bags
        
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"brix-value-5-0\"]")).sendKeys("15");//bix value
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"remarks-5-1\"]")).sendKeys("test");//remarks
        
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Submit\"]")).click();

        

        


		
		
		}
	}

}
