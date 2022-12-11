package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EddieGuide extends CommonMethods {

    @FindBy(id ="ddl-freq")
    public WebElement frequencyDD;

    @FindBy(id = "ddl-girth")
    public WebElement girthDD;

    @FindBy(id = "checkout-button")
    public WebElement CheckOutBtn;

    public EddieGuide(){
        PageFactory.initElements(driver,this);
    }

}
