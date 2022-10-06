package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void logoTest01() {
		homePage.logDisplayed();
	}

	@Test(enabled = false)
	public void signInTest() {
		homePage.signInAccount();
	}

	@Test(enabled = false) // ask Tufail bhai for the solution. ***
	public void cartBtnTest() throws InterruptedException {
		Thread.sleep(3000);
		homePage.cartLogo();
	}

	@Test(enabled = false)
	public void tvAndAudioBtnSelectedTest() throws InterruptedException {
		Thread.sleep(2000);
		boolean tvAndAudioIsSelected = driver
				.findElement(By.xpath("//span[@class='gnb__depth1-link-text' and text()='TV & Audio']")).isSelected();
		System.out.println("It has been slected? Ans:" + tvAndAudioIsSelected);
		Thread.sleep(2000);
	}

	@Test(enabled = false)
	public void use_of_get_title_method() {// get title method
		System.out.println("The title of the page is:" + driver.getTitle());
	}

	@Test(enabled = false) // get text method
	public void use_of_get_text_method() {
		WebElement textFromHomePagElement = driver.findElement(By.xpath(
				"//h2[@class='text-block-container__headline' and text()='Shop all latest offers and innovations']"));
		System.out.println("The text is :" + textFromHomePagElement.getText());
	}

	@Test(enabled = false) // get current URL method, it will get the URL of the page
	public void use_of_get_current_url_method() throws InterruptedException {// ElementClickInterceptedException------>
																				// Failing **
		driver.findElement(By.xpath("//button[text()='Galaxy Note']")).click();
		Thread.sleep(4000);
		System.out.println("This is the current URL: " + driver.getCurrentUrl());
	}

	@Test(enabled = false) // send keys method and enter button
	public void used_of_sendKeys_method() throws InterruptedException {// sending keys method working
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).sendKeys("samsung note");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).sendKeys("Galaxy note 10");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).sendKeys("Samsung note 10", Keys.ENTER);
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and return (Enter button) keys method
	public void used_of_sendKeys_and_ReturnKey_method() throws InterruptedException {// Return key method working
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).sendKeys("samsung note");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='home-page-search']")).sendKeys("Samsung Ultra", Keys.RETURN);
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and navigate method
	public void used_of_sendKeys_and_Navigate_method_01() throws InterruptedException {// forward/ back method working
		Thread.sleep(4000);
		driver.navigate().to("https://www.walmart.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();// It's not performing forward function. but not working. Working in Khan
									// academy Framework.
		Thread.sleep(4000);
	}

	@Test(enabled = false) // send and navigate method
	public void used_of_sendKeys_and_Navigate_method_02() throws InterruptedException {// navigate method working
		Thread.sleep(4000);
		driver.navigate().to("https://www.walmart.com");
		Thread.sleep(4000);
		driver.navigate().refresh(); // it's working in KhanAcademay Framework.
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void mouseHoverOverActions1() throws InterruptedException {
		driver.get("https://www.ebay.com");
		Actions actions = new Actions(driver);
		WebElement signInAccnt = driver.findElement(By.xpath("//a[@class='gh-eb-li-a gh-rvi-menu' and @title]"));
		Thread.sleep(4000);
		actions.moveToElement(signInAccnt).build().perform();
	}

	@Test(enabled = false)
	public void mouseHoverOverActions2() throws InterruptedException {
		driver.get("https://www.amazon.com");
		Actions actions = new Actions(driver);
		WebElement signInAccouent = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		actions.moveToElement(signInAccouent).build().perform();
	}
	
	@Test(enabled = false)
	public void mouseHoverOverActions3() throws InterruptedException {	//samsung website 01
		Actions actions = new Actions(driver);
		WebElement signInAccouent = driver.findElement(By.xpath("//span[@class='gnb__depth1-link-text' and text()='Mobile']"));
		Thread.sleep(4000);
		actions.moveToElement(signInAccouent).build().perform();
	}
	
	@Test(enabled = false)
	public void mouseHoverOverActions4() throws InterruptedException {	//samsung website 02
		Actions actions = new Actions(driver);
		WebElement signInAccouent = driver.findElement(By.xpath("//span[@class='gnb__depth1-link-text' and text()='Offers']"));
		Thread.sleep(4000);
		actions.moveToElement(signInAccouent).build().perform();
	}
	
	@Test(enabled = false)
	public void logoTest02() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='gnb__logo-icon']"));
		 boolean flag = logo.isDisplayed();
		 Assert.assertFalse(true, "Application logo is not displayed.....");
		// java.lang.AssertionError: Application logo is not displayed..... expected [false] but found [true]
	}
	
	@Test(enabled = false)//PASSED: logoTest03
	public void logoTest03() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='gnb__logo-icon']"));
		 boolean flag = logo.isDisplayed();
		 Assert.assertTrue(true, "Application logo is not displayed.....");
		 
	}
	
	@Test(enabled = true)
	public void use_of_get_title_method02() {// get title method
		String expected = driver.getTitle();
		String actual = "Samsung US | Mobile | TV | Home Electronics | Home Appliances | Samsung US";
		Assert.assertEquals(actual, expected, "Home title doesn't match.....");
	}
}