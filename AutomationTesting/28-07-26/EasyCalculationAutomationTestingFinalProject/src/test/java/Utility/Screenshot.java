package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

    public static String captureScreenshot(WebDriver driver, String screenshotName) {

        File folder = new File("./Screenshots");

        if (!folder.exists()) {

            folder.mkdirs();

        }

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String filePath = "./Screenshots/" + screenshotName + "_" + timeStamp + ".png";

        try {

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File(filePath);

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot Saved Successfully");

        }

        catch (IOException e) {

            e.printStackTrace();

        }

        return filePath;

    }

}