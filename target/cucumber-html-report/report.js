$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/productCategory/TestProductsCountBasedOnColor.feature");
formatter.feature({
  "line": 2,
  "name": "ProductCategoryPage1",
  "description": "",
  "id": "productcategorypage1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 5321414093,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Total Number Of Products based on color filters",
  "description": "",
  "id": "productcategorypage1;verify-total-number-of-products-based-on-color-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on women navigation menu",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on orange color filter",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify total number of products dispalyed as \"3\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginToAutomationPractices.navigate_to_application()"
});
formatter.result({
  "duration": 62580937015,
  "status": "passed"
});
formatter.match({
  "location": "ProductCategory.user_click_on_women_navigation_menu()"
});
formatter.result({
  "duration": 26854333901,
  "status": "passed"
});
formatter.match({
  "location": "ProductCategory.click_on_orange_color_filter()"
});
formatter.result({
  "duration": 7222993369,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 46
    }
  ],
  "location": "ProductCategory.verify_total_number_of_products_dispalyed_as(String)"
});
formatter.result({
  "duration": 35115215,
  "status": "passed"
});
formatter.after({
  "duration": 678944,
  "status": "passed"
});
});