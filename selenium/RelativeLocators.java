package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.addArguments("--headless");
		WebDriver driver=new ChromeDriver(chromeOption);
		driver.get("https://www.goodreads.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		WebElement AmzButton=driver.findElement(By.linkText("Continue with Amazon"));
		try {
			driver.findElement(with(By.xpath("//i[@class=\"gr-button--facebook__icon\"]")).above(AmzButton));
			System.out.println("Pass:FB Button is above amazon button");
			
		}catch(Exception e) {
			
			System.out.println("Fail: FB button is not above ");
			e.printStackTrace();
		}
		driver.quit();

	}

}
