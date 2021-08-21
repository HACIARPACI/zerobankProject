$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "Navigating to Pay Bills Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Pay Bills\" Page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityNavigationStepDefs.the_user_navigates_to_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Unsuccessful Pay operation invalid date",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enters the following information",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_enters_the_following_information(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Pay button",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_clicks_the_Pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not see the message as \"The payment was successfully submitted.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_should_not_see_the_message_as(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertFalse(Assert.java:65)\r\n\tat org.junit.Assert.assertFalse(Assert.java:75)\r\n\tat com.zerobank.stepdefinitions.PayBillsStepDefs.the_user_should_not_see_the_message_as(PayBillsStepDefs.java:138)\r\n\tat ✽.the user should not see the message as \"The payment was successfully submitted.\"(file:///C:/Users/pc/IdeaProjects/zerobankProject/src/test/resources/features/PayBills.feature:51)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Unsuccessful Pay operation invalid date_screenshot");
formatter.after({
  "status": "passed"
});
});