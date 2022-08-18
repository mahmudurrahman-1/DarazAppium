package Drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseDriver {

    public AndroidDriver driver = null;
    URL url = null;

    public AndroidDriver setup(String platform, String device, String version, String udid) {

        //Android File Location
        File file_loc = new File("src/main/resource");
        File filename = new File(file_loc, "DarazOnlineShopping.apk");

        //Setting up android device
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        cap.setCapability(MobileCapabilityType.UDID, udid);
        cap.setCapability(MobileCapabilityType.APP, filename.getAbsolutePath());

        //Setting up url
        try {
            url = new URL("0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setupdriver(driver);
        return driver;
    }
}
