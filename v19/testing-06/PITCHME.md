---

### Testing

Note:
- dagens presentasjon: https://gitpitch.com/sivhollup/inf112/master?p=v19/testing-06
- Eksempel: regnskapsføring
- hver gang et nytt innslag i et regnskap føres, skal summen gå inn på en konto
  og ut fra en annen
- en konto krediteres, en debeteres. Hvis du kjøper inn kontorrekvisita,
  debeteres kontorrekvisita-kontoen i regnskapet, mens du krediterer bank-konto
  (som du har betalt fra). Summen blir null
- dette kalles dobbel bokføring, og brukes for å redusere antall feil i
  regnskapet og for å gi bedre kontroll over regnskapet
- testing er dobbel bokføring i kodeforstand


---

### Testing == Verifikasjon

Note: 
- Hva er formålet med testing av software?
- sikkerhetsnett
- Mer detaljert: 
- verifisere funksjonalitet
- sørge for at feil ikke oppstår igjen (etter en er oppdaget)
- senke risiko for produksjonssetting
- øke tryggheten til utviklere og kunder
- øke vedlikeholdbarheten til kode
- gjøre det enklere å eksperimentere
- redusere mengden konsepter utvikleren trenger å holde i hodet på en gang 


---

### Hvordan tester vi?

Note:
- automatiske tester (finnes ulike typer som kjøres til ulike tider)
- manuelle tester
- finnes tester på ulike nivåer, som har ulike formål


---

### Enhetstester

Note: 
- Tester funksjon av en spesifikk del av koden, gjerne en funksjon
- kjøres ofte (feks finnes det verktøy som kjører alle enhetstestene for deg
  hver gang du lagrer endringer i koden)
- Skal være raske


---

### Integrasjonstester

Note:
- Tester at ulike deler av systemet interagerer på riktig måte
- Eksempel: at databasen og back-enden snakker sammen på riktig måte
- Eksempel: systemet ditt integrerer med Altinn på riktig måte
- tar ofte litt mer tid
- krever gjerne et kjørende system (typisk test-system)
- kjøres ikke like ofte som enhetstester, men i alle fall før ny funksjonalitet
  aksepteres i master-branch


---

### Regresjonstester

Note: 
- Tester som sjekker at du ikke har noe som har virket men som har sluttet å
  virke
- Si at du har et system som det finnes en del funksjonalitet i. Du utvikler en
  ny feature. Regresjonstester er å teste at all den eksisterende
  funksjonaliteten fortsatt virker etter at du har lagt på den nye features.
  Hvis du ikke har automatiske tester, vil da de som tester manuelt teste både
  de nye featurene som har blitt lagt til, men også alle de gamle featurene som
  skal fortsette å virke. 
- en regresjon er at noe som virket før slutter å virke i senere tid
- hver gang du kjører testene dine kjører du egentlig regresjonstester


---

### Systemtester

Note:
- Tester som kjøres på et komplett system, der alle moduler er tilgjengelig
- Tester dermed hele stacken
- Ofte finnes det egne test-domener som speiler oppsettet (arkitektur) til
  produksjon
- Eksempel på testsystem: test.site.com som snakker med test.api.site.com med
  autentisering og egen persistering osv. 


---

### Akseptansetester

Note:
- Tester som utføres av kunde med det formål å godkjenne eller underkjenne ny
  funksjonalitet. Altså: er funksjonen ferdig utviklet og kan gå i produksjon? 
- Kan være manuelle eller automatiske
- Når en akspetansetest er gjennomført kan denne legges inn som regresjonstest

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


---

### Sikkerhetstesting/penetrasjonstester

Note:
- Teste programvare for å se om systemet tilfredstiller sikkerhetskrav
- Kan være automatisk eller manuelt, gjerne en kombinasjon
- Kan utfordre konfidensialitet (få lesetilgang på hemmelig informasjon),
  integritet (endre informasjon) eller tilgjengelighet (kan systemet angripes
  slik at det ikke blir tilgjengelig for andre)
- Sjekke OWASP topp 10 om dere er interessert i sikkerhet (de ti vanligste
  angrepene man må verne systemet sitt mot)


---

### Hypotesetesting

Note: 
- testrammeverk som lar deg spesifisere intervaller du skal teste i, og kjører
  mange (>100) tester med generert input basert på verdier du oppgir
- ofte brukt for å teste matematiske funksjoner/komplekse scenario der du
  trenger tilfeldigheter/mye ulik input
- brukes ofte til å teste intervaller


---

### Test automatisk

Note:
- jo flere tester som kan automatiseres, jo tryggere er du på at utvidelser du
  gjør ikke ødelegger noe du har laget allerede
- jo oftere tester kjører, jo bedre
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
- Dårlig eksempel: order.set(age, drink) etterfulgt av order.allowedPurchase, der
  allowedPurchase er private member. 
- Godt eksempel: order.set(age, drink) etterfulgt av order.isValid(), der
  isValid() er en public-metode som feks kan sjekke
  order.allowedPurchase-variabelen
- Om order.allowedPurchase byttes ut med noe annet påvirkes ikke den siste
  testen
- Tester som tester implementasjonsdetaljer gjør kodeendring vanskelig over tid
  (gir skjør kode (brittle)


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



