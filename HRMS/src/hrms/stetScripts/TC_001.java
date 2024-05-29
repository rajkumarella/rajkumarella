package hrms.stetScripts;
import hrms.lib.General;

public class TC_001 {
public static void main(String args[]) {
	//Test Steps
  General g = new General();
	g.openapplication();
	g.login();
	g.logout();
	g.closeApplication();
}
}
