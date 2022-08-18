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
     * android:id/button2
     * com.daraz.android:id/intro_skip_btn
     *
     */
    @FindBy(id="android:id/button2")
    WebElement bangla;
    @FindBy(id="com.daraz.android:id/intro_skip_btn")
    WebElement skip;
    @FindBy(className = "android.widget.FrameLayout")
    WebElement account;

    public void banglaoption(){
        bangla.click();
    }
    public void skipoption(){
        skip.click();
    }

}
