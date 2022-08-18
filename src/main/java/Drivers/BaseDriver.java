package Drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseDriver {

    public static AndroidDriver driver = null;
    URL url = null;

    public AndroidDriver setup(String platform, String version,String device, String udid) {

        //Android File Location
        DesiredCapabilities cap = new DesiredCapabilities();
        File file_loc = new File("src/main/resources");
        File filename = new File(file_loc, "DarazOnlineShopping.apk");

        //Setting up android device

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        cap.setCapability(MobileCapabilityType.UDID, udid);
        cap.setCapability(MobileCapabilityType.APP, filename.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        //Setting up url
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setupdriver(driver);
        return driver;
    }
}
