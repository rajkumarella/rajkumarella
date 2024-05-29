package hrms.stetScripts;
import hrms.lib.General;

public class TC002 {
public static void main(String args[]) {
	//Test Steps
	General g =new General();
g.openapplication();
g.login();
g.enterFrame();
g.addNewEmp();
g.exitFrame();
g.logout();
g.closeApplication();
}
}
