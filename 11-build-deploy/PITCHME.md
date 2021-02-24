---

### Build, deploy og arkitektur

Note: 
- Dere har til nå lært å skrive Proof of Concept (POC)-kode
- Fokus på å få ting til å virke, evt at det skal være kjapt
- koden demonstrerer spesifikk oppførsel/eksperiment/analyse e.l.
- koden er gjerne bruk og kast
- koden har ikke særlige krav til kodekvalitet
- kjøres ofte rett i kommandolinje/REPL
- POC-kode er ok til sitt formål, brukes ofte for å gjøre eksperimenter i
  bransjen


---

### Produksjonskode != POC-kode

Note:
- Produksjonskode skal leve lenge og brukes/vedlikeholdes av
  mange. Produksjonskode har andre krav
- eks: koden jeg har jobbet med siste året er opprinnelig skrevet for nesten 10
  år siden, ingen har gjort noe særlig med den etter det
- Prodkode skal levere funksjonalitet til en bruker/kunde
- Prodkode leveres som en tjeneste


---

### Tjenesten må være tilgjengelig for brukerne

Note: 
- Du har laget en tjeneste som du vil at noen skal bruke. Med mindre du vil at
  laptopen skal være på nett hele tiden må tjenesten bo et sted
- Tjenesten er bare en eksekverbar fil som kjører kontinuerlig
- Vanlig å gjøre tjenester tilgjengelig i skyen
- Å installere/kopiere inn filen og starte den kalles å deploye tjenesten
- For å få dette til må du kompilere programmet, bygge en fil som kan deployes,
  overføre denne filen og sette den i gang
- Disse stegene må gjøres hver gang du vil ha ut ny funksjonalitet til brukerne
  av systemet
- Tegne på tavlen: lokal utvikling av feature --> eksekverbar --> kunde kan
  bruke denne (første pil == build, andre pil == deploy)
- I realiteten er dette mye jobb: tester (gjerne ulike typer) skal kjøres, koden
  skal deployes til flere miljø, biblioteker skal være tilgjengelige, selve
  deploy-delen har gjerne flere steg, du jobber ikke alene, koden skal gjerne
  kompileres og kjøres i et annet miljø
- Tidligere ble dette gjort manuelt. Tidkrevende og mye detaljer som må være
  riktig hver gang. Kjedelig jobb, lett å gjøre feil. 
- eks: vi er et team som jobber sammen om koden (5 stk i mitt team), alle leverer
  kode
- koden må bygge hos alle, og kunne kjøres lokalt
- koden må også garantert virke opp mot de systemene vi deployer til, ergo
  bruker vi byggserver til å hjelpe oss
- behov for å teste våre endringer sammen med andre sine endringer og andre
  systemer før vi går i prod... 



---

### Produksjonskode krever trygghet

Note:
- hva vil det si? 
- koden må være vedlikeholdbar over tid
- tenke sikkerhet, både ift angrep, men også bruk og videre utvikling
- kontroll over utvikling og den koden som havner ut mot kunder. Trenger gjerne
  også integrasjoner mot eksterne systemer, ordentlig feilhåndtering (både mot
  bruker og mot integrasjoner). Dette krever mer kode, og mange flere ting kan
  gå gale. 
- Vi trenger trygge, reproduserbare og forutsigbare omgivelser til
  produksjonskode. 
- vi ønsker å redusere risiko for å gjøre feil under utvikling, men også under
  produksjonssetting
- Idag skal vi snakke om hvordan vi kan lage nettopp dette. Mest bygg og deploy,
  men også arkitektur


---


### Byggeverktøy automatiserer byggprosessen

Note: 
- begynner med det vi gjør mest: utvikling, bygging, testing (lokalt)
- logge-forelesning viste de reelle stegene for å kjøre kode med avhengigheter.
  Selv med gode script er dette voldsomt å forholde seg til
- Mange verktøy for å automatisere bygg-prosessen, de meste kjente for Java er
  Maven og Gradle
