package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWindowSeleniumNewFeature {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goodreads.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			Thread.sleep(2000);
			driver.switchTo().window(window);
			if(driver.getCurrentUrl().equals("https://www.google.com/")) {
				break;
			}
		}
		

	}

}
