---

### Planlegging og design

Note:
- finne hovedfunksjonalitet, features/epics
- hva er regler?
- finne ut hva vi skal begynne med
- detaljplanlegge et lite sett
- prioritere regler (både på lang sikt og kort sikt)


---

### Features 

Note: 
- hva er hovedfunksjonalitet i roborally?
- NB: ingen fasitsvar her. Ikke prøvd dette før, vil komme justeringer underveis


---

### Hva er mest viktig?

Note:
- prioritering av krav er kritisk, og må gjøres kontinuerlig
- prioritering endrer seg
- velg de med høyest risiko først, altså: hva MÅ systemet kunne gjøre?
  Vanskeligst/mest virksomhetskritisk først


---

### Minimum viable product (MVP)

Note: 
- det minste vi kan få til for å kunne gå i produksjon
- uten dette har vi ikke et produkt
- ofte høy risiko-funksjonalitet
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
- flytte flere brikker samtidig
- flytte brikker utfra prioritet på kort
- flagg på brettet
- kunne registrere at en robot har vært innom et flagg
- vandrer du av brettet mister du et liv
- håndtere kollisjon riktig
- kunne legge igjen backup
- restarte fra backup v ødeleggelse
- går du i et hull, blir du ødelagt
- går du av brettet, blir du ødelagt
- blir du skutt i fillebiter (9 i skade) dør du
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
- det kan være lasere på brettet
- det kan være samlebånd på brettet
- det kan være tannhjul som roterer deg på brettet
- det kan være ruter med fastnøkkel
- ruter med fastnøkkel lar deg legge igjen backup i slutten av en fase
- ruter med fastnøkkel lar deg reparere en skade på slutten av en runde


---

### Nice to have

Note: 
- options-kort, som endrer reglene for deg (bad stuff for andre, good stuff for
  deg osv)

---

### Tekniske detaljer

