package Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adactin_New_Re {
public static void main(String arg[]) throws Exception{
WebDriver driver = new FirefoxDriver();
driver.get("https://adactinhotelapp.com/index.php");//enter url
System.out.println("Application opened");
driver.findElement(By.linkText("New User Register Here")).click();
System.out.println("NewUserRegistion here");
Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("kumar");
Thread.sleep(2000);
driver.findElement(By.name("password")).sendKeys("Nani@123");
Thread.sleep(2000);
driver.findElement(By.name("re_password")).sendKeys("Nani@123");
Thread.sleep(2000);
driver.findElement(By.name("full_name")).sendKeys("rajkumar");
Thread.sleep(2000);
driver.findElement(By.name("email_add")).sendKeys("rajkumarel999@gmail.com");
Thread.sleep(2000);
driver.findElement(By.name("captcha")).click();
Thread.sleep(8000);
driver.findElement(By.name("tnc_box")).click();
Thread.sleep(2000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(2000);
driver.close();
}
}