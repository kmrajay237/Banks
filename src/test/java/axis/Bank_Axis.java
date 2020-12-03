package axis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Bank_Axis {
	public static void main(String[] args) {	
		WebDriverManager.operadriver().setup();
		WebDriver driver=new OperaDriver();
		driver.get("https://toolsqa.com/");
		driver.close();
	}
}
