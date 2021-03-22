
Feature: UiScrollable
Scenario: Scrooling_textswitcher_kadar
  And kullanici API Demos sayfasina gidecek
  And kullanici Views sayfasina gidecek
  Then kullanici textswitcher secenegini secer
  And kullanıcı next butonuna iki kez tiklar
  And sayinin iki oldugunu verify edin