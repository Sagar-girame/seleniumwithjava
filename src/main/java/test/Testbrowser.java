package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("(//span[@class='SJajHc NVbCr'])[3]")).click();
		
	}

}
