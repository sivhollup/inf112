---

### Planlegging og design

Note:
- jobbe videre med brukerhistorier/oppgaver
- finne hovedfunksjonalitet, features/epics for prosjektet
- hva er regler?
- finne ut hva vi skal begynne med
- prioritere regler (både på lang sikt og kort sikt)
- hva er hovedfunksjonalitet i roborally?
- prioritering av krav er kritisk, og må gjøres kontinuerlig
- generelt: velg krav med høyest risiko først, altså: hva MÅ systemet kunne
  gjøre?


---

### Minimum viable product (MVP)

Note: 
- det minste vi kan få til for å kunne gå i produksjon
- uten dette har vi ikke et produkt
- vi trenger mer funksjonalitet for full suksess, men det blir should/nice to
  have
- må kunne testes på reelle brukere
- må finne MVP i dag (kan være dette justeres noe, men hovedlinjer)


---

### MVP tvinger frem et reelt system

Note:
- velg oppgaver som gjør at du må innom alle delene av systemet
- persistens, forretningslogikk, brukergrensesnitt, integrasjoner mot andre
  systemer
- testmiljø og produksjonsmiljø må settes opp 
- bygg/deploy-pipeline må settes opp 
- avtaler om drift og evt støtte må settes opp 



---

### MVP gir verdi

Note:
- Hva er verdi? 
- Kan være penger spart eller penger tjent
- kan også være kunnskap: tilbakemelding fra brukere


---

### MVP inneholder høyrisikoelementer

Note:
- har du unik funksjonalitet? Legg det til MVP slik at du så tidlig som mulig
  får tilbakemelding på om dette fungerer eller ikke
- liker brukerne det?
- klarer brukerner å bruke det slik du hadde tenkt?
- trenger brukerne det? 
- hvis hele businesscaset ditt er bygget opp rundt en feature, få den testet så
  tidlig som mulig slik at du kan justere kurs
- er noe teknisk vanskelig å få til? Ta det med, slik at det blir god tid til å
  fikse eventuelle problemer som dukker opp (dette er også høyrisikoelementer)


---

### MVP gir reell informasjon

Note:
- tilbakemelding fra brukere er gull
- hvordan bruker de systemet? finner de riktige funksjoner?
- brukes systemet som forventet?
- hva savner brukerne? 
- hvor mange ønsker å bruke systemet?
- reelle brukere gjør at dere kan lære og dermed videreutvikle
- brukes til å justere kurs videre


---

### Roborally: overordnet mål

Note: 
- du programmerer en robot i et produksjonslokale (programkortene er enkle
  bevegelser)
- det er om å gjøre å komme seg innom alle flaggene
- flaggene skal besøkes i stigende rekkefølge
- om å gjøre å ikke dø 3 ganger --> ute av spillet
- den som først kommer seg innom alle flaggene (på gyldig måte) vinner
- roborally består av runder, og hver runde består av 5 faser


---

### Roborally er rundebasert

Note:
- 0: Roboter som skal i powerdown settes i powerdown
- 1: Kort deles ut
- 2: Alle programmerer robotens fem faser (1 programkort pr fase). Spillere
  godkjenner sine kort og kan deretter ikke endre dem (de er da overført til
  roboten). Når nest siste spiller har godkjent sine kort, får sistemann 30
  sekunder til å legge ned sine kort. Gjenværende registre fylles med random
  kort fra hånden til spilleren. 
- 3: Spillrunden gjennomføres med fem faser
- 3: I hver fase utføres robotens program for den fasen, elementer på brettet
  beveger seg, og lasere skyter, skade deles ut
- 4: Opprydning: eventuelle optionskort deles ut, skade fjernes og
  roboter i powerdown vekkes til live igjen, roboter som gjenoppstår fra de døde
  settes ut på brettet igjen




---?image=https://www.theboardgamefamily.com/wp-content/uploads/2013/03/RoboRallyCards.jpg

@snap[north-east]
#### @color[white](Fem faser i en runde)
@snapend

Note:
- 1: Programkort utføres, høyest prioritet først 
- 1: Dersom konflikt om plassen, vil den som flytter først dytte annen robot med
  mindre det er en vegg i veien. Deretter vil den andre roboten flytte og gjerne
  da flytte den første roboten.
