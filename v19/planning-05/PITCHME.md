---

### Planlegging og design

Note:
- Denne presentasjonen:
  https://gitpitch.com/sivhollup/inf112/master?p=v19/planning-05
- finne hovedfunksjonalitet, features/epics
- hva er regler?
- finne ut hva vi skal begynne med
- detaljplanlegge et lite sett regler (og lage design for det dere tror det
  blir. Husk at dette kommer til å endre seg)
- prioritere regler (både på lang sikt og kort sikt)
- hva er hovedfunksjonalitet i roborally?
- NB: ingen fasitsvar her. Ikke prøvd dette før, vil komme justeringer underveis
- prioritering av krav er kritisk, og må gjøres kontinuerlig
- prioritering endrer seg
- generelt: velg krav med høyest risiko først, altså: hva MÅ systemet kunne
  gjøre?


---

### Minimum viable product (MVP)

Note: 
- det minste vi kan få til for å kunne gå i produksjon
- uten dette har vi ikke et produkt
- vi trenger mer funksjonalitet for full suksess, men det blir should/nice to
  have
- må finne MVP i dag (kan være dette justeres noe, men hovedlinjer)


---

### Krav for Roborally 

Note: 
- ha et spillebrett
- vise en brikke
- kunne flytte en brikke
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
- kunne ta powerdown for å reparere skade
- vanskelighetsgrad på brett??
- for mye skade brenner fast programkort fra runde til runde


---

### Rekkefølge i spillmekanikk

Note: 
- en runde består av fem faser
- før en runde skal et program på 5 faser legges ned
- alle roboter har en plassering på brettet før runden begynner
- en fase: snu kortet i fasen
- høyest prioritet flytter først
- bevege samlebånd
- bevege tannhjul
- lasere skyter (både på brettet og de som robotene har)
- flytte backup og registrere flagg
- totalt fem faser slik, så ved slutten av runde:
- reparere skade hvis robot står på fastnøkkelrute
- dele ut options-kort?


---

### Forretningsregler: programkort

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


---

### Forretningsregler for brettet

Note:
- det kan kun være en robot pr rute
- det kan være vegger på brettet
- det kan være hull på brettet
- det kan være lasere på brettet, som er aktive helt til de treffer en vegg
- det kan være samlebånd på brettet
- det kan være tannhjul som roterer deg på brettet
- det kan være ruter med fastnøkkel
- ruter med fastnøkkel lar deg legge igjen backup i slutten av en fase
- ruter med fastnøkkel lar deg reparere en skade på slutten av en runde
- må kunne ha ulike brett (kan hardkodes til MVP)
- må kunne sette samme ulike brett til større deler


---

### Nice to have

Note: 
- options-kort, som endrer reglene for deg (bad stuff for andre, good stuff for
  deg osv)
- andre elementer på brettet
- generere bret??
- generere hvordan brett kobles sammen?


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
- bruk UML for å diskutere hvordan klassestrukturen utvikler seg der det gir
  mening. Lag enkle skisser for å beskrive klassediagram, legg på nødvendig
  informasjon som feks forhold mellom klassene (1-1, 1-mange mange-mange osv).
  For å få oversikt over grunnleggende UML, se hvordan det er brukt i læreboken
  og bruk google. Her er en kort oversikt over ulike typer UML-diagrammer og hva
  de brukes til: https://tallyfy.com/uml-diagram/
- dersom dere synes det gir verdi, bruk gjerne sekvensdiagram osv for å få på
  plass logikken i spillet 
- Mer detaljer rundt feks symboler brukt i UML kan dere finne litt nedover på
  siden her: https://www.smartdraw.com/uml-diagram/


---

### Funksjonalitet før teknisk design

Note:
- bruk tid på å finne ut av hvilken funksjonalitet dere trenger 
- sørg for at alle er enige om hvordan forretningsreglene virker
- planlegg teknisk design etterpå. Husk at dette kan endre seg fort når dere
  begynner å kode
- tenk på hvordan dere vil teste funksjonalitet


