import Factory.BrowserFactory;


import StackOverflow.BO.bAboutBO;
import StackOverflow.BO.bLeadershipBO;
import org.testng.Assert;
import org.testng.annotations.Test;
import PropertiUtil.Driver;
import org.openqa.selenium.WebDriver;
import StackOverflow.BO.bPressBO;
// CHROME DRIVER MANAGER
public class UITest{

    @Test
    public void buttonPress() {
        BrowserFactory.initDriver("chrome");
        bPressBO pressTest = new bPressBO();
        Assert.assertTrue(pressTest.bpress());

    }

    @Test
    public void buttonAbout() {
        BrowserFactory.initDriver("chrome");
        bAboutBO aboutTest = new bAboutBO();
        Assert.assertTrue(aboutTest.babout());
    }
    @Test
    public void buttonLeadership() {
        BrowserFactory.initDriver("chrome");
        bLeadershipBO leadershipTest = new bLeadershipBO();
        Assert.assertTrue(leadershipTest.bleadership());
    }

}
