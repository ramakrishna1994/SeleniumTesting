package TestScripts;

import org.testng.annotations.Test;

import Libraries.FormLogin;


public class LoginTests {
	
	@Test
	public void test1() throws Exception
	{
		FormLogin.loginForm("Invalid login - check the error message");
	}	

	@Test
	public void test2() throws Exception
	{
		FormLogin.loginForm("login with admin");
	}	
}		
	

