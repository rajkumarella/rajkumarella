package hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

  public  class General extends Global {
//To provid all re-usable fun:/methods realted to whole application
	public void openapplication() {
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application opened");
	
	}
	public void closeApplication() {
	driver.quit();
	System.out.println("Application closed");
	
	}
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("logout completed");
	
	}
	public void enterFrame() {
	driver.switchTo().frame(frm_empinfo);
	System.out.println("Entered into frame");
	}
	public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit into frame");
	}
	public void addNewEmp() {
    driver.findElement(By.xpath(btn_Add)).click();
    driver.findElement(By.name(txt_efn)).sendKeys(efn);
    driver.findElement(By.name(txt_eln)).sendKeys(eln);
    driver.findElement(By.id(btn_save)).click();
    System.out.println("New emp added");
    }
	public void EditEmp() {
		driver.findElement(By.xpath(click_Empname)).click();
		driver.findElement(By.name(btn_edit)).click();
		driver.findElement(By.name(delete_efn)).click();
		driver.findElement(By.name(delete_eln)).click();
		System.out.println("EditEmp");
	
	}
	public void DeleteEmp(){
		driver.findElement(By.name(txt_searchby)).sendKeys("Emp.ID");
		driver.findElement(By.name(txt_searchfor)).sendKeys("3464");
		driver.findElement(By.xpath(btn_save1)).click();
		driver.findElement(By.name(txt_checkbox)).click();
		driver.findElement(By.xpath(btn_delet)).click();
		System.out.println("DeleteEmp");
		
	
		
	}
	}
	
	
	
		
	
		
	

