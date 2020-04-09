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
  "line": 5,
  "name": "Login in the Saucedemo",
  "description": "",
  "id": "saucedemo-website;login-in-the-saucedemo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "saucedemo-website;login-in-the-saucedemo;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "saucedemo-website;login-in-the-saucedemo;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 13,
      "id": "saucedemo-website;login-in-the-saucedemo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login in the Saucedemo",
  "description": "",
  "id": "saucedemo-website;login-in-the-saucedemo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Saucedemo"
    },
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user login using standard_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdef.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 6804509027,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 10635595033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 21
    },
    {
      "val": "secret_sauce",
      "offset": 39
    }
  ],
  "location": "LoginStepdef.the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 1552147066,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 26316931350,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Select price-range",
  "description": "",
  "id": "saucedemo-website;select-price-range",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@TC02_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "TC02 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "TC02 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "TC02 the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "TC02 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "TC02 select the price range from low to high",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "saucedemo-website;select-price-range;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "saucedemo-website;select-price-range;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 25,
      "id": "saucedemo-website;select-price-range;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Select price-range",
  "description": "",
  "id": "saucedemo-website;select-price-range;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@TC02_Saucedemo"
    },
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "TC02 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "TC02 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "TC02 the user login using standard_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "TC02 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "TC02 select the price range from low to high",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceRangeStepdef.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 8012319239,
  "status": "passed"
});
formatter.match({
  "location": "PriceRangeStepdef.tc02_the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 15229924188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 26
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "PriceRangeStepdef.tc02_the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 490176176,
  "status": "passed"
});
formatter.match({
  "location": "PriceRangeStepdef.tc02_click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 28015084982,
  "status": "passed"
});
formatter.match({
  "location": "PriceRangeStepdef.tc02_select_the_price_range_from_low_to_high()"
});
formatter.result({
  "duration": 2892680060,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Select product",
  "description": "",
  "id": "saucedemo-website;select-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@TC03_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "TC03 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "TC03 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "TC03 the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "TC03 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "TC03 the user select the product",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "TC03 adds the product to Add Cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "saucedemo-website;select-product;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 37,
      "id": "saucedemo-website;select-product;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 38,
      "id": "saucedemo-website;select-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "Select product",
  "description": "",
  "id": "saucedemo-website;select-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Saucedemo"
    },
    {
      "line": 27,
      "name": "@TC03_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "TC03 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "TC03 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "TC03 the user login using standard_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "TC03 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "TC03 the user select the product",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "TC03 adds the product to Add Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectProductStepdef.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 3865390472,
  "status": "passed"
});
formatter.match({
  "location": "SelectProductStepdef.tc03_the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 6510096720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 26
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "SelectProductStepdef.tc03_the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 827404050,
  "status": "passed"
});
formatter.match({
  "location": "SelectProductStepdef.tc03_click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 54907920739,
  "status": "passed"
});
formatter.match({
  "location": "SelectProductStepdef.tc03_the_user_select_the_product()"
});
formatter.result({
  "duration": 702534938,
  "status": "passed"
});
formatter.match({
  "location": "SelectProductStepdef.tc03_adds_the_product_to_add_cart()"
});
formatter.result({
  "duration": 1080627045,
  "status": "passed"
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
  "name": "TC04 the user launch the browser",
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
  "keyword": "And "
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
        "standard_user",
        "secret_sauce"
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
  "name": "TC04 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "TC04 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "TC04 the user login using standard_user and secret_sauce",
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
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "TC04 the user continue shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "ContinueShoppingStepdef.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 3900008469,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppingStepdef.tc04_the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 4249866547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 26
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "ContinueShoppingStepdef.tc04_the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 733150177,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppingStepdef.tc04_click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 11803465350,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppingStepdef.tc04_the_user_select_the_product_and_add_to_cart()"
});
formatter.result({
  "duration": 1564272540,
  "status": "passed"
});
formatter.match({
  "location": "ContinueShoppingStepdef.tc04_the_user_continue_shopping()"
});
formatter.result({
  "duration": 2026908902,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 54,
  "name": "To select menu",
  "description": "",
  "id": "saucedemo-website;to-select-menu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@TC05_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "TC05 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "TC05 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "TC05 the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "TC05 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "TC05 user opens the menu",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "TC05 user click on About and select Platform",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Tc05 in platform user select Selenium",
  "keyword": "Then "
});
formatter.examples({
  "line": 63,
  "name": "",
  "description": "",
  "id": "saucedemo-website;to-select-menu;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 64,
      "id": "saucedemo-website;to-select-menu;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 65,
      "id": "saucedemo-website;to-select-menu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 65,
  "name": "To select menu",
  "description": "",
  "id": "saucedemo-website;to-select-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Saucedemo"
    },
    {
      "line": 53,
      "name": "@TC05_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "TC05 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "TC05 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "TC05 the user login using standard_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "TC05 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "TC05 user opens the menu",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "TC05 user click on About and select Platform",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Tc05 in platform user select Selenium",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuStepdef.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 7767725828,
  "status": "passed"
});
formatter.match({
  "location": "MenuStepdef.tc05_the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 8883868688,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 26
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "MenuStepdef.tc05_the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 416488728,
  "status": "passed"
});
formatter.match({
  "location": "MenuStepdef.tc05_click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 38170639056,
  "status": "passed"
});
formatter.match({
  "location": "MenuStepdef.tc05_user_opens_the_menu()"
});
formatter.result({
  "duration": 275931952,
  "status": "passed"
});
formatter.match({
  "location": "MenuStepdef.tc05_user_click_on_about_and_select_platform()"
});
formatter.result({
  "duration": 25373201796,
  "status": "passed"
});
formatter.match({
  "location": "MenuStepdef.tc05_in_platform_user_select_selenium()"
});
formatter.result({
  "duration": 13415984427,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 68,
  "name": "Logout from Saucedemo",
  "description": "",
  "id": "saucedemo-website;logout-from-saucedemo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 67,
      "name": "@TC06_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "TC06 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "TC06 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "TC06 the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "TC06 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "TC06 user opens the menu",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "TC06 user click on Logout",
  "keyword": "And "
});
formatter.examples({
  "line": 76,
  "name": "",
  "description": "",
  "id": "saucedemo-website;logout-from-saucedemo;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 77,
      "id": "saucedemo-website;logout-from-saucedemo;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 78,
      "id": "saucedemo-website;logout-from-saucedemo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 78,
  "name": "Logout from Saucedemo",
  "description": "",
  "id": "saucedemo-website;logout-from-saucedemo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 67,
      "name": "@TC06_Saucedemo"
    },
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "TC06 the user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "TC06 the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "TC06 the user login using standard_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "TC06 click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "TC06 user opens the menu",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "TC06 user click on Logout",
  "keyword": "And "
});
formatter.match({
  "location": "LogoutStepdef.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 7428149680,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepdef.tc06_the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 5132739891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 26
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "LogoutStepdef.tc06_the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 465485943,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepdef.tc06_click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 3717016384,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepdef.tc06_user_opens_the_menu()"
});
formatter.result({
  "duration": 299175153,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepdef.tc06_user_click_on_logout()"
});
formatter.result({
  "duration": 5329669342,
  "status": "passed"
});
});