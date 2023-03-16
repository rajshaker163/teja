package TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;


public class TC000 {
public static void main(String args[])throws Exception {
	

//public void tc000()
	{
		DOMConfigurator.configure("log4j.xml");
		General g1=new General();
		g1.open();
		Thread.sleep(3000);
		g1.log1in();
		Thread.sleep(3000);
		g1.log1out();
		Thread.sleep(3000);
		g1.close();
	}
}
}
