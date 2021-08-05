package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static resources.Base.*;

public class Hook {
    @Before
    public void setup() {
        initialisation();
    }

    @After
    public void tearUp() {
        closeBrowser();
    }
}
