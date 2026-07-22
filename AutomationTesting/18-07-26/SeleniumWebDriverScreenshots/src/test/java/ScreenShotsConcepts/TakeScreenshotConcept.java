package ScreenShotsConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Open Google
		driver.get("https://www.google.com");

		// Take Screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Create destination file
		File dest = new File("./ScreenShots/GoogleHomePage.png");

		// Copy screenshot to destination
		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot captured successfully.");

		// Close Browser
		driver.quit();
	}
}