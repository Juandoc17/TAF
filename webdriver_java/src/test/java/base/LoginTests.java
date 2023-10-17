

public class BaseTests extends BaseTests{
    @Test
    public void testLogin() {
        // Find the username and password fields and the login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        logger.info("Typing the credentials in LoginPage");
        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");

        logger.info("Login Action Button");
        loginButton.click();
        logger.info("Clicked the login button.");

        WebElement dashboardHeader = driver.findElement(By.id("dashboardHeader"));
        assert dashboardHeader.isDisplayed() : "Login failed.";
        logger.info("Login successful.");
    }

}
