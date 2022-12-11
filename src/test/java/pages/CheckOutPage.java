package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CheckOutPage extends CommonMethods {


    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath ="//button[@id='checkout-customer-continue']")
    public WebElement continueBtn;

    public CheckOutPage(){
        PageFactory.initElements(driver,this);

    }









}
