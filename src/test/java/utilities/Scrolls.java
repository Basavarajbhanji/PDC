package utilities;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Scrolls {
	
	
	 public final static PointerInput FINGER = new PointerInput(TOUCH, "finger");

	    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
	        Sequence swipe = new Sequence(FINGER, 1)
	                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
	                .addAction(FINGER.createPointerDown(LEFT.asArg()))
	                .addAction(FINGER.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
	                .addAction(FINGER.createPointerUp(LEFT.asArg()));
	        driver.perform(Arrays.asList(swipe));
	    }

	public static WebElement scrollToTextByAndroidUIAutomator(String text, AndroidDriver driver) {

		return driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ text + "\").instance(0))"));

	}

	public static void swipeUp(int numberOfTimes, AndroidDriver driver) {
		Dimension dimension = driver.manage().window().getSize();
		Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
		Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
		for (int i = 0; i < numberOfTimes; i++) {
		doSwipe(driver, start, end, 1000); 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}

}
