package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multimedia {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup(); // static

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://mars.nasa.gov/");

		// Maximize the browser
		driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement mouseOver=driver.findElement(By.xpath("//span[text()='Multimedia']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(mouseOver).perform();
	

	driver.findElement(By.xpath("//span[text()='Images']")).click();
	
	
	}
	
	
	
	
}
