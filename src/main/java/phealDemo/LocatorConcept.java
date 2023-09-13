package phealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Dhok\\Desktop\\New folder\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.google.com/");

		driver.get("https://corpapps.rabbitandtortoise.com/rnt/");
		//Xpath =//tagname[@Attribute=’value’]
		//input[@placeholder='Please Enter User ID ']
		//driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("PD1278");
				
       driver.findElement(By.xpath("//*[@placeholder='Please Enter User ID ']")).sendKeys("PD1278");
       driver.findElement(By.xpath("//*[@id='password-field']")).sendKeys("Ps@@1234");
   
       driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();
      // driver.findElement(By.xpath("//a[normalize-space()='Timesheet Management System']")).click();
       
       driver.findElement(By.linkText("Timesheet Management System")).click();
       
       driver.findElement(By.xpath("//span[normalize-space()='Fill Timesheet']")).click();
       
     //  driver.findElement(By.linkText("Timesheet Record")).click();
       
      driver.findElement(By.xpath("//div[@class='item-tmsdas activeDiv']//span]")).click();
       
       driver.findElement(By.xpath("//span[normalize-space()='Fill Timesheet'div[@class='item-tr']//span]")).click();
       
        driver.findElement(By.xpath("//div[@class='item-tr activeDiv']//span")).click();
       
     //Timesheet Record//div[@class='item-tr activeDiv']//span
     
  //   driver.quit();

		
		
		
		
		
	}

}
