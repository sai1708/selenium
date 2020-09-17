$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestCase.feature");
formatter.feature({
  "name": "To Test The OrangeHrm Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To Test the Admin Functionality of OrangeHrm",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To Open Admin functionlity of OrangeHrm",
  "keyword": "Given "
});
formatter.step({
  "name": "To Enter \"\u003cUsername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Select UserRole",
  "keyword": "Then "
});
formatter.step({
  "name": "To Enter EmployeeName",
  "keyword": "Then "
});
formatter.step({
  "name": "Select Status",
  "keyword": "Then "
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "Then "
});
formatter.step({
  "name": "Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username"
      ]
    },
    {
      "cells": [
        "Praveen"
      ]
    },
    {
      "cells": [
        "Suresh"
      ]
    },
    {
      "cells": [
        "Karthik"
      ]
    }
  ]
});
formatter.background({
  "name": "To Test the Login Functionality of OrangeHrm",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To Launch the Browser and navigate to the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Launch_the_Browser_and_navigate_to_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To ake he Screeshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_ake_he_Screeshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Test the Admin Functionality of OrangeHrm",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To Open Admin functionlity of OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Open_Admin_functionlity_of_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter \"Praveen\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select UserRole",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.select_UserRole()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter EmployeeName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Enter_EmployeeName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Status",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.select_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.take_the_Screenshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "To Test the Login Functionality of OrangeHrm",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To Launch the Browser and navigate to the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Launch_the_Browser_and_navigate_to_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To ake he Screeshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_ake_he_Screeshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Test the Admin Functionality of OrangeHrm",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To Open Admin functionlity of OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Open_Admin_functionlity_of_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter \"Suresh\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select UserRole",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.select_UserRole()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter EmployeeName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Enter_EmployeeName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Status",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.select_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.take_the_Screenshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "To Test the Login Functionality of OrangeHrm",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To Launch the Browser and navigate to the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Launch_the_Browser_and_navigate_to_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_Click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To ake he Screeshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmLoginSteps.to_ake_he_Screeshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Test the Admin Functionality of OrangeHrm",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To Open Admin functionlity of OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Open_Admin_functionlity_of_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter \"Karthik\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select UserRole",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.select_UserRole()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter EmployeeName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.to_Enter_EmployeeName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Status",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.select_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.click_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.take_the_Screenshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_defination.OrangeHrmAdminSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});