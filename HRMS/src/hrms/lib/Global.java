package hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	 WebDriver driver ;
	//To privid Test Data & Objects related to Whole application
	//*******************TestData
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String efn = "rajkumar";
	public String eln = "selenium";
	
	
	//****************Objects/Elements
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout" ;
	public String frm_empinfo = "rightMenu";
	public String btn_Add = "//input[@value='Add']";
	public String txt_efn = "txtEmpFirstName";
	public String txt_eln = "txtEmpLastName";
	public String btn_save = "btnEdit";
	public String click_Empname = "/html/body/div/div[2]/form/table/tbody/tr[2]/td[3]/a";
	public String delete_efn = "txtEmpFirstName";
	public String delete_eln = "txtEmpLastName";
	public String btn_edit ="EditMain";
	public String txt_searchby = "loc_code";
	public String txt_searchfor = "loc_name";
	public String btn_save1 = "//input[@value='Search']";
	public String txt_checkbox = "chkLocID[]";
	public String btn_delet = "//input[@value='Delete']";

}
