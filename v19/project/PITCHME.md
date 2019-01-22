---

### Denne presentasjonen

https://bit.ly/2Mq6Mgj


---?image=https://images.pexels.com/photos/1776134/pexels-photo-1776134.jpeg

Note:
- Bilde: føtter på et barn som såvidt har lært seg å gå
- byggebransjen har eksistert i tusenvis av år, vi er kvitt barnesykdommene
- alle har et forhold til byggebransjen
- de fleste klarer å spikre sammen småting
- de fleste klarer å gjøre litt større ting, feks lage en terasse, ved å lese
  litt
- noen klarer å gjenkjenne godt arbeid selv om de ikke er i bransjen selv
- IT-bransjen har kun eksistert i noen få år, vi kan regne fra ca 60-tallet
- Dette har flere konsekvenser, først og fremst: umoden bransje, vi har ikke
  funnet ut hva som virkelig fungerer. I tillegg går utviklingen veldig fort, du
  kan ikke være lenge vekke før det du kunne er utdatert
- en konsekvens er at det som er relevant nå, som dere lærer i dette kurset,
  gjerne ikke er like relevant om 3 år eller 5 år. Prøver å fiske ut de
  generelle temaene, men vær forberedt på at verden endrer seg


---

### Prosjekt og prosjektmetodikker

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
  forvaltning) som gjentar seg gjennom hele levetiden til prosjektet
- for softwareprosjekter: de er levende (aktive) eller døde (ingen bruker det
  mer)



---?image=https://flatiron-v3-production.imgix.net/edsger_dijkstra_twitter_1024.jpg

Note:
- bilde: dijkstra-strektegning
- på 60-tallet var programmering/utvikling en vitenskap
- fra 60-tallet til midten av 80-tallet var det mange enorme softwareprosjekter,
  og mange gikk ordentlig på trynet, enorme tap (kalt the software crisis)
- "The major cause of the software crisis is that the machines have become
  several orders of magnitude more powerful! To put it quite bluntly: as long as
  there were no machines, programming was no problem at all; when we had a few
  weak computers, programming became a mild problem, and now we have gigantic
  computers, programming has become an equally gigantic problem." Edsger
  Dijkstra 
- Software har nesten uendelig mange mulige eksekveringsstier, gjør at risiko
  for feil er veldig høy, ikke mulig å teste alt.
- sannheten er ikke så enkel, en annet problem var at kundens krav var
  LOV (kunden har alltid rett)
- som et resultat av dette vokste det frem ulike typer prosjektmetodologier for
  å få bukt med disse problemene

---

### Programvarebransjen vs andre bransjer

- Mange tenker på software som ferdigprodukt man kan kjøpe (altså
  ikke vedlikehold eller endring over tid).
- Mange har tenkt at produktet er "ferdig" etter release (stemmer jo ikke).
  Dette er "sant" i mange andre, mer etablerte, bransjer (særlig fysiske
  produkter)
- Dette er ikke egentlig virkeligheten mer. Mange applikasjoner har
  abonnement-løsninger, omtrent alt som har software har oppdateringer.
- Veldig sjeldent release. Konsekvenser: Høy risiko ved release, veldig mange
  ting kan gå gale (bilde). Mye stress og frys på funksjonalitet lenge før fordi
  mye testing skal gjøres.
- Mange glemmer et veldig viktig punkt:


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
- Ca 90-tallet vokste det frem både rammeverk og et annet tankesett rundt det å
  utvikle. Først var det blitt noe ingeniører holdt på med (software
  engineering). Så endret tankesettet seg fra en ingeniør-gesjeft til håndverk.
  To bøker som også hadde stor innflytelse: The pragmatic programmer (1999) og
  Software Craftsmanship (2001) som introduserer programvareutvikling som
  håndverk i stedet for en ingeniørdisiplin. Etter disse kom Smidig-manifestet
  (2001)

---

### Agile manifesto

Note:
- handler om hvordan vi vil jobbe, og om hva som egentlig er viktig i et
  utviklingsprosjekt

---

Individuals and interactions over processess and tools

Note:
- uten folk er det ikke noe prosjekt. 
- En person i et prosjektteam er ikke en ressurs. Har unik kompetanse, bakgrunn,
  kontekst og synspunkter. Vi trenger prosesser og verktøy også, men det er
  underordnet et fungerende team.
