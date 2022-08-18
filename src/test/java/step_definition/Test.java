package step_definition;

import PageObject.HomePage;
import io.cucumber.java.en.Given;

public class Test {
    HomePage home = new HomePage();


    @Given("^test$")
    public void check() throws InterruptedException{

        Thread.sleep(50000);
        home.banglaoption();
        Thread.sleep(2000);
        home.skipoption();
    }
}
