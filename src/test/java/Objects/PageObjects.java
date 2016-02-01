package Objects;

import java.util.HashMap;

public  class PageObjects {
	 public final static  HashMap<String,String> loginMap = new HashMap<String,String>();
	 
	 public static  HashMap<String,String> loginObjects() {
		 loginMap.put("userName", "inputUsername");
		 loginMap.put("password", "inputPassword");
		 loginMap.put("login", "//button[text()='Login']");
		 loginMap.put("support", "link=Support");
		 loginMap.put("teradata", "link=Teradata Aster");
		 loginMap.put("loginForm", "//form[@id='auth-form']/div");
		 loginMap.put("message", "div.message");
		 return loginMap;
	 }
	 
/*	public static String userName = "id='inputUsername'";
	public static String password = "id=inputPassword";
	public static String login = "//button[text()='Login']";
	public static String support = "link=Support";
	public static String teradata = "link=Teradata Aster";
	public static String loginForm = "//form[@id='auth-form']/div";*/
}
