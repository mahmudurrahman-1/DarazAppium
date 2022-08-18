package step_definition;

import Drivers.BaseDriver;
import Drivers.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DataLoader;

import javax.xml.crypto.Data;
import java.util.Properties;

public class DriverRunner extends BaseDriver {
    //Loaddata using Properties object
    Properties prop = DataLoader.loadProperties("initialization");

    @Before
    public void initilization() {
        String plname, plversion, device, udid;
        plname = prop.getProperty("plname");
        plversion = prop.getProperty("plversion");
        device = prop.getProperty("device");
        udid = prop.getProperty("udid");
        driver = setup(plname, plversion, device, udid);
    }

    @After
    public void closedown() {
        PageDriver.getCurrentDriver().quit();
    }
}
