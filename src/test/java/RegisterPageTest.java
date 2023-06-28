

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterPageTest extends BaseTest{

    @Test
    public void testRegisterWithValidCredentials() {
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.clickUsername();
        registerPage.setUsername("test");
        registerPage.clickPassword();
        registerPage.setPassword("test..");
        registerPage.clickPasswordInputConfirm();
        registerPage.setPasswordInputConfirm("test..");
        registerPage.clickRegisterButton();

    }

    @Test
    public void testRegisterWithInValidCredentials() {
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.clickUsername();
        registerPage.setUsername("test");
        registerPage.clickPassword();
        registerPage.setPassword("test..");
        registerPage.clickPasswordInputConfirm();
        registerPage.setPasswordInputConfirm("test");
        registerPage.clickRegisterButton();


        String expectedErrorMessage = "Toks vartotojo vardas jau egzistuoja";
        String actualErrorMessage = registerPage.getErrorMessage();
        assertEquals(expectedErrorMessage, actualErrorMessage);

    }
}
