import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearch {
    public static void main(String[] args) {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to OpenCart Demo site
        driver.get("https://demo.opencart.com/");

        // Locate the search box and search button
        WebElement searchBox = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.cssSelector("button.btn.btn-default"));

        // Perform a search for "Laptop"
        searchBox.sendKeys("Laptop");
        searchButton.click();

        // Verify if search results are displayed
        if (driver.getPageSource().contains("Search - Laptop")) {
            System.out.println("Search feature works correctly!");
        } else {
            System.out.println("Search feature failed!");
        }

        // Close the browser
        driver.quit();
    }
}
