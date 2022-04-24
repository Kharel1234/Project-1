package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllCheckPage {

	WebDriver driver;

	public ToggleAllCheckPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement TOGGLE_ALL_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[2]/input")
	WebElement TEST_ITEM2_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[2]/input")
//	WebElement TEST_ITEM1_ELEMENT;

	public void clickToggleAllButton() {
		TOGGLE_ALL_BUTTON_ELEMENT.click();
//		TOGGLE_ALL_BUTTON_ELEMENT.clear();

	}

	public void removeSingelItem() {
		TEST_ITEM2_ELEMENT.click();
		REMOVE_ELEMENT.click();
	}
//	public void clickRemove() {
//		REMOVE_ELEMENT.click();
//	}

	public void removeAllItem() {
		TOGGLE_ALL_BUTTON_ELEMENT.click();
		REMOVE_ELEMENT.click();
	}
}


