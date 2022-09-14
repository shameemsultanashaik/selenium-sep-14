package com.Amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login {
	WebDriver driver;

	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement mouseHoverElement;



	@FindBy(css="#nav-flyout-ya-signin > a > span")
	private WebElement signElement ;
	
	@FindBy(id="ap_email")
	private WebElement emailElement;
	
	@FindBy(id="continue")
	private WebElement continueElement;
	
	@FindBy(id="ap_password")
	private WebElement passElement;
	
	
	@FindBy(id="signInSubmit")
	private WebElement signInElement;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchElement;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(4) > div > div > div > div > div > div > div > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.s-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style > h2 > a > span")
	private WebElement iphoneElement;
	
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchphoneElement;
	
	@FindBy(css="#a-autoid-29 > span > input")
	private WebElement addTocartElement;
	
	@FindBy(css="#a-autoid-28-announce > div > div > div.a-fixed-left-grid-col.a-col-left > div > label > input[type=radio]")
	private WebElement subcriptionbuttonElement;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[3]/div[3]/div[1]/div/div[3]/div/form/div/span[1]/span/input")
	private WebElement addTocart2Element;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/div/span/span[2]/span/button")
	private WebElement noThaksElement;
	
	
//	@FindBy(css="#attach-sidesheet-checkout-button > span > input")
//	private WebElement checkoutElement;



//doSignin
// Searchiphone
// addtoCart
	




	public Login(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

}
	public void signIn() throws InterruptedException {
		
		Actions as = new Actions(driver);
		as.moveToElement(mouseHoverElement).perform();
		signElement.click();
		emailElement.sendKeys("shameemshaik82@gmail.com");
		continueElement.click();
		passElement.sendKeys("Sultana82#");
		signInElement.click();
			

	}
	
	public void searchIphone() {
searchElement.sendKeys("i phone13 pro");
		
		searchphoneElement.click();
		searchphoneElement.click();
		
	}
	
	public void addToCart() throws InterruptedException {
		iphoneElement.click();
		addTocartElement.click();
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(subcriptionbuttonElement));
		
		subcriptionbuttonElement.click();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addTocart2Element));
		addTocart2Element.click();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(noThaksElement));

		noThaksElement.click();
		
		
	}
//	checkoutElement.click();
}
	
