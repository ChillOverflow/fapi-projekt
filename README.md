# fapi-projekt

Toto je můj vypracovaný úkol pro firmu FAPI.\
Jedná se o webovou aplikaci postavenou pomocí framewroku Spring, templating enginu Thymeleaf a Bootstrapu.\
Pro stažení aktuálního kurzovního lístku jsem použil toto API: https://www.kurzy.cz/html-kody/json/kurzy-bank.htm


```
src/main
+-java
  +-cz.danieldockal.fapiprojekt
    +-FapiProjektApplication.java  (slouží pro spouštění Spring aplikace)
    +-MainController.java (Stará se o HTTP requesty)
    +-UserData.java (Objekt - Spring entita pro přenos informací z formuláře)
+-resources
  +-static
    +-css
      +-styles.css (Custom styly)
    +-js
     +-currency.js  (kód pro upravu ceny na stránce rekapitulace, 
  +-templates       |pro generování aktuálního kurzovního lítku a 
    +-fragments     |následný přepočet měny)
      +-header.html (html fragmenty pro thymeleaf)
      +-head.html
    +-index.html   (hlavní stránka)
    +-recapitulation.html (stránka s rekapitulací)
 ```     

