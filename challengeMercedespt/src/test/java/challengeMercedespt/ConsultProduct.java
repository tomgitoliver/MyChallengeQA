//---------------------------------------------------------------------------------------------------------------
// -Eclipse IDE for Java Developers
// -Apache Maven 3.6.3
// -Selenium-java-4-0-0-alpha-6
// -Cucumber eclipse plugin 1.0.202005150629
// -Cucumber-java-1.2.jar
// -Cucumber-JUnit-1.2.5.jar
//---------------------------------------------------------------------------------------------------------------
// -Testing Browser:
//
// -Firefox 78.0.2 (64-bit)
// -Driver: geckodriver-master
//---------------------------------------------------------------------------------------------------------------
// -Project: challengeMercedespt
// -Version: 0.1
//---------------------------------------------------------------------------------------------------------------

//1 - Packages

package challengeMercedespt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//2 - Libraries


//3 - Classes

public class ConsultProduct {
	//void CookieRead() {
	//}
	// 3.1 - Attributes
	static String url;
	static WebDriver driver;
	
	// 3.2 - Methods ( Tests)
	
	//@BeforeClass
	@Before // Before the test
	public  static void Iniciator() throws Exception {
		
		url ="https://shop.mercedes-benz.com/en-gb/collection/";
		//url ="https://iterasys.com.br/plataforma/home/index.php?action=initial";
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\challenge_MG_QA\\drivers\\firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//Thread.sleep(2000);
	}
	@After// After the test
	public void Finalizer() {
		// Selenium will be running in background
	    //driver.quit();
		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Given("^i visit the homepage of Mercedes-Benz$")
	public void i_visit_the_homepage_of_Mercedes_Benz() throws Throwable {
	    // Open the browser Chrome on the page of Mercedes-Benz.io
		driver.get(url);
		//driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver, 60);
		System.out.println("Step 1 - open the Homepage of Mercedes-Benz");
		//Thread.sleep(5000);
	}

	@When("^i search for a \"([^\"]*)\" product and press the key \"([^\"]*)\"$")
	public void i_search_for_a_product_and_press_the_key(String term2, String term1) throws Throwable {
	    // Selenium click on Link "Search"
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span.header-search-open-trigger-label.ng-binding")).click();	
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.chord(term2));
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
		System.out.println("Step 2 - search a list of products");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
	@Then("^I visualize my Mercedes-Maybach S (\\d+) \"([^\"]*)\" with the biggest price$")
	public void i_visualize_my_Mercedes_Maybach_S_with_the_biggest_price(int term3, String term4) throws Throwable {
	    // Validation of the page and navigation
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		assertEquals("Mercedes-Maybach S 650 "+term4, driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).getText());
		//assertEquals(term3, driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).getText());
		//assertEquals("Mercedes-Maybach S 650 \"" + term2 + "\"", driver.findElement(By.cssSelector("h2.dcp-ar2.ng-binding")).getText());	                                                                                   
		System.out.println("Step 3 - visualize a list of products");
	}
	
