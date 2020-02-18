package WareHouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleGIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement gmail  = driver.findElement(By.name("q"));
		gmail.sendKeys("gmail");
		gmail.sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.xpath("//h3[contains(text(),'Gmail - Google')]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		
		System.out.println("test complete");
	}

}
