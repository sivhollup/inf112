---

### Testing

Note:
- Eksempel: regnskapsføring
- hver gang et nytt innslag i et regnskap føres, skal summen gå inn på en konto
  og ut fra en annen
- en konto krediteres, en debeteres. Hvis du kjøper inn kontorrekvisita,
  debeteres kontorrekvisita-kontoen i regnskapet, mens du krediterer bank-konto
  (som du har betalt fra). Summen blir null
- dette kalles dobbel bokføring, og brukes for å redusere antall feil i
  regnskapet og for å gi bedre kontroll over regnskapet
- testing er dobbel bokføring i kodeforstand
- finnes mange ulike typer tester, som tester systemet på ulike nivåer


---

### Testing == Verifikasjon

Note: 
- sikkerhetsnett
- verifisere funksjonalitet
- sørge for at feil ikke oppstår igjen (etter en er oppdaget)
- senke risiko for produksjonssetting
- øke tryggheten til utviklere og kunder
- øke vedlikeholdbarheten til kode
- gjøre det enklere å eksperimentere
- redusere mengden konsepter utvikleren trenger å holde i hodet på en gang 
- produksjonskode beskriver hvordan en oppgave løses
- testkode beskriver hvordan en løsning skal oppføre seg, og om mulig hvorfor


---

### Hvordan tester vi?

Note:
- automatiske tester (finnes ulike typer som kjøres til ulike tider)
- manuelle tester
- finnes tester på ulike nivåer, som har ulike formål


---

### Oppbygning av en test

Given

When

Then

Note: 
- Given: Hvordan ser verden ut når du starter testen? Også kalt precondition
- Given: andre navn: precondition, arrange
- Given: Alt det som er viktig for at du skal kunne verifisere ønsket oppførsel
- When: Oppførselen du tester
- When: Andre navn: Act
- When: På enhets-test-nivå, helst bare ett metodekall
- Then: Verifisere at resultatet av det du har gjort gir korrekt resultat
- Then: En test verifiserer en ting (eller ting som henger sammen)
- Then: andre navn: postcondition, Assert


---

### Enhetstester

Note: 
- engelsk: unit tests
- Tester hvordan en spesifikk del av koden fungerer, gjerne en funksjon eller en
  del av en funksjon
- kjøres ofte (feks finnes det verktøy som kjører alle enhetstestene for deg
  hver gang du lagrer endringer i koden)
- Skal være raske
- Tegne på tavlen: boks: klasse/modul
- se på et generelt eksempel på hvordan en test kan se ut


---

```java
package inf112.tdd;

import org.junit.Test;

public class ClassNameTest {

    @Test
    public void whatTheTestShouldVerify() {
       ThingToTest ttt = new ThingToTest();
       Result expected = new Result().withExpectedValues();

       Result result = ttt.methodToBeTested();

       assertEquals(expectedValue, result);
    }
}
```

Note:
- Test i klassenavn, en testklasse er bare en vanlig java-klasse
- @ : annotasjon 
- @Test: annotasjon som sier at dette er en test som skal kjøres
- testklasser er public
- testmetoder er public void, testrammeverket sørger for riktig oppførsel (hva
  som feiler)
- metoder uten annotasjon kan lages for støtte (hjelpefunksjoner), typisk
  private-metoder
- forklar hensikt i metodenavn
- grupper gjerne linjene for given, when, then slik at det er lett å se forskjell på de
  ulike delene av koden
- vi skal se på reelle tester i en demo etterpå, men hva med andre typer tester? 
- nå har vi sett på testing av enkelte byggestener
- hvis vi zoomer ut, blir neste nivå å teste et sett av byggestener


---

### Integrasjonstester

Note:
- De fleste systemer er satt sammen av ulike deler, og ulike kjørende instanser
- Tester at ulike deler av systemet interagerer på riktig måte
- Eksempel: at databasen og back-enden snakker sammen på riktig måte
- Eksempel -- Tegne på tavlen: banksystem --> folkeregisteret, gjeldsregisteret,
  eiendomsregisteret, motorvognregisteret
- tar ofte litt mer tid
- krever gjerne et kjørende system (typisk test-system eller lokalt kjørende
  instans)
- kjøres ikke like ofte som enhetstester, men i alle fall før ny funksjonalitet
  aksepteres i master-branch
- stiller større krav til oppsett av test både på test-siden og
  produksjonskode-siden. 
- Må legge til rette for både test og produksjon
- Eksempel: kan db kjøre lokalt? Kan hver kjørende instans kjøres lokalt?
- Bruker ofter docker (virtualisering av OS som kan kjøre koden), gjør det mulig
  å ha "prodlikt" miljø med ulike kjørende instanser lokalt


---

### GUI-tester

