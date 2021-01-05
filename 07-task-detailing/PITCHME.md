### Fra brukerhistorie til implementasjon

Note:
- mer detaljering av problemet
- gå i dybden på noen brukerhistorier og gjøre dem om til noe som det går an å
  jobbe med


---

### Runder og faser i spillet 

Note:
- etter forelesning kom det noen gode spm, ta opp noe av dette her, samt gå
  gjennom spillmekanikken en gang til 
- I løpet av en runde: (tegne på tavlen)
- 0. Annonser PowerDown
- 1. Dele ut riktig antall kort
- 2.a Alle spillere programmerer sine roboter (det skal alltid legges ned fem
  kort, en for hver fase, enten gjennom fastbrente kort eller de spilleren
  legger ned)
- 2.bt Spillere godkjenner programmene sine og leverer tilbake kort de ikke har
  bruk,t
- 3. Fase 1
- 4. Fase 2
- 5. Fase 3
- 6. Fase 4
- 7. Fase 5
- 8. Opprydning: skadereduksjon, optionskort
- 9. Samle inn alle kort og stokker dem
- For hver fase: 
- a. Snu programkort for riktig fase
- b. Utføre programkort i prioritert rekkefølge
- c. Ekspressbånd flytter seg 1 steg
- d. Vanlige bånd og ekspressbånd flytter seg 1 steg
- e. tannhjul roterer
- f. andre elementer på brettet agerer
- g. lasere aktiveres og skade deles ut
- h. Backup flyttes
- i. Flagg registreres


---

### Roboter har lasere

Note:
- robot har laser som peker i den retningen roboten ser (fremover)
- ta med i opptegning


---

### Vegger mellom felter

Note:
- vegger tilhører en side av et felt
- vegger stopper flytting (også ved dytting)
- en robot kan også flytte flere andre roboter, med mindre det er vegg i veien


---

### Roborally over lokalt nett

Note:
- forventer ikke at dere kan koble sammen spill over Internet (i så fall
  valgfritt)
- forventer at prosesser kan kobles opp på samme LAN
- muligens enklest: første prosess som ikke finner noen å koble seg til blir
  master, og alle andre kobler seg til den
- tenk på: hva skjer om en spiller faller ut? 
- skal det gå an å spille fra samme pc? Kanskje? 


---

### MVP: Flaggposisjon er hardkodet

Note:
- dere kan bruke ferdig flaggposisjon til MVP, hvis dere får sjans kan dere
  legge inn mulighet for å plassere ut flagg selv for å variere hvordan brettene
  spilles


---

### Krav -- gjennomgang

Note:
- vise spillebrett
- vise spiller 
- vise flere spillere
- vinne spillet
- avslutte spillet 
- kunne dele ut kort
- besøke et flagg
- kunne utføre lovlig trekk
- dele ut kort
- robot kan miste et liv
- spiller kan dø 
- prioritering avgjør rekkefølge på robotenes bevegelser i hver fase
- prioritering gjøres på nytt for hver fase
- robot kan få skade
- robot kan få reparert skade
- velge spillebrett
- robot fyrer av laser
- plassere flagg
- ta backup
- når nest siste spiller er ferdig skal timeren på 30 sek settes igang
- spiller kan programmere roboten
- godkjenne program for runden
- robot dør hvis den havner i hull
- robot dør hvis den havner utenfor brettet
- robot dør hvis den får 10 i skade
- antall kort justeres utfra mengden skade roboten har
- robotens død fjerner optionskort
- spille en runde
- vegger stopper bevegelse hos robot
- vegger stopper lasere
- vegger ligger mellom to brikker
- robot stopper laser
- en robot kan dytte en annen
- spiller annonserer powerdown
- robot er i powerdown
- aktivere robot fra powerdown
- samlebånd beveger robot
- gjennomføre en fase
- tannhjul roterer robot
- samlebånd kan rotere robot
- få et optionskort
- bruke optionskort
- velge brett før spillet begynner
- dere må sortere disse, presenter det dere tenker skal være med i MVP i
  innleveringen


---

### En brukerhistorie trenger akseptansekriterier

Note:
- Hva er et akseptansekriterie? 
- testbart punkt
- klart definert
- utformes gjerne på formen: "gitt x, så skjer y" eller tilsvarende
- kan forstås entydig
- brukerhistorie handler om behov, akseptansekriterie handler om å definere
  hvordan vi måler at vi når behovet (sånn sett nærmere et "krav")
- 1 eller flere
- når akseptansekriteriene er oppnådd, er vi ferdig med brukerhistorien


---

### Akseptansekriterier definerer skop

Note:
- Akseptansekriterier setter rammene for hva som skal med i brukerhistorien og
  ikke
- Akseptansekriterier definerer planlagt feilhåndtering
- Akseptansekriterier sørger for at alle forstår brukerhistorier på samme måte
  (fordi den blir konkretisert)
