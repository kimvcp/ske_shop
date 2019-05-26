$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cancel.feature");
formatter.feature({
  "line": 1,
  "name": "Buy products",
  "description": "  As a customer\n  I want to cancel product(s)",
  "id": "buy-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 134618,
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
  "name": "a order Bread with quantity 1 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a order Jam with quantity 1 exists",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "StepDefShop.a_product_with_quantity_exists(String,int)"
});
formatter.result({
  "duration": 88057477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jam",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "StepDefShop.a_product_with_quantity_exists(String,int)"
});
formatter.result({
  "duration": 93742,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Cancel one order",
  "description": "",
  "id": "buy-products;cancel-one-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I cancel Bread",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "total order should be 1",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 9
    }
  ],
  "location": "StepDefShop.i_cancel(String)"
});
formatter.result({
  "duration": 145356,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "StepDefShop.total_order_should_be(int)"
});
formatter.result({
  "duration": 104003293,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003c1\u003e but was: \u003c2\u003e\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)\n\tat org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:177)\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:144)\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:135)\n\tat org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:305)\n\tat shop.StepDefShop.total_order_should_be(StepDefShop.java:81)\n\tat ✽.Then total order should be 1(features/cancel.feature:11)\n",
  "status": "failed"
});
formatter.before({
  "duration": 349468,
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
  "name": "a order Bread with quantity 1 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a order Jam with quantity 1 exists",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "StepDefShop.a_product_with_quantity_exists(String,int)"
});
formatter.result({
  "duration": 155119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jam",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "StepDefShop.a_product_with_quantity_exists(String,int)"
});
formatter.result({
  "duration": 178011,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Cancel multiple orders",
  "description": "",
  "id": "buy-products;cancel-multiple-orders",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I cancel Bread",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I cancel Jam",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "total order should be 0",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bread",
      "offset": 9
    }
  ],
  "location": "StepDefShop.i_cancel(String)"
});
formatter.result({
  "duration": 84926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jam",
      "offset": 9
    }
  ],
  "location": "StepDefShop.i_cancel(String)"
});
formatter.result({
  "duration": 221644,
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
  "duration": 2732779,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003c0\u003e but was: \u003c2\u003e\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:52)\n\tat org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:177)\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:144)\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:135)\n\tat org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:305)\n\tat shop.StepDefShop.total_order_should_be(StepDefShop.java:81)\n\tat ✽.Then total order should be 0(features/cancel.feature:16)\n",
  "status": "failed"
});
});