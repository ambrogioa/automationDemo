Feature: Feature to test TinyMCE WYSIWYG Editor
  @TinyMceWysiwyg
  Scenario: Check TinyMCE WYSIWYG Editor
    Given User is on TinyMCE WYSIWYG Editor page
    When User switch to iFrame editor
    Then user insert text into editor