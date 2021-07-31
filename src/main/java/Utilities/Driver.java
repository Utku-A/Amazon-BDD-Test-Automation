package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver setUp() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver","src/main/java/Utilities/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
