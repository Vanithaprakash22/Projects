package testNG;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MartianWanted {

		public static void main(String[] args) throws Exception {
			
			WebDriverManager.chromedriver().setup(); // static

			// Launch the browser
			ChromeDriver driver = new ChromeDriver();
					
			driver.get("https://mars.nasa.gov/");

			// Maximize the browser
			driver.manage().window().maximize();

			
			driver.findElement(By.linkText("Mars Explorers Wanted")).click();
			
			
			
			WebElement firstImage=driver.findElement(By.xpath("//img[@src='/files/resources/posters/P01-Explorers-Wanted-NASA-Recruitment-Poster-600x.jpg']"));
			firstImage.click();
			
			
		}
		
	}
	

