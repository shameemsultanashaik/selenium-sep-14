package com.Amazon;

import org.testng.annotations.Test;

import com.Amazon.Login;



public class TestLogin extends Base {
	@Test
	public void LoginConformation() throws InterruptedException {
		
	
	Login lo = new Login(driver);
	lo.signIn();
	lo.searchIphone();
	lo.addToCart();
	
	

}
}
