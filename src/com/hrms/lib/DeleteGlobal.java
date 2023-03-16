package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class DeleteGlobal {

	
	WebDriver driver;
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String SearrchBy="Emp.ID";
	public String SearchFor="4037";

	
	
	public String username="txtUserName";
	public String Password="txtPassword";
	public String login_btn="Submit";
	public String searchBy1="loc_code";
	public String SearchFor1="loc_name";
	public String Search_btn="//input[@type='button']";
	public String Radio_btn="chkLocID[]";
	public String Delete_btn="//input[@type='button']";
	public String Logout_btn="Logout";
}