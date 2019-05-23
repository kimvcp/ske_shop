$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/buy.feature");
formatter.feature({
  "line": 1,
  "name": "Buy products",
  "description": "  As a customer\n  I want to buy products",
  "id": "buy-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 102509,
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
  "location": "BuyStepdefs.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 75450816,
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
  "location": "BuyStepdefs.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 107524,
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
  "name": "total should be 41.00",
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
  "location": "BuyStepdefs.i_buy_with_quantity(String,int)"
});
formatter.result({
  "duration": 244691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "41.00",
      "offset": 16
    }
  ],
  "location": "BuyStepdefs.total_should_be(double)"
});
formatter.result({
  "duration": 131784942,
  "status": "passed"
});
formatter.before({
  "duration": 126928,
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
  "location": "BuyStepdefs.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 289058,
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
  "location": "BuyStepdefs.a_product_with_price_exists(String,double)"
});
formatter.result({
  "duration": 157764,
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
  "name": "total should be 121.00",
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
  "location": "BuyStepdefs.i_buy_with_quantity(String,int)"
});
formatter.result({
  "duration": 700135,
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
  "location": "BuyStepdefs.i_buy_with_quantity(String,int)"
});
formatter.result({
  "duration": 330935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "121.00",
      "offset": 16
    }
  ],
  "location": "BuyStepdefs.total_should_be(double)"
});
formatter.result({
  "duration": 222792,
  "status": "passed"
});
});