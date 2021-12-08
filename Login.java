import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Loginuser {
@Test
public void login() {
System.setProperty("webdriver.chrome.driver", "path of driver");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.browserstack.com/users/sign_in");
WebElement username=driver.findElement(By.id("username"));
WebElement password=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.name("login"));
username.sendKeys("demo");
password.sendKeys("demo");
login.click();
String actualUrl=" https://qa.rtcamp.net/activity/";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
}
}
