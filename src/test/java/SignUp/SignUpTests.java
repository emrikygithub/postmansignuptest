package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpTests {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://identity.getpostman.com/signup");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("bezeamaku@yahoo.com");
        driver.findElement(By.id("username")).sendKeys("kingsmann2");
        driver.findElement(By.id("password")).sendKeys("boxed4000");
        driver.findElement(By.id("tnc-checkbox")).click();
        driver.findElement(By.id("sign-up-btn")).click();
    }
    public static void main(String[] args) throws InterruptedException {
        SignUpTests test = new SignUpTests();
        test.setUp();

    }
}