- kan selvsagt bytte ut teammedlemmer, men det er en stor kostnad forbundet
  med det

---

Working software over comprehensive documentation

Note: 
- Dokumentasjon lyver ofte, særlig hvis det er mye av det.
- Vær kritisk: hva er viktig dokumentasjon? Hvorfor er en spesifikk løsning
  valgt. Ikke hva skjer her: det burde være beskrevet i kode.
- Hvis løsningen krever dokumentasjon for å være brukbar, symptom på annet
  problem. Ekspert-verktøy kan være unntak.
- Trenger noe teknisk dokumentasjon for utviklere: Hvordan bygge og jobbe med
  prosjektet. Hvor finner man hemmeligheter? Informasjon man ikke finner andre
  steder eller feks i kode


---

Customer collaboration over contract negotiation

Note:
- Programvare utvikles over tid i samarbeid med kunden, fordi verden endrer
  seg. Best resultat ved hyppig kommunikasjon slik at feil kan rettes opp så
  tidlig som mulig.
- Kontrakter sier noe om hvordan samarbeid skal foregå og rammer, men ikke
  hva som skal lages (i mer enn veldig overordnede former)


---

Responding to change over following a plan

Note:
- Vi vet at verden endrer seg, kan ikke gjøre planlegging over lang tid.
- Disse burde være selvsagte, men er i virkeligheten ikke alltid det
- Vi som fagfolk, håndverkere, må guide kunder i prosjekter
- Har vokst frem mange ulike smidige prosjektmetodikker (mange gjør det til en
  forretningsplan, bruk "vår" metodikk og bli bedre osv)


---

### Prosjektmetodikker

Note:
- samliger av ulike teknikker for å prosjekter til å fungere bedre
- inneholder aktiviteter og roller
- noen følger en metodikk strengt, andre plukker
- de første metodikkene var ganske strenge, med mange roller og aktiviteter,
  senere metodikker har mindre føringer

---

### Smidige prosjektmetodikker

Note:
- felles for smidige prosjektmetodikker:
- ikke planlegge altfor langt frem i tid
- teamene er selvorganiserende og i stor grad autonome
- lag de viktigste tingene først (reduserer risiko i forhold til finansiering,
  gir brukbart system fortere. I tillegg gir bruktbart system kjapt mye raskere
  feedback fra kunden om hva som virker og ikke virker, og ikke minst avslører
  det om det er misforståelser mellom teamet og kunden tidlig)
- holde på med oppgaver som er godt beskrevet. Disse skal også være prioritert i
  samarbeid med kunden
- alle i teamet må skjønne hva som foregår (alle i samme båt)
- samarbeid viktig, kunnskapsoverføring, bedre løsninger, færre feil 
- integrere endringene dine med andres så ofte som mulig, ikke seile sin egen
  sjø (ikke bare unngå mergekonflikt, men sørge for at din kode fungerer med
  resten av kodebasen. Alle andre må vite at deres kode virker med dine
  endringer like mye som at din kode må virke med andres endringer)
- jevnlig tilbakemelding fra kunder og brukere. Dette oppnås ved hyppige
  leveranser
- følger smidig-manifestet, men ble etablert før agile manifesto ble publisert
- viktig å sette av tid til å vurdere retningen på prosjektet (og teamet), lære
  underveis og gjøre endringer utfra de erfaringene teamet har gjort seg
- det finnes mange smidige prosjektmetodikker, vi skal se på


---

### XP, Scrum og Kanban

Note:
- veldig utbredte, og viser dessuten ulike tilnærminger til å oppnå god
  prosjektflyt
- XP handler i stor grad om aktiviteter som gjør prosjekter mer håndterlige
- Scrum handler om ritualer i større grad enn XP, noe mer overordnet, mer
  "tradisjonell" prosjektledelse-innfallsvinkel
- Kanban er minimalisten
- få som følger disse metodikkene til punkt og prikke
- kontekst er viktig, ta inn elementer som trengs i det prosjektet du er i der
  og da
- stort problem ved gamle prosjektmetodikker: for lang feedback-loop. Ergo: mye
  i smidige metodikker handler om å få rask tilbakemelding. 


---?image=https://d2slcw3kip6qmk.cloudfront.net/marketing/blog/2018Q2/extreme-programming/xp-planning-and-feedback-loops.png&size=45%

