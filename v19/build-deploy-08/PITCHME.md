---

### Build, deploy og arkitektur

Note:
- Denne presentasjonen:
  https://gitpitch.com/sivhollup/inf112/master?p=v19/build-deploy-08
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

https://bit.ly/2t7OmYW

Note:
- lenke til en pom.xml fra et opensource-prosjekt
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


---

### Kvalitetssikring

Note: 
- Frem til nå har vi snakket om de absolutt mest kritiske stegene som må gjøres
  for å bygge et prosjekt
- I tillegg gjøres gjerne linting og statisk kildekodeanalyse (kvalitetssikring
  av koding
- Dette hjelper til med å luke ut kjente bugs som følge av feil/svak bruk av
  konsepter i programmeringsspråket (feks, bruk av == i stedet for .equals i
  java, bruk av == i stedet for === i js, kan klage på magiske tall i koden osv)
- særlig for uerfarne folk eller folk som ikke har jobbet før er det lurt å
  bruke slike verktøy, for det gjør at kodebasen blir mer lik (skal ikke kunne
  gjenkjenne hvem som har kodet hva utfra stil)


---

### Lokalt vs sentralt bygg

Note: 
- alt frem til nå kan fint gjøres på egen maskin, men også på en byggserver
- teamet må være trygg på at kodebasen i master fungerer, og alle skal være
  trygge på at prosjektet til en hver tid bygger
- sentral byggserver kan settes opp til å bygge hver gang noen pusher kode til
  det sentrale repositoriet
- hva er en byggserver? En tjeneste som lytter på repositoriet ditt på github
  (eller andre public repositories) og bygger prosjektet for deg hver gang det
  kommer endringer i prosjektet
- kommer ofte med integrasjon til github, feks kan Travis knyttes direkte til om
  du får merge kode-endringer
- vanlige byggservere: Travis, CircleCI, Jenkins, Team City
- nysgjerrig på mer detaljer rundt dette? Sjekk ut Nerdschool-workshoppene på
  bygg og deploy (https://www.meetup.com/Bergen-Nerdschool/ og
  https://github.com/nerdschoolbergen)
- samme stegene som gjøres lokalt gjøres da sentralt, men helautomatisk
- avslører om det finnes feil (feks om du har glemt å kjøre testene dine før du
  committer)


---

### God arbeidsflyt

Note: 
- skriv tester før kode
- utvikle små, logiske biter av gangen
- commit hver logiske bit
- før push, gjør clean install slik at du ser at kodebasen virker før du pusher
  koden
- alle tester skal kjøre før du pusher. Ellers vil bygget sentralt feile, og
  alle som henter ned siste versjon vil få ikke-fungerende tester og vil dermed
  ikke kunne jobbe effektivt selv


---

### Hva skal committes?

Note:
- har nevnt dette før, men særlig aktuelt med byggeverktøy
- ingen generert kode i repositoriet
- typisk skal følgende eksluderes: target, .idea (IntelliJ sin prosjektkatalog),
  .iml-filer, .swp-filer, .jar-filer osv. 
- Ingen biblioteker heller, dette laster maven ned for deg
- slike genererte filer endres ofte og alle vil "ødelegge" for hverandre siden
  alle filene som genereres vil være ulike


---

### Hva deployes? 

Note: 
- for java: som oftest en jar-fil, som er en zipfil med spesiell katalogstruktur
  der alle .class-filene ligger og alle bibliotekene som brukes finnes
- også vanlig (i alle fall tidligere) .war
- annerledes for andre språk, men felles er at det som oftest samles til en
  eksekverbar fil
- når du gjør mvn install får du en .jar-fil i target-katalogen hvis det står at
  du skal lage jar i pom-en


---

### Hvordan deploye?

Note: 
- jar-filen må kjøre et sted
- kan kjøre java -jar i kommandolinje på en server
- som oftest er det en applikasjonsserver eller webserver som server jar-filen
  din, fordi applikasjonen gjerne skal kommunisere med andre tjenester og være
  tilgjengelig vi HTTP/HTTPS
- vanlige servere for java: jetty og tomcat
- kan gi deg mulighet til å bytte ut jar-fil uten å skru av tjenesten
- kanskje ikke relevant for dere i prosjektet
- hvis dere vil eksperimentere med denne type stack: bruk spring-boot som
  utgangspunkt, ferdigkonfigurert oppsett som tar mange fornuftige valg rundt
  applikasjonsserver og hvordan alt henger sammen der
- byggserver kan settes opp til å deploye hver gang man merger til master (kan
  være risikabelt)


---

### Vanlig arkitekturdeling

Note: 
- 
