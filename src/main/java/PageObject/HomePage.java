package PageObject;

import Drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /***********
     * Locators
     */
    @FindBy(className = "android.widget.FrameLayout")
    WebElement account;

    public void printing(){
        System.out.println("Printed");
    }

}
