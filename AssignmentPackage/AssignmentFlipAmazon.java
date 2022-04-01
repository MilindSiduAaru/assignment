package AssignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentFlipAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("REDMI Note 10 Pro");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		driver.findElement(By.xpath("(//div[text()=\"REDMI Note 10 Pro (Vintage Bronze, 128 GB)\"])[1]")).click();
		String FlipKartValue=driver.findElement(By.xpath("(//div[text()=\"₹16,999\"])[1]")).getText();
		System.out.println(FlipKartValue);
		
		
		driver.close();
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("REDMI Note 10 Pro");
		driver1.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("(//span[@class=\"a-truncate-cut\"])[2]")).click();
		Thread.sleep(5000);
		String AmazonValue=driver1.findElement(By.xpath("(//span[@class=\"a-offscreen\"])[6]")).getText();
		
	  if(FlipKartValue.equals(AmazonValue)) {
	    	System.out.println("Value is same");
	    }else {
	    	System.out.println("Value is not same");
	    }
	    
	    
	   //In Amazon Area Label hidden=true thats why it is not retrieving value from Amazon
	 
	    
				
		
		
		
		
		
		
		
		}
		
}


