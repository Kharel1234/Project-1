package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllCheckPage;
import util.BrowserFactory;

public class ToggleAllCheckTest {
	WebDriver driver;

	@Before
	public void initBrowser() {
		driver = BrowserFactory.init();
	}

	@Test
	public void testTODOLIST() throws InterruptedException {

		ToggleAllCheckPage todolistpage = PageFactory.initElements(driver, ToggleAllCheckPage.class);
		todolistpage.clickToggleAllButton();
		Thread.sleep(3000);
		todolistpage.removeSingelItem();
		Thread.sleep(3000);
		todolistpage.removeAllItem();
		Thread.sleep(3000);
		
	}

	@After
	public void tearDown() {
		BrowserFactory.tearDown();
	}

}
