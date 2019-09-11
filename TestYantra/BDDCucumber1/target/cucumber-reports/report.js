$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/featurefile/Loginfeature.feature");
formatter.feature({
  "name": "Testing the login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing the login feature with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "then user opens the browser and enters the url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.then_user_opens_the_browser_and_enters_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user mouse hover to account",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.the_user_mouse_hover_to_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he land Customer login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.he_land_Customer_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid \"sk724677@gmail.com\" and \"shashi098\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_the_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User dashboard page with username Should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_dashboard_page_with_username_Should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the brower",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.close_the_brower()"
});
formatter.result({
  "status": "passed"
});
});