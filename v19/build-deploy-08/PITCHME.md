---

### Build, deploy og arkitektur

Note:
- Proof of concept (POC): når du skriver kode for å utforske uten tanke på
  hvordan dette skal brukes videre, et eksperiment
- POC kjennetegnes av lite fokus på kvalitet, lite generalisering, små
  kodebaser, kjøres ofte rett fra kommandolinjen eller i en REPL, laget for å
  være utviklervennlig (debug-muligheter, tilgang til å endre kode mens
  programmet kjører).
- POC er forskjellig fra kode som skal leve lenge og brukes/vedlikeholdes av
  mange. Produksjonskode har andre krav
- kodekvalitet, sikkerhet, vedlikeholdbarhet over tid, kontroll over utvikling
  og den koden som havner ut mot kunder. Trenger gjerne også integrasjoner mot
  eksterne systemer, ordentlig feilhåndtering (både mot bruker og mot
  integrasjoner). Dette krever mer kode, og mange flere ting kan gå gale. 
- Derfor trenger vi trygge, reproduserbare og forutsigbare omgivelser til
  produksjonskode. 
- Idag skal vi snakke om hvordan vi kan lage nettopp dette. Mest bygg og deploy,
  men også arkitektur


---

### Hvor lever tjenesten din?

Note: 
- Du har laget en tjeneste som du vil at noen skal bruke. Med mindre du vil at
  laptopen skal være på nett hele tiden må tjenesten bo et sted
- Tjenesten må deployes, gjerne til en skytjeneste
- For å få dette til må du kompilere programmet, bygge en fil som kan deployes,
  overføre denne filen og sette den i gang
- Disse stegene må gjøres hver gang du vil ha ut ny kode
- I realiteten er dette mye jobb: tester (gjerne ulike typer) skal kjøres, koden
  skal deployes til flere miljø, selve deploy-delen har gjerne flere steg, du
  jobber ikke alene, koden skal gjerne kompileres og kjøres i et annet miljø
- Tidligere ble dette gjort manuelt. Tidkrevende og mye detaljer som må være
  riktig hver gang. Kjedelig jobb også, lett å gjøre feil. 


---

### Byggeverktøy

Note: 
- Mange verktøy for å automatisere bygg-prosessen, de meste kjente for Java er
  Maven og Gradle
- Andre kjente byggeverktøy i andre språk: pipenv (Python), npm, webpack, yarn
  (JS), nuget (C#) og Visual Studio (bygging)
- Tar seg av opprydning, kompilering, nedlasting og organisering av biblioteker,
  testkjøring, generere eksekverbar fil (jar) m.m.
- Bruker maven som eksempel


---

### Mavens katalogstruktur

```
projectName
 -> pom.xml
 -> src/
    -> main
        -> java
        -> resources
    -> test
        -> java
        -> resources
```

Note: 
- maven genererer en target-katalog i projectName-katalogen
- du må ha kildekode organisert etter det maven krever, ellers finner den ikke
  filer og ressurser den trenger for å bygge
- men først: 


---

### pom.xml

Note:
- pom.xml er konfigurasjonsfilen til prosjektet ditt
- holder styr på overordnet informasjon, som feks hvilken javaversjon som
  brukes, hvordan prosjektet skal pakkes, navn. 
- alle avhengighetene til prosjektet listes her (dependencies, biblioteker)
- hvilket karaktersett skal oppgis her (BRUK UTF-8)
- angir hvor du henter pakker fra (finnes flere enn maven central)
- inneholder build-konfigurasjon
- Denne filen må vedlikeholdes, både bygge-konfig/steg, men aller mest
  dependencies (oppdatere versjoner, slette ting som ikke brukes lenger osv)
- Ikke last ned jar selv, legg til dependency i pom.xml (IKKE gjennom IntelliJ,
  manuelt), la maven laste ned


---

mvn compile

Note: 
- kompilerer alle .java-filene i src/main/java til .class og linker inn
  bibliotek som brukes.  Dersom nye bibliotek er lagt til vil disse lastes ned
  også
- Alle bibliotek som lastes ned legges i en katalog som heter .m2 som ligger i
  hjemmekatalogen din
- Alle ressurser som trengs til programmet ditt legges i src/main/resources
- eksempler på slike filer: database-migrering, db-skjema, db-spørring,
  config-filer
- lager target-katalog (target/classes)


---

mvn test

Note:
- kjører alle tester i src/test/java/
- filer som trengs til tester skal legges i src/test/resources
- eksempel på det kan være nøkler, rådata, inputfiler, testconfig


---

mvn clean

Note:
- sletter alle genererte filer (target-katalogen)


---

mvn install

Note: 
- gjør compile, test, package og en masse andre steg (får .jar-fil hvis det er
  det prosjektet bygger til)
- gjør alle steg frem til og med install
- clean må du kjøre selv, før du committer, så du vet at alt fungerer



