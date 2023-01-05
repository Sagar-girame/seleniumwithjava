package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbdrpdwn {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
	}

}
