package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageObjects {
    @FindBy(how= How.CLASS_NAME,using="subheader-close")
    public WebElement home;
    @FindBy(how = How.CLASS_NAME, using = "icon-user")
    public WebElement SignInIcon;
    @FindBy(how = How.CLASS_NAME, using = "users-process-list__btn")
    public WebElement SignItem;
    @FindBy(how=How.ID,using = "EmailLogin")
    public  WebElement EmailTextBox;
    @FindBy(how=How.ID,using = "Password")
    public WebElement PasswordTextBox;
    @FindBy(how=How.CLASS_NAME,using = "js-login-button")
    public WebElement SignInButton;
    @FindBy(how = How.CLASS_NAME, using = "user-menu__log-out-icon")
    public WebElement IconClose;
    @FindBy(how = How.CLASS_NAME, using = "modal-dialog")
    public WebElement UserPageHeaderLan;
}
