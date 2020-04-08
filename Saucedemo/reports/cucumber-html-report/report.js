$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/saucedemo.feature");
formatter.feature({
  "line": 2,
  "name": "Saucedemo Website",
  "description": "",
  "id": "saucedemo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 41,
  "name": "To select product and continue shopping",
  "description": "",
  "id": "saucedemo-website;to-select-product-and-continue-shopping",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 40,
      "name": "@TC04_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "TC04 the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "TC04 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "TC04 the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "TC04 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "TC04 the user select the product and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "TC04 the user continue shopping",
  "keyword": "Then "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "saucedemo-website;to-select-product-and-continue-shopping;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 50,
      "id": "saucedemo-website;to-select-product-and-continue-shopping;;1"
    },
    {
      "cells": [
        "name",
        "pswd"
      ],
      "line": 51,
      "id": "saucedemo-website;to-select-product-and-continue-shopping;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 51,
  "name": "To select product and continue shopping",
  "description": "",
  "id": "saucedemo-website;to-select-product-and-continue-shopping;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 40,
      "name": "@TC04_Saucedemo"
    },
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "TC04 the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "TC04 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "TC04 the user login using name and pswd",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "TC04 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "TC04 the user select the product and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "TC04 the user continue shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "ContinueShoppinStepdef.tc04_the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 11946251626,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppinStepdef.tc04_the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 5264098373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 26
    },
    {
      "val": "pswd",
      "offset": 35
    }
  ],
  "location": "ContinueShoppinStepdef.tc04_the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 3819696701,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppinStepdef.tc04_click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 7935038115,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppinStepdef.tc04_the_user_select_the_product_and_add_to_cart()"
});
formatter.result({
  "duration": 2855837775,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppinStepdef.tc04_the_user_continue_shopping()"
});
formatter.result({
  "duration": 5368524407,
  "status": "passed"
});
});