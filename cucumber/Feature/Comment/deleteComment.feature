
Feature: Delete Comment

  Scenario: Administrator deletes a comment
    Given The user has opened a Topic
    And The user has the Administrator role
    When Clicks on the Delete Button next to a comment
    Then The comment gets deleted
    And the user gets notifed with the "Comment deleted successfully"

 Scenario: Regular user deletes a comment
    Given The Regular user has opened a Topic
    And The user has the Regular role
    When Clicks on the Delete Button next to it
    Then The expected warning message "Couldn't delete the comment" shows

	 