public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate(“http://automationpractice.com/index.php?controller=authentication&back=my-account”);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

// Проверка существования кнопки логина
        Assert.assertTrue(LoginPage.getLoginBtn().isEnabled());

// Авторизация
        LoginPage.setEmailField("seleniumisgood@mail.com");
        LoginPage.setPswrdField("123456"):
        LoginPage.getLoginBtn().click();

// Проверка наличия поля "MY ACCOUNT" после авторизации
        Assert.assertTrue(LoginPage.getLoginizedApproveElement().isDisplayed());

    }

}