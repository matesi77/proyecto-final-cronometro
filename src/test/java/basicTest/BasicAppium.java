package basicTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicAppium {

    private AppiumDriver appiumDriver;
    //setup - initialize (Se ejecuta antes de cada test)
    @BeforeEach
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI P20 lite");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity", ".ui.HomeActivity");
        capabilities.setCapability("platformName", "Android");
        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //implicit wait
        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    //cleanup - teardown (Se ejecuta despues de cada test)
    @AfterEach
    public  void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        appiumDriver.quit();
    }
    @Test
    public void createTaskWhenDo(){
        //click +
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        //Set title
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Remove");
        //Set note
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Remove this task");
        //save
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
        //verification
        String expectedResult = "Remove";
        String currentResult = appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(expectedResult, currentResult, "Error, la tarea no fue creada");
    }

}
