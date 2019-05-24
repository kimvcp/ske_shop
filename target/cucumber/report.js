$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/buy.feature");
formatter.feature({
  "line": 1,
  "name": "Buy products",
  "description": "  As a Thai customer\n  I want to buy products",
  "id": "buy-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 108659,
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
  "name": "a product Bread with price 20.50 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a product Jam with price 80.00 exists",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 10
    },
    {
      "val": "20.50",
      "offset": 27
    }
  ],
  "location": "StepDefShop.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 75054812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jam",
      "offset": 10
    },
    {
      "val": "80.00",
      "offset": 25
    }
  ],
  "location": "StepDefShop.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 114578,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Buy one product",
  "description": "",
  "id": "buy-products;buy-one-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I buy Bread with quantity 2",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "total should be 43.87",
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
      "offset": 26
    }
  ],
  "location": "StepDefShop.i_buy_with_quantity(String,int)"
});
formatter.result({
  "duration": 311095,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "43.87",
      "offset": 16
    }
  ],
  "location": "StepDefShop.total_should_be(double)"
});
formatter.result({
  "duration": 66155193,
  "status": "passed"
});
formatter.before({
  "duration": 125243,
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
  "name": "a product Bread with price 20.50 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a product Jam with price 80.00 exists",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 10
    },
    {
      "val": "20.50",
      "offset": 27
    }
  ],
  "location": "StepDefShop.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 136711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jam",
      "offset": 10
    },
    {
      "val": "80.00",
      "offset": 25
    }
  ],
  "location": "StepDefShop.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 537636,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Buy multiple products",
  "description": "",
  "id": "buy-products;buy-multiple-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I buy Bread with quantity 2",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I buy Jam with quantity 1",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "total should be 129.47",
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
      "offset": 26
    }
  ],
  "location": "StepDefShop.i_buy_with_quantity(String,int)"
});
formatter.result({
  "duration": 359812,
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
      "offset": 24
    }
  ],
  "location": "StepDefShop.i_buy_with_quantity(String,int)"
});
formatter.result({
  "duration": 99653,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "129.47",
      "offset": 16
    }
  ],
  "location": "StepDefShop.total_should_be(double)"
});
formatter.result({
  "duration": 127230,
  "status": "passed"
});
});