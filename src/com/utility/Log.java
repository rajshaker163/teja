package com.utility;

import org.apache.log4j.Logger;

public class Log {

	//public static void info(String string) {
		// TODO Auto-generated method stub
	private static  Logger log1=Logger.getLogger(Log.class.getName());
	
	public static void info(String Message) 
	{
		log1.info(Message);
	}
	
	public static void error(String message)
	{
		log1.error(message);
	
	}

	
}