- 2: Alle ekspress-samlebånd flyttes 1 hakk
- 3: Alle samlebånd flyttes 1 hakk
- 4: tannhjul roteres 90 grader i angitt retning
- 5: lasere aktiveres både for roboter og på brettet
- 6: Backup flyttes, flagg registreres
- før runden begynner skal et program på 5 faser legges ned
- alle roboter har en plassering på brettet før runden begynner
- når du har godkjent kortene dine for en runde går det ikke an å endre dem
- alle kortene byttes ut etter en runde med mindre de er låst pga skade


---

### Skade og programkort

Note:
- roboten blir truffet av en aktiv laser i en fase fører til 1 skade
- roboter kan bli truffet av lasere fra brettet, men også fra andre roboter
- roboter har en laser som peker forover (den retningen roboten ser)
- flere lasertreff i samme fase fører til 1 skade pr laser
- antall kort som deles ut i starten av en runde er direkte proporsjonal med
  antall uskadde registre. 
- Eks: 1 i skade --> åtte kort, 5 i skade --> 4 kort
- de siste registrene hvor bevegelseskort lagres blir "brent fast" i minnet hvis
  antall skade overstiger 4. Disse kortene blir liggende til neste runde og frem
  til roboten tar powerdown eller mister et liv
- hvis roboten står på et felt med skiftenøkkel på slutten av runden, repareres
  1 skade


---

### Powerdown

Note:
- det blir mye skade og vanskelig å lage gode programmer
- du kan annonsere powerdown, som vil si at roboten står inaktiv en hel runde
- når powerdown starter fjernes all skade fra roboten
- en robot i powerdown kan flyttes av andre roboter og kan motta ny skade
- Annonser powerdown når alle har lagt ned sine programkort, men før første fase
- Powerdown blir da aktivert etter de fem fasene i runden


---

### Døden og gjenoppstandelsen

Note:
- Når en robot mister et liv gjenoppstår den fra der backupen sist ble lagret
- en backup er aldri helt bra, så roboten har 2 i skade når den kommer tilbake
- roboten mister et liv om den går utenfor brettet
- roboten mister et liv om den detter ned i et hull i brettet
- roboten mister liv dersom den får 10 i skade
- en spiller har 3 liv. Har roboten dødd 3 ganger er du ute av spillet


---

### Detaljer programkort

Note: 
- har en bevegelse (Flytt frem 1, Flytt frem 2, Flytt frem 3, Flytt bakover 1,
  Roter 90 grader H, Roter 90 grader V, Roter 180 grader)
- har en prioritet (alle bevegelseskort må ha unik prioritet innenfor sin
  klasse, og mellom klassene (bevegelsestypene) skal intervallet ikke være
  overlappende)
- backup: 6 kort (430 - 480)
- u-turn: 6 kort (10 - 60)
- rotate right: 18 kort (80-420, intervall 20)
- rotate left: 18 kort (70-410, intervall 20)
- move 1: 18 kort (490 - 650, intervall 10)
- move 2: 12 kort (670 - 780, intervall 10)
- move 3: 6 kort (790 - 840, intervall 10)


---?image=https://www.theboardgamefamily.com/wp-content/uploads/2013/03/RoboRallyLaser1.jpg&size=55%

@snap[north]
#### Detaljer brett
@snapend

Note:
- det kan kun være en robot pr rute
- det kan være vegger på brettet
- det kan være hull på brettet
- det kan være lasere på brettet
- lasere stoppes av vegger og av roboter (de vil ikke gå gjennom en robot)
- det kan være samlebånd på brettet, samlebånd kan bevege roboter 1 rute (gule)
  eller 2 ruter (blå) i hver fase
- det kan være tannhjul som roterer deg på brettet
- det kan være ruter med fastnøkkel
- ruter med fastnøkkel lar deg legge igjen backup i slutten av en fase
- ruter med fastnøkkel lar deg reparere en skade på slutten av en runde
- må kunne ha ulike brett (kan hardkodes til MVP)
- brett kan settes sammen til større spilleflate



---?image=https://i0.wp.com/www.luisescobarblog.com/wp-content/uploads/2014/05/Three-Reasons-Robo-Rally-is-a-Must-Own-Board-Game-2.jpg&size=60%

