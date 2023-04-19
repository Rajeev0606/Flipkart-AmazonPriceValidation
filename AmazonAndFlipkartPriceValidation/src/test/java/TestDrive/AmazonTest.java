package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClassAmazon;
import PageDrive.AmazonSearchPage;

public class AmazonTest extends BaseClassAmazon {
	
	@Test
	public void AmazonTestPage() {
		AmazonSearchPage asp = new AmazonSearchPage(driver);
		asp.Search(prop.getProperty("ProductName"));
		String Price = asp.getIphonePrice();
		System.out.println("The Price of Selected Product" +Price);
		
	}

}
