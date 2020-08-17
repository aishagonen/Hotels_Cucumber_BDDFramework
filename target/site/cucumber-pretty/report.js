$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Hotels feature",
  "description": "",
  "id": "hotels-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@hotels"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@hotels1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select property class \u003cstars\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify system displays only \u003cstars\u003e hotels on search result",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;",
  "rows": [
    {
      "cells": [
        "stars"
      ],
      "line": 13,
      "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;;1"
    },
    {
      "cells": [
        "5 stars"
      ],
      "line": 14,
      "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;;2"
    },
    {
      "cells": [
        "4 stars"
      ],
      "line": 15,
      "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;;3"
    },
    {
      "cells": [
        "3 stars"
      ],
      "line": 16,
      "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11939715654,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I am on Hotels Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 14,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@hotels"
    },
    {
      "line": 6,
      "name": "@hotels1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select property class 5 stars",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify system displays only 5 stars hotels on search result",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.getResultScreen()"
});
formatter.result({
  "duration": 12882154947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "HomePageSD.selectAnyStars(int)"
});
formatter.result({
  "duration": 5208699713,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 30
    }
  ],
  "location": "HomePageSD.verifyDisplayedStars(int)"
});
formatter.result({
  "duration": 5043401911,
  "status": "passed"
});
formatter.after({
  "duration": 278469338,
  "status": "passed"
});
formatter.before({
  "duration": 5954567226,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Given I am on Hotels Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "hotels-feature;verify-user-can-only-view-the-result-by-selected-property-class;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@hotels"
    },
    {
      "line": 6,
      "name": "@hotels1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select property class 4 stars",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify system displays only 4 stars hotels on search result",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.getResultScreen()"
});
