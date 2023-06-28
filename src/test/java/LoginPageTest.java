import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickUsername();
        loginPage.setUsername("test");
        loginPage.clickPassword();
        loginPage.setPassword("test..");
        loginPage.clickLoginButton();

    }

    @Test
    public void testLoginWithInValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickUsername();
        loginPage.setUsername("test");
        loginPage.clickPassword();
        loginPage.setPassword("test");
        loginPage.clickLoginButton();


        String expectedErrorMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        String actualErrorMessage = loginPage.getErrorMessage();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