- Andre kjente byggeverktøy i andre språk: pipenv (Python), npm, webpack, yarn
  (JS), nuget (C#) og Visual Studio (bygging)
- Tar seg av opprydning, kompilering, nedlasting og organisering av biblioteker,
  testkjøring, generere eksekverbar fil (jar) m.m.
- Bruker maven som eksempel, laget av apache foundation
- maven (eller andre byggeverktøy) installeres på maskinen din, disse er typisk
  kommandolinjeverktøy, installer fra https://maven.apache.org/


---

### Maven legger føringer på katalogstruktur

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
- pom.xml: konfigurasjon av maven
- src/ inneholder all kildekode, både test og produksjonskode 
- pakkestruktur mellom main/ og test/ dupliseres
- kode i java-katalog
- andre filer som trengs (filer for testing, konfig osv) ligger i resources
- feks ligger typisk logback.xml i src/main/resources
- du må ha kildekode organisert etter det maven krever, ellers finner den ikke
  filer og ressurser den trenger for å bygge
- enkleste eksempelet: ingen resources, tddDemo fra tdd-forelesning
- skiller mellom test og prod-ressurser (ofte er oppsett ulikt)
- maven genererer også filer, feks ved bygg: target-katalog i projectName-katalogen


---

### pom.xml definerer prosjektet

```
<project>
<!-- The Basics -->
<groupId>...</groupId>
<artifactId>...</artifactId>
<version>...</version>
...
<properties>...</properties>
<dependencies>...</dependencies>
...
<!-- Build Settings -->
<build>...</build>
...
</project>
```

Note:
- hvordan pom er bygget opp: http://maven.apache.org/pom.html
- pom.xml er konfigurasjonsfilen til prosjektet ditt (project objet model)
- xml-format
- øverst: informasjon om hvilken versjon av maven dette er slik at maven vet
  hvordan filen skal tolkes
- groupid: identifiserer din organisasjon på tvers av prosjekter, følg
  java-pakke-syntaks
- artifact-id: navnet til pakken du bygger 
- version: hvilken versjon prosjektet er på, oppdateres typisk etter release (en
  eksekverbar, feks .jar, vil være oppbygget av artifactid + versjon.jar)
- packaging: forteller hvilken metode som skal brukes for å lage release-pakke
  (mest brukt jar, tidligere var war vanlig)
- name: navnet til prosjektet (description: beskrivelse)
- properties: javaversjon, karaktersett (BRUK UTF-8)
- dependencies: alle biblioteker du bruker listes her, feks junit
- inneholder build-konfigurasjon
- Denne filen må vedlikeholdes, både bygge-konfig/steg, men aller mest
  dependencies (oppdatere versjoner, slette ting som ikke brukes lenger osv)


---

### Dependencies er kode

Note: 
- for ikke å finne opp hjulet på nytt, deler vi kode
- rammeverk, bibliotek, pakker (mange navn)
- kompilert kode som kan brukes i ditt prosjekt
- junit er et eksempel på dette, finnes mange andre
- kunne lastet ned .jar for hånd, lagt i git
- generert kode skal jo ikke i git --> byggeverktøy fikser det for deg
- eks på manuell håndtering: cplibs-scriptet til Martin
- et typisk prosjekt har lett 50-100 dependencies
- Ikke last ned jar selv, legg til dependency i pom.xml (IKKE gjennom IntelliJ,
  manuelt), la maven laste ned
- alle dependencies ligger i .m2-katalogen i rot-folderen din (der $HOME peker)
- maven vil lete først lokalt, så i sentralt repository


---

### Eksempel på reell pom.xml
https://bit.ly/2t7OmYW

Note:
- lenke til en pom.xml fra et opensource-prosjekt (taxonomy-api)
- <parent>...</parent>
- parent: pom-filer kan eksistere i arvehierarki
- <repositories>...</repositories>
- repositories: kan legge til repositories der du henter dependencies fra utover
  mvnrepository.com (nåværende prosjekt internt repository kun tilgjengelig på
  internt nett)


---

### Maven definerer rekkefølge på arbeidsoppgaver

```
validate
clean 
compile
test
package
verify
package
install
deploy
```

Note:
- livssyklus henger nøye sammen med hvordan vi jobber i java
- legger føringer på rekkefølge på arbeidsoppgaver, feks test før koden er klar
  for pakking og release
- fullstendig oversikt over livssyklus: http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
- noen steg handler om maven-spesifikke ting, feks validate som verifiserer at
  nødvendig informasjon er tilgjengelig i prosjektet
- andre steg handler om å jobbe med java-koden og prosjektet
- generelt: alle steg gjøres i riktig rekkefølge, og alle steg før må utføres
  med suksess for at neste steg skal kunne påbegynnes


---

mvn clean

Note:
- sletter alle genererte filer (target-katalogen)
- tips: alt som slettes når mvn clean kjøres skal ikke ligge i versjonskontroll
- tips: før du committer koden din, kjør mvn clean install



---

mvn compile

Note: 
- kompilerer alle .java-filene i src/main/java til .class og linker inn
  bibliotek som brukes.  Dersom nye bibliotek er lagt til vil disse lastes ned
  før kompilering skjer
- når du gjør javac .java ligges .class-filene i samme katalog som du står i by
  default. Vi ønsker ikke å blande generert kode og kildekode --> target
- lager target-katalog (target/classes)
- Alle bibliotek som lastes ned legges i en katalog som heter .m2 som ligger i
  hjemmekatalogen din


---

mvn test

Note:
- kjører alle tester i src/test/java/
- tilsvarer "Run tests..." i IntelliJ der alle tester kjøres
- kompilerer kode og henter ned nødvendige dependencies <-- foregående steg
- filer som trengs til tester skal legges i src/test/resources
- eksempel på det kan være nøkler, rådata, inputfiler, testconfig


---

mvn package

Note:
- lager .jar (hvis det er jar du har definert i pom.xml)
- finnes andre targets også, men jar er stort sett standard nå


---

### Innholdet i en jar-fil

```
➜  assignment git:(2019) ✗ jar tf target/pub.jar
META-INF/
META-INF/MANIFEST.MF
nerdschool/
nerdschool/bar/
nerdschool/bar/Beverage.class
nerdschool/bar/IngredientAmount.class
nerdschool/bar/Pub.class
nerdschool/bar/Ingredient.class
nerdschool/bar/Cocktail.class
nerdschool/bar/SimpleBeverage.class
META-INF/maven/
META-INF/maven/nerdschool/
META-INF/maven/nerdschool/pub/
META-INF/maven/nerdschool/pub/pom.xml
META-INF/maven/nerdschool/pub/pom.properties
```

Note:
- jar er en glorifisert zip-fil, du kan unzipe den eller bruke jar-verktøyet for
  å se hva den inneholder
- her ligger alle .class-filene i riktig filhierarki, samt en del
  meta-informasjon
- sjekk .jar-filen som lages om dere kjører mvn clean package i prosjektet
  deres! 


---

mvn verify

Note:
- her plasseres tester som krever et kjørende system (integrasjonstester,
  gui-tester osv)
- må kjøres etter package fordi det er steget den eksekverbare filen din blir
  laget (vi kjører ikke .class-filer i virkeligheten)


---

mvn install

Note: 
- gjør compile, test, package og en masse andre steg (får .jar-fil hvis det er
  det prosjektet bygger til)
- gjør alle steg frem til og med install 
- install kjøres ved behov, ikke sikkert du trenger dette hver gang du har
  endret i koden. Men før commit: mvn clean install. Alltid. 
- må oppgi clean som parameter, den er uavhengig av de andre targetene. 
- demo!


---

### mvn install og .m2

Note:
- alle avhengigheter maven laster ned for deg legges i .m2-katalogen din som
  ligger i hjemmekatalogen din 
- cplibs-scriptet til martin kunne hatt en tilsvarende katalog den lastet ned
  til
- .m2 er UAVHENGIG av prosjektet ditt, den er knyttet til maven-installasjonen
  din
- ls -la eller "vis skjulte kataloger" for å finne den 
- mao: bruker du samme junit i flere prosjekter, vil alle sammen bruke samme
  jar-fil fra .m2-repoet
- finnes det flere versjoner, vil alle finnes i .m2
- vis konkret dependency også: ls .m2/repository/junit/junit/
- repository-katalogen i .m2 viser pakkehierarki av alt den har lastet ned
- eks: ls .m2/repository/no/kantega viser at jeg har kjørt mvn install både i
  pub-oppgaven (refaktoreringsworkshop) og en tdd-workshop
- .m2/repository/inf112 <-- alt fra forelesninger
- hvis du sletter alt i .m2, vil maven laste ned nye dependencies etterhvert som
  du bygger


---

### Kvalitetssikring og kodestil

Note: 
- Frem til nå har vi snakket om stegene som må gjøres for å bygge et prosjekt
- I tillegg gjøres kvalitetssikring av kode: linting og statisk kildekodeanalyse 
- codacy for java (integrerer flere verktøy)
- Dette hjelper til med å luke ut kjente bugs som følge av feil/svak bruk av
  konsepter i programmeringsspråket (feks, bruk av == i stedet for .equals i
  java, bruk av == i stedet for === i js, kan klage på magiske tall i koden osv)
- ubrukte variabler osv
- IntelliJ varsler om en del også
- for python: pylint, pycodestyle
- for JS: eslint (nyere js)
- særlig for uerfarne folk eller folk som ikke har jobbet før er det lurt å
  bruke slike verktøy, for det gjør at kodebasen blir mer lik (skal ikke kunne
  gjenkjenne hvem som har kodet hva utfra stil)
- Også lurt å bli enige om stil: tab vs spaces, formattering av kode (der flere
  varianter er syntaktisk riktig)
- Skal imports skrives fullt ut, eller er det OK å bruke * ? 
- Slike ting skaper støy i versjonshistorikk om man ikke bruker samme oppsett,
  like greit å automatisere det man blir enige om --> kan finne ut av dette og
  rydde før commit gjøres
- finnes mange standarder, bare bli enige! 


---

### Fjern steg som kan skape feil

Note: 
- alt frem til nå kan fint gjøres på egen maskin, men mange steg å huske på
- teammedlemmer har kanskje andre operativsystem
- prosjektet kjører kanskje på en server i et annet miljø
- teamet må være trygg på at kodebasen i master fungerer, og alle skal være
  trygge på at prosjektet til en hver tid bygger
- maven og verktøy for å sjekke kodestil hjelper, men alle steg skal alltid
  huskes på, og i riktig rekkefølge
- hvordan kan teamet være trygge på at alt ivaretas?
- ved å sette opp en tjeneste som automatisk gjør alle stegene i riktig
  rekkefølge, i riktig miljø


---

### Byggserver samler alle steg i byggeprosessen


Note:
- hva er en byggserver? En tjeneste som lytter på repositoriet ditt på github
  (eller andre public repositories) og bygger prosjektet for deg hver gang det
  kommer endringer i prosjektet
- kommer ofte med integrasjon til github, feks kan Travis knyttes direkte til om
  du får merget kode-endringer
- byggserver bygger på riktig måte, hver gang, med alle stegene du ønsker å ha
  med --> sikkerhetsventil
- sikrer at prosjektet bygger riktig fordi det alltid bygges fra grunnen av på
  en "ren" installasjon
- avslører om det finnes feil (feks om du har glemt å kjøre testene dine før du
  committer)
- bygger prosjektet til release, sikrer at ikke debug-kode er med 
- tegne/vise tegning igjen: lokalt bygg på maskiner vs sentral byggserver, og kobling mot deploy
- vanlige byggservere: Travis, CircleCI, Jenkins, Team City
- nysgjerrig på mer detaljer rundt dette? Sjekk ut Nerdschool-workshoppene på
  bygg og deploy (https://www.meetup.com/Bergen-Nerdschool/ og
  https://github.com/nerdschoolbergen)
- gode tegninger: https://www.mindtheproduct.com/what-the-hell-are-ci-cd-and-devops-a-cheatsheet-for-the-rest-of-us/
- hvordan jobber vi på en god måte (også med byggserver?)


---

### God arbeidsflyt

Note: 
- utvikle små, logiske biter av gangen
- skriv automatiserte tester, kjør dem ofte
- commit hver logiske bit
- før push, gjør clean install slik at du ser at kodebasen virker før du pusher
  koden, gjør så evt linting og andre steg hvis ikke automatikk
- alle tester SKAL kjøre før du pusher. Ellers vil bygget sentralt feile, og
  alle som henter ned siste versjon vil få ikke-fungerende tester og vil dermed
  ikke kunne jobbe effektivt selv


---

### Hvor ofte integreres endringer?

Note:
- Jo oftere endringer integreres med alle andre sine, jo lavere er risiko for at
  endringer ikke er kompatible
- Hvis alle alltid committer til master, og ikke venter lenge med å committe:
  continuous integration
- kalles ofte trunk based development
- hvor ofte bør man integrere? MINST en gang om dagen. 
- husk: lokale endringer som ikke er delt med andre == branch, bare lokal
- oppnår to ting med jevnlig integrasjon: du vet at dine endringer virker med
  andre sine, og andre vet at deres endringer virker med dine
- for å klare å integrere ofte: små steg, alltid ha kontroll
- tegne på tavlen: git med ulike branches som deles i ulikt tempo


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
- gir også grisete git-log fordi disse filene endres i HVER commit fra
  forskjellige personer
- Nå har vi utviklet en feature, og vi vil vise dette til kunden. 
- Da må vi ikke bare bygge systemet, men også få den kjørbare filen med featuren
  ut til brukeren


---

### Hva deployes

Note: 
- for java: som oftest en jar-fil, som er en zipfil med spesiell katalogstruktur
  der alle .class-filene ligger og alle bibliotekene som brukes finnes
- også vanlig (i alle fall tidligere) .war
- annerledes for andre språk, men felles er at det som oftest samles til en
  eksekverbar fil
- når du gjør mvn package får du en .jar-fil i target-katalogen hvis det står at
  du skal lage jar i pom-en


---

### Hvordan deploye

Note: 
- jar-filen må kjøre et sted
- kan kjøre java -jar i kommandolinje på en server
- som oftest er det en applikasjonsserver eller webserver som server jar-filen
  din, fordi applikasjonen gjerne skal kommunisere med andre tjenester og være
  tilgjengelig vi HTTP/HTTPS
- vanlige servere for java: jetty og tomcat
- kan gi deg mulighet til å bytte ut jar-fil uten å skru av tjenesten
- hvis dere vil eksperimentere med denne type stack: bruk spring-boot som
  utgangspunkt, ferdigkonfigurert oppsett som tar mange fornuftige valg rundt
  applikasjonsserver og hvordan alt henger sammen der
- byggserver kan settes opp til å deploye hver gang man merger til master (kan
  være risikabelt)
- enkel tjeneste hvis dere vil eksperimentere: Heroku
- tegne på tavlen: fra build-server til prod, og etterpå via testmiljø


---

### Hva er arkitektur?

Note:
- Oppgave: diskuter hva dere mener med arkitektur i kontekst av det å lage
  programvare (2-3 minutter)
- hvilke elementer inngår i arkitektur på ulike nivå? (muligens diskutere?)
- ulike miljø (lokal, utvikling, test, prod)
- andre interne systemer dere kommer i kontakt med: brannmur, proxy,
  last-delere
- redundans-løsninger i egen rigg
- hvordan koden er adskilt
- hvordan ulike deler av systemet skal kommunisere
- hva er typiske mønstre vi ser for å skille ulike ansvarsområder?
- Persistens-lager, back-end (hoveddel av forretningslogikk), front-end (grafisk
  brukergrensesnitt)
- tegne på tavle: persistens, backend, frontend (inn i eksisterende
  prod-løsning)



---

### Ta vare på data over tid

Note:
- Persistenslaget handler om å lagre (persistere) data over tid
- Oppgave: Hva kan persistering være? (1 minutt)
- Database, relasjon eller annen type
- lagring av enkeltverdier og hvordan disse relaterer til hverandre
- Dokumenter/filer på disk
- brukerdata
- konfigurasjon 
- tilstand på en aktivitet (spilltilstand, søknad som er halvveis utfylt osv)
- skiller på persistering brukerdata og av oppsett for å tilpasse et system
- skiller på strukturerte data og ustrukturerte data
- tegnes ofte som en boks, men i realiteten er det både kode og en separat
  kjørende instans (feks db-skjema, hvordan databasen er bygget opp, er kode)


---

### Forretningslogikk behandler data

Note:
- hva er behandling av data?
- er data gyldig syntaktisk?
- er data gyldig semantisk?
- er applikajonstilstand gyldig?
- hente data fra ulike kilder
- sette sammen data fra ulike kilder
- Kan være mange systemer som integrerer med backend, ønsker å begrense hvor
  mange samtidige koblinger (feks database og "dyre" integrasjoner)
- løse forretningsproblemer
- sørge for at brukeren får gjort det som er nødvendig
- sørge for planlagt feilhåndtering


---

### Visuell kommunikasjon med brukeren

Note:
- visningslogikk handler om 
- presentere data til bruker
- tilpasse data før visning
- ta imot oppgaver fra bruker til systemet (brukeren utfører brukerhistorier)
- logikk for visning <-- ofte uklar linje mellom forretningslogikk og
  visningslogikk


---

### Arkitektur i kode er ansvarsfordeling

Note:
- det aller viktigste prinsippet for å lage kode med god kvalitet er å skille
  ulike ansvarsområder logisk (også vanskelig, tenk sjakk) (separation of
  concerns)
- noen ganger skilles dette logisk og fysisk, andre ganger ikke
- ulike ansvar: hvordan ting lagres har ingenting med hvordan ting
  tegnes å gjøre
- deres spill: har kanskje ikke persistenslag, og visning og forretningslogikk
  (kjernen) er i samme eksekverbare fil. 
- Likevel viktig å skille ansvarsområdene, da i ulike kodefiler/pakker hvis
  nødvendig
- i prosjektet skal dere la folk spille sammen over nett, da må vi tenke
  arkitektur
- Hvilken arkitektur legger vi opp til i prosjektet?


---

### Peer to Peer (P2P)

Note:
- Hva er P2P?
- ingen sentral kjørende node/instans/maskin
- alle aktører er likeverdige og kan kommunisere med hverandre
- arbeidsoppgaver kan fordeles likt
- koden som kjøres på alle noder er lik
- git er i utgangspunktet p2p
- prosjektet deres er p2p. Vet ikke på forhånd hvilken node som er "serveren",
  avhengig av hvem som kobler seg til først
- samme koden kjører på alle nodene
- flere spillere: tre
- tegne på tavlen: p2p av spillet 


---

### Client-server

Note:
- Mot andre enden av skalaen ligger client-server, der en fast node har en
  koordinerende rolle: serveren
- koden som kjøres på server er ulik den som kjøres i klientene
- mittUiB: eksempel på klient-server-arkitektur
- en (eller flere) eksekverbare systemer håndterer backend og visning
- annen kode (egen klient eller i browser) håndterer interaksjon med systemet
- kode er stort sett ikke delt mellom klient og server, de har ulike
  arbeidsoppgaver
- spill med sentral koordinering
- tegne på tavlen: kun klient -- klienter -- klient/server -- bare server 
- ytterpunktene er at det bare finnes en variant (feks offline spill, eller
  server som serverer statisk html)
- fet klient/tynn klient (klient kan være eget program eller webbrowser som
  kjører kode)


---

### Arkitektur påvirkes av brukerbehov

Note:
- hvorfor deles ofte applikasjonen opp slik? 
- Oppgave: Hva kan være årsaker til at ulike typer arkitektur velges? 2 minutter 
- lokasjon: som at brukere er på ulike steder (Internet)
- lokasjon: vil kreve at brukere er på et spesielt nett eller
  fysisk sted
- disse er ofte bakgrunn for p2p/ client-server


---

### Sikkerhetsvurderinger påvirker arkitektur

Note:
- Eks: jobber med banksystemer
- må bruke VPN for å få kontakt med testmiljø mm.
- deler av applikasjonssystemet ligger i egne nett
- brannmur mm skjermer deler av systemet
- kompliserer tilkobling for eksterne aktører
- kompliserer systemene vi bygger, fordi vi må jobbe rundt sikkerhetskrav hele
  tiden, feks i forhold til autentisering og autorisering (har tilgang, har
  rolle som tillater spesifikk bruk)
- dev-miljø
- testmiljø
- akseptansetestmiljø
- ulike nivåer av likhet til prodmiljø (bør være så likt som mulig) der hele
  applikasjonsuniverset er tilgjengelig for mest mulig realistisk testing
- kan spinnes opp der og da eller leve over tid
- må tenke på hvilke type data som kan finnes der (skal det leve lenge, skal man
  kunne importere proddata?), hva med sensitive data? 


---

### Uavhengige instanser skalerer uavhengig


Note:
- Ulike krav til respons fra ulike deler av systemet fordi de oppfører seg ulikt
  under last
- en del av koden krever mer maskinressurser enn andre, og må skaleres
  annerledes
- ulike operasjoner: skrive til system er krevende, lesing av system er trivielt
- ulike brukerbehov: nesten ingen skriver, men veldig mange leser
- last varierer: skalere opp på gitte tidspunkt, feks når selvangivelsen kommer,
  rundt eksamenstid, semesterbaserte undervisningssystemer, ulike tider på
  døgnet --> ulik last osv. 
- Ved skalering må lasten fordeles til de ulike nodene
- Tegne på tavlen: proxy/lastbalanserer som fordeler trafikk
- eks: systemene jeg jobber med har uavhengige noder i produksjon (gjør det
  mulig å oppgradere/deploye nye features uten nedetid)



---

### Oppetidskrav påvirker arkitektur

Note:
- dersom systemet må være oppe hele tiden er det vanskelig å gjøre oppgradering
  av disse
- feks journalsystemer, systemer på sykehus, offentlige systemer (postutsending og
  henting av post), taxi-bestilling, nødetater osv. 
- kan løses med lastbalanserer og redundante instanser: ta ut en node og
  oppgradere denne, sette den inn i trafikk igjen og ta ut neste osv. 
- kjente skytjenester: AWS, Azure, Google Cloud, Heroku
- dette er hele økosystemer av tjenester, AWS har > 100 tjenester og enda flere
  produkter
- kan sette opp separate nett for flere virtuelle maskiner som kjører koden din,
  databasen din osv. 
- kan skalere for deg, feks: 
- hvis backenden trenger mye CPU, bestill det
- hvis frontenden får mange forespørsler, sett opp flere noder og sett en
  lastbalanserer foran
- hva hvis trafikk er ujevnt fordelt? Sett opp prod-miljøet til å skalere
  dynamisk
- Kubernetes er en teknologi som også kan brukes for å gjøre konfigurering av
  sånt
- Denne disiplinen kalles devops i dag, fordi mye av konfigurasjonen på
  driftsmiljøet er kodebasert idag og dermed kan utvikles mer likt som kode


---

### Arkitektur påvirker koden

Note: 
- alle er uavhengige entiteter og må kunne fungere (og feile på en god måte) uten
  de andre systemene: husk å ta med i designet og planlegging av systemet
- oppdatering skjer noen ganger uavhengig av hverandre, noen ganger samkjørt
  (feks om du endrer på interface)
- Systemer med stor last trenger gjerne caching (midlertidig minne for ofte
  brukte data), dette må tas hensyn til i koden. Caching er forferdelig
  vanskelig å få til. 
- uavhengig kjørende instanser som går mot samme type persistens må være trygge
  på at de ikke ødelegger for hverandre


---

### Virtualisering

Note:
- brukes ofte til lokal utforskning, og til å distribuere programvare på en
  enklere måte
- kan gjøres gjennom virtuelle maskiner feks gjennom VMWare, HyperV, VirtualBox
- feks: trenger å teste webapp i en spesifikk windows-browser: har windows-image
  i virtualbox
- en full virtuell maskin er tungt å kjøre opp, krever plass til et helt
  operativsystem mm, windows-vm-en er 8gb, og må leve i minne på maskinen
- vokst frem en annen type virtualisering: docker: en container som oppfører seg
  som brukerområdet på en spesifikk platform i stedet for en full VM med
  operativsystem. 
- jeg bruker docker for å kjøre spesifikk software: feks visning av slides. I
  stedet for å installere programvare, kjører jeg bare et docker-image. Får
  gitpitch satt opp riktig (alle dependencies og konfig satt)
- eks: database må installeres på riktig operativsystem og trenger en del
  systemspesifikt oppsett
- med docker kan dette gjøres en gang og gjøres tilgjengelig for andre
- også mye brukt til lokal utforskning, feks fordi det kan gi deg reell database
  uten at du trenger å installere db lokalt (ofte vanskelig eller umulig)
- oppsummering



---

### Separer ulike ansvarsområder 

Note:
- hvis du klarer dette, er sjansen større for at du har et lesbart og
  vedlikeholdbart system over tid
- arkitektur endrer seg også
- hva betyr dette i praksis? 
- påloggingstjeneste endres fordi organisasjonen du jobber opp mot endrer sin
  innlogging. Eget konsept som holdes så separat fra koden som mulig gjør det
  enklere å bytte ut spesifikk teknologi
- håndtering av brukere og roller gjøres ofte utenfor applikasjonen (stort og
  komplekst felt)
- bygg og deploy er også et ansvarsområde, for uten dette virker ikke koden din
  ordentlig
- maven håndterer dependencies og bygg, så slipper du å tenke altfor mye på det
- all konfigurasjon rundt dette holdes så separat som mulig fra resten av koden
  (pom.xml)
- byggserver håndterer det å bygge i riktig miljø, egen konfig for dette
- så deployes den eksekverbare filen, vi får konfig av serveren den lever på
- neste lag: hvor kjører serveren/tjenesten, og hva er kravene til feks oppetid
  og respons?



---

### Neste: Kodekvalitet og Single Responsibility Principle
