package StackOverflow.BO;

import PropertiUtil.Driver;

import StackOverflow.PO.bLeadershipPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class bLeadershipBO {
    @Step
    public boolean bleadership() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://stackoverflow.com/");
        bLeadershipPO leadershipPO = new bLeadershipPO(driver);
        leadershipPO.bAbout();

        return true;
    }
}
