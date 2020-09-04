//---------------------------------------------------------------------------------------------------------------
//-Eclipse IDE for Java Developers
//-Apache Maven 3.6.3
//-Selenium-java-4-0-0-alpha-6
//-Cucumber eclipse plugin 1.0.202005150629
//-Cucumber-java-1.2.jar
//-Cucumber-JUnit-1.2.5.jar
//---------------------------------------------------------------------------------------------------------------
//-Testing Browser:
//
//-Google Chrome 84.0.4147.235 (64-bit)
//-Driver: geckodriver-master
//---------------------------------------------------------------------------------------------------------------
//-Project: challengeMercedespt
//-Autor: Oliveira
//-Date: 02.09.2020
//-Version: 0.1
//---------------------------------------------------------------------------------------------------------------

//1 - Packages

package challengeMercedespt2;

//2 - Libraries

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
import org.openqa.selenium.JavascriptExecutor;
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

//3 - Classes

public class ConsultProduct2 {
	private static final Object Element = null;

	// 3.1 - Attributes
	
	static String url;
	static WebDriver driver;
	
	// 3.2 - Methods ( Tests)

	@Before // Before the test
	public  static void Iniciator() throws Exception {	
		url ="https://shop.mercedes-benz.com/en-gb/collection/";
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\challenge_MG_QA\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//Thread.sleep(2000);
	}
	@After// After the test
	public void Finalizer() {
		// Selenium will be running in background
	    driver.quit();
		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Given("^i visit the homepage of Mercedes-Benz$")
	public void i_visit_the_homepage_of_Mercedes_Benz() throws Throwable {
	    // I open the Shopping Homepage of Mercedes-Benz with the Google Chrome Browser.
		driver.get(url);
		System.out.println("Step 1 - open the Homepage of Mercedes-Benz with the Google Chrome Browser.");
		//Thread.sleep(5000);
	}

	@When("^i search for a \"([^\"]*)\" product and press the key \"([^\"]*)\"$")
	public void i_search_for_a_product_and_press_the_key(String term21, String term22) throws Throwable {
	    // I search my product into the field "Search".
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span.header-search-open-trigger-label.ng-binding")).click();	
		driver.findElement(By.id("searchTerm")).sendKeys(term21);
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
		System.out.println("Step 2 - search a list of products with kind Cabriolet.");
 }
	@Then("^I visualize my Mercedes-Maybach S (\\d+) \"([^\"]*)\" with the biggest price$")
	public void i_visualize_my_Mercedes_Maybach_S_with_the_biggest_price(int term31, String term32) throws Throwable {
	    // I validade my search on the correct page navigation with my product name: Mercedes-Maybach S 650 Cabriolet.
		Thread.sleep(3000);
		Thread.sleep(3000);
		assertEquals("Mercedes-Maybach S 650 "+term32, driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).getText());                                                                                   
		System.out.println("Step 3 - visualize a list of products");
	}
	
