import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateInput extends AbstractObjectPage{
    @FindBy(xpath = "//input[@id='sk1']")
    private WebElement firstNumber;

    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement secondNumber;

    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement dropdown;

    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement countButton;

    public CreateInput(WebDriver driver) {
        super(driver);
    }

    public void clickFirstNumber(){
        firstNumber.click();
    }
    public void setFirstNumber(Integer number){
        firstNumber.sendKeys(number.toString());
    }

    public void clickSecondNumber(){
        firstNumber.click();
    }
    public void setSecondNumber(Integer number){
        secondNumber.sendKeys(number.toString());
    }

    public void clickDropdown(){
        dropdown.click();
    }

    public void selectDropdown(String s) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='zenklas']"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        WebElement selectedOption = select.getFirstSelectedOption();
        selectedOption.click();
    }

    public void clickCountButton(){
        countButton.click();
    }
}
