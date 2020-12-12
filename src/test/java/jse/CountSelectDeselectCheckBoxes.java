package jse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountSelectDeselectCheckBoxes {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///home/qualitrix/Desktop/ws/Assets/files/xpath.html");
		List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int s=checkboxList.size();
		System.out.println("The number of checkboxes are :"+s);
		
//		for (WebElement box : checkboxList) {
//			Thread.sleep(500);
//			box.click();
//		}
		
		for(int i=0;i<s;i++) {
			Thread.sleep(500);
			checkboxList.get(i).click();
		}
		
		Thread.sleep(1500);
		
		for(int j=s-1;j>=0;j--) {
			Thread.sleep(500);
			checkboxList.get(j).click();
		}
		Thread.sleep(1500);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