Note:
- Tester brukergrensesnitt manuelt eller automatisk
- Kan teste at GUI-elementer finnes, at riktig antall vises
- Kan teste at oppførsel er korrekt, feks at de rette elementene dukker opp når
  en knapp klikkes på, eller at riktig side dukker opp
- Kan være vanskelig å designe uten å gjøre systemet skjørt (slike tester er
  veldig detaljerte og kan være veldig knyttet mot implementasjonsdetaljer i
  grensesnittet)
- skrives vanligvis ikke før GUI har nådd en viss modenhet, fordi GUI ofte
  endrer seg vesentlig tidlig i utviklingsløspet
- ofte skrives automatiske tester for kritiske deler av applikasjonen, og nok
  til å verifisere alt alle ting henger sammen på riktig måte, kalles ofte
  smoke-tester. 
- kan være helt uavhengig av resten av systemet, da må resten av systemet mockes
  vekk 


---

### Mock

Note:
- ved behov for å kontrollere ytre faktorer (andre moduler, eksterne API-er osv)
- vi kan bruke biblioteker som later som om de er en klasse eller et annet
  system, de kan sjekke mye ulikt: 
- 1) har en funksjon blitt kalt? Klasse blitt opprettet?
- 2) Hvor mange ganger har en metode blitt kalt?
- 3) Når en metode kalles (gjerne med spesifikt innhold), returner konfigurert
  innhold
- noen skiller på fake og mock, spy er også et uttrykk som brukes relatert til
  dette
- kan gjøre tester mindre skjøre, feks krever ikke GUI-tester at hele systemet
  kjører
- kan også brukes for å redusere mengden integrasjonstester som kreves (OBS:
  krever vedlikehold)
- https://github.com/nerdschoolbergen/all-about-testing-code <-- exercise 5
  handler om mocking med mockito, prøv det! 


---

### Systemtester

Note:
- Der en integrasjonstest kanskje tester en spesifikk kobling mellom to
  systemer, trengs tester som tester helheten 
- Tester som kjøres på et komplett system, der alle
  moduler/subsystemer/integrasjoner er tilgjengelige
- Tester dermed hele stacken (alle lagene: frontend, forretningslogikk,
  persistens og evt integrasjoner)
- Ofte finnes det egne test-domener som speiler oppsettet (arkitektur) til
  produksjon
- Eksempel på testsystem: test.site.com som snakker med test.api.site.com med
  autentisering og egen persistering osv.
- 1) Oppfører alle delene seg som forventet mot hverandre? 
- 2) Hva skjer hvis en del av systemet går ned? (spesifikk feiltesting)
- 3) Er responstid akseptabel ved forventet bruk?


---

### Ytelsestester

Note: 
- Tester som utforsker hva grensene til et system er
- Bør ha kjørende system (kan gjøres på integrasjonstestnivå også)
- Genererer reelle (eller enda større) last på systemet
- eksempel på verktøy: gatling
- Kjører opp mange tråder og sender forespørsler til systemet, måler responstid
- Designer gjerne dette for å stadig øke presset på systemet for å undersøke
  hvordan oppførsel endrer seg med last (hvor knekker det, og hvordan?)
- Brukes ofte sammen med analyseverktøy for å se hvordan lasten fordeler seg i
  systemene og hvordan enkeltmoduler oppfører seg med last (kan være
  minne/CPU-bruk osv)


---

### Regresjonstester

Note: 
- en regresjon er at noe som virket før slutter å virke i senere tid
- Tester som sjekker at du ikke har noe som har virket men som har sluttet å
  virke
- Si at du har et system som det finnes en del funksjonalitet i. Du utvikler en
  ny feature. Regresjonstester er å teste at all den eksisterende
  funksjonaliteten fortsatt virker etter at du har lagt på ny funksjonalitet.
- Hvis du ikke har automatiske tester, vil da de som tester manuelt teste både
  de nye featurene som har blitt lagt til, men også alle de gamle featurene
- hver gang du kjører de automatiske testene dine kjører du egentlig regresjonstester
- hvis du gjør testing hele tiden er regresjonstest er unødig begrep, men dersom
  prosjektet har mye manuelle tester, er regresjonstest reelt


---

### Akseptansetester

Note:
- Ofte utvikler vi programvare for noen (kunden)
- Når ny funksjonalitet er laget, skal den godkjennes før den settes i
  produksjon
- Utføres ofte av kunde med det formål å godkjenne eller underkjenne ny
  funksjonalitet. 
- Kan være manuelle eller automatiske
- Når en akspetansetest er gjennomført kan denne legges inn som regresjonstest,
  helst automatisk
- Dersom jobben med å finne ut hva som skal lages gjøres med kunden før koden
  skrives, kan en automatisk test lages med en gang


