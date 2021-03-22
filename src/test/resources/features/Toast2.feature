@toast1
  Feature: Android Test
    Scenario: Toast
      When kullanici API Demos sayfasina gidecek
      When kullanici Views sayfasina gidecek
      When kullanici Popup Menu sayfasina gidecek
      When kullanici Make a popup butonuna tikliyacak ve popup gorecek
      When kullanici Add butonuna basacak
      Then toast mesaji onayliyacak "Clicked popup menu item Add"
      Then take the screenshot