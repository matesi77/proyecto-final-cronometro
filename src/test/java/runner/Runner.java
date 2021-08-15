package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import session.Session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class Runner {
    // hooks
    @Before
    public void hookBefore(){
        System.out.println("Esto se ejecuta al inicio de un escenario.");
    }

    @After
    public void hookAfter() throws MalformedURLException {
        System.out.println("Esto se ejecuta al final de un scenario");
        Session.getInstance().closeSession();
    }
}

