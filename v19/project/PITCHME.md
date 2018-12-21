--- 

# Prosjekt og prosjektmetodikker

Note: 
- Hva er et prosjekt? Hvor lenge varer det?
- Litt historie
- Smidig/agile -- hva er det? 
- Smidige prosjekter
- Gå gjennom noen metodikker

---

### Hva er et prosjekt?

Note: 
- en eller flere oppgaver som skal utføres
- som oftest lenger varighet
- helst flere folk
- en prosjekt har en livsyklus: planlegging/utredning, implementasjon,
  forvaltning)
- for softwareprosjekter: de er levende (aktive) eller døde (ingen bruker det
  mer)

---

### Once upon a time

Note: 
- Prosjekt tenkt på som ferdigprodukt man kan kjøpe (altså ikke vedlikehold
  eller endring over tid). 
- Veldig sjeldent release. Konsekvenser: Høy risiko ved release, veldig mange
  ting kan gå gale (bilde). Mye stress og frys på funksjonalitet lenge før fordi
  mye testing skal gjøres. 
- Mange har tenkt at produktet er "ferdig" etter release (stemmer jo ikke). 
- Software har nesten uendelig mange mulige eksekveringsstier, gjør at risiko
  for feil er veldig høy, ikke mulig å teste alt.
- Glemt en veldig viktig ting: 

---

### Verden endrer seg

Note:
- mål for prosjekt endrer seg
- metoder endrer seg
- folk endrer seg (både i og utenfor prosjektet)
- landskapet rundt prosjektet endrer seg (feks hvilke andre systemer ditt system
  skal integrere mot)
- Invaliderer ferdig-produkt-tankegangen
- Fortsatt noen som opererer med sjeldne release. 
- I tillegg: Mange har ikke tenkt på folkene i prosjektet som folk, men som
  deler som kan byttes ut (som har samme funksjon)

---

### Agile manifesto

1. Individuals over and interactions over processess and tools
2. Working software over comprehensive documentation
3. Customer collaboration over contract negotiation
4. Responding to change over following a plan

Note: 
- 1) uten folk er det ikke noe prosjekt. En person i et prosjektteam er ikke en
  ressurs. Har unik kompetanse, bakgrunn, kontekst og synspunkter. Vi trenger
  prosesser og verktøy også, men det er underordnet et fungerende team. 
- 1) kan selvsagt bytte ut teammedlemmer, men det er en stor kostnad forbundet
  med det
- 2) Dokumentasjon lyver ofte, særlig hvis det er mye av det. 
- 2) Vær kritisk: hva er viktig dokumentasjon? Hvorfor er en spesifikk løsning
  valgt. Ikke hva skjer her: det burde være beskrevet i kode. 
- 2) Hvis løsningen krever dokumentasjon for å være brukbar, symptom på annet
  problem. Ekspert-verktøy kan være unntak. 
- 2) Trenger noe teknisk dokumentasjon for utviklere: Hvordan bygge og jobbe med
  prosjektet. Hvor finner man hemmeligheter? Informasjon man ikke finner andre
  steder eller feks i kode
- 3) Programvare utvikles over tid i samarbeid med kunden, fordi verden endrer
  seg. Best resultat ved hyppig kommunikasjon slik at feil kan rettes opp så
  tidlig som mulig. 
- 3) Kontrakter sier noe om hvordan samarbeid skal foregå og rammer, men ikke
  hva som skal lages (i mer enn veldig overordnede former)
- 4) Vi vet at verden endrer seg, kan ikke gjøre planlegging over lang tid. 
- Disse burde være selvsagte, men er i virkeligheten ikke alltid det
- Vi som fagfolk, håndverkere, må guide kunder i prosjekter
- Har vokst frem mange ulike smidige prosjektmetodikker

---

### Prosjektmetodikker

Note: 
- samliger av ulike teknikker for å prosjekter til å fungere bedre
- inneholder aktiviteter og roller
- noen følger en metodikk strengt, andre plukker

---

### Smidige prosjektmetodikker

- Extreme Programming (XP)
- Scrum
- Kanban

Note: 
- følger smidig-manifestet
- hyppige leveranser
- stor mulighet for selvorganiserende team
- et team i stor grad en autonom enhet
- få kontroll på arbeidsflyt og prioriterte oppgaver
- lære underveis og gjøre endringer utfra erfaringer

---?https://upload.wikimedia.org/wikipedia/commons/4/44/XP-feedback.gif

Note: 
- feedback er sentralt, på mange nivå
- først umiddelbart (i løpet av sekunder eller minutter) gjennom
  parprogrammering og testdrevet utvikling
- daglig gjennom standup og fordeling av hvem som jobber med hvem
- flere dager/ukentlig gjennom akspetansetester
- ca hver 2.-3. uke: iterasjon og planning av neste iterasjon
- hver 2. til 3. måned: overordnet retning av prosjektet

---

### XP

Note:
- begynnelsen av prosjekt: få ned historier som er mest viktige
- bryte ned oppgaver til noenlunde fornuftig størrelse (ikke for store, ikke for
  små)
- justere fart (velocity) etterhvert som prosjektet fortsetter
- planlegge release (hver 2. til 4. måned)
- planlegge iterasjoner (feks 2 uker)
- ingen nye tasks inn i påbegynt iterasjon
- teknisk planlegging i begynnelsen av en iterasjon (rekkefølge + utviklertasks,
  1-2 dager pr oppgave)
- fot i bakken halvveis i iterasjonen
- mange aktiviteter som skal utføres og følges opp (testdrevet design,
  kodekvalitetsprinsipper, metafor, CI, akseptansetester)
- Roller: kunde, programmerer, coach, tester m.m.

---

### Scrum 

Note: 
- noe mindre regler enn i XP 
- langtidshorisont ganske lik som XP (en iterasjon kalles sprint, samme
  tidsperspektiv som XP)
- ingen nye saker inn i pågående sprint
- en sprint: planlegging, utføre, demo/release, retrospektiv (erfare og lære)
- får ikke lov å legge inn flere oppgaver enn det som kan løses i en sprint
- ingen regler for hvordan team-medlemmer jobber sammen eller organiserer seg
- følger opp oppgaver i scrumboard (oversikt over oppgaver i en sprint)
- Roller: produkteier (utenfor teamet), scrum master ("team lead"), utvikler
  (medlem av teamet)

---

### Kanban

Note:
- veldig lite regler. 
- sentralt: kanban-tavle
- begrenser hvor mange oppgaver som kan utføres samtidig
- få som bruker kanban kun med dette, veldig ofte i kombinasjon med elementer
  fra XP og scrum

---

### Prosjekt-tavle

Note: 
- kolonnebasert
- inneholder oppgaver
- minimum: TODO, Doing, Done
- ofte også: backlog/inbox e.l. til ting som ikke ennå er prioritert
- ofte også: egen kolonne til ekstern test, review etc. 
- tavle kan være fysisk, men mange digitale muligheter også: github project
  board, trello, jira osv. 
