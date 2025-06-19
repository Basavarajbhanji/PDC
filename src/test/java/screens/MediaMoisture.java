package screens;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import utilities.CapabalitiesSet;

public class MediaMoisture extends BaseScreen {

    public MediaMoisture(AppiumDriver driver) {
        super(driver);
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Running test iteration: " + i);
            driver = CapabalitiesSet.setup(); // Reinitialize driver if needed each time
            Thread.sleep(2000);

            driver.findElement(By.xpath("//android.widget.TextView[@text=\"Media Moisture\"]")).click();
            Thread.sleep(2000);

            try {
                WebElement popup = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
                if (popup.isDisplayed()) {
                    popup.click();
                }
            } catch (Exception e) {
                System.out.println("Permission popup not shown.");
            }

            Thread.sleep(3000);
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰐕\"]")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"dome-0-0\"]")).sendKeys("Dome");
            driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"section-0-1\"]")).sendKeys("10");
            driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"ec-0-2\"]")).sendKeys("10");
            driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"moisture-0-3\"]")).sendKeys("10");
            driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"temperature-0-4\"]")).sendKeys("12");
            driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Submit\"]")).click();

            Thread.sleep(2000); 
            //driver.quit(); 
        }
    }
}