	@When("^i select my Mercedes-Maybach S (\\d+) \"([^\"]*)\"$")
	public void i_select_my_Mercedes_Maybach_S(int term41, String term42) throws Throwable {
	    // I select my product: Mercedes-Maybach S 650 Cabriolet.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)");
		Thread.sleep(3000);
		//WebElement Element4 = driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]"));
		//js.executeScript("arguments[0].scrollIntoView();", Element4);
		driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).click();
		Thread.sleep(3000);
		System.out.println("Step 4 - select a product and press enter");
	}

	@Then("^i visualize my Mercedes-Maybach S (\\d+) \"([^\"]*)\" with the Item number \"([^\"]*)\"$")
	public void i_visualize_my_Mercedes_Maybach_S_with_the_Item_number(int term51, String term52, String term53) throws Throwable {
		// I validade my correct page navigation using the product name: Mercedes-Maybach S 650 Cabriolet.
		// I validade my correct page navigation using the Item number: B66962451 (Optional).
		//assertEquals("Mercedes-Maybach S 650 " + term6, driver.findElement(By.xpath("//h3[contains(.,'Mercedes-Maybach S 650 Cabriolet')]")).getText());
		System.out.println("Step 5 - visualize the description of the product");
	}

	@When("^i select the color \"([^\"]*)\" for my Cabriolet$")
	public void i_select_the_color_for_my_Cabriolet(String term6) throws Throwable {
     // I select the color [Red( ), White(X)] for my product name: Mercedes-Maybach S 650 Cabriolet. (Optional and White is selected!).
		//WebElement Element6 = driver.findElement(By.cssSelector("div.pdp-buy-box-colors-item.pdp-buy-box-colors-item-selected"));
		//js.executeScript("arguments[0].scrollIntoView();", Element6);
		//driver.findElement(By.cssSelector("div.pdp-buy-box-colors-item.pdp-buy-box-colors-item-selected")).click();
		//assertEquals("Black", driver.findElement(By.cssSelector("ng-binding")).getText());
		System.out.println("Step 6 - select the color of the product");
	}

	@When("^i insert a quantity (\\d+) or (\\d+) for my White Cabriolet$")
	public void i_insert_a_quantity_or_for_my_White_Cabriolet(int term71, int term72) throws Throwable {
	    // I select the quantity for product name: Mercedes-Maybach S 650 Cabriolet (Optional and "1" is standard).
		//WebElement Element7 = driver.findElement(By.cssSelector("dbutton.dcp-utils-product-quantity_element.dcp-utils-product-quantity_btn"));
		//js.executeScript("arguments[0].scrollIntoView();", Element7);
		//driver.findElement(By.cssSelector("dbutton.dcp-utils-product-quantity_element.dcp-utils-product-quantity_btn")).click();
		//assertEquals("Black", driver.findElement(By.cssSelector("ng-binding")).getText());
		System.out.println("Step 7 - insert the quantity of the product");
	}

	@When("^i click on botton Add to basket to add my Cabriolet to basket$")
	public void i_click_on_botton_Add_to_basket_to_add_my_Cabriolet_to_basket() throws Throwable {
	    // I add my product name: Mercedes-Maybach S 650 Cabriolet with color "White" to basket.
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element8 = driver.findElement(By.xpath("//button[contains(.,' Add to basket')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element8);
		driver.findElement(By.xpath("//button[contains(.,' Add to basket')]")).click();	
		System.out.println("Step 8 - add the product to basket");
	}

	@Then("^I visualize my basket with my Cabriolet Item number \"([^\"]*)\"$")
	public void i_visualize_my_basket_with_my_Cabriolet_Item_number(String term9) throws Throwable {
	    // I validate my correct page navigation with the product Item Number: "B66962451".
		//Thread.sleep(3000);
		//WebElement Element = driver.findElement(By.xpath("//button[contains(.,' Add to basket')]"));
		//assertEquals("Item number: B66040617", driver.findElement(By.cssSelector("p.hidden-xs.dcp-orderline-product-info_item.ng-binding.ng-scope")).getText());
		System.out.println("Step 9 - visualize the basket with the product");
	}
	
	@When("^i click on botton Go to shopping basket$")
	public void i_click_on_botton_Go_to_shopping_basket() throws Throwable {
	    // I click on button "Go to Shopping Basket".
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("button.wb-e-btn-1.dcp-modal__cta.dcp-modal__cta--primary.ng-binding")).click();	
		//driver.findElement(By.xpath("//button[contains(.,'Go to shopping basket')]")).click();
		System.out.println("Step 10 - go to shopping basket");
	}

	@Then("^i visualize my shopping basket with my \"([^\"]*)\" Cabriolet Item number \"([^\"]*)\"$")
	public void i_visualize_my_shopping_basket_with_my_Cabriolet_Item_number(String term11, String term14) throws Throwable {
	    // I validate the correct page navigation with the product Item Number: "B66962451".
		//assertEquals("Item number: B66040617", driver.findElement(By.cssSelector("p.hidden-xs.dcp-orderline-product-info_item.ng-binding.ng-scope")).getText());
		System.out.println("Step 11 - visualize the total in my shopping basket");
	}

	@When("^i click on botton Continue to address and delivery$")
	public void i_click_on_botton_Continue_to_address_and_delivery() throws Throwable {
	    // I click on button "Go to Place order as guest".
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.findElement(By.cssSelector("button.wb-e-btn-1.dcp-co-func-header__cta-primary.ng-binding")).click();	
		System.out.println("Step 12 - go to Place order as guest ");
	    //driver.quit();		
	}

	@Then("^i visualize the Place order to insert my \"([^\"]*)\" and place order as guest$")
	public void i_visualize_the_Place_order_to_insert_my_and_place_order_as_guest(String term13) throws Throwable {
	    // I validade my correct page navigation with the text "Validate place order as guest".
		//assertEquals("Validate place order as guest", driver.findElement(By.cssSelector("h3.dcp-ar3.dcp-order-process-login-panel_headline.ng-binding")).getText());
		System.out.println("Step 13 - visualize the Place order as guest");
	}
	
	@When("^i insert my email adress \"([^\"]*)\"$")
	public void i_insert_my_email_adress(String term14) throws Throwable {
	    // I insert my email address
		driver.findElement(By.cssSelector("#dcp-login-guest-user-email")).click();	
		driver.findElement(By.cssSelector("#dcp-login-guest-user-email")).sendKeys(term14);
		//driver.findElement(By.cssSelector("#dcp-login-guest-user-email")).sendKeys(Keys.ENTER);
		System.out.println("Step 14 - insert my email address");
	}

	@When("^i click on botton Place order as guest$")
	public void i_click_on_botton_Place_order_as_guest() throws Throwable {
	    // I click on button "Place order as guest".
		driver.findElement(By.cssSelector(".dcp-order-process-login-panel__cta:nth-child(2)")).click();
		System.out.println("Step 15 - click on Place order as guest");
	}

	@Then("^i visualize the form \"([^\"]*)\"$")
	public void i_visualize_the_form(String term16) throws Throwable {
	    // I validate my correct navigation with the text "Form Your invoice address".
		//assertEquals("oliveira75.de@gmail.com", driver.findElement(By.cssSelector("#co_payment_address-email")).getText());
		System.out.println("Step 16 - visualize the form Your invoice address");
	}

	@When("^i select a \"([^\"]*)\" Salutation$")
	public void i_select_a_Salutation(String term17) throws Throwable {
	    // I select my Salutation Mr.
		driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > .dcp-form-radio-group__label")).click();
		Thread.sleep(1000);
		System.out.println("Step 17 - insert a Salutation (Mr / Ms)");
	}

	@When("^i insert my first name \"([^\"]*)\"$")
	public void i_insert_my_first_name(String term18) throws Throwable {
	    // Insert my first name.
		driver.findElement(By.cssSelector("#co_payment_address-firstName")).click();
		driver.findElement(By.cssSelector("#co_payment_address-firstName")).sendKeys(term18);
		//driver.findElement(By.cssSelector("#co_payment_address-firstName")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		System.out.println("Step 18 - insert my first name");
	}

	@When("^i insert my last name \"([^\"]*)\"$")
	public void i_insert_my_last_name(String term19) throws Throwable {
	    // I insert my last name.
		driver.findElement(By.cssSelector("#co_payment_address-lastName")).click();
		driver.findElement(By.cssSelector("#co_payment_address-lastName")).sendKeys(term19);
		//driver.findElement(By.cssSelector("#co_payment_address-lastName")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		System.out.println("Step 19 - insert my last name");
	}

	@When("^i insert my street \"([^\"]*)\"$")
	public void i_insert_my_street(String term20) throws Throwable {
	    // I insert my street name.
		driver.findElement(By.cssSelector("#co_payment_address-line1")).click();
		driver.findElement(By.cssSelector("#co_payment_address-line1")).sendKeys(term20);
		//driver.findElement(By.cssSelector("#co_payment_address-line1")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		System.out.println("Step 20 - insert my Street name");
	}

	@When("^i insert my street number \"([^\"]*)\"$")
	public void i_insert_my_street_number(String term21) throws Throwable {
	    // I insert the street number.
		driver.findElement(By.cssSelector("#co_payment_address-line2")).click();
		driver.findElement(By.cssSelector("#co_payment_address-line2")).sendKeys(term21);
		//driver.findElement(By.cssSelector("#co_payment_address-line2")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		System.out.println("Step 21 - insert my street number");
	}
	@When("^i insert my postal code \"([^\"]*)\"$")
	public void i_insert_my_postal_code(String term22) throws Throwable {
	    // I insert my postal code.
		driver.findElement(By.cssSelector("#co_payment_address-postalCode")).click();
		driver.findElement(By.cssSelector("#co_payment_address-postalCode")).sendKeys(term22);
		//driver.findElement(By.cssSelector("#co_payment_address-postalCode")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		System.out.println("Step 22 - insert my Post code");
	}

	@When("^i insert my city \"([^\"]*)\"$")
	public void i_insert_my_city(String term23) throws Throwable {
	    // I insert my city.
		driver.findElement(By.cssSelector("#co_payment_address-town")).click();
		driver.findElement(By.cssSelector("#co_payment_address-town")).sendKeys(term23);
		//driver.findElement(By.cssSelector("#co_payment_address-town")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		System.out.println("Step 23 - insert my Town/City");
	}

	@When("^i insert my date of birth: day \"([^\"]*)\", month \"([^\"]*)\", year \"([^\"]*)\"$")
	public void i_insert_my_date_of_birth_day_month_year(String term241, String term242, String term243) throws Throwable {
	    // Insert my birthday ( XX, XX, XXXX).
		driver.findElement(By.cssSelector("#co_payment_address-dateOfBirth")).click();
		driver.findElement(By.cssSelector("#co_payment_address-dateOfBirth")).sendKeys(term241);
		//driver.findElement(By.cssSelector("#co_payment_address-dateOfBirth")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".wb-e-inp-1__label:nth-child(2) > .wb-e-inp-1__input")).click();
		driver.findElement(By.cssSelector(".wb-e-inp-1__label:nth-child(2) > .wb-e-inp-1__input")).sendKeys(term242);
		//driver.findElement(By.cssSelector(".wb-e-inp-1__label:nth-child(2) > .wb-e-inp-1__input")).sendKeys(Keys.TAB);		
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector(".dcp-form-date-group__year")).click();
		driver.findElement(By.cssSelector(".dcp-form-date-group__year")).sendKeys(term243);
		//driver.findElement(By.cssSelector(".dcp-form-date-group__year")).sendKeys(Keys.TAB);	
		Thread.sleep(1000);	
		System.out.println("Step 24 - insert my Date of birth (e.g. 31/12/1978)");
	}

	@When("^i insert my country \"([^\"]*)\"$")
	public void i_insert_my_country(String term25) throws Throwable {
	    // I insert my country (Optional, United Kingdom is standard!).
		//driver.findElement(By.cssSelector("button.dcp-sr3./.dropdown-toggle")).click();
		//driver.findElement(By.id("button.dcp-sr3./.dropdown-toggle")).sendKeys(Keys.chord(term28));
		Thread.sleep(1000);
		System.out.println("Step 25 - insert my Country");
	}

	@When("^i insert my telephone number \"([^\"]*)\"$")
	public void i_insert_my_telephone_number(String term26) throws Throwable {
	    // I insert my Telephone number (Optional!).
		driver.findElement(By.cssSelector("#co_payment_address-phone")).click();
		driver.findElement(By.cssSelector("#co_payment_address-phone")).sendKeys(term26);
		Thread.sleep(3000);
		System.out.println("Step 26 - insert my Telephone number");
	}

	@When("^i click on botton Continue to payment type$")
	public void i_click_on_botton_Continue_to_payment_type() throws Throwable {
	    // I click on button "Continue to payment".
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(3000);
		//WebElement Element27 = driver.findElement(By.cssSelector(".dcp-co-func-footer__cta-primary"));
		//js.executeScript("arguments[0].scrollIntoView();", Element27);
		driver.findElement(By.cssSelector(".dcp-co-func-footer__cta-primary")).click();
		Thread.sleep(3000);
		System.out.println("Step 27 - click on Continue payment type");	
	}

	@Then("^i visualize my Payment type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_visualize_my_Payment_type_and(String arg30, String arg31) throws Throwable {
	    // I validate my correct navigation with the text "My payment type ( Credit card / Paypal)".
		//assertEquals("oliveira75.de@gmail.com", driver.findElement(By.cssSelector("#co_payment_address-email")).getText());
		System.out.println("Step 28 - visualize My Payment type ( Credit card / Paypal) ");
	}
	
	@When("^i select my payment type \"([^\"]*)\"$")
	public void i_select_my_payment_type(String term32) throws Throwable {
	    // I select my payment type PayPal.
		driver.findElement(By.cssSelector(".dcp-co-payment-modes-overview__item:nth-child(3) .wb-e-radio-1__label")).click();	
		Thread.sleep(3000);
		System.out.println("Step 29 - select Paypal ");
	}

	@When("^i click on botton Continue to verification and order plecement$")
	public void i_click_on_botton_Continue_to_verification_and_order_plecement() throws Throwable {
	    // I click on button "Continue verification and order placement".
		driver.findElement(By.cssSelector(".dcp-co-func-header__cta-primary")).click();	
		Thread.sleep(4000);	
		System.out.println("Step 30 - click on Continue to verification and order placement");
	}

	@Then("^i visualize my order data with my \"([^\"]*)\" Item number \"([^\"]*)\"$")
	public void i_visualize_my_order_data_with_my_Item_number(String term33, String term34) throws Throwable {
	    // I validade my correct navigation with the text "Validate My Order Date". 
		// ATTENTION: here shall this automation be stopped!).
		//assertEquals("oliveira75.de@gmail.com", driver.findElement(By.cssSelector("div.dcp-co-order-data-panel_content.ng-binding")).getText());
		System.out.println("Step 31 - visualize My Order Data and STOP this Testing!.");
	    driver.quit();
	}

}
