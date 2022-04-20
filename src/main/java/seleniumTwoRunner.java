import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTwoRunner {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.in/");

        WebElement webElement = webDriver.findElement(By.cssSelector("[name='field-keywords']"));
        String s_searchItem = "Mobiles";

        webElement.sendKeys(s_searchItem);
        webElement.sendKeys(Keys.ENTER);

        //webDriver.quit();

    }
}
