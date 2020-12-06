package axis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByChainedClass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("file:///home/qualitrix/Desktop/Ajay/xpath.html");
		By by1 = By.id("a1");
		By by2 = By.name("n2");
		By by3 = By.id("a3");
		By by4 = By.className("c4");
		WebElement ele = driver.findElement(new ByChained(by1,by2,by3,by4));
		ele.sendKeys("gender concept");
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.close();
	}

}
