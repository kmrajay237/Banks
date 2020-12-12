package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveTextFromTextBox {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.shaadi.com/");
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String loginScript = "arguments[0].click();";

		jse.executeScript(loginScript, login);
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("email"));
		// single quote="+"kmrajay237@gmail"+"

		String emailScript = "arguments[0].value='" + "kmrajay237@gmail" + "'";
		jse.executeScript(emailScript, email);

		Thread.sleep(3000);
		
		String deleteScript="arguments[0].value=''";
		jse.executeScript(deleteScript, email);
		Thread.sleep(3000);
		driver.close();
	}

}
