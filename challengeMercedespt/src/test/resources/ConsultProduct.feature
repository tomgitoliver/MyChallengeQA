#language EN
#Sample Feature Challenge Mercedes-Benz PT
@tag
Feature: Consult a product in the Homepage of Mercedes-Benz

  @tag1
  Scenario: Consult a product
    Given i visit the homepage of Mercedes-Benz
    When i search for a "Cabriolet" product and press the key "enter"
    Then I visualize my Mercedes-Maybach S 650 "Cabriolet" with the biggest price
    When i select my Mercedes-Maybach S 650 "Cabriolet"
    Then i visualize my Mercedes-Maybach S 650 "Cabriolet" with the Item number "B66962451"
    When i select the color "White" for my Cabriolet
    And i insert a quantity 1 or 2 for my White Cabriolet
    And i click on botton "Add to basket" to add my Cabriolet to basket
    Then I visualize my basket with my Cabriolet Item number "B66962451"
    When i click on botton "Go to shopping basket"
    Then i visualize my shopping basket with my "White" Cabriolet Item number "B66962451"
    When i click on botton "Continue to address and delivery"
    Then i visualize the Place order to insert my "Email address" and place order as guest
    When i insert my email adress "oliveira75.de@gmail.com"
    And i click on botton "Place order as guest"
    Then i visualize the form "Your invoice address"
    When i select a "Mr" Salutation
    And i insert my first name "Pedro"
    And i insert my last name "Fernandes"
    And i insert my street "Main Street"
    And i insert my street number "100"
    And i insert my postal code "SP2 0FL"
    And i insert my city "London"
    And i insert my date of birth: day "30", month "08", year "1975"
    And i insert my country "United Kingdom"
    And i insert my telephone number "123456789"
    And i click on botton "Continue to payment type"
    Then i visualize my Payment type "Credit Card" and "PayPal"
    When i select my payment type "PayPal"
    And i click on botton "Continue to verification and order plecement"
    Then i visualize my order data with my "Cabriolet" Item number "B66962451"
