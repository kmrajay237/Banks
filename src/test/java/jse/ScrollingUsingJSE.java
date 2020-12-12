package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingUsingJSE {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form/");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.clear();
		firstName.sendKeys("Emilia");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.clear();
		lastName.sendKeys("Clarke");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.clear();
		email.sendKeys("emilia.clarke@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		gender.click();
		
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9046933956");
		
	
		driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("submit"));
		int y=submit.getLocation().getY();//Y-Coordinates
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		Scrolling upto specific web element
		String scrollScript="window.scrollTo(0,"+y+")";
		
//		String scrollToheight="window.scrollTo(0,document.body.scrolllHeight)";
//		Scroll Upward
//		Scroll Horizontally
		
		Thread.sleep(3000);
		jse.executeScript(scrollScript);
		Thread.sleep(3000);
		String submitScript="arguments[0].click()";
		jse.executeScript(submitScript, submit);
//		submit.click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
