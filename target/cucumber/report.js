$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cancel.feature");
formatter.feature({
  "line": 1,
  "name": "Buy products",
  "description": "  As a customer\n  I want to cancel product(s)",
  "id": "buy-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 103781,
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
  "name": "a order 1 with 1 quantity exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "StepDefShop.a_product_exists(int,int)"
});
formatter.result({
  "duration": 77698804,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Cancel one order",
  "description": "",
  "id": "buy-products;cancel-one-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I cancel order 1",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "total order should be 0",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "StepDefShop.i_cancel_order(int)"
});
formatter.result({
  "duration": 126064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 22
    }
  ],
  "location": "StepDefShop.total_order_should_be(int)"
});
formatter.result({
  "duration": 68829254,
  "status": "passed"
});
formatter.before({
  "duration": 63044,
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
  "name": "a order 1 with 1 quantity exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "StepDefShop.a_product_exists(int,int)"
});
formatter.result({
  "duration": 173429,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Cancel all order",
  "description": "",
  "id": "buy-products;cancel-all-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I cancel all orders",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "total order should be 0",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefShop.i_cancel_all_order()"
});
formatter.result({
  "duration": 29254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 22
    }
  ],
  "location": "StepDefShop.total_order_should_be(int)"
});
formatter.result({
  "duration": 62692,
  "status": "passed"
});
});