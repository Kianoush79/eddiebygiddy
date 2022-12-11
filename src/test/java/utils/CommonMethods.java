package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class CommonMethods {

    public static WebDriver driver;
    public static String Url="http://localhost:3000/";

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){

        //ConfigReader.readProperties(Constants.COFIGURATION_FILEPATH);
        //switch(ConfigReader.getPropertyValue("browser")){

            //case "chrome":
               // WebDriverManager.chromedriver().setup();
               // driver=new ChromeDriver();
               // break;

            //case "firefox":
                //WebDriverManager.firefoxdriver().setup();
               // driver=new FirefoxDriver();
                //break;

           // default:
                //throw new RuntimeException("Invalid browser name");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
         //driver.get(ConfigReader.getPropertyValue("url"));
         //driver.manage().window().maximize();
         //driver.manage().window().maximize();
    public static void sendText(WebElement element,String text){
        element.sendKeys(text);
    }

    public static void click(WebElement element){
        element.click();
    }


    //driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

    public static void erase(WebElement element){
        element.clear();
    }

    //public static WebDriverWait getWait(){
       // WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(20),Duration.ofSeconds(20));
        //return webDriverWait;
    //}

    //public static void waitForElement(WebElement element){
        //waitForElement(getWait().until(ExpectedConditions.elementToBeClickable(element)));
    //}

    @AfterMethod(alwaysRun = true)
    public  void tearDown(){
        driver.quit();
    }
}
