import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mytesting {
 WebDriver driver = null;
 
 @Before
 public void beforetest() {
  System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
 }
 
 @After
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException 
 {  
  driver.findElement(By.id("text1")).sendKeys("My First Name");

  //Selecting value from drop down using visible text
  Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
  mydrpdwn.selectByVisibleText("Audi");
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
 }
   
}