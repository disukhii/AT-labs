import Factory.BrowserFactory;
import com.github.dockerjava.api.model.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PropertiUtil.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PropertiUtil.Driver;
import Selenium.opencart.po.ContactUsPO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
// CHROME DRIVER MANAGER
public class UITest{

    @Test
    public void buttonAbout() {
        //WebDriver driver = Driver.getInstance().getDriver();
        BrowserFactory.initDriver("Chrome");
        driver.get("http://localhost/index.php?route=common/home");
    }
}
