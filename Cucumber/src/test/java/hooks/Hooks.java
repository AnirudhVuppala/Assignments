package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import utils.DriverFactory;

public class Hooks {
    @Before
    public void setup() {
        DriverFactory.createDriver();
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DriverFactory.quitDriver();
    }
}