Note:
- bilde: feedbackloop i XP
- feedback er sentralt, på mange nivå
- først umiddelbart (i løpet av sekunder eller minutter) gjennom
  parprogrammering og testdrevet utvikling
- daglig gjennom standup og fordeling av hvem som jobber med hvem
- flere dager/ukentlig gjennom akspetansetester
- ca hver 2.-3. uke: iterasjon og planning av neste iterasjon (iterasjon)
- hver 2. til 3. måned: overordnet retning av prosjektet (release plan)


---

### XP

Note:
- handler om alle aktivitetene som skal til for å få et prosjekt til å bli
  vellykket
- aktivitetene er i stor grad daglige aktiviteter som teammedlemmer utfører for
  å høyne kvaliteten på prosjektleveranser og arbeidsmiljøet
- de viktigste aktivitetene: testdrevet utvikling, parprogrammering, 
  kodekvalitetsprinsipper, metafor (det store bildet i prosjektet og det rette
  vokabularet), CI, akseptansetester, sitte sammen (helst også et medlem fra
  forretningssiden, evt skal en i teamet ha den rollen), felles eierskap,
  planlegging, fornuftig hastighet
- Aktivitet (særlig begynnelsen av prosjektet): få ned historier som er mest
  viktige. Ikke altfor nøye, men må ha oversikt på overordnede mål der og da.
  Denne aktiviteten gjentas/følges opp hver 2. til 3. måned
- Aktivitet: bryte ned oppgaver til noenlunde fornuftig størrelse (ikke for
  store, ikke for små), gjøres ved begynnelsen på en iterasjon. Dette er en
  teknisk planlegging. Hver oppgave skal være omtrent 1-2 dagers arbeid. 
- justere fart (velocity) etterhvert som prosjektet fortsetter
  (endringshåndtering). Vi vet at estimater er vanskelig, bør helst unngås.
  Estimater i XP handler om relativ arbeidsmengde, ikke antall timer. Etterhvert
  som teamet får erfaring kan teamet si noe mer fornuftig om hastighet
- planlegge release (hver 2. til 4. måned). Husk at dette ikke betyr at software
  leveres bare hver 2. til 4. måned, software leveres ved slutten av hver
  iterasjon
- andre regler i XP:  
- ingen nye oppgaver inn i påbegynt iterasjon
- fot i bakken halvveis i iterasjonen
- Roller i XP: kunde, programmerer, tester, coach m.m. Coach er den som har
  oversikt på teamet og sørger for at alle klarer å levere så bra som mulig. 


---

### Scrum

Note:
- fokuserer mindre på aktiviteter, og har sånn sett mindre regler enn XP
- langtidshorisont ganske lik som XP (en iterasjon kalles sprint, samme
  tidsperspektiv som XP)
- Scrum setter begrensninger utfra et prosjektlederperspektiv, som feks hvilke
  elementer som går inn i en sprint
- en sprint: planlegging, utføre, demo/release, retrospektiv (erfare og lære)
- ingen regler for hvordan team-medlemmer jobber sammen eller organiserer seg
- Begrensninger for arbeidsflyt: 
- ingen nye saker inn i pågående sprint
- får ikke lov å legge inn flere oppgaver enn det som kan løses i en sprint
- følger opp oppgaver i scrumboard (oversikt over oppgaver i en sprint)
- Roller: produkteier (utenfor teamet), scrum master ("team lead"), utvikler
  (medlem av teamet)


---

### Kanban

Note:
- veldig lite regler.
- sentralt: kanban-tavle (prosjekttavle)
- eneste virkelige begrensning: antall oppgaver som kan utføres samtidig
- få som bruker kanban kun med dette, veldig ofte i kombinasjon med elementer
  fra XP og scrum


---?image=https://images.pexels.com/photos/1157859/pexels-photo-1157859.jpeg

@snap[south-west]
### Prosjekt-tavle
@snapend

Note:
- bilde: lapper på veggen/prosjekttavle
- felles for alle er at det er viktig å holde kontroll på hva teamet jobber med
  til enhver tid: prosjekttavle
- kolonnebasert
- inneholder oppgaver
- minimum: TODO, Doing, Done
- ofte også: backlog/inbox e.l. til ting som ikke ennå er prioritert
- ofte også: egen kolonne til ekstern test, review etc.
- tavle kan være fysisk, men mange digitale muligheter også: github project
  board, trello, jira osv.
