package axis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByAllClass {
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("file:///home/qualitrix/Desktop/Ajay/Table.html");
		
		By by1=By.xpath("//td[text()='Core Java']");
		By by2=By.xpath("//td[text()='Python']");
		By by3=By.xpath("//td[text()='Appium']");
		
		ByAll b=new ByAll(by1,by2,by3);
		
		List<WebElement> ele = driver.findElements(b);
		
		for (WebElement e : ele) {
			String text = e.getText();
			System.out.println(text);
		}
		
		driver.close();
	}
}
