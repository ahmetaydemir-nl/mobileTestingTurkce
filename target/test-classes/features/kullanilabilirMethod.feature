@reusable
  Feature: kullanilabilir method
    Scenario: sayfalar icin
      When kullanici "API Demos" sayfasina gidecek
      When kullanici "Views" sayfasina gidecek
      When kullanici "Expandable Lists" sayfasina gidecek
      When kullanici "1. Custom Adapter" sayfasina gidecek
      When kullanici "People Names" sayfasina gidecek

   Scenario: scroll
     When kullanici "API Demos" sayfasina gidecek
     When kullanici "Views" sayfasina gidecek
     When kullanici "WebView" scroll yapacak
