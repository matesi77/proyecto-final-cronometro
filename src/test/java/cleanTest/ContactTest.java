package cleanTest;

import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class ContactTest {

    @Test
    public void testSwipeEvent() throws MalformedURLException {
        Session.getInstance().swipe();
        Session.getInstance().closeSession();
    }
}
