public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginBtn() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id="SubmitLogin"]"), 30);
    }

    public WebElement getEmailField() {
        return Utils.waitForElementPresence(driver, By.xpath(@//*[@id="email"]"), 30);
    }

    public WebElement getPswrdField() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id="passwd"]"), 30);
    }

    public WebElement getLoginizedApproveElement() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id="center_column"]/h1"), 30);
    }

    public void setEmailField(String mail) {
        WebElement email = this.getEmailField();
        email.clear();
        email.sendKeys(mail);
    }

    public void setPswrdField(String pass) {
        WebElement password = this.getPswrdField();
        password.clear();
        password.sendKeys(pass);
    }

}