- Hvordan jobbe med en prosjekttavle: 
- Plukk oppgaver fra kolonnen med prioriterte oppgaver (typisk todo). Denne
  kolonnen fylles som oftest i planleggingssesjon (feks 2. hver uke). Kolonnen
  er gjerne også prioritert slik at de viktigste oppgavene ligger øverst
- Flytt oppgaven du begynner på fra TODO til Doing, slik at andre vet at
  oppgaven er påbegynt. Gi oppgaven til deg selv slik at andre vet hvem som
  jobber med den. 
- Når oppgaven er ferdig og godkjent flyttes oppgaven til Done. Hva som regnes
  som ferdig (Definition of Done) blir teamet enige om (hvilke tester skal
  gjøres, kvalitet på kode osv)
- All informasjon som trengs for å løse en oppgave skal legges inn på oppgaven,
  slik at den som begynner på oppgaven kjapt kan sette seg inn i og utføre
  oppgaven. Dette skal fylles inn på planleggingssesjon (evt på en teknisk
  gjennomgang)
- hvis oppgaver er avhengig av hverandre, tillater mange systemer å koble sammen
  oppgaver slik at det blir tydelig at en oppgave ikke kan påbegynnes før en
  annen er ferdig
- Hold orden på prosjekttavlen. Flytt oppgaver på riktig tid, særlig hvis man
  jobber remote eller har kunder som følger med på tavlen er det viktig at den
  viser hva som faktisk skjer
- Ha en egen kolonne der kunder/brukere kan legge inn oppgaver. Disse skal
  gjennom planlegging og prioritering før de havner i Todo-kolonnen
- Finnes mange fine features i prosjekttavle-verktøy, hovedregel: Keep it
  simple, stupid (KISS). Prosjekttavlen skal være et hjelpemiddel, ikke bli
  målet med prosjektet


---?image=https://images.pexels.com/photos/1437540/pexels-photo-1437540.jpeg

@snap[north-west]
### @color[#F6C59A](Retrospektiv)
@snapend

Note: 
- Bilde: engasjerte, aktive teammedlemmer
- Retrospektiv: sentral aktivitet i Scrum, men viktig i alle smidige
  prosjektmetodikker
- Handler om å gå gjennom de erfaringene teamet gjør seg i et prosjekt og
 lære av dem, og endre oppførsel for å få teamet til å fungere bedre
- viktig prinsipp: alle har gjort det som der og da så ut som den beste
  løsningen, og alle har gjort så godt de kan
- prinsippet er viktig fordi retrospektiv ikke handler om å legge skyld for
  eventuelle problemer
- fokus skal være på forbedringer og løsninger på problemer (løsningsorientert i
  stedet for problemorientert)
- et møte der hele teamet er med, varer typisk 1 - 1 1/2 time
- et teammedlem (eller noen utenfra) fasiliteter møtet (styrer øvelsene,
  tidsbruk, sørger for god og konstruktiv tone osv)
- går gjennom en eller flere "øvelser" for å vurdere hvordan perioden har vært
- ender som oftest med forslag til forbedringer, endringer i hva man skal
  fokusere på osv
- teamet blir sammen enige om hva som skal endres på for å få bedre samarbeid
- noen vanlige ting å fokusere på i retrospektiv: 
- hva har vært bra i sist periode?
- hva ønsker teamet å slutte med?
- hva ønsker teamet å begynne med?
- hva hindrer teamet?
- praktisk gjennomføring: 
- bruker ofte post-its og mye tavleplass
- alle skriver ned det de kommer på på lapper og henger dem opp
- alle lapper gjennomgås, lignende/like lapper grupperes
- alle i teamet stemmer på hva som er mest viktig og blir sammen enige om noen
  få punkter som skal endres/gjennomføres frem til neste retrospektiv
- husk: hold god stemning, vil helst ende opp med god-feeling etter retro

---

### Programvareutvikling er kontinuerlig

Note: 
- slutter ikke før ingen bruker koden og alle maskiner som kjører koden er av

---

### Programvareutvikling er vanskelig

Note: 
- vi lever i krysningen mellom mennesker og maskiner og må gjøre konkret mening
  og presise regler ut av uklare og uferdige ideer

--- 

### Programvare skal leveres ofte


---

### En person er ikke en ressurs


---

### Begrens arbeidsmengde


---

### Prioriter ofte


---

### Bruk riktig verktøy


---

### Lær av fortiden


---

### Neste: Spesifisering

