package Drivers;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;

public class PageDriver {
    private static final ThreadLocal<AndroidDriver> androiddriver = new ThreadLocal<>();
    private static PageDriver instance = null;

    //prevents of creating instance in another class
    private PageDriver() {
        //Empty
    }

    //initialize instance
    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();
        }
        return instance;
    }

    //setup driver
    public void setupdriver(AndroidDriver driver) {
        androiddriver.set(driver);
    }

    //get the driver
    public AndroidDriver getdriver() {
        return androiddriver.get();
    }

    // get running driver
    public static AndroidDriver getCurrentDriver() {
        return getInstance().getdriver();
    }
}
