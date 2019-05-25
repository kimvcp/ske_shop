$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/add.feature");
formatter.feature({
  "line": 1,
  "name": "Buy products",
  "description": "  As a shop owner\n  I want to add products to catalog",
  "id": "buy-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 128567,
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
  "duration": 106854046,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add one product",
  "description": "",
  "id": "buy-products;add-one-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I add product with quantity 2",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "total size should be 12",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 28
    }
  ],
  "location": "StepDefShop.i_add_with_quantity(int)"
});
formatter.result({
  "duration": 364431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 21
    }
  ],
  "location": "StepDefShop.total_size_should_be(int)"
});
formatter.result({
  "duration": 78051675,
  "status": "passed"
});
});