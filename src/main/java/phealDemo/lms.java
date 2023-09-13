package phealDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lms {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Dhok\\Desktop\\New folder\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	 //driver.get("https://www.google.com/");
       driver.get("https://corpapps.rabbitandtortoise.com/rnt/");
       
       String title = driver.getTitle();
       System.out.println(title);
       if(title.equals("RNT | Login")) {
       
       System.out.println("Login page shows");
       }
       else {
    	   System.out.println("Login page not shows");
       }
       
	   driver.findElement(By.xpath("//*[@placeholder='Please Enter User ID ']")).sendKeys("PD1278");
	   System.out.println("Login page User ID shows");
	   
       driver.findElement(By.xpath("//*[@id='password-field']")).sendKeys("Ps@@1234");
	   System.out.println("Login page User Password shows");
	   
	
	   
	   driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();
	   
	   String title1 = driver.getTitle();
       System.out.println(title1);
       
       if(title.equals("RNT | Login")) {
       
       System.out.println("Login Succesful");
       }
       else {
    	   System.out.println("Login not Succesful");
       }
	   
	   
	}

}
