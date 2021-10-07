$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Navigating to Account Activity Page",
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
  "name": "the user navigate to \"Pay Bills\" Page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityNavigationStepDefs.the_user_navigate_to_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account Activity Title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@haci"
    }
  ]
});
formatter.step({
  "name": "the user should see the the title \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_the_the_title(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cZero - [Account Activity]\u003e but was:\u003cZero - [Pay Bills]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.LoginStepDefs.the_user_should_see_the_the_title(LoginStepDefs.java:25)\r\n\tat ✽.the user should see the the title \"Zero - Account Activity\"(file:///C:/Users/pc/IdeaProjects/zerobankProject/src/test/resources/features/AccountActivity.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Account Activity Title_screenshot");
formatter.after({
  "status": "passed"
});
});