- Kan være med å lage estimater fordi det blir tydeligere hva som må realiseres
- Pass på at det ikke blir hverken isfjell eller tannpirkere
- Alle skal være enige om akseptansekriteriene
- mer lesestoff: https://www.altexsoft.com/blog/business/acceptance-criteria-purposes-formats-and-best-practices/


---

### En brukerhistorie fører til konkrete arbeidsoppgaver

Note:
- arbeidsoppgaver som må utføres for å få kunne oppfylle
  akseptansekriteriene
- Visuelt design
- Interaksjonsdesign (Hvordan brukeren interagerer med systemet)
- Avklaringer teknisk eller funksjonelt
- Konkrete implementasjonsoppgaver i de ulike lagene av applikasjonen. Testkode
  er en del av implementasjonskoden
- Trenger du å utvide persistenslaget? 
- Trenger du ny forretningslogikk?
- Trenger du ny visningslogikk? 
- Trenger du nye konsepter/relasjoner?
- Trenger du nye steg i build/deploy-pipelinen for å realisere oppgaven?
- Trenger du utvidede tester utover de automatiske?


---

### En god brukerhistorie går gjennom hele stacken

Note:
- eksempel: "vise en spiller på brettet"
- Dette skal ikke handle kun om visning, men også om at spilleren eksisterer i
  systemet og modelleres som alt annet
- hvis du trenger noe i persistenslaget ditt for å få til å vise en spiller,
  skal dette realiseres
- noen ganger er det mulig å lage arbeidsoppgaver utfra akseptansekriterier,
  andre ganger vil ikke det være dekkende


---

### Å vise et brett

Note:
- akseptansekriterier: 
- vise brettet uten elementer
- vise forventede elementer på brettet (?)
- brettet har forventet størrelse i x og y-retning
- Oppgave: Hvordan definerer vi et element? Må dette med i historien? Diskuter 2 minutter
- Er basisbildet som vises et element? 
- Oppgave: Hvordan vil dere modellere dette? Hva tror dere trengs av kode for å
  få til å vise et brett? 2-3 minutter
- Tegne opp klassene
- Kanskje en mer meningsfull brukerhistorie er å vise en spiller på et brett? 
- Eksempel på brukerhistorie: Som spiller trenger jeg å vite hvor roboten min
  befinner seg for å kunne planlegge neste fase


---

#### UML: visualisering av struktur og flyt

Note: 
- UML -- unified modelling language
- visuelt språk for å vise flyt og relasjoner
- vanlige bruksområder: 
- flyt gjennom program
- oppgaverekkefølge
- interaksjonsdesign
- alle disse handler om oppførsel og modellering av oppførsel 
- relasjon mellom klasser/moduler (klassediagram)
- eksempler på objekter med verdier (objektdiagram)
- disse er strukturelle og beskriver sammenheng i kode
- https://tallyfy.com/uml-diagram/
- https://www.smartdraw.com/uml-diagram/


---

### Klassediagram

Note: 
- inneholder klassenavn
- lister viktige variabler/egenskaper ved klassen
- lister viktige metoder 
- som oftest vises ikke alt
- viser relasjon mellom to klasser vha linjer
- hva er en relasjon? "er en", "har en" 
- annotasjoner på linjene definerer hvilken type relasjon to klasser har
- Tegn opp: en til en, en til mange, arv, interface


---

### Objektdiagram

Note:
- representerer en tilstand på et gitt tidspunkt i applikasjonen
- viser klasser som er instansiert til konkrete objekter
- tegn inn hvilke verdier ulike felter i klassene har på det tidspunktet
- brukes ofte for å forklare endringer i tilstand på ulike tidspunkt
- viser relevante feltvariabler (de som er viktig for det man diskuterer)
- viser ikke metodesignaturer
- eksempel på tavlen: brett med ulike typer elementer


--- 

### Spiller utfører et trekk

Note:
- prøve oss på en litt mer omfattende historie med litt mer detaljer
- både forretningslogikk og visningslogikk
- Oppgave: Hvordan kan denne brukerhistorien se ut? (3-5 min)
- Oppgave: hva er akseptansekriterier for denne historien? (5-6 min)
- Eksempel: definere hvordan input skal gis, er det relativ posisjonering eller
  absolutt?
- Oppgave: hva blir arbeidsoppgavene? (4-5 min)
- Eksempel arbeidsoppgaver: 
- kode visning av brikke 
- kunne representere en spiller i koden
- persistens? eller er alt lagret i minnet? 
- lage: spiller kan gi input om hva trekket skal være (ingen logikk rundt lovlighet)
- lage visningslogikk for å vise brikke på riktig sted
- klare å beregne ny posisjon utfra input


---

### Neste forelesning: refaktorering
