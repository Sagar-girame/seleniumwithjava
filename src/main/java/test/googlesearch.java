package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearch {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Pushpa");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.partialLinkText("Wikipedia")).click();
		
		String a=driver.findElement(By.xpath("(//td[@class='infobox-data'])[12]")).getText();
			
		System.out.println(a);
		
	}

}
