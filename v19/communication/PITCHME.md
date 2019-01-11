---

## Systemkonstruksjon 
### INF112 vår 2019
#### Siv Midtun Hollup

Note: 
- intro/historie

---?image=https://images.pexels.com/photos/53987/tool-work-bench-hammer-pliers-53987.jpeg

Note: 
- Dette faget handler om verkøyene vi bruker for å utvikle programvare
- Hvordan bruker vi disse verktøyene på en god måte?
- Når brukes de ulike verktøyene? 

---?image=https://images.pexels.com/photos/1068523/pexels-photo-1068523.jpeg

Note:
- Dette faget handler om hvordan vi jobber sammen for å utvikle programvare

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
- Oppgaver for å lære verktøy og lage team
- Prosjekt teller 50% av karakter

---

### Praktisk informasjon

- Meld dere på grupper selv
- Gruppene er faste
- dan.zhang@uib.no <-- undervisningsassistent

Note: 
- Dere velger prosjektpartnere utfra de dere er på gruppe med

---

@snap[north]
### Lærebok
@snapend

@snap[midpoint]
![Lærebok](https://images-na.ssl-images-amazon.com/images/I/51yHf-4GaSL._SX393_BO1,204,203,200_.jpg)
@snapend

Note: 
- første del av boken er pensum
- eksempler i Java og C++
- online bok om Kanban og Scrum
- forelesningsnotater og noen artikler på nett

---

### Forelesningsnotater og kode

https://bit.ly/2SNCd6P

Note: 
- https://github.com/sivhollup/inf112/tree/master/v19

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
- Hele prosessen vi går gjennom for å utvikle et system

---

### Vær aktiv

Note:
- Aktive i forelesninger
- Still spørsmål
- Kom med forslag til forbedringer
- Gi feedback til foreleser, gruppeledere og hverandre
- Hjelp medstudenter
- Jobbe jevnt
- Dere får mest ut av faget ved å være aktive
- Jeg er: Faglig oppdatert
- Jeg er: Lydhør
- Jeg er: Engasjert

---?image=https://images.pexels.com/photos/1120344/pexels-photo-1120344.jpeg

@snap[north-west]
### Kommunikasjon
@snapend

Note: 

- Hva ser dere i dette bildet? 
- Er dette en OK situasjon eller ikke?
- Hvis han er leder og hun er nyansatt? Aggresjon?
- Hva er de bare dypt konsentrerte og engasjerte?
- Er de likeverdige?
- Kommunikasjon er vanskelig og krever trening

---

### Men vi skal jo bare kode?

Note: 
- Vi skal lage en levende representasjon av et sett med regler i en gitt
  kontekst
- Må forstå problemområdet, kontekst og regler, altså DOMENET
- For å lage rett løsning må vi forstå hva problemet er
- Vi jobber med folk hele tiden
- For å være effektiv må vi kommunisere godt


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/misunderstanding.jpg&position=right&size=55% 100%

@snap[span-45 west] 
#### Mye vanligere enn du tror
@snapend

---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/understanding.jpg&position=right&size=55% 100%

@snap[span-45 west]
#### Hva er vellykket kommunikasjon?
@snapend

Note: 
- Meldingen betyr det samme for mottaker og avsender
- Meldingen er nyttig for mottakeren

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


---

### Respekt for andres tid

Note: 
- felles for alle typer kommunikasjon: ikke mer enn nødvendig
- alle er travle
- alle sliter med å forstå andre innimellom: Sett kontekst
- alle blir frustrerte over ting uten nytteverdi, vær kritisk til hvem som blir
  inkludert


---

### Epost

Note: 
- Mottakere
- Tema
- Innhold
- Tråder
- send kun til de som faktisk trenger å bli informert.
- forventer du svar? Til-felt. 
- trenger å se, men ikke gjøre noe? Cc-felt
- husk at bcc også finnes. Sender du til MANGE? Bruk bcc eller liste slik at
  ingen får oversikt over alle adressene og trykker reply-to-all ved en
  feiltakelse. 
- epost bør være oppsummert i tittellinjen/tema slik at folk kan huske hva dette
  dreier seg om bare ved å se i oversiktslisten. Eks: "Din flyvning med SAS
  <dato>"
- et tema per eposttråd. Ikke benytt anledningen i en tråd til å snakke om noe
  annet, skriv ny epost i stedet for. 
- når svaret ikke haster, men er viktig
- mer formelt enn feks chat
- kan forvente at eposter blir lest og besvart


---

### Online chat

Note: 
- Flyktig
- Dele informasjon
- Team-informasjon
- deling av ressurser
- diskusjoner der folk kan svare når det passer, men ikke like formelt som epost
- stille diskusjoner (diskutere uten å skape støy i landskapet)
- beskjeder der og da (viktig informasjon må også gis på epost)
- plugins feks for byggestatus av prosjekt, integrasjon mot github osv


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


---?image=https://images.pexels.com/photos/935949/pexels-photo-935949.jpeg

@snap[north-west]
### @color[#1D1F20](Ansikt til ansikt)
@snapend

Note: 
- Hva ser vi i bildet? Avslappet, blide, åpne for kommunikasjon
- kroppsspråk (ikkeverbalt) viktig, er du avslappet? åpen? trygg? usikker?
- øyekontakt (tillit), ansiktsmimikk
- kan være sosialt eller faglig
- kunnskapsoverføring
- samarbeid
- Hvordan kritisere? 
- Hvordan diskutere? 
- Hvordan snakke for å åpne for konstruktiv diskusjon
- Øvelse!


---

### Hvem har rett? 

- "Den skal være stor"
- "Den skal være liten"

Note: 
- Person A sier den skal være STOR
- Person B sier den skal være LITEN
- Hva kan være grunnen til en slik konflikt? (tenk fysiske objekter)
- "Det viktigste er at det er mye plass"
- "Det viktigste er at vekten er lav"


--- 

### Antagelser er farlige

Note: 

- pass på å fortelle om antagelser når dere diskuterer 
- sett kontekst
- åpen for diskusjon: åpen for å greie ut misforståelser basert på upresis
  ordbruk



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
- Bør ikke være for lange, evt med pauser
- Vær kritisk med hvem som trenger å være med
- Legg møter til ettermiddag eller i forbindelse med lunsj (minst mulig
  avbrytelser)
- Er alle tilstede i rommet? Hvis remote, kamera eller bare lyd?
- Interaktivt, effektivt
- Hold konstruktiv tone, forklar kontekst så kort som mulig
- Agenda: ALLTID
- Må noen forberede? Gi dem tid til det. Respekter andres tid. 
- Kroppsspråk: ikke invader andres personlige område
- Kroppsspråk: bakoverlent med kryssede armer/ben: negativ
- Kroppsspråk: fremoverlent antyer interessert

---?image=https://images.pexels.com/photos/845451/pexels-photo-845451.jpeg

@snap[north-west]
### @color[#1D1F20](Telefon og video)
@snapend

Note: 

- En til en eller mange
- I tilrettelagt møterom, fokusrom eller ved pulten
- Bruk headset med mikrofon, ikke pc-høyttaler/mikrofon
- Hvis mange: mute når du ikke snakker
- Sørg for god lyd (ekstern høyttaler)
- Snakk om hvordan slike møter fungerer, prøv å begrense forstyrrelser og
  problemer
- Eksempel: remote prosjekt NDLA, utviklere over hele landet


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
 

---

### Hvordan diskutere sammen 

#### Et godt eksempel

https://bit.ly/2RFTbqh

Note:
- åpen for endring i oppsett
- forklarer hva han gjør
- undersøker hvordan man kan jobbe best sammen (hva slags kontekst har den du
  sitter sammen med?)
- høflig: får tastatur
- forklarer hvordan ny laptop fungerer
- lar den andre få tenke i fred
- bytter på å jobbe
- virker kanskje vanskelig i begynnelsen, men blir effektivt over tid
- kanskje ikke like bra: holder armen på stolen til naboen (men litt suboptimalt
  oppsett med bare laptop)


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
- sniping
- kritiserer hverandre
- svarer ikke på spørsmål
- ingen forståelse for annen kontekst
- usaklig kritikk av kode
- usaklig forsvar av kode
- gjentagelse
- ikke noe problem en gang: men hva om dette er hverdag?


---

### Do's and don'ts

Note: 
- kode er ekstremt personlig, tanke oversatt direkte til tekst
- mange tar kritikk av kode som personlig kritikk
- hvis du reagerer på noe: hvorfor? 
- hvis du reagerer på noe: hva kan være et alternativ?
- være løsningsorientert, ikke problemorientert
- sørg for at begge to forstår hva som foregår
- partner er ikke tankelesere, forklar retningen du beveger deg i
- vær høflig og profesjonell
- vær konstruktiv
- når den andre skriver kode: følg med
- spør om å få overta hvis du har en ide
- spør om partner vil kode hvis du har kodet lenge
- la mobil og annen laptop ligge med mindre du leter etter løsning på problem
  dere nå jobber med
- hvis du feks må på do, gi beskjed hvor lenge du forventer å bli vekke
- ikke gå uten forklaring
- forsiktig med mat, er det OK for partner?
- personlig hygiene teller, veldig tett på partner
- pass kroppsspråk
- høflighet
- OK å være usikker
- OK å prøve ut
- OK å være uenige, kan vente med å løse noen problemer til senere
- universelle regler, enter man koder eller prater sammen, tegner sammen osv.
- si ifra om du trenger en pause


---

### Lønner deg seg å jobbe sammen?

Note: 
- Pros: bedre kunnskapsdeling: to stk har dyp forståelse av problemet
- løser problemet fortere totalt sett, selv om det virker som om det går tregere
  i begynnelsen
- utforsker flere måter å løse problemer på
- færre feil
- Cons: veldig ulike personligheter kan ha problemer med å jobbe sammen
- noen foretrekker å jobbe alene
- slitsomt der og da (veldig intenst)
- ulike arbeidsmetoder (feks cowboy mot planleggeren)
- kan være lett å bli distrahert
- Øvelse: Tellespillet


---

@snap[west span-10]
![Tardis](https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/tardis.png)
@snapend

@snap[midpoint span-10]
![C3PO](https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/c3po.png)
@snapend

@snap[east span-10]
![Cylon](https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/cylon.png)
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

### Hva oppnår vi?

Note: 
- effektivt samarbeid
- trygge medlemmer som sier ifra om ting som ikke er bra
- bedre løsninger
- bedre kunnskapsdeling --> lavere risiko i prosjekter

---

### Hvordan jobbe sammen i par

Note: 
- http://sedano.org/toddsedano/2017/10/24/considerate-pair-programming.html
  (både del 1, 2 og 3)
- To hoder tenker bedre enn ett, særlig på komplekse problemer. Bare det å
  forklare løsningen din for andre gjør at du forstår den bedre selv. 
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

### Kommunikasjon er essensielt

Note: 
- ikke snakket noe særlig om hvilket språk vi bruker, og hvilke ord (kommer
  senere)
- kommunikasjon er ikke-verbalt og verbalt, skriftlig, figurer, kode, chat
- kommunikasjon legger grunnlaget for å få til et bra resultat både daglig og
  totalt


--- 

### Neste: Versjonskontroll 

Note: 
- neste forelesning: versjonskontroll og git


---

### Slack

https://bit.ly/2SO63b0

Note: 
- satt opp et slack-workspace til faget. Diskuter fag, lag
  prosjektkanal/gruppekanal. Spør meg der eller send epost. 
