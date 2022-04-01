package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement>Country=driver.findElements(By.xpath("//div[@class=\"ui-menu-item-wrapper\"]"));
		for(WebElement c:Country) {
			if(c.getText().equalsIgnoreCase("Indonesia")) {
				c.click();
				break;
			}
		}

	}

}
