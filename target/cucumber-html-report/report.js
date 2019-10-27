$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "line": 1,
  "name": "User login to system successfully",
  "description": "",
  "id": "user-login-to-system-successfully",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is at landing page for the login process",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userIsAtLandingPageForTheLoginProcess()"
});
formatter.result({
  "duration": 12507080658,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "The user enters home page and fills correct user information after login to system",
  "description": "",
  "id": "user-login-to-system-successfully;the-user-enters-home-page-and-fills-correct-user-information-after-login-to-system",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user clicks sign button and after clicks sign item",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user fills user email and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks sign in button and it display close icon",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.userClicksSignButtonAndAfterClicksSignItem()"
});
formatter.result({
  "duration": 6377419745,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userFillsUserEmailAndPassword()"
});
formatter.result({
  "duration": 325882910,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userClicksSignInButtonAndItDisplayCloseIcon()"
});
formatter.result({
  "duration": 1366139140,
  "status": "passed"
});
});