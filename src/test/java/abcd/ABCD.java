package abcd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABCD {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///home/qualitrix/Desktop/ws/Training/htmlfiles/xpath.html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[2]/input"));
		for (WebElement checkbox : checkboxes) {
			Thread.sleep(1000);
			checkbox.click();
		}
		for (WebElement checkbox : checkboxes) {
			Thread.sleep(1000);
			checkbox.click();
		}
//		checkboxes.click();
//		[ele1,ele2,ele3,ele4].click();
//		Correct xpath and
//		xpath is matching with multiple web elements and 
//		If you are using findElement() then
//		findElement() method will return the first matching web element
	}

}