@snap[north]
#### Krav for Roborally 
@snapend

Note: 
- ha et spillebrett
- vise en brikke
- kunne flytte en brikke
- spille fra ulike maskiner
- dele ut kort
- velge kort (5 av 9)
- flytte brikke utfra kort
- dele ut nye kort ved ny runde
- vise flere (i alle fall to) brikker på samme brett
- dele ut kort til hver robot
- flytte flere brikker samtidig
- flytte brikker utfra prioritet på kort
- flagg på brettet
- kunne registrere at en robot har vært innom et flagg
- håndtere konflikter i bevegelse riktig
- kunne legge igjen backup
- restarte fra backup v ødeleggelse
- går du i et hull, blir du ødelagt, mister et liv og begynner fra forrige
  backup
- går du av brettet, blir du ødelagt, mister et liv og begynner fra forrige
  backup
- blir du skutt i fillebiter (9 i skade) blir du ødelagt, mister et liv og
  begynner fra forrige backup
- vender en robot mot deg ved slutten av en fase blir du skutt og får en i skade
- får du skade får du mindre kort i henhold til skaden du har
- kan ikke gå gjennom vegger
- for mye skade brenner fast programkort fra runde til runde


---

### Nice to have

Note: 
- kunne ta powerdown for å reparere skade
- options-kort, som endrer reglene for deg (bad stuff for andre, good stuff for
  deg osv)
- pushers, teleportere og andre elementer på brettet
- kunne lage større brett/sette sammen ulike brett
- andre elementer på brettet
- generere hvordan brett kobles sammen?
- generere brett?
- vanskelighetsgrad på brett??
- single player


---

### Hvordan gå frem i planlegging

Note: 
- for et krav, feks vise et brett
- tenk: hva er det minste som må til, programmeringsmessig, for å realisere
  dette? Trenger ikke være pent, trenger ikke være elegant, men må løse oppgaven
- Prøv å tenke gjennom i grove trekk hvilken kode som trengs (forretningslogikk,
  brukergrensesnitt osv). 
- Diskuter hvordan dere tror det vil se ut klassemessig og lag en implementasjon
- Hvordan har dere tenkt å verifisere funksjonalitet? 
- Bli enige om hva som skal til for at oppgaven er ferdig
- gjør dette for de mest kritiske kravene dere vil få på plass først. 
- Legg inn oppgaver i TODO i prioritert rekkefølge, husk å dra over i In
  progress og legg på hvem som jobber med hva
- Hvis dere bommer på hvor mye arbeid det er, tenk på hvordan dere kan justere
  forventningene i neste iterasjon
- husk første iterasjon er kort og en god del tid går med til å planlegge
- bruk gjerne enkel UML for å diskutere hvordan klassestrukturen utvikler seg
  der det gir mening. Mest nyttig er sannsynligvis klassediagram, evt
  objektdiagram. Legg på de detaljene dere trenger for å forstå designet deres.
  For å få oversikt over grunnleggende UML, se hvordan det er brukt i læreboken
  og bruk google. Her er en kort oversikt over ulike typer UML-diagrammer og hva
  de brukes til: https://tallyfy.com/uml-diagram/
- Mer detaljer rundt feks symboler brukt i UML kan dere finne litt nedover på
  siden her: https://www.smartdraw.com/uml-diagram/
- Vise: hvordan kan klassediagram se ut
- Vise: hvordan kan objektdiagram se ut



---

### Definition of Done

Note:
- Mange opererer med Definition of done (handler ofte om mer tekniske aspekter
  også, som kodekvalitet)
- testdekning
- kodekvalitetsmetrikker (statisk kildekodeanalyse, linting)
- hvem som bestemmer når oppgaven er ferdig
- hvordan skal funksjonalitet testes


---

### Funksjonalitet før teknisk design

Note:
- bruk tid på å finne ut av hvilken funksjonalitet dere trenger 
- sørg for at alle er enige om hvordan forretningsreglene virker
- planlegg teknisk design etterpå. Husk at dette kan endre seg fort når dere
  begynner å kode
- tenk på hvordan dere vil teste funksjonalitet


