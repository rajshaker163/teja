package TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.DeleteGeneral;

public class Tc002 extends DeleteGeneral {
	@Test
	public void tc002()throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		DeleteGeneral g1=new DeleteGeneral();
		g1.openAppication();
		Thread.sleep(2000);
		g1.logindetails();
		Thread.sleep(2000);
		g1.SearchFor();
		Thread.sleep(2000);
		g1.Delete();
		Thread.sleep(2000);
		g1.Logout();
		Thread.sleep(2000);
		g1.Close();
		
		
	}

}
