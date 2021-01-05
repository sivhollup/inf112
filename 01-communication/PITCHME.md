---?image=https://images.pexels.com/photos/53987/tool-work-bench-hammer-pliers-53987.jpeg
@snap[north]
## @color[#1D1F20](Innføring i systemutvikling)
@snapend

Note: 
- Intro: misforståelse om byggeprosjekt: tegne hull og vise plassering av
  bunnsvill. Hva har dette med programvareutvikling å gjøre? Det finner dere
  snart ut av. 
- intro Siv: ansatt 20% for å forelese dette faget, jobber ellers som konsulent
  i kantega. Arrangerer også Nerdschool. 
- Dette faget handler om verkøyene vi bruker for å utvikle programvare
- Hvordan bruker vi disse verktøyene på en god måte?
- Når brukes de ulike verktøyene? 


---?image=https://images.pexels.com/photos/1068523/pexels-photo-1068523.jpeg

Note:
- Dette faget handler om hvordan vi jobber, og mer viktig: jobber sammen for å utvikle programvare
- Kommunikasjon er det viktigste verktøyet vi har, derfor den lille historien 


---?image=https://images.pexels.com/photos/54216/pexels-photo-54216.jpeg

Note: 
- Heter systemkonstruksjon, men burde vært kalt utviklingshåndverk
- Litt som sjakk: lære grunnreglene er enkelt, spille på en god måte: vanskelig
- Lære om håndverket gjennom forelesninger og prosjektarbeid i team
- Praktisk fag, praktisk fokus

---

### Hvordan skal vi jobbe med faget? 

Note:

- Forelesninger i første halvdel av kurset, prosjektarbeid resten
- Oppgaver for å lære verktøy og å lære seg å jobbe sammen og bruke ulike
  verktøy
- Totalt fire obliger, disse teller 50% av karakteren. Dere skal lage et
  program, og alle innleveringene omhandler dette systemet. Begynner om noen
  uker.  


---

### Praktisk informasjon

- Meld dere på grupper selv
- Gruppene er faste
- Undervisningsassistenter: Thomas Trautner og Eric Mörth

Note: 
- Dere blir tildelt team innenfor den gruppen dere er påmeldt
- Derfor den faste inndelingen. Er mulig å endre, men ta kontakt med
  undervisningsass. 


---

@snap[north]
### Lærebok
@snapend

