package TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;

public class TC001 extends General{

	public static void main(String[] args)throws Exception  {
	
//public void tc001() throws Exception
{
		DOMConfigurator.configure("log4j.xml");
		General g1=new General();
		g1.open();
		
		g1.log1in();
		
		g1.Frames();

		Thread.sleep(3000);
		g1.SearchBy();

		Thread.sleep(3000);
		g1.Add();

	
		g1.save();

		Thread.sleep(3000);
		g1.Exit();
		
		Thread.sleep(3000);
		g1.log1out();
		g1.close();
	}

}
}