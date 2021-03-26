Feature: User

  #este es un comentario
  @Usuarios
  Scenario: As admin user
  I want to create, update and delete an user
  So that i am able to manipulate the user

    Given I have access to Todo.ly
    When I send a request POST to url http://todo.ly/api/user.json with json
    """
    {
      "Email":"michel@upb.com",
      "FullName":"nuriamichel",
      "Password":"12345"
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
        "Id": "IGNORE",
        "Email": "michel@upb.com",
        "Password": "IGNORE",
        "FullName": "nuriamichel",
        "TimeZone": 0,
        "IsProUser": false,
        "DefaultProjectId": "IGNORE",
        "AddItemMoreExpanded": false,
        "EditDueDateMoreExpanded": false,
        "ListSortType": 0,
        "FirstDayOfWeek": 0,
        "NewTaskDueDate": -1,
        "TimeZoneId": "IGNORE"
    }
    """
    When I send a request PUT to url http://todo.ly/api/user/0.json with json
    """
    {
      "FullName": "nuriamichel123"
    }
    """
    Then I expected response code 200
    And I expected the response body
    """
    {
        "Id": "IGNORE",
        "Email": "michel@upb.com",
        "Password": "IGNORE",
        "FullName": "nuriamichel123",
        "TimeZone": 0,
        "IsProUser": false,
        "DefaultProjectId": "IGNORE",
        "AddItemMoreExpanded": false,
        "EditDueDateMoreExpanded": false,
        "ListSortType": 0,
        "FirstDayOfWeek": 0,
        "NewTaskDueDate": -1,
        "TimeZoneId": "IGNORE"
    }
    """
    When I send a request DELETE to url http://todo.ly/api/user/0.json with json
    """
    """
    Then I expected response code 200
