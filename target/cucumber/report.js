$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cancel.feature");
formatter.feature({
  "line": 1,
  "name": "Buy products",
  "description": "  As a customer\n  I want to cancel product(s) that is ordered",
  "id": "buy-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 110962,
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
  "name": "an order number 1 with 1 quantity exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    },
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "StepDefShop.a_order_number_with_quantity_exists(int,int)"
});
formatter.result({
  "duration": 134075250,
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
  "name": "total orders should be 0",
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
  "duration": 175425,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    }
  ],
  "location": "StepDefShop.total_orders_should_be(int)"
});
formatter.result({
  "duration": 5772760,
  "status": "passed"
});
formatter.before({
  "duration": 114323,
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
  "name": "an order number 1 with 1 quantity exists",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 16
    },
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "StepDefShop.a_order_number_with_quantity_exists(int,int)"
});
formatter.result({
  "duration": 135502,
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
  "name": "total orders should be 0",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefShop.i_cancel_all_order()"
});
formatter.result({
  "duration": 39199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    }
  ],
  "location": "StepDefShop.total_orders_should_be(int)"
});
formatter.result({
  "duration": 76973,
  "status": "passed"
});
});