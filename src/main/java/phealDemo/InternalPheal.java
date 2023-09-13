package phealDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternalPheal {

	public static void main(String[] args) {
	 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Dhok\\Desktop\\New folder\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

        String title =  driver.getTitle();
         System.out.println(title); 
         //validation point :actual vs expected
         if(title.equals("Google")) {
        	 System.out.println("Correct title");
        	 
         }
         else {
        	 System.out.println("In-correct title");
         }
         
         System.out.println(driver.getCurrentUrl());
         
        // System.out.println(driver.getPageSource());
         
       //  driver.quit();
         }

}


