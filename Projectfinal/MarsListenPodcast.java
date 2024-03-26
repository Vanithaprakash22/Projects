package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MarsListenPodcast {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup(); // static

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://mars.nasa.gov/");

		// Maximize the browser
		driver.manage().window().maximize();

		
		driver.findElement(By.linkText("Listen to Mars Podcasts")).click();
		
		
		
		WebElement firstImage=driver.findElement(By.xpath("//img[@src='/system/resources/list_images/26686_OnAMission_s4-05-320x240.jpg']"));
		firstImage.click();
		
		
	}
	
}
