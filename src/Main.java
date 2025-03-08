import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://www.example.com");

        // Get and verify title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Example Domain";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title matched!");
        } else {
            System.out.println("Title didn't match!");
        }

        // Close browser
        driver.quit();
    }
}
