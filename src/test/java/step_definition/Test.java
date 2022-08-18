package step_definition;

import PageObject.HomePage;
import io.cucumber.java.en.Given;

public class Test {
    HomePage home = new HomePage();


    @Given("^test$")
    public void check(){
        home.printing();
    }
}
