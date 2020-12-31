package relative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorNear {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MINUTES);
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement maleRadioButton = driver.findElement(By.id("gender-radio-1"));
		WebElement mobileNumber = driver.findElement(RelativeLocator.withTagName("input").near(maleRadioButton));
		mobileNumber.sendKeys("1234567890");
	}
}
