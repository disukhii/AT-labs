package pg.login.PO;


import io.qameta.allure.Step;
import pg.decorator.ClickButtonElement;
import pg.login.BasicPO;
import org.openqa.selenium.support.FindBy;

public class HomePO extends BasicPO {

    @FindBy(xpath = "//*[@data-testid=\"user-avatar\"]")
    private ClickButtonElement userLogo;

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return userLogo.waitForMeVisible(10000);
    }


}
