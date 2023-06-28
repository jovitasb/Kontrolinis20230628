import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {


        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        driver.get("http://localhost:8080/prisijungti");
        // driver.get("http://localhost:8080/registruoti");
        // driver.get("http://localhost:8080/skaiciuoti");

//        @AfterEach
//        public void closeBrowser () {
//            driver.close();
    }
}