	@When("^i select my Mercedes-Maybach S (\\d+) \"([^\"]*)\"$")
	public void i_select_my_Mercedes_Maybach_S(int arg1, String term5) throws Throwable {
	    // Selenium click on product 
		driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).click();
		System.out.println("Step 4 - select a product and press enter");
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
	}

	@Then("^i visualize my Mercedes-Maybach S (\\d+) \"([^\"]*)\" with the Item number \"([^\"]*)\"$")
	public void i_visualize_my_Mercedes_Maybach_S_with_the_Item_number(int term8, String term6, String term7) throws Throwable {
		assertEquals("Mercedes-Maybach S 650 " + term6, driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).getText());
		System.out.println("Step 5 - visualize the description of the product");
	}

	@When("^i select the color \"([^\"]*)\" for my Cabriolet$")
	public void i_select_the_color_for_my_Cabriolet(String term9) throws Throwable {
    // Select the color of the product 
		//driver.findElement(By.cssSelector("div.pdp-buy-box-colors-item.pdp-buy-box-colors-item-selected")).click();
		//assertEquals("Black", driver.findElement(By.cssSelector("ng-binding")).getText());
		System.out.println("Step 6 - select the color of the product");
	}

	@When("^i insert a quantity (\\d+) or (\\d+) for my White Cabriolet$")
	public void i_insert_a_quantity_or_for_my_White_Cabriolet(int term10, int term11) throws Throwable {
		//driver.findElement(By.cssSelector("dbutton.dcp-utils-product-quantity_element.dcp-utils-product-quantity_btn")).click();
		//assertEquals("Black", driver.findElement(By.cssSelector("ng-binding")).getText());
		System.out.println("Step 7 - insert the quantity of the product");
	}

	@When("^i click on botton \"([^\"]*)\" to add my Cabriolet to basket$")
	public void i_click_on_botton_to_add_my_Cabriolet_to_basket(String term12) throws Throwable {
	    // Add the product to basket
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector(".wb-e-btn-1:nth-child(2)")).click();
		driver.findElement(By.xpath("//button[contains(.,' Add to basket')]")).click();
		System.out.println("Step 8 - add the product to basket");
	}

	@Then("^I visualize my basket with my Cabriolet Item number \"([^\"]*)\"$")
	public void i_visualize_my_basket_with_my_Cabriolet_Item_number(String term11) throws Throwable {
	    // Validation of the page and navigation
		//assertEquals("Item number: B66040617", driver.findElement(By.cssSelector("p.hidden-xs.dcp-orderline-product-info_item.ng-binding.ng-scope")).getText());
		System.out.println("Step 9 - visualize the basket with the product");
	}
	
	@When("^i click on botton \"([^\"]*)\"$")
	public void i_click_on_botton(String term12) throws Throwable {
	    // Go to Shopping Basket
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-350)", "");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,' Go to shopping basket')]")).click();
		//driver.findElement(By.cssSelector("button.wb-e-btn-1.dcp-modal_cta.dcp-modal_cta--primary.ng-binding")).click();
		System.out.println("Step 10 - go to shopping basket");
	}

	@Then("^i visualize my shopping basket with my \"([^\"]*)\" Cabriolet Item number \"([^\"]*)\"$")
	public void i_visualize_my_shopping_basket_with_my_Cabriolet_Item_number(String term13, String term14) throws Throwable {
	    // Validate page Shopping Basket
		//assertEquals("Item number: B66040617", driver.findElement(By.cssSelector("p.hidden-xs.dcp-orderline-product-info_item.ng-binding.ng-scope")).getText());
		System.out.println("Step 11 - visualize the total in my shopping basket");
	}

	@When("^i click on botton Continue to address and delivery$")
	public void i_click_on_botton_Continue_to_address_and_delivery() throws Throwable {
	    // Go to Place order as guest
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-300)", "");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Continue to address and delivery')]")).click();
		System.out.println("Step 12 - go to Place order as guest ");
	}

	@Then("^i visualize the Place order to insert my \"([^\"]*)\" and place order as guest$")
	public void i_visualize_the_Place_order_to_insert_my_and_place_order_as_guest(String term15) throws Throwable {
	    // Validate place order as guest
		assertEquals("Validate place order as guest", driver.findElement(By.cssSelector("h3.dcp-ar3.dcp-order-process-login-panel_headline.ng-binding")).getText());
		System.out.println("Step 13 - visualize the Place order as guest");
	}
	
	@When("^i insert my email adress \"([^\"]*)\"$")
	public void i_insert_my_email_adress(String term16) throws Throwable {
	    // Insert ma email address
		driver.findElement(By.id("#dcp-login-guest-user-email")).sendKeys(Keys.chord(term16));
		driver.findElement(By.id("#dcp-login-guest-user-email")).sendKeys(Keys.ENTER);
		System.out.println("Step 14 - insert my email address");
	}

	@When("^i click on botton Place order as guest$")
	public void i_click_on_botton_Place_order_as_guest() throws Throwable {
	    // Click on Place order as guest
		driver.findElement(By.cssSelector("button.wb-e-btn-2.dcp-order-process-login-panel_cta.ng-binding")).click();
		System.out.println("Step 15 - click on Place order as guest");
	}

	@Then("^i visualize the form \"([^\"]*)\"$")
	public void i_visualize_the_form(String term17) throws Throwable {
	    // Validate Form Your invoice address
		assertEquals("oliveira75.de@gmail.com", driver.findElement(By.cssSelector("#co_payment_address-email")).getText());
		System.out.println("Step 16 - visualize the form Your invoice address");
	}

	@When("^i select a \"([^\"]*)\" Salutation$")
	public void i_select_a_Salutation(String term18) throws Throwable {
	    // Insert a salutation
		driver.findElement(By.cssSelector("lavel.dcp-form-radio-group_label.ng-binding.wb-e-radio-3_label")).click();
		System.out.println("Step 17 - insert a Salutation (Mr / Ms)");
	}

	@When("^i insert my first name \"([^\"]*)\"$")
	public void i_insert_my_first_name(String term19) throws Throwable {
	    // Insert my first name
		driver.findElement(By.cssSelector("#co_payment_address-firstName")).click();
		driver.findElement(By.id("#co_payment_address-firstName")).sendKeys(Keys.chord(term19));
		System.out.println("Step 18 - insert my first name");
	}

	@When("^i insert my last name \"([^\"]*)\"$")
	public void i_insert_my_last_name(String term20) throws Throwable {
	    // Insert my last name
		driver.findElement(By.cssSelector("#co_payment_address-lastName")).click();
		driver.findElement(By.id("#co_payment_address-lastName")).sendKeys(Keys.chord(term20));
		System.out.println("Step 19 - insert my last name");
	}

	@When("^i insert my street \"([^\"]*)\"$")
	public void i_insert_my_street(String term21) throws Throwable {
	    // Insert my street name
		driver.findElement(By.cssSelector("#co_payment_address-line1")).click();
		driver.findElement(By.id("#co_payment_address-line1")).sendKeys(Keys.chord(term21));
		System.out.println("Step 20 - insert my Street name");
	}

	@When("^i insert my street number \"([^\"]*)\"$")
	public void i_insert_my_street_number(String term22) throws Throwable {
	    // Insert the street number
		driver.findElement(By.cssSelector("#co_payment_address-line2")).click();
		driver.findElement(By.id("#co_payment_address-line2")).sendKeys(Keys.chord(term22));
		System.out.println("Step 21 - insert my street number");
	}
	@When("^i insert my postal code \"([^\"]*)\"$")
	public void i_insert_my_postal_code(String term23) throws Throwable {
	    // Insert my postal code
		driver.findElement(By.cssSelector("#co_payment_address-postalCode")).click();
		driver.findElement(By.id("#co_payment_address-postalCode")).sendKeys(Keys.chord(term23));
		System.out.println("Step 22 - insert my Post code");
	}

	@When("^i insert my city \"([^\"]*)\"$")
	public void i_insert_my_city(String term24) throws Throwable {
	    // Insert my city
		driver.findElement(By.cssSelector("#co_payment_address-town")).click();
		driver.findElement(By.id("#co_payment_address-town")).sendKeys(Keys.chord(term24));
		System.out.println("Step 23 - insert my Town/City");
	}

	@When("^i insert my date of birth: day \"([^\"]*)\", month \"([^\"]*)\", year \"([^\"]*)\"$")
	public void i_insert_my_date_of_birth_day_month_year(String term25, String term26, String term27) throws Throwable {
	    // Insert my birthday
		driver.findElement(By.cssSelector("##co_payment_address-dateOfBirth")).click();
		driver.findElement(By.id("#co_payment_address-dateOfBirth")).sendKeys(Keys.chord(term25));
		driver.findElement(By.cssSelector("input.wb-e-inp-1_input.dcp-form-date-group_input.ng-touched")).click();
		driver.findElement(By.id("input.wb-e-inp-1_input.dcp-form-date-group_input.ng-touched")).sendKeys(Keys.chord(term26));
		driver.findElement(By.cssSelector("dcp-schema-form-date_dateOfBirth-third")).click();
		driver.findElement(By.id("dcp-schema-form-date_dateOfBirth-third")).sendKeys(Keys.chord(term27));
		System.out.println("Step 24 - insert my Date of birth (e.g. 01/12/1978)");
	}

	@When("^i insert my country \"([^\"]*)\"$")
	public void i_insert_my_country(String term28) throws Throwable {
	    // Insert my country
		driver.findElement(By.cssSelector("button.dcp-sr3./.dropdown-toggle")).click();
		driver.findElement(By.id("button.dcp-sr3./.dropdown-toggle")).sendKeys(Keys.chord(term28));
		System.out.println("Step 25 - insert my Country");
	}

	@When("^i insert my telephone number \"([^\"]*)\"$")
	public void i_insert_my_telephone_number(String term29) throws Throwable {
	    // Insert my Telephone number
		driver.findElement(By.cssSelector("#co_payment_address-phone")).click();
		driver.findElement(By.id("#co_payment_address-phone")).sendKeys(Keys.chord(term29));
		System.out.println("Step 26 - insert my Telephone number");
	}

	@When("^i click on botton Continue to payment type$")
	public void i_click_on_botton_Continue_to_payment_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button.wb-e-btn-1.dcp-co-func-footer_cta-primary.ng-binding.ng-scope")).click();		
		System.out.println("Step 27 - click on Continue payment type");
		
	}

	@Then("^i visualize my Payment type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_visualize_my_Payment_type_and(String arg30, String arg31) throws Throwable {
	    // Validate my payment type ( Credit card / Paypal)
		assertEquals("oliveira75.de@gmail.com", driver.findElement(By.cssSelector("#co_payment_address-email")).getText());
		System.out.println("Step 28 - visualize My Payment type ( Credit card / Paypal) ");
	}
	
	@When("^i select my payment type \"([^\"]*)\"$")
	public void i_select_my_payment_type(String term32) throws Throwable {
	    // Select my payment
		driver.findElement(By.cssSelector("label.wb-e-radio-1_label.dcp-form-radio-group_label")).click();	
		System.out.println("Step 29 - select Paypal ");
	}

	@When("^i click on botton Continue to verification and order plecement$")
	public void i_click_on_botton_Continue_to_verification_and_order_plecement() throws Throwable {
	    // Continue verification and order placement
		driver.findElement(By.cssSelector("button.wb-e-btn-1.dcp-co-func-footer_cta-primary.ng-binding.ng-scope")).click();		
		System.out.println("Step 30 - click on Continue to verification and order placement");
	}

	@Then("^i visualize my order data with my \"([^\"]*)\" Item number \"([^\"]*)\"$")
	public void i_visualize_my_order_data_with_my_Item_number(String term33, String term34) throws Throwable {
	    // Validate My Order Date
		assertEquals("oliveira75.de@gmail.com", driver.findElement(By.cssSelector("div.dcp-co-order-data-panel_content.ng-binding")).getText());
		System.out.println("Step 31 - visualize My Order Data");
	}


}

