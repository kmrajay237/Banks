package waitMechanism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginAndLogoutUsingExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("XXXXXXXXXXXXXXXXX");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("XXXXXXXXXXXX");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		WebElement accountDropdown = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		accountDropdown.click();
				
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(logout));
		
		logout.click();
		
		driver.close();
	}

}
