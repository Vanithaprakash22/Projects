package testNG;



	import java.io.File;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class MarsTestNG {
		
		public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup(); // static

			// Launch the browser
			ChromeDriver driver = new ChromeDriver();
					
			driver.get("https://mars.nasa.gov/");

			// Maximize the browser
			driver.manage().window().maximize();
	
			
			driver.findElement(By.linkText("Send Your Name to Mars Again")).click();
			
			driver.findElement(By.id("FirstName")).sendKeys("Harsha");
					
			driver.findElement(By.id("LastName")).sendKeys("Ram");
			
			WebElement Countrylist = driver.findElement(By.name("country"));
			Select country=new Select(Countrylist);	

			country.selectByVisibleText("United States");
			
			
			driver.findElement(By.name("postal")).sendKeys("54913");
			driver.findElement(By.name("SearchSubmit")).click();
			
			driver.findElement(By.linkText("Learn")).click();
				
			
						
			Thread.sleep(3000);
			
//			File fileLocation=new File("C:\\Users\\harsh\\Downloads");
//			File[] totalFiles=fileLocation.listFiles();
//			
//			for (File file : totalFiles) {
//				
//				
//		if(file.getName().equals("BoardingPass_MyNameOnFutureMission")){
//				
//			System.out.println("file is downloaded");
//			break;
//			}
			
			
			}
			
			
		}
	
	

