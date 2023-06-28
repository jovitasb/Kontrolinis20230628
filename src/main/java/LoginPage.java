import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {

    @FindBy(xpath = "//input[@placeholder='Prisijungimo vardas']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Slaptažodis']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='Prisijungti']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickUsername() {
        usernameInput.click();

    }

    public void setUsername(String username) {

        usernameInput.sendKeys(username);
    }

    public void clickPassword() {
        passwordInput.click();

    }

    public void setPassword(String password) {

        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {

        loginButton.click();
    }

    public String getErrorMessage() {
    WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'Įvestas prisijungimo vardas ir/ arba slaptažodis y')]"));
    return errorMessage.getText();
    }
}

