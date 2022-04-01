package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		driver.manage().window().maximize();
		String S=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id=\"u_7_8\"]")).click();
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("-----------------------------------");
			if(!window.equals(S)) {
				Thread.sleep(2000);
				driver.close();
				
			}
		}

	}

}
