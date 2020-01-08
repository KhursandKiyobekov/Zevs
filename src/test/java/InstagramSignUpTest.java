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

       /*
            By tagName = By.tagName("h1");
            driver.findElement(tagName);
            System.out.println("Found element by tagName");
            By fullnameBar = By.name("FirstName LastName");
            driver.findElement(fullnameBar).sendKeys("0101");
            By emailBar = By.name("emailOrPhone");
            driver.findElement(emailBar).sendKeys("test@example.com");
            By userName= By.name("someUsername");
            driver.findElement(userName).sendKeys("@@##@@");
            By passwordBar = By.name("P@ssw0rd");
            driver.findElement(passwordBar).sendKeys("    ");
        */
            By tagName = By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/h1");
            driver.findElement(tagName);
            System.out.println("Found element by xPath");
            By fullnameBar = By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[4]/div/label/input");
            driver.findElement(fullnameBar).sendKeys("Khursand Kiyobekov");
            By emailBar = By.name("emailOrPhone");
            driver.findElement(emailBar).sendKeys("test@example.com");
            By userName= By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[5]/div/label/input");
            driver.findElement(userName).sendKeys("khurs@nd");
            By passwordBar = By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[6]/div/label/input");
            driver.findElement(passwordBar).sendKeys("1A1a1@1.-");
            By button = By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[7]/div/button");
            driver.findElement(button).click();

           assertEquals("Instagram", driver.findElement(tagName).getText());
           //assertEquals("Full Name", driver.findElement(fullnameBar).getAttribute("Full Name"));
        }
    }
}