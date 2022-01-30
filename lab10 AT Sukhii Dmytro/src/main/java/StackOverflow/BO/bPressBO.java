package StackOverflow.BO;

import PropertiUtil.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


import StackOverflow.PO.bPressPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import PropertiUtil.Driver;
import org.testng.Assert;

public class bPressBO {
    @Step
    public boolean bpress() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://stackoverflow.com/");
        bPressPO pressPO = new bPressPO(driver);
        pressPO.bAbout();
        pressPO.bPress();
        pressPO.title();

        return true;
    }

}