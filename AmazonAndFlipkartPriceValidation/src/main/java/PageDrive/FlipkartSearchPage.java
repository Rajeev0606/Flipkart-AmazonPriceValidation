package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class FlipkartSearchPage extends UtilClass {
	WebDriver driver;

	public FlipkartSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement loginclosebut;

	@FindBy(name = "q")
	WebElement searchBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchBut;

	@FindBy(xpath = "//div[contains(text(),'Apple iPhone XR (Yellow, 64 GB)')]")
	WebElement productNam;

	@FindBy(xpath = "//div[@class='dyC4hf']/div//div[@class='_30jeq3 _16Jk6d']")
	WebElement price;

	public void Search(String ProductName) {
		loginclosebut.click();
		searchBox.sendKeys(ProductName);
		searchBut.click();
		productNam.click();

	}

	public String getIphonePrice() {
		return price.getText();
	}


}
