import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends AbstractObjectPage{
    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='passwordConfirm']")
    private WebElement passwordInputConfirm;

    @FindBy(xpath = "//button[normalize-space()='Sukurti']")
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickUsername(){
        usernameInput.click();

    }
    public void setUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void clickPassword(){
        passwordInput.click();

    }
    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickPasswordInputConfirm(){
        passwordInputConfirm.click();

    }
    public void setPasswordInputConfirm(String password) {
        passwordInputConfirm.sendKeys(password);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath("//span[@id='username.errors']"));
        return errorMessage.getText();
    }
}

