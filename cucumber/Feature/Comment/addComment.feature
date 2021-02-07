
Feature: Add Comment

  Scenario Outline: Comment a topic
    Given The user has opened a topic
    And The user has navigated to the AddComment texbox
    When The "<text>" has been added
    And The user clicks on Add Comment button
    Then The expected message "<expected message>" shows
    
	 Examples:
     	|text|expected message|
			|This is a cool comment|The comment has been added|
			||Please add text|
