package activities.whenDo;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;
import java.util.List;

public class MainScreen {
    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label nameTaskLabel = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    public Button groupTask = new Button(By.xpath("//*[@resource-id='com.vrproductiveapps.whendo:id/notesList']//android.widget.LinearLayout/android.widget.LinearLayout"));

    public MainScreen(){}

    public boolean isPresentNameTaskLabel() throws MalformedURLException {
        List<WebElement> elements = Session.getInstance().getDriver().findElements(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        return elements.size() > 0 ? true : false;
    }
}