---

### Utforskende tester

Note:
- handler om å utforske programvare, gjøres manuelt
- krever stor grad av kreativitet i kombinasjon med evne til å klare å
  gjenprodusere og systematisere resultater
- eks: Klikke på rare og uventede steder i brukergrensesnittet, bruke ulike
  musknapper eller kombinasjoner, bruke hurtigtaster, short-cuts, ulike tegn i
  inputfelt osv. 
- Gjøres med jevne mellomrom for å utfordre design og funksjon i
  brukergrenesnitt (men kan også brukes på API-nivå)
- Gjøres som oftest på system- eller integrajonsnivå


---

### Sikkerhetstesting og penetrasjonstester

Note:
- Teste programvare for å se om systemet tilfredstiller sikkerhetskrav
- Kan være automatisk eller manuelt, gjerne en kombinasjon
- Kan utfordre konfidensialitet (få lesetilgang på hemmelig informasjon),
  integritet (endre informasjon) eller tilgjengelighet (kan systemet angripes
  slik at det ikke blir tilgjengelig for andre)
- Sjekke OWASP topp 10 om dere er interessert i sikkerhet (de ti vanligste
  angrepene man må verne systemet sitt mot)
- https://www.owasp.org/index.php/Category:OWASP_Top_Ten_Project


---

### Hypotesetesting

Note: 
- testrammeverk som lar deg spesifisere intervaller du skal teste i, og kjører
  mange (>100) tester med generert input basert på grenseverdier du oppgir
- ofte brukt for å teste matematiske funksjoner/komplekse scenario der du
  trenger tilfeldigheter/mye ulik input
- ulike rammeverk for ulike programmeringsspråk


---

### Hvordan jobbe med tester? 

Note: 
- for mange er (fortsatt) testing vanskelig å håndtere
- vi må finne måter å gjøre det mindre skummelt på 
- hvordan teste på en god måte?
- hvordan få dette inn som en del av arbeidsflyten som gir dere en bedre
  hverdag? 


---

### Test-drevet utvikling (TDD)

Note:
- Utviklernær måte: test-drevet utvikling
- Drive utvikling med tester. 
- Testen skrives først, før det finnes noe som helst annen kode. Det er ikke lov
  å skrive kode før det finnes en test
- Implementer kode etterhvert som det trengs, men aldri mer enn nødvendig for å
  få testen til å gå gjennom 


---

### Testen skal feile først

Note:
- Hvis ikke testen feiler, vet du ikke at du tester det du tror du tester
- Hvis testen er grønn fordi du har gjort en feil i testen, tror du feilaktig at
  du har dekket oppførsel du ønsket å teste
- Hvis du skriver tester for eksisterende kode, gå inn i koden og ødelegg slik
  at du ser at testen feiler på riktig måte
- Når testene går gjennom (blir grønne), kan man forbedre koden (refaktorere
  koden)
- Denne syklusen kalles red-green-refactor



---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/02-testing/img/red_green_refactor.png&size=35%

Note: 
- Refaktorere: å endre kodestruktur uten å endre funksjonalitet, det vil si at
  testene skal kjøre både før og etter uten endringer


---

### Demo


---

### @Before og @After

Note: 
- Annotasjoner for funksjoner som skal sette opp felles testmiljø og deretter
  rydde opp 
