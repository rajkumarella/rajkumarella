package Hotel;

	//to accecc object/element methods
	import org.openqa.selenium.By;
//pre-def
	//to access webdriver methods & classess
	import org.openqa.selenium.WebDriver;
//to access browser
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Adactin_login_Logout {
	public static void main(String arg[]) throws Exception{
	   //Test steps
		//interface           //classname
	WebDriver driver = new FirefoxDriver();//launch browser
	driver.navigate().to("https://adactinhotelapp.com/");//enter url
	System.out.println("Application opened");
	Thread.sleep(4000);//wait time
	driver.findElement(By.name("username")).sendKeys("Rakesh00");
	driver.findElement(By.name("password")).sendKeys("L3QP76");
	Thread.sleep(4000);
	driver.findElement(By.name("login")).click();
	System.out.println("Login Completed");
	Thread.sleep(4000);//wait time
	driver.findElement(By.name("location")).sendKeys("Brisbane");
	Thread.sleep(2000);
	driver.findElement(By.name("hotels")).sendKeys("Hotel creek");
	Thread.sleep(1000);
	driver.findElement(By.name("room_type")).sendKeys("Double");
	Thread.sleep(1000);
	driver.findElement(By.name("room_nos")).sendKeys("3-Three");
	Thread.sleep(1000);
	driver.findElement(By.name("datepick_in")).sendKeys("03/03/2024");
	Thread.sleep(1000);
	driver.findElement(By.name("datepick_out")).sendKeys("05/03/2024");
	Thread.sleep(1000);
	driver.findElement(By.name("adult_room")).sendKeys("2-Two");
	Thread.sleep(1000);
	driver.findElement(By.name("child_room")).sendKeys("1-One");
	Thread.sleep(1000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("radiobutton_0")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("continue")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("first_name")).sendKeys("rajkumar");
	Thread.sleep(1000);
	driver.findElement(By.name("last_name")).sendKeys("e");
	Thread.sleep(1000);
	driver.findElement(By.name("address")).sendKeys("Hydrabad");
	Thread.sleep(1000);
	driver.findElement(By.name("cc_num")).sendKeys("64783901836837749277");
	Thread.sleep(1000);
	driver.findElement(By.name("cc_type")).sendKeys("visa");
	Thread.sleep(1000);
	driver.findElement(By.name("cc_exp_month")).sendKeys("january");
	Thread.sleep(1000);
	driver.findElement(By.name("cc_exp_year")).sendKeys("2019");
	Thread.sleep(1000);
	driver.findElement(By.name("cc_cvv")).sendKeys("234");
	Thread.sleep(1000);
	driver.findElement(By.name("book_now")).click();
	Thread.sleep(5000);
	System.out.println("open my ititnary");
	driver.findElement(By.linkText("Booked Itinerary")).click();
	Thread.sleep(6000);
	driver.findElement(By.name("ids[]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("cancelall")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(4000);
	driver.close();

	}

	}





