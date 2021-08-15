package controlAppium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator = locator;
    }

    protected void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }

    public WebElement getControl() throws MalformedURLException {
        this.findControl();
        return control;
    }
}
