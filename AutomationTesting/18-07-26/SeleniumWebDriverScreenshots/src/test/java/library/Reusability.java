package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {

	public static void capturedScreenshot(WebDriver driver, String screenShotName) {

		try {
			// Take Screenshot
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);

			// Save Screenshot
			FileUtils.copyFile(source, new File("./ScreenShots/" + screenShotName + ".png"));

			System.out.println("Screenshot captured successfully.");

		} catch (Exception e) {
			System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
	}
}