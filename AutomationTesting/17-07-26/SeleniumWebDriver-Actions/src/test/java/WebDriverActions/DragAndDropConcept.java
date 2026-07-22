package WebDriverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropConcept {

    @Test
    public void dragAndDrop() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(4000);

        // Switch to the iframe
        driver.switchTo().frame(0);

        // Locate source and target elements
        WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));

        // Create Actions class object
        Actions action = new Actions(driver);

        // Perform Drag and Drop
        action.clickAndHold(source)
              .moveToElement(target)
              .release()
              .build()
              .perform();

        Thread.sleep(3000);

        driver.quit();
    }
}