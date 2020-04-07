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
  "line": 4,
  "name": "",
  "description": "Login in the Saucedemo",
  "id": "saucedemo-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Saucedemo"
    }
  ]
});
});