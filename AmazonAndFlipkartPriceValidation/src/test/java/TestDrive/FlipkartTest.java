package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClassFlipkart;
import PageDrive.FlipkartSearchPage;

public class FlipkartTest extends BaseClassFlipkart{
	
	@Test
	public void FlipkartpageTest() {
		FlipkartSearchPage fsp = new FlipkartSearchPage(driver);
		fsp.Search(prop.getProperty("ProductName"));
		String flipkartPrice = fsp.getIphonePrice();
		System.out.println("The Price of the Product: "+flipkartPrice);
		
	}
}
