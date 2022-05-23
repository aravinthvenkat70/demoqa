Feature: validating adactin hotel username and password
@smoke
Scenario: incorrect username and correct password
Given user launch chrome browser
When login enters username "aravinthvenk"and password "123456"
And click login button
Then user verify home page


@smoke
Scenario: validate valid username and valid password
Given user should launch chrome browser
When user enter valid username"aravinthvenkat"and password"123456"and location"Brisbane"and hotel "Hotel Hervey"and roomtype"Deluxe"and number of rooms"3"and check in date "17/05/2022"and check out date"19/05/2022"and number of adult"3"number of children"2"and firstname"Aravinth" and lastname"ssr"and adress"viluppuram"and card number"1234567890123456"and cardtype"MAST"and Cardexpirymonth"2"and cardexpiryyear"2021"and cvv number "123" 	and
And user click the book now button



@E2E
Scenario: validate by filing only mandatory fields
Given user chrome browser launch
When user enter valid username"aravinthvenkat"and password"123456"and location"Brisbane"and number of rooms"3"and check in date "17/05/2022"and check out date"19/05/2022"and number of adult"3"and firstname"Aravinth" and lastname"ssr"and adress"viluppuram" and card number"1234567890123456"and cardtype"MAST"and Cardexpirymonth"2"and cardexpiryyear"2022"and cvv number"123" and user should click the book now button




@smoke
Scenario: validate booking and cancelling the order
Given user launch browser chrome home
When user enter valid username"aravinthvenkat"and password"123456"and location"Brisbane"and hotel "Hotel Hervey"and roomtype"Deluxe"and number of rooms"3"and check in date "17/05/2022"and check out date"19/05/2022"and number of adult"3"number of children"2"and firstname"Aravinth" and lastname"ssr"and adress"viluppuram"and card number"1234567890123456"and cardtype"MAST"and Cardexpirymonth"2"and cardexpiryyear"2021"and cvv number"123" and user click the book now button to book
Then user copy the orderno
When click the bookeditineary



@reg
Scenario: validate by filing with wrong checkin and checkout date
Given user  should launch chrome browser
When user have to enter valid username"aravinthvenkat"and password"123456"and location"Brisbane"and hotel "Hotel Hervey"and roomtype"Deluxe"and number of rooms"3"and check in date "19/05/2022"and check out date"17/05/2022"and number of adult"3"number of children"2"and firstname"Aravinth" and lastname"ssr"and adress"viluppuram"and card number"1234567890123456"and cardtype"MAST"and Cardexpirymonth"2"and cardexpiryyear"2021"and cvv number"123"

@smoke
Scenario: validate login and cancelling the order
Given user launch   chrome browser
When user enter valid  username"aravinthvenkat"and valid password"123456" for cancelation
When user should click the bookeditineary
Then cancel order

