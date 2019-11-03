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
  "duration": 2853999037,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "The user enters home page and fills correct user information after login to system",
  "description": "",
  "id": "user-login-to-system-successfully;the-user-enters-home-page-and-fills-correct-user-information-after-login-to-system",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user clicks sign button and after clicks sign item",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user fills user email and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks sign in button and it display close icon",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.userClicksSignButtonAndAfterClicksSignItem()"
});
formatter.result({
  "duration": 2034404839,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userFillsUserEmailAndPassword()"
});
formatter.result({
  "duration": 323895374,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userClicksSignInButtonAndItDisplayCloseIcon()"
});
formatter.result({
  "duration": 1249071004,
  "status": "passed"
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
  "duration": 2000022563,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "The user change language and sees to change all pages",
  "description": "",
  "id": "user-login-to-system-successfully;the-user-change-language-and-sees-to-change-all-pages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@wrongpassword"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user clicks sign in area and choose to sign in item",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user fills correct email and wrong password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user display to open modal",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.userClicksSignInAreaAndChooseToSignInItem()"
});
formatter.result({
  "duration": 2593443190,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userFillsCorrectEmailAndWrongPassword()"
});
formatter.result({
  "duration": 120744408,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.userDisplayToOpenModal()"
});
formatter.result({
  "duration": 767918125,
  "status": "passed"
});
});