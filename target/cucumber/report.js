$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/add.feature");
formatter.feature({
  "line": 1,
  "name": "Add products",
  "description": "  As a shop owner\n  I want to add product(s) to catalog",
  "id": "add-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 97625,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a catalog with 10 size exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 15
    }
  ],
  "location": "StepDefShop.a_catalog_with_size_exists(int)"
});
formatter.result({
  "duration": 65777702,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add one product",
  "description": "",
  "id": "add-products;add-one-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I add Bread with size 2",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "total catalog size should be 12",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 6
    },
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "StepDefShop.i_add_product_with_quantity(String,int)"
});
formatter.result({
  "duration": 2767928,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 29
    }
  ],
  "location": "StepDefShop.total_catalog_size_should_be(int)"
});
formatter.result({
  "duration": 74850317,
  "status": "passed"
});
formatter.before({
  "duration": 54892,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "a catalog with 10 size exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 15
    }
  ],
  "location": "StepDefShop.a_catalog_with_size_exists(int)"
});
formatter.result({
  "duration": 319879,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add multiple products",
  "description": "",
  "id": "add-products;add-multiple-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I add Bread with size 2",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I add Jam with size 1",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "total catalog size should be 13",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 6
    },
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "StepDefShop.i_add_product_with_quantity(String,int)"
});
formatter.result({
  "duration": 103785,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jam",
      "offset": 6
    },
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "StepDefShop.i_add_product_with_quantity(String,int)"
});
formatter.result({
  "duration": 70212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13",
      "offset": 29
    }
  ],
  "location": "StepDefShop.total_catalog_size_should_be(int)"
});
formatter.result({
  "duration": 84100,
  "status": "passed"
});
});