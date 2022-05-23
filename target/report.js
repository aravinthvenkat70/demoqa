$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucu.feature");
formatter.feature({
  "name": "validating adactin hotel username and password",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate by filing only mandatory fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "user chrome browser launch",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userChromeBrowserLaunch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid username\"aravinthvenkat\"and password\"123456\"and location\"Brisbane\"and number of rooms\"3\"and check in date \"17/05/2022\"and check out date\"19/05/2022\"and number of adult\"3\"and firstname\"Aravinth\" and lastname\"ssr\"and adress\"viluppuram\" and card number\"1234567890123456\"and cardtype\"MAST\"and Cardexpirymonth\"2\"and cardexpiryyear\"2022\"and cvv number\"123\" and user should click the book now button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userEnterValidUsernameAndPasswordAndLocationAndNumberOfRoomsAndCheckInDateAndCheckOutDateAndNumberOfAdultAndFirstnameAndLastnameAndAdressAndCardNumberAndCardtypeAndCardexpirymonthAndCardexpiryyearAndCvvNumberAndUserShouldClickTheBookNowButton(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});