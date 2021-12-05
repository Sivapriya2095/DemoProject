
@tag
Feature: Hotel Adactin Login Validation
 
 Background:
 Given Launch the browser
    And Open the Adactin hotel Login page

Scenario Outline: Validate Adactin Login 
    When User enter the login page with valid "<username>" and "<Password>"
    And Click login button
    Then Validate the error message
    And Close the browser
    
Examples:
|username|Password|
|harry|56CLEU|

Scenario Outline: Validate Adactin Login 
		When User enter the login page with valid "<username>" and "<Password>"
    And Click login button
    And Select location "<location>"
    And Select hotel "<hotel>"
    And Select room type "<roomType>"
    And Select number of room "<roomNo>"
    And Enter check in date "<checkin>"
    And Enter check out date "<checkout>"
    And Select number of adult "<adultno>"
    And Select number of child "<childno>"
    And Click search button
    And Click the hotel
    And Click the submit button
    And Enter First Name "<firstName>"
    And Enter Last Name "<lastName>"
    And Enter Billing address "<address>"
    And Enter Credit card "<cardNo>"
    And Select Credit card type "<cardType>"
    And Select Expiry month "<expiryMonth>"
    And Select Expiry year "<expiryYear>"
    And Enter CVV "<cvv>"
    And Click book now
    Then Validate the booking
    And Close the browser
Examples:
|username|Password|location|hotel|roomType|roomNo|checkin|checkout|adultno|childno|firstName|lastName|address|cardNo|cardType|expiryMonth|expiryYear|cvv|
|harry123|56CLEU|Melbourne|Hotel Creek|Standard|3 - Three|28/11/2021|30/11/2021|2 - Two|1 - One|Harry|Strokes|Chennai|1234567890987654|American Express|February|2022|123|
   