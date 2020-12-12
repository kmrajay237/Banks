package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickingOnWebElementUsingJSE {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.shaadi.com/");
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		String script="arguments[0].click();";
		
		jse.executeScript(script, help);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
