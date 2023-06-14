package TestScript;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.AmazonGeneral;

public class AmazonTC001 extends AmazonGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DOMConfigurator.configure("log4j.xml");
     AmazonGeneral g1=new AmazonGeneral();
     g1.open();
     g1.action();
   
	}

}
