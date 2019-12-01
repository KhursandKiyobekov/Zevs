import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class InstagramSignUpTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeInstagramSignUpTest() throws InterruptedException {
//        Implementation goes here.

        {
            By className = By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/h1");
            driver.findElement(className);
            By fullnameBar = By.name("fullName");
            driver.findElement(fullnameBar).sendKeys("0101");
            By emailBar = By.name("emailOrPhone");
            driver.findElement(emailBar).sendKeys("___@yahoo.com");
            By userName= By.name("username");
            driver.findElement(userName).sendKeys("@@##@@");
            By passwordBar = By.name("password");
            driver.findElement(passwordBar).sendKeys("    ");
        }
    }
}
