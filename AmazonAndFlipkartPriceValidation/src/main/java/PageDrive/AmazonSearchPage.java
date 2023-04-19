package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class AmazonSearchPage extends UtilClass {

	WebDriver driver;

	public AmazonSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBut;

	@FindBy(xpath = "//span[text()='Apple iPhone XR, 64GB, Yellow - Unlocked (Renewed Premium)']")
	WebElement productNam;

	@FindBy(xpath = "(//span[@class='a-color-price a-text-bold'])[2]")
	WebElement price;

	public void Search(String ProductName) {
		searchBox.sendKeys(ProductName);
		searchBut.click();
		productNam.click();

	}

	public String getIphonePrice() {
		return price.getText();
	}

}
