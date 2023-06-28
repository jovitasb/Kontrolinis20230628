import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindInputPage extends AbstractObjectPage{

    @FindBy(xpath = "//h4[contains(text(),'3 -')]")
    private WebElement input;


    public FindInputPage(WebDriver driver) {
        super(driver);
    }

    public String getInput(String text){
        return input.getText();

    }

}
