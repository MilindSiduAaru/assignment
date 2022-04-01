package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement W=driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select S=new Select(W);
		S.selectByValue("option2");

	}

}
