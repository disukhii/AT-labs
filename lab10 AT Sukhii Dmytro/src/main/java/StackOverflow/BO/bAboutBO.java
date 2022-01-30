package StackOverflow.BO;

import PropertiUtil.Driver;
import StackOverflow.PO.bAboutPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class bAboutBO {
    @Step
    public boolean babout() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://stackoverflow.com/");
        bAboutPO aboutPO = new bAboutPO(driver);
        aboutPO.bAbout();

        return true;
    }
}
