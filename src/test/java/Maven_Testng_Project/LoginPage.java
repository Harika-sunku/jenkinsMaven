package Maven_Testng_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
  @Test
  public void f() {
	  
	  WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");  
		System.out.println(driver.getTitle());
		driver.quit();
  }
}
