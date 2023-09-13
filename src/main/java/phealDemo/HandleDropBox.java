package phealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Dhok\\Desktop\\New folder\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://corpapps.rabbitandtortoise.com/rnt/");
		driver.findElement(By.xpath("//*[@placeholder='Please Enter User ID ']")).sendKeys("PD1278");
	    driver.findElement(By.xpath("//*[@id='password-field']")).sendKeys("Ps@@1234");
	    driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();

	     
		driver.findElement(By.xpath("//a[normalize-space()='Timesheet Management System']")).click();
		driver.findElement(By.xpath("//div[@class='item-tr']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='item-tr']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Fill Timesheet']")).click();
		driver.findElement(By.cssSelector("div[class='addTimesheet detailsButton'] button span")).click();
		
	  //driver.quit();fillId
		
		//handle drop box 
		//Select select =new Select(driver.findElement(by.Id));
		
	
		
		
	}

}
