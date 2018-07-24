package afasf.Demoq;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Base{
	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "first_name")
	private WebElement firstname;
	
	@FindBy(name= "last_name")
	private WebElement lastname;

	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;

	}
}
