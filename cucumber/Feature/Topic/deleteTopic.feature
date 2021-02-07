

Feature: Delete a topic

  Scenario: Administrator deletes a topic
    Given The user has opened a Topic to be deleted
    And The user has Administrator role
    When Thse clicks on the Delete Topic button
    Then The expected notificaton "Topic was successfully deleted" shows