@snap[west span-20]
![Hovedbok](https://raw.githubusercontent.com/sivhollup/inf112/master/v20/01-communication/img/pensumbok-s.png)
@snapend

@snap[east span-20]
![Tilleggsbok](https://images-na.ssl-images-amazon.com/images/I/61jkT88rRML.jpg)
@snapend

Note: 
- første del av boken er pensum
- eksempler i Java og C++
- online bok om Kanban og Scrum
- forelesningsnotater og noen artikler på nett
- kommer til å snakke om ting som står i boken, men prøver bevisst å gi andre
  perspektiver enn det som står i læreboken for at det skal være reelt nyttig å
  komme på forelesning


---

### Forelesningsnotater og kode

https://bit.ly/2Njfdfe

Note: 
- https://github.com/sivhollup/inf112/tree/master/v20


---

### Tema

- Kommunikasjon 
- Prosjektorganisering
- Krav
- Testing
- Bygg og deploy av prosjekt
- Refaktorering
- Designmønstre
- Lovverk

Note: 
- Mye av det som trengs for å drive med programvareutvikling. 
- Skraper såvidt i overflaten, kunne nok laget et fag basert på hver eneste
  forelesning. 
- Hvordan jobbe sammen
- Tekniske verktøy for å lage større programvaresystem
- Metoder som gir god kodekvalitet


---

### Vær aktiv

Note:
- Aktive i forelesninger
- Still spørsmål
- Kom med forslag til forbedringer
- Gi feedback til foreleser, gruppeledere og hverandre
- Hjelp medstudenter
- Jobbe jevnt
- Jeg er: Faglig oppdatert
- Jeg er: Lydhør
- Jeg er: Engasjert
- Jeg er: faglig oppdatert i forhold til hva som brukes i bransjen


---?image=https://images.pexels.com/photos/1120344/pexels-photo-1120344.jpeg

@snap[north-west]
### Kommunikasjon
@snapend

Note: 
- bilde av mann og dame, han står over henne
- OPPGAVE: Hva ser dere i dette bildet? Bruk noen minutter 
- Er dette en OK situasjon eller ikke?
- Hvis han er leder og hun er nyansatt? Aggresjon?
- Hva er de bare dypt konsentrerte og engasjerte?
- Er de likeverdige?
- Kommunikasjon er vanskelig og krever trening
- Basisferdigheter


---

### Men vi skal jo bare kode?

Note: 
- Vi skal lage en levende representasjon av et sett med regler i en gitt
  kontekst
- Må forstå problemområdet, kontekst og regler, altså DOMENET
- For å lage rett løsning må vi forstå hva problemet er
- Vi jobber med folk hele tiden
- For å være effektiv må vi kommunisere godt


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication-01/img/misunderstanding.jpg&position=right&size=55% 100%

@snap[span-45 west] 
#### Mye vanligere enn du tror
@snapend

Note:
- person A snakker om sirkler
- person B snakker om firkanter
- person C snakker om trekanter
- Eller gjør de det? Kanskje det høres ut som om de snakker om ulike ting, mens
  de egentlig prater om det samme? 
- Kanskje de diskuterer noe de egentlig er enige om?
- Den situasjonen jeg åpnet med er et typisk eksempel, og når vi utvikler
  programvare skjer dette mye oftere enn man skulle tro
- språket vi bruker er veldig abstrakt. 



---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication-01/img/understanding.jpg&position=right&size=55% 100%

@snap[span-45 west]
#### Hva er vellykket kommunikasjon?
@snapend

Note: 
- Meldingen betyr det samme for mottaker og avsender
- Meldingen er nyttig for mottakeren
- OPPGAVE: bruk noen minutter med en som sitter i nærheten: En finner et
  eksempel å vellykket kommunikasjon, en finner eksempel på misforståelse (hva
  hva som helst). Fortell hverandre om situasjonen. Hva var bra med den
  vellykkede kommunikasjonen? Hvordan oppdaget dere at dere hadde misforstått
  hverandre?
- Hvilke kommunikasjonskanaler har vi vanligvis i programvareutvikling?


---

### Kommunikasjonskanaler

- Epost
- Chat
- Issue tracking
- Ansikt til ansikt
- Møter
- Telefon/video
- Tekst og figur

Note: 
- både dokumentasjon og kode er tekst. Begge er kommunikasjonskanaler. 
- felles for all kommunikasjon og samarbeid: 


---

### Respekt

Note: 
- for andres tid
- for andres oppmerksomhet
- alle blir frustrerte over ting uten nytteverdi, vær kritisk til hvem som blir
  inkludert
- tilstrekkelig mengde informasjon: nok til å forstå, ikke mer enn nødvendig
- alle er travle
- for andres forståelse 
- for andres mangel på forståelse <-- ikke for å være vanskelig


---

### Kontekst

Note:
- alle sliter med å forstå andre innimellom: Sett kontekst
- Hva handler kommunikasjonen om? 
- Hva er bakgrunn?
- Hva ønsker du å oppnå med kommunikasjonen? 
- Har mottaker fått nok informasjon til å kunne ta stilling til det du ønsker å
  ta opp? 
- Kjøreregler og ting å huske på for de ulike kommunikasjonskanalene, begynner
  med de muntlige


---?image=https://images.pexels.com/photos/935949/pexels-photo-935949.jpeg

@snap[north-west]
### @color[#1D1F20](Ansikt til ansikt)
@snapend

Note: 
- Hva ser vi i bildet? Avslappet, blide, åpne for kommunikasjon
- hva ser vi etter?
- kroppsspråk (ikkeverbalt) viktig, er du avslappet? åpen? trygg? usikker?
- øyekontakt (tillit), ansiktsmimikk
- hvilke situasjoner er typiske i arbeidssammenheng? 
- kan være sosialt eller faglig på jobb
- kunnskapsoverføring
- samarbeid
- Hva må vi være særlig oppmerksomme på? 
- Kritikk
- Uenighet og diskusjon
- Ubalanse i maktforhold mellom deltagere
- Kan bruke teknikker for å åpne for konstruktiv diskusjon og tilbakemelding
- Øvelse! Dette blir bedre med erfaring 


---

### Hvem har rett? 

- "Den skal være stor"
- "Den skal være liten"

Note: 
- Kontekst: romfart
- Person A sier den skal være STOR
- Person B sier den skal være LITEN
- OPPGAVE: Hva kan være grunnen til en slik konflikt? (tenk fysiske objekter)
- "Det viktigste er at det er mye plass" <-- noe har stort volum
- "Det viktigste er at vekten er lav" <-- volum er uviktig, men vekten kritisk


--- 

### Antagelser er farlige

Note: 
- pass på å fortelle om antagelser når dere diskuterer 
- sett kontekst
- åpen for diskusjon: åpen for å greie ut misforståelser basert på upresis
  ordbruk
- tips: bruk fraser som: "Jeg forstår det på følgende måte, korriger meg gjerne
  om jeg tar feil" 
- "Har jeg forstått det riktig at .. " 
- "Jeg oppfatter at .... , stemmer dette?" 



---?image=https://images.pexels.com/photos/1157859/pexels-photo-1157859.jpeg

@snap[south-west]
### @color[#F6C59A](Møter)
@snapend

Note: 
- For prosjektrelatert arbeid som må diskuteres i fellesskap
- Ansikt til ansikt (kanskje også over video)
- Spesifikt tema
- Diskusjon, planlegging, status
- Korte eller lange (feks status i teamet vs dybdediskusjon om et problem)
- Bør ikke være for lange, legg i så fall inn pauser (1,5 - 2 timer er maks uten
  pause)
- Vær kritisk med hvem som trenger å være med
- Legg møter til ettermiddag eller i forbindelse med lunsj (minst mulig
  avbrytelser)
- Er alle tilstede i rommet? Hvis remote, kamera eller bare lyd?
- Interaktivt (hvis ikke, er møte rett format?)
- Hold konstruktiv tone (den som kaller bør ta ansvar for det, men gjør det hvis
  ingen andre gjør dette)
- forklar kontekst så kort som mulig
- Agenda: ALLTID
- Må noen forberede? Gi dem tid til det. Respekter andres tid. 
- Etter møtet: Referat hvis nødvendig. Veldig kort bakgrunn/sett kontekst. Hva ble bestemt?
  Hvem skal gjøre evt oppgaver? Hva er tidsfrist? Når skal neste aktivitet
  skje?


---

### Kroppsspråk

Note: 
- ikke invader andres personlige område
- bakoverlent med kryssede armer/ben: negativ
- fremoverlent antyder interessert
- skuldre: høye, lave?
- nervøs?
- avslappet?


---?image=https://images.pexels.com/photos/845451/pexels-photo-845451.jpeg

@snap[north-west]
### @color[#1D1F20](Telefon og video)
@snapend

Note: 
- En til en eller mange
- I tilrettelagt møterom, fokusrom eller ved pulten
- Bruk headset med mikrofon, ikke pc-høyttaler/mikrofon
- Artikuler tydelig, forsikre deg om at folk hører deg godt nok
- Hvis mange: mute når du ikke snakker
- Sørg for god lyd (ekstern høyttaler)
- Snakk om hvordan slike møter fungerer, prøv å begrense forstyrrelser og
  problemer
- Eksempel: remote prosjekt NDLA, utviklere over hele landet
- Eksempel: jobber mot team i Trondheim, mye møter remote


---

### Epost

Note: 
- Mottakere: kun de som trenger å være med. 
- Aktiv tilbakemelding? Til-felt. 
- Trenger å se, men ikke å gi tilbakemelding? CC-felt. 
- husk at bcc også finnes. Sender du til MANGE? Bruk bcc eller liste slik at
  ingen får oversikt over alle adressene og trykker reply-to-all ved en
  feiltakelse. 
- Tema: ett tema pr eposttråd.
- Nytt tema, selv om det er til de samme? Ny eposttråd
- Innhold: kort og konsist
- Tråder: relevant svar: svar på eposten
- Tittellinje inneholder en oppsummering og stikkord for innhold, slik at folk kan huske hva dette
  dreier seg om bare ved å se i oversiktslisten. Eks: "Din flyvning med SAS
  <dato>"
- når svaret ikke haster, men er viktig
- mer formelt enn feks chat
- kan forvente at eposter blir lest og besvart


---

### Online chat

Note: 
- Flyktig, som oftest uformell
- Dele informasjon og ressurser (URLer/dokumenter). NB: Er det viktig, samle
  informasjon i wiki eller et mer permanent sted
- Team-informasjon
- diskusjoner der folk kan svare når det passer, men ikke like formelt som epost
- stille diskusjoner (diskutere uten å skape støy i landskapet)
- beskjeder der og da (viktig informasjon må også gis på epost)
- plugins feks for byggestatus av prosjekt, integrasjon mot github osv
- Bruk tråding i mer formelle settinger (eks KK)


---

### Issue tracking

Note: 
- Viktig prosjektorganiseringsverktøy
- Eksempler: Github Project board, Trello, Jira osv. 
- Kan også være fysisk: tavle med lapper
- Formelt, brukes av både team og kunder/brukere
- Inneholder: hvilke arbeidsoppgaver finnes?
- Inneholder: Hva er status på arbeidsoppgaver?
- Inneholder: Hvem jobber med hva? 
- Inneholder: Kommentarer på pågående oppgaver
- Inneholder: Historie på kommunikasjon og valg som blir tatt på oppgaver
- Vis opensource project board på github


---

### Tekst

Note: 
- kontrakter, juridisk bindende
- informasjon om prosjekt (kontekst til hvordan bygge)
- informasjon som ikke endres ofte (enn feks chat eller ansikt-til-ansikt)


---?image=https://images.pexels.com/photos/1043514/pexels-photo-1043514.jpeg

@snap[north-east]
### @color[#1D1F20](Figurer)
@snapend

Note: 
- bilde av figur med personer og piler
- informasjon om domenet
- informasjon om kode
- ting å huske på
- visualisere flyt (data, arbeid, prosess)
- noen figurer er flyktige (nyttig der og da), noen er nyttig over tid
  (oversikt/tilstand)
- bruker ofte figurer for å hjelpe folk å forstå konsepter (noen mennesker
  tenker visuelt)
- ofte nyttig å tenke på konsepter på ulike måter
- Andre typer figurer:


---?image=https://images.pexels.com/photos/1537008/pexels-photo-1537008.jpeg

Note: 
- arkitektur, detaljer/oversikt


---?image=https://images.pexels.com/photos/1181346/pexels-photo-1181346.jpeg

Note: 
- oversikt over kode (nyttig bruk av UML)
- oversikt over oppgaver
- brukergrensesnitt


---?image=https://images.pexels.com/photos/1181263/pexels-photo-1181263.jpeg

@snap[north-east]
### @color[#F6C59A](Kode)
@snapend

Note: 
- forretningsregler for domenet
- beskriver realiteten
- leses av mange, lever lenge
- beskriver løsningen på problemet du prøver å løse
- mye av kurset handler om hvordan kommunisere best mulig i kode
- nå skal vi sankke mer i detalj om hvordan vi diskuterer sammen, både ansikt
  til ansikt men også via chat og andre kanaler
- Dette gjelder særlig fagdiskusjoner og når man koder sammen
 

---

### Hvordan diskutere sammen 

#### Et godt eksempel

https://bit.ly/2RFTbqh

Note:
- settingen her er at to stykker skal kode sammen, parprogrammering
- åpen for endring i oppsett
- forklarer hva han gjør
- undersøker hvordan man kan jobbe best sammen (hva slags kontekst har den du
  sitter sammen med?)
- høflig: får tastatur (ber om tastatur)
- forklarer hvordan ny laptop fungerer
- lar den andre få tenke i fred
- bytter på å jobbe
- virker kanskje vanskelig i begynnelsen, men blir effektivt over tid
- kanskje ikke like bra: holder armen på stolen til naboen (men litt suboptimalt
  oppsett med bare laptop)
- det neste eksempelet er naturlig nok et med problematisk oppførsel. NB: Dette er
  satt på spissen og samler mange uvaner i ett. 


---

### Hvordan diskutere sammen 

#### Et dårlig eksempel

https://bit.ly/2smxwW0

Note:
- uhøflig språk
- uoppmerksom
- lat
- forsvinner i telefon
- baksetesjåfør
- useriøst
- arrogant
- ikke opptatt av samarbeid
- kritiserer hverandre
- svarer ikke på spørsmål
- ingen forståelse for annen kontekst
- usaklig kritikk av kode
- usaklig forsvar av kode
- gjentagelse
- ikke noe problem en gang: men hva om dette er hverdag?


---

### Kommunikasjon rundt kode

Note: 
- Vi bruker mye tid på å kommunisere rundt kode
- kode er ekstremt personlig, tanke oversatt direkte til tekst
- mange tar kritikk av kode som personlig kritikk
- hvis du reagerer på noe: hvorfor? 
- hvis du reagerer på noe: hva kan være et alternativ?
- være løsningsorientert, ikke problemorientert
- partner er ikke tankelesere, forklar retningen du beveger deg i
- vær høflig, profesjonell, konstruktiv
- når den andre skriver kode: følg med
- spør om å få overta hvis du har en ide
- spør om partner vil kode hvis du har kodet lenge
- la mobil og annen laptop ligge med mindre du leter etter løsning på problem
  dere nå jobber med
- hvis du må forlate arbeidet, gi beskjed hvor lenge du forventer å bli vekke
- si ifra om du trenger en lengre pause
- forsiktig med mat, er det OK for partner?
- personlig hygiene teller, veldig tett på partner
- pass kroppsspråk
- OK å være usikker
- OK å prøve ut
- OK å være uenige, kan vente med å løse noen problemer til senere
- universelle regler, enter man koder eller prater sammen, tegner sammen osv.


---

### Hvordan jobbe sammen i par

Note: 
- http://sedano.org/toddsedano/2017/10/24/considerate-pair-programming.html
  (både del 1, 2 og 3)
- Ha to tastatur, helst to skjermer også, likeverdig plassering av partnere
- Kan være bedre å stå
- Gi komplimenter hvis du gleder deg, si hvorfor
- Introduksjon hvis du ikke har sittet sammen med noen før
- Hva er forventninger til utfall av parprogrammering? (løse problemer i
  fellesskap, levere funksjonalitet osv)
- Hvordan har den andre det i dag? Kan vi tilpasse situasjon slik at det blir
  mest mulig effektivt?
- Eks: "Er bekymret for om featuren vi lager løser problemet vi egentlig har"
- Eks: "Gleder meg til å få hjelp med dette, for jeg har stått fast i 2 dager"
- Eks: "Du har mer erfaring enn meg, så jeg er nervøs"
- Sjekk tilstand halvveis i sesjonen, be om tilbakemelding. Vær konstruktiv!
- Ta pauser når det ikke går an å konsentrere seg
- Den som trenger mest tid setter tempo på arbeidet, begge skal være med
- Si takk på slutten av dagen!
- Hvis noe går gale: 
- Gjenta/forklar med egne ord hva problemstillingen er (kan hjelpe på
  forståelse)
- ulike ideer til hvordan løse problemet? Prøv å argumentere FOR partneren sin
- gå gjennom hvordan dere har havnet i situasjonen
- prøv å tenke ut andre løsninger
- få noen andre fra teamet til å hjelpe
- prøv begge løsninger
- Forklar hva du føler: "Når du gjør .. så oppfatter i hodet mitt ... da føler jeg.."
- Snakk om noe annet: spør hva partneren er opptatt av? (trenger ikke være
  faglig)
- Deeskaler situasjonen (pause/samtale om andre ting osv)


---

### Lønner deg seg å jobbe sammen?

Note: 
- Pros: bedre kunnskapsdeling: to stk har dyp forståelse av problemet
- To hoder tenker bedre enn ett, særlig på komplekse problemer. Bare det å
  forklare løsningen din for andre gjør at du forstår den bedre selv. 
- løser problemet fortere totalt sett, selv om det virker som om det går tregere
  i begynnelsen
- utforsker flere måter å løse problemer på
- færre feil
- Cons: veldig ulike personligheter kan ha problemer med å jobbe sammen
- noen foretrekker å jobbe alene, er evt bare ikke vant til å jobbe sammen med
  andre
- slitsomt der og da (veldig intenst)
- ulike arbeidsmetoder (feks cowboy mot planleggeren)
- kan være lett å bli distrahert



---

### Hva oppnår vi med god kommunikasjon?

Note: 
- effektivt samarbeid
- trygge medlemmer som sier ifra om ting som ikke er bra
- bedre løsninger
- bedre kunnskapsdeling --> lavere risiko i prosjekter
- samme forståelse for situasjon, utfordringer og løsninger



---

### Kommunikasjon er essensielt

Note: 
- ikke snakket noe særlig om hvilket språk vi bruker, og hvilke ord (kommer
  senere)
- kommunikasjon er ikke-verbalt og verbalt, skriftlig, figurer, kode, chat
- kommunikasjon legger grunnlaget for å få til et bra resultat både daglig og
  totalt
- Til slutt skal vi gjøre en øvelse for å demonstrere en stor svakhet som har
  med kommunikasjon å gjøre
- Øvelse: Tellespillet


---

@snap[west span-10]
![Tardis](https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication-01/img/tardis.png)
@snapend

@snap[midpoint span-10]
![C3PO](https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication-01/img/c3po.png)
@snapend

@snap[east span-10]
![Cylon](https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication-01/img/cylon.png)
@snapend

Note: 
- Skal vise disse tre ikonene, de bytter med jevne mellomrom. Dere skal huske
  hvor mange det er av hver uten å skrive ned. 
- Kjører to runder av dette spillet. 
- Runde 2: 
- Hva er 5 + 8? Rop ut svaret
- "Anne og Ole kjører tog. De starter i hhv Bergen og Oslo samtidig. Anne sitt
  tog går i 75 km/t, og Ole sitt i 50 km/t. Det er 500 km mellom Bergen og Oslo.
  Hvor langt har Anne kommet når de møtes (antall km fra Bergen)?"
- Rop ut tallet på måneden du er født i
- Hva er siste sifferet i telefonnummeret ditt?
- Hvis vi hadde gjort denne øvelsen i par, går det an å bli mindre avbrutt?


--- 

### Neste forelesning: Testing


---

https://gitpitch.com/sivhollup/inf112/master?p=v20/01-communication

---

### Slack

https://bit.ly/39FEw4t


Note: 
- satt opp et slack-workspace til faget. Diskuter fag, lag
  prosjektkanal/gruppekanal. Spør meg der eller send epost. 
- bruk uib.no-adressen din og lag en konto. Husk å oppgi fullt navn slik at det
  er lett for oss som er admin å hjelpe og holde folk fra hverandre
- gode grunner til å ikke bruke uib.no-adressen? Gi beskjed til undassene. 
