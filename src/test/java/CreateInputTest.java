//import org.junit.Test;

import org.junit.jupiter.api.Test;

public class CreateInputTest extends BaseTest{


    @Test
    public void testCreateInput(){
     CreateInput  createInput = new CreateInput(driver);

     createInput.clickFirstNumber();
     createInput.setFirstNumber(3);
     createInput.clickSecondNumber();
     createInput.setSecondNumber(4);
     createInput.clickDropdown();
     createInput.selectDropdown("1");
     createInput.clickCountButton();
    }

    @Test
    public void testCreateInvalidInput(){
        CreateInput  createInput = new CreateInput(driver);

        createInput.clickFirstNumber();
        createInput.setFirstNumber(3);
        createInput.clickSecondNumber();
        createInput.setSecondNumber(-2);
        createInput.clickDropdown();
        createInput.selectDropdown("1");
        createInput.clickCountButton();
    }

}
