
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class FindInputPageTest extends BaseTest {
    @Test
    public void testFindInput(){
    FindInputPage findInputPage = new FindInputPage(driver);

    String textMessage = driver.findElement(By.xpath("//h4[contains(text(),'3 -')]")).getText();
    assertEquals("3 - 2 = 1", textMessage, "Įrašai sutampa");
    }

    @Test
    public void testFindInputThatDoesNotMatch(){
        FindInputPage findInputPage = new FindInputPage(driver);

        String textMessage = driver.findElement(By.xpath("//h4[contains(text(),'3 -')]")).getText();
        assertEquals("3 + 2 = 5", textMessage, "Įrašai nesutampa");
    }
}
