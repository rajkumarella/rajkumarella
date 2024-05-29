package hrms.stetScripts;

import hrms.lib.General;

public class TC003 {
public static void main(String args[]) {
	//Test Steps
	General g=new General();
  g.openapplication();
  g.login();
  g.enterFrame();
  g.EditEmp();
  g.exitFrame();
  g.logout();
 g.closeApplication();
  
}
}
