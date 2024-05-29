package hrms.stetScripts;

import hrms.lib.General;

public class TC_004 {
public static void  main(String args[]) {
	//Test steps
	General g = new General();
	g.openapplication();
	g.login();
	g.enterFrame();
	g.DeleteEmp();
	g.exitFrame();
	g.logout();
	g.closeApplication();
}
}
