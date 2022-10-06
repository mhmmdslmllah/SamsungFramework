package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// Page Factory class helps to instantiate the web elements
	}

	@FindBy(xpath = "//div[@class='gnb__logo-icon']")     //div[@class='gnb__logo-icon']
	WebElement logo;                                                      //div[@class='gnb__logo-icon']

	@FindBy(className = "gnb__login-btn")
	WebElement signIn;

	@FindBy(xpath = "//a[@class='gnb__cart-btn js-gp-cart-btn' and @role='button']")
	WebElement cartBtn;

	public boolean logDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("Is the logo Displayed:" + flag);
		return flag;
	}

	public void signInAccount() {
		signIn.click();
	}

	public void cartLogo() throws InterruptedException {
		Thread.sleep(3000);
		cartBtn.click();
		Thread.sleep(3000);
	}

}
