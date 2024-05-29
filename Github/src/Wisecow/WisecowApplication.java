package Wisecow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WisecowApplication {
	 public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        // Instantiate WebDriver
	        ChromeDriver driver = new ChromeDriver();

	        // Open Wisecow application URL
	        driver.get("http://wisecow-service:80");

	        //  Selenium test logic here
	        driver.findElement(By.name("username")).sendKeys("xxxxx");
	        driver.findElement(By.name("password")).sendKeys("xxxx");
	        driver.findElement(By.name("login")).click();
	        System.out.println("login completed");
	        driver.findElement(By.xpath("logout")).click();
	        System.out.println("logout completed");
	        
	        

	        // Close the WebDriver instance
	        driver.quit();
	    }
	}