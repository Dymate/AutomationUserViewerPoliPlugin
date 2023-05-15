#Author: Dylan Mateo Llano Jaramillo
Feature: As a user, I need to search a user in the User Viewer Poli Plugin.

  Background:
    Given the user enters to the page
    And the user log in
    And the user enters the section usuarios

  @SearchName
  Scenario Outline: Search a user with name
    When the user enters the name <name>
    Then the user validates the name searched

    Examples:
      | name     |
      | Revistas |

  @SearchLastname
  Scenario Outline: Search a user with lastname
    When the user enters the lastname <lastname>
    Then the user validates the lastname searched

    Examples:
      | lastname    |
      | Politécnico |

  @SearchCountry
  Scenario Outline: Search a user with country
    When the user enters the country <country>
    Then the user validates the country searched

    Examples:
      | country   |
      | Colombia  |
      | Brazil    |
      | Argentina |
      | Cuba      |

  @SearchRole
  Scenario Outline: Search a user with role
    When the user enters the role <role>
    Then the user validates the role searched

    Examples:
      | role              |
      | Revisor/a externo |
      | Autor/a           |

  @ValidateViewMoreDetails
  Scenario: Validate the view more details
    When the user clicks on the button to view more details
    Then the user sees a modal


  @EditUniversity
  Scenario Outline: Validate the edition of university
    When the user clicks on the button to view more details
    When the user click on the edit university <university>
    Then the user validates the university

    Examples:
      | university  |
      | Politécnico |
      | UdeA        |
      | UNAL        |

  @EditAcademicDegree
  Scenario Outline: Validate the edition of Academic Degree
    When the user clicks on the button to view more details
    When the user click on the edit Academic Degree <academicDegree>
    Then the user validates the Academic Degree

    Examples:
      | academicDegree                     |
      | Ingeniero Informatico              |
      | Doctor en ciencias computacionales |
      | Docente de catedra                 |
      | Filosofo                           |

  @EditBiography
  Scenario Outline: Validate the edition of Biography
    When the user clicks on the button to view more details
    When the user click on the edit Biography <Biography>
    Then the user validates the Biography

    Examples:
      | Biography                                                        |
      | Docente universitario con estudios en ciencias de la computacion |
      | sd3432fsd                                                        |

  @ValidateActionViewer
  Scenario Outline: Validate the action of viewer
    When the user enters the role <role>
    And the user clicks on the button to view more details
    Then the user validate the action of viewer

    Examples:
      | role              |
      | Revisor/a externo |

  @ValidateContainsModal
  Scenario: Validates keys of details modal
    When the user clicks on the button to view more details
    Then the user sees the information
      | admin                                                                    |
      | revistas@elpoli.edu.co                                                   |
      | CO                                                                       |
      | UNAL                                                                     |
      | Filosofo                                                                 |
      | Administrador del sitio,Gestor,Editor,Autor/a,Revisor/a externo,Lector/a |


  @ValidatePaginationControl
  Scenario Outline: Validate pagination control
    When the user enters the country <country>
    And the user goes to the next page
    Then the user validates that the users are from the country

    Examples:
      | country   |
      | Colombia  |

    @ValidateUsersFromPagination
    Scenario Outline: Validate the users from pagination
      When the user enters the country <country>
      And the user counts the users from pagination
      Then user validates the number of users

      Examples:
        | country   |
        | Colombia  |

  @ValidateExportButton
  Scenario: Validate the export button for generate excel
    When the user clicks on the checkbox
    Then the user validates the export button export

