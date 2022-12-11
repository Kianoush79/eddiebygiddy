package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.EddieGuide;
import utils.CommonMethods;

public class CheckoutPageTest extends CommonMethods {


    @Test
        public void CheckOutProcess() throws InterruptedException {

        HomePage homePage = new HomePage();
        click(homePage.BuyNowBtn);
        EddieGuide eddieGuide=new EddieGuide();
        Select select=new Select(eddieGuide.frequencyDD);
        select.selectByValue("freq");
        Select select1=new Select(eddieGuide.girthDD);
        select1.selectByValue("thicc");
        click(eddieGuide.CheckOutBtn);
        CheckOutPage checkOutPage=new CheckOutPage();
        sendText(checkOutPage.email,"k.kamranpour@yahoo.com");
        //waitForElement(checkOutPage.continueBtn);
        click(checkOutPage.continueBtn);






    }


}