- velkjent designprinsipp: DRY (Don't repeat yourself), hvis noe opptrer flere
  ganger, gjem det vekk i en funksjon så du slipper duplisering
- Finnes ulike varianter, @before, @beforeeach, @beforeclass osv. (og
  tilsvarende for @after)
- Varierer med testrammeverk, men hensikten med de ulike er det samme
- @before kjører før en test eller en klasse, samme metode kjøres før alle
  tester
- trenger du en db-connection? Sett den opp her
- Trenger alle testene dine et objekt med basis-egenskaper? Sett det opp her
- Samle det som er felles på et sted
- sørg for å rydde opp etter deg (ofte gjøres rydding også i before i stedet for
  å legge dette i after). Fordel med å gjøre dette før test: sikker på at
  utgangspunkt for testen er korrekt


---

### Effektiv og trygg testing

Note: 
- Dere har nå sett testdrevet utvikling og hvordan vi skriver tester
- Hva er viktig å tenke på i forbindelse med test utover det å skrive en test
  rent teknisk? 


---

### Test automatisk

Note:
- jo flere tester som kan automatiseres, jo tryggere er du på at utvidelser du
  gjør ikke ødelegger noe du har laget allerede
- jo oftere tester kjører, jo bedre, gjerne hver gang du lagrer koden
- testkode utgjør lett halvparten av kodebasen


---

### Test oppførsel

Note: 
- tester oppførsel, ikke implementasjonsdetaljer (med mindre det er en del av
  oppførselen som er kritisk). Tenk på systemet du tester som en svart boks, du
  har kun mulighet til å gi inn input og få output tilbake. Alt på "innsiden" av
  boksen skal du ikke teste. 
- Eks: ikke test verdier på interne variabler i en klasse, kun det du får
  tilbake.
- Dårlig eksempel: order.set(age, drink) etterfulgt av order.allowedPurchase,
  der allowedPurchase er private member. 
- Godt eksempel: order.set(age, drink) etterfulgt av order.isValid(), der
  isValid() er en public-metode som sjekker order.allowedPurchase-variabelen
- Om order.allowedPurchase byttes ut med noe annet påvirkes ikke den siste
  testen
- Tester som tester implementasjonsdetaljer gjør kodeendring vanskelig over tid
  (gir skjør kode (brittle))


---

### Test en ting

Note:
- en test tester kun et konsept
- lett å forstå hva testen tester og få oversikt
- viser hvilken kode som er nødvendig for å oppnå det ene konseptet
- letter å forstå hva som blir ødelagt når testen feiler
- kortere å navngi testen


---

### Prøv ut din egen kode

Note: 
- testkode lar deg bruke din egen kode i isolasjon
- lett å avsløre om du har laget et bra grensesnitt å bruke eller ikke
- hvis du trenger mye kode for å utføre noe enkelt, er det kanskje et tegn på at
  du kan lage en funksjon for det og bruke den (både i test og i kode generelt)


---

### Tester er dokumentasjon

Note:
- tester viser hvordan koden din er ment til å brukes
- nye folk på prosjektet (evt deg selv om et halvt år) kan bruke tester til å
  sette seg inn i prosjektet
- god navngiving på tester gir deg en kort beskrivelse av hvordan systemet
  oppfører seg 
- eksempel: testNonValidIdFails() { String id = "ab"; } vs
  testIdWithoutHyphenIsRejected() { String id = "ab"; } (her bør det også være
  med en test som viser hva en gyldig id er
- mer spesifikt: 
- viser hvilke parametre som trengs for å utføre en oppgave
- viser hvilken type parametrene skal være (evt ikke være)
- viser hva som er gyldige verdier, og ikke gyldige
- viser hva slags returverdier du kan få
- viser hva som er tiltenkt feilhåndtering
- gjem vekk alt annet enn det som er kritisk for testen (kan være funksjoner som
  hjelper deg med å sette opp inputdata osv)


---

### Tester avslører antagelser


Note:
- Eksempel:
- nettbutikk. Du velger det du vil kjøpe og skal sende det. Når systemet først
  lages finnes det bare en måte å sende pakken på, og du må taste inn et sett
  med informasjon. Seks mnd etterpå finnes det fire ulike måter å sende pakker
  på, og testene må reflektere dette
- testnavn kan i utgangspunktet være: validAddressInformation(), men hvis ulike
  firma krever ulik informasjon trenger du testnavn (og tester) som reflekterer
  dette. Første testnavn er tvetydig, for det sier ikke noe om hvilken
  informasjon som er viktig og for hvilken shippingmetode det er viktig


---

### Testkode er også kode

Note:
- testkode kan lett utgjøre halvparten av linjene i en kodebase
- krever samme type vedlikehold og omtanke som resten av prosjektet
- blir testene lange med stor grad av duplisering, blir de ikke brukt (ingen
  gidder å lese dem, ingen gidder å vedlikeholde dem, og det blir vanskelig å
  endre koden fordi alle testene knekker og det er ikke noe lett å fikse dem der
  og da)
- tester er særlig utsatt for duplisering, siden mange tester omhandler nesten
  den samme funksjonaliteten, husk å lage kode for å håndtere testoppsett
  fornuftig
- de fleste testrammeverk gir noen muligheter for å ta vekk duplisering: 
- before, after, beforeclass, afterclass
- Builder-pattern kan brukes for å gjøre det enklere å lage gode tester (vis
  prosjekt)


---

### Når skal vi ikke teste?

Note:
- prøve ut nye ting: hvis man ikke vet hvilken løsning man skal gå for, kan det
  være greit å eksperimentere uten å teste, evt å la testen være utforskning.
  POC kan være uten test, men produksjonskode er ikke uten test
- hvis det er vanskelig å teste på en god måte. Må ta hensyn til i hvilken grad
  funksjonalitet som testes er virksomhetskritisk
- hvis tester gjør at endring av kode er vanskelig (men dette er typisk et tegn
  på at noe er gale med koden din)
- Eksempel: data blir brukt opp, data på tvers av uavhengige systemer (feks
  transaksjoner)



---

### Neste forelesning: Prosjektmetodikk


