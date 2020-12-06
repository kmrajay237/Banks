package axis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ByIdOrNameClass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("file:///home/qualitrix/Desktop/Ajay/xpath.html");
		By by1=new ByIdOrName("n2");
		WebElement ele = driver.findElement(by1);
		ele.sendKeys("ByIdOrName");
		Thread.sleep(5000);
		driver.close();
	}

}
