package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class HomePage extends CommonMethods {

    @FindBy(xpath ="//a[@id='buy-now-eddie-btn']")
    public WebElement BuyNowBtn;

    public HomePage(){
        PageFactory.initElements(driver,this);

    }


}
