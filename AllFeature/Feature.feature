Feature: Automation for rest assured

  Background: 
    Given Set The  BaseURI By Using RestAssured class

  Scenario: Validate HTTP PostReq
    Given Get Req Specification object to add req header req body select http req
    And Content Type req header
    And Add req Body
    When User Select Http post req
    Then Cpature Status Code
    And Capture StatusLine
    And Capture ResponseTime
    And Capture ResponseHeader
    And Capture ResponseBody
    And Capture Response Id

  Scenario: Validate HTTP Get Req
    Given Get Req Specification object to add req header req body select http req
    When User Select Http get req
    Then Cpature Status Code
    And Capture StatusLine
    And Capture ResponseTime
    And Capture ResponseHeader
    And Capture ResponseBody

  Scenario: Validate HTTP PatchReq
    Given Get Req Specification object to add req header req body select http req
    And Content Type req header
    And Add req Body for patch req
    When User Select Http patch req
    Then Cpature Status Code
    And Capture StatusLine
    And Capture ResponseTime
    And Capture ResponseHeader
    And Capture ResponseBody

  Scenario: Validate HTTP Get Req
    Given Get Req Specification object to add req header req body select http req
    When User Select Http get req
    Then Cpature Status Code
    And Capture StatusLine
    And Capture ResponseTime
    And Capture ResponseHeader
    And Capture ResponseBody

  Scenario: Validate HTTP delete Req
    Given Get Req Specification object to add req header req body select http req
    When User Select Http delete req
    Then Cpature Status Code
    And Capture StatusLine
    And Capture ResponseTime
    And Capture ResponseHeader

  Scenario: Validate HTTP Get Req
    Given Get Req Specification object to add req header req body select http req
    When User Select Http get req
    Then Cpature Status Code
    And Capture StatusLine
    And Capture ResponseTime
    And Capture ResponseHeader
