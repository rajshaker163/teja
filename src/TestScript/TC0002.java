package TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;

public class TC0002 {
	
	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
	//	public void Delete() throws Exception
		DOMConfigurator.configure("log4j.xml");
		     General g1=new General();
		     g1.open();
		     Thread.sleep(2000);
		     g1.log1in();
		     Thread.sleep(2000);
		     g1.SearchBy();
		     Thread.sleep(2000);
		     g1.searchfor();
		     Thread.sleep(2000);
		     g1.Search_btn();
		     Thread.sleep(2000);
		     g1.radiobutton();
		     Thread.sleep(2000);
		     g1.detele();
		     Thread.sleep(2000);
		     g1.log1out();
			
			
			
			
		}
		

	}


