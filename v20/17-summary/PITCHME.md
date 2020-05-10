### Oppsummering V2019

Note:
- Da jeg begynte som utvikler ble jeg veldig overrasket over forskjellen på det
  som ble undervist på universitetet og hvordan virkeligheten var i et prosjekt
- verktøy som knapt ble introdusert og aldri vektlagt viste seg å være kritiske
  i arbeidet
- samme gjaldt teknikker, og mange hadde jeg aldri hørt om. Hensikten med dette
  faget (som jeg av ulike grunner ikke tok) er å gjøre overgangen mellom det
  mesteparten av utdannelsen handler om og "den virkelige verden" mindre
- reise gjennom det å være med å utvikle produksjonskode (kode som skal leve
  over tid, og ikke minst å bygge dette som et team i stedet for å jobbe alene)
- skrapt overflaten på teamarbeid og det å jobbe på et større prosjekt
- sett på organisasjon av team og prosjekt, tekniske verktøy, kodekvalitet, bygg
  og deploy, jus mm
- Hver av forelesningene kunne vært en introduksjon til et eget fag
- Hva er det som er viktig? Veldig generelt er det ett stikkord dere alltid skal
  tenke på: 


---

### Hensikt

Note: 
- begynne på toppen
- hva er hensikten med å være utvikler? 
- Løse problemer
- Fokus på hva vi ønsker å oppnå
- Hvilke utfordringer står vi overfor når vi skal løse problemer?
- Går mer i detalj, dere har lært om masse verktøy
- Hva er hensikten med verktøyet eller metoden du skal bruke? Hva du ønsker å
  oppnå påvirker hvilket verktøy du velger


--- 

### Språk

Note: 
- språk er det aller viktigste verktøyet vi har
- vi jobber ikke i vakuum, det er noen som har et behov som vi skal hjelpe til å
  løse
- språk former hvordan vi tenker på det vi jobber med. 
- Bruk tid på å etablere felles ordforråd slik at alle vet hva
  de ulike uttrykkene betyr. Bruk mye tid på å snakke sammen
- hensikt: unngå misforståelser, felles forståelse av behov, aktører,
  operasjoner som skal utføres, resultat
- utvikling er mye mer enn å bare kode, hvis du ikke løser riktig problem
  spiller det ingen rolle hvor elegant løsningen din er
- Først: hva *er* problemet som skal løses? 


---

### Krav, ønsker og behov

Note: 
- hva er hensikten med krav? Konkretisere behovene til kunden
- viktig å finne ut: hva er reelle behov? Hva er mest viktig? 
- fremsatte krav: er de reelle behov? Er det ønsker? 
- kunden klarer ikke alltid å hverken formulere de behovene de har, eller i det
  hele tatt å vite hvilke behov de har
- behovene endrer seg over tid: som utviklere må vi hjelpe kunden med dette
- Endrer kravene seg? Finne ut av det, følge opp. Tenke på oversikt og ikke bare
  detalj. 
- Jobbe med krav som fremsettes for å finne ut hva de egentlig dreier seg om


--- 

### Funksjonelle og ikke-funksjonelle krav

Note: 
- funksjonelle krav: hva systemet skal gjøre (ikke implementasjonsdetaljer, men
  overordnet: hvilke behov skal oppfylles)
- ikkefunksjonelle krav: begrensninger/krav som ikke direkte omhandler hvilke
  oppgaver systemet skal utføre (responstid, platformer, sikkerhet,
  integrasjoner osv)
- krav handler ofte om HVA
- et krav inneholder gjerne mye funksjonalitet, derfor trenger vi å bryte dem
  ned til mindre oppgaver: 


---

### Presisering av krav: brukerhistorier

Som @color[green](rolle) trenger jeg @color[green](funksjonalitet) for å
@color[green](oppnå nytteverdi)

Note: 
- engelsk: usecases 
- hensikt: en spesifikk beskrivelse av et krav og hvorfor det er viktig. Skal
  være så detaljert at det går an å lage konkrete arbeidsoppgaver utfra dette
  som kan løses innen rimelig tid. Alle skal kunne forstå kravet og hva som skal
  til for å løse det. 
- er en mye brukt måte å konkretisere krav på
- skal inneholde HVEM som har behov, HVA som er behov/HVILKET problem løses,
  HVORFOR rollen ha behovet
- rolle: person(er) som skal bruke systemet, evt et system (eks integrasjon)
- uansett om krav er fremsatt som usecases eller på andre måter, er det fortsatt
  en del problemer med krav som vi må være obs på
- løsninger forkledd som behov (se liste over fag)
- å skyte fra hoften (svarer der og da uten å tenke på kontekst og det store
  bildet)
- manglende krav (ser ikke alt)
- uklare krav (tvetydig)
- Problem: småbarnsforelderen (sånn er det bare, påstand uten forklaring).
  Tiltak: femåringen (hvorfor?!)
- Problem isfjell: (for stort). Eks: Kunne spillet spillet etter regelboken.
  Tiltak: motorsag (del opp)
- problem: kråkesølv (ingen reell verdi). Eks: Kunne sette emoji på robot
  etterhvert som fasen går, og fra runde til runde. Tiltak: ikke prioriter dem. 


---

### Brukerhistorier, akseptansekriterier og arbeidsoppgaver

Som @color[green](spiller) trenger jeg @color[green](å velge programkort i
bestemt rekkefølge fra de jeg har fått utdelt) slik at @color[green](roboten kan
beveges mot målet i løpet av en runde)

Note:
- Dere kommer til å få spørsmål om brukerhistorier, akseptansekriterier og
  arbeidsoppgaver på eksamen. ØV! Lag brukerhistorier for systemer du bruker,
  for prosjektet
- Bruk fem mins på å lage akseptansekriterier og arbeidsoppgaver for denne
  brukerhistorien
- akseptansekriterier: 
- 1) Gitt 9 kort er mulig, få utdelt 9 kort fra de mulige kortene
- 2) Ett kort kan bare brukes en gang, gitt 9 unike kort i stokken skal vært
  kort kun opptre en gang
- 3) Fem kort kan velges, da legges de 4 andre tilbake i stokken
- 4) Fem kort er bekreftet, disse kan ikke endres i etterkant
- 5) Gitt en kortstokk med mer enn 9 unike kort. Spiller kan ikke velge andre
  kort enn de som er delt ut (5 av 9). Valgte kort skal være et ekte subsett av
  de som ble utdelt
- 6) Velge kun et kort for en fase
- 7) Rekkefølgen av kort for en runde kan bestemmes. Bruker oppgir kort 1, 2, 3,
  4, 5 (av utdelte) for runden, dette angir rekkefølge på utførte trekk i runden
  som spilles. Ingen andre kort utføres for gjeldende robot. 
- Arbeidsoppgaver: 
- modellere et spillkort (hvilke egenskaper trenger det? hvordan skal det vises?)
- kunne velge et kort (input fra bruker, forretningslogikk for å støtte opp
  under det)
- kunne bekrefte et sett med kort
- dele ut kort, vise kortene til bruker, forretningslogikk for å støtte opp
  under utdelingsregler
- kunne utføre og vise trekkene i en fase
- tendenser til isfjell her: kanskje bedre å ha en brukerhistorie for å kunne
  velge et kort for en fase og utføre det, og en for å utføre en runde?
- de viktigste brukerhistoriene skal gjøres først. Vi lager ikke alle
  brukerhistoriene før vi går i produksjon, vi skal i produksjon så tidlig som
  mulig. 


---

### MVP: Minimum viable product

Note:
- det minste som må være på plass for at vi skal kunne gå i produksjon
- hvorfor vil vi i produksjon tidlig (hensikt)? 
- Få tilbakemelding fra reelle brukere
- Justere retning så fort som mulig (feile fort og så korrigere)
- Hva skal med i MVP? 
- Virksomhetskritiske features: det som vil skille dette produktet fra
  konkurrenten. Er det viktig for kundene? Finn ut fort!
- Risiko-features: er det vanskelig? Få det ut tidlig slik at de vanskeligste
  problemen er løst
- Viktige krav kan gjerne løses manuelt eller på andre måter enn å lage kode for
  det. MVP: det ABSOLUTTE minimum, ikke ferdig system. 
- kunne MVP i prosjektet kunne vært gjort annerledes? Er det nødvendig å ha
  belter for å kunne gå i prod?
- mange ulike faktorer påvirker systemet og kan utgjøre krav



---

### Jus

Note: 
- hensikt med jussen? klargjøre hvilke lover og regler som finnes.
  Sikre rettigheter og plikter både hos privatpersoner og for firmaer og
  organisasjoner (personvernforordningen). Regulere samarbeid og handel
- jus kan stille krav, feks GDPR (personvernforordningen)
- krav til sletting, krav til å kunne korrigere, krav til å vite at man har sagt
  ja, til å kunne trekke tilbake samtykket
- enkelt språk, gode rutiner
- vil stille krav til implementasjon, feks mhp sikkerhet
- lisenser: regulerer bruk og salg av (og muligheter til å tjene penger på) programvare
- lisenser på kode dere bruker kan ha innflytelse på hva dere kan gjøre med
  produktet deres (feks åpne lisenser som krever at produkter der de brukes får
  samme lisens: konkret at feks kode er open source)
- Sørge for at de som har funnet på noe unikt får rettigheten til det
  (immaterierett: åndsverksloven, patentloven, kopibeskyttelse)
- rettighet til å selge, videreformidle, bruke, videreutvikle osv., rettigheter
  til å tjene penger på
- hva må dere kunne: ha oversikt over de viktigste lovene dere kommer borti, de viktigste
  uttrykkene, og ikke minst konsekvenser av lovverket


---

### Sikkerhet

Note: 
- tett relatert til jus, fordi svikt i sikkerhet gjerne utløser lover og har
  reelle konsekvenser for folk
- hensikt med sikkerhet: sikre systemer -- beskytte verdier mot skade
- Også ofte nevnt: informasjonssikkerhet: konfidensialitet, integritet og
  tilgjengelighet
- Tenk: hvordan kan systemet du lager misbrukes? 
- Hva er misbruk? Spionasje, sabotasje, tyveri (målrettede angrep), bevisst
  misbruk av intern person, feilbruk, annen bruk enn teamet har tenkt
- Hvor er sårbarhetsflatene? Alt som er tilgjengelig mot Internet (husk Internet
  var laget for en håndfull enheter, ikke millioner av enheter), grenser mellom
  ulike systemer, innlogging
- Gjør risikovurdering: tenk som en angriper
- Hva er trusselen? Hva er mulige tiltak? Hva koster det å implementere et
  tiltak vs sannsynlighet for at uønsket hendelse skjer? 
- Gjør risikovurdering. Hva er risikovurdering? oversikt over hvilke risikoer
  som finnes, hva konsekvens av at disse risikoene utløses, og hva slags
  konsekvenser det kan få, og hvilke tiltak som kan redusere risiko
- Hva er det svakeste leddet? Som oftest brukeren
- Ta hensyn til biologi når systemer designes


---

### Brukeropplevelse

Note:
- kundene dine er brukere, når de klarer å bruke systemet riktig har du lykkes
- sett deg i brukerens sko: hvordan opplever de systemet ditt? 
- hvem er brukeren? (Personas)
- hvilke problemer trenger brukere å løse? (Er dette krav til systemet? Burde
  det vært det?)
- Gå gjennom brukerens opplevelse (brukerreise)
- Hvordan kan vi hjelpe brukeren litt mer teknisk?
- Justering, tekst, form, plassering
- Ikke gi mer informasjon enn nødvendig
- Grupper informasjon som henger sammen
- plasser det mest viktig først og sist
- bruk repetisjon, plassering, justering, nærhet og luft
- pass på fonter, farger, kontrast


---

### Gjøre om krav til oppgaver: planlegging


Note: 
- Generelt sett: om å gjøre å komme seg i produksjon så snart som mulig
- for alle krav: hva er det minste, rent programmeringsmessig, som skal til for
  å kunne realisere oppgaven? Hvor mye brukergrensesnitt må egentlig til? Hvor
  mye forretningslogikk? 
- i hvilken rekkefølge må oppgaver løses?
- hvilke oppgaver er kritisk for å oppfylle behovet? Begynn med disse, slik at
  du får erfaring med dem
- hvordan har du tenkt å teste funksjonalitet slik at du kan si at oppgaven er
  ferdig? 
- når features tas i bruk kan funksjonalitet utvides og forfines til det er godt
  nok
- For en oppgave: hva skal til rent teknisk? Hver oppgave skal ikke være altfor
  stor, kan være greit å planlegge rent teknisk hva som skal til for å løse en
  oppgave
- Bruk project board/oppgavetavle til å holde oversikt på status på oppgaver,
  både ventende, i gang og ferdige


---

### Kommunikasjon

Note:
- hva er hensikten? forstå hverandre. Løse de rette problemene. Unngå problemer.
- løse de rette problemene
- fortelle andre om hva vi holder på med (hvorfor og hvordan)
- unngå misforståelser
- kunnskapsdeling og kunnskapsoverføring
- viktigste verktøyet vi har som utviklere
- god kommunikasjon gir bedre samarbeid, mer avslappet team, og løsninger
  som er mer kreative og har høyere kvalitet
- finne ut hva som er problemer/behov (hva vi trenger å løse for kunden)
- finne løsning på problemer
- Hvilke kommunikasjonskanaler finnes? epost, chat, issue tracking, ansikt til
  ansikt, møter, telefon, video, figur, tekst
- når brukes de ulike kanalene og hvordan skal vi bruke dem på en god måte?
- hva er god kommunikasjon? beskjed er nyttig og betyr det samme for avsender og
  mottager
- dette inkluderer kode, som også er en form for kommunikasjon (mellom utvikler
  og maskin, men også mellom utviklere)
- hvordan ordlegge seg i en ubehagelig setting? Hvordan samarbeide to og to?
  Hvordan bruke kroppsspråk og ansiktsmimikk?


---

### Prosjektmetodikk

Note: 
- hensikt: 
- organisere arbeid: hva skal gjøres, hvem skal gjøre hva, prioriteringer (også
  opp mot økonomi)
- organisere mennesker: teammedlemmer, kunder, interessenter 
- organisere interaksjon mellom ulike "flater", mennesker, maskiner, behov,
  krav, økonomi
- håndtere endringer både strukturelt i organisasjon, i team, i hva som skal
  lages, hvordan det skal lages
- håndtere risiko
- agile manifesto:
- 1: individuals and interactions over processes and tools
- 2: working software over comprehensive documentation
- 3: customer collaboration over contract negotiation
- 4: responding to change over following a plan
- Hvorfor er disse prinsippene viktig? de som jobber er mennesker, mye
  lederspråk devaluerer mennesker (feks ved å kalle dem ressurser osv)
- agile manifesto prøver å rette opp i mye feil som ble begått fra 60- til
  midten av 80-tallet
- software-utvikling er ikke en ingeniør-disiplin, og kan ikke styres etter dens
  prinsipper
- hvilke metodikker finnes? Mest kjente: XP, Scrum, Kanban, kunne prinsippene
  for dem og hva som skiller dem. Feks at XP handler mye om hvilke aktiviteter
  som skal gjøres (av utviklerne) for at prosjektet skal bli vellykket, men
  Kanban er veldig lite begrensende og kun begrenser påbegynt arbeid
- reflektere rundt hvilke elementer som er fornuftige og at det går an å sette
  sammen ulike verktøy i fra de ulike metodikkene
- begrense arbeid som gjøres på en gang
- vite vanlige roller i softwareteam (teamlead, kundekontakt, testleder)
- prosjekttavle: hvilke elementer, hvordan brukes den i de ulike metodikkene
- lære av fortiden: retro. Hva er viktig, feks at man ikke legger skyld, velger
  noen få ting å forbedre seg på, demokratisk møte
- teamstørrelse (ikke for store team)


---

### Versjonskontroll

Note: 
- hva er hensikten? 
- spore endringer
- sikre samme versjon hos alle
- gjøre distribusjon av kildekode enkelt
- gruppere endringer
- jobbe trygt (senke risiko)
- hva ellers må dere kunne?
- hvordan git virker teknisk: working directroy, staging, lokalt og remote
  repository
- ulike kommandoer i git, hva de gjør
- forskjell på git vs github
- hvordan utnytte git og github til å jobbe på en god måte: 
- branching vs PR feks, visuelle verktøy for å gjøre review/endringshåndtering
- forstå hvordan git påvirker arbeidsflyten din og hvordan versjonskontroll gjør
  hverdagen din tryggere og mer effektiv


---

### Bygg og deploy

Note: 
- hensikt? Håndtere alt det tekniske rundt hvordan lage et eksekverbart artefakt
  og hvordan eksponere det til brukere
- hvorfor? Mange steg, kjedelig, stor risiko for feil (bygg og deploy) vanskelig
  å gi folk tilgang til laptopen din
- samme skal skje hver gang vi bygger, også på ulike maskiner (trygghet)
- automatisere: reduserer risiko for feil, raskere prosess
- trygg, forutsigbar deploy av produksjonskode
- hvilke steg finnes i bygg og deploy-kjeden? (hente dependencies, kompilere,
  teste, lage artefakt (jar)
- hvilke verktøy finnes? fokus her på java og det vi har brukt, maven
- maven: hvordan er katalogstrukturen, hvordan henger pom.xml sammen, hvordan
  virker de ulike kommandoene? Hvordan bruker du maven til feks å legge til en
  ny dependency, hvilke steg må da gjøres om igjen for at du skal kunne bruke
  biblioteket? 
- hva er en god arbeidsflyt? Lage mindre, men veldefinerte endringer som henger
  sammen (feks en bit med funksjonalitet) og teste og deploye dette
- grovt om arkitektur: hva er poenget med arkitektur? Hvilke nivåer har vi?
  (både kodemessig og bygg/deploymessig)
- hva slags ulike miljøer er en god ide? dev/test/prod, hva testes i de ulike
  miljøene?
- skalering og virtualisering: hva er dette, hvorfor kan det være nødvendig?
- nå skal vi tilbake til kommunikasjon, mer spesifikt kommunikasjon ved hjelp av
  kode


---

### Testing 

Note:
- Hva er hensikten? verifisere funksjonalitet, slik at vi vet at koden gjør det
  den skal 
- gir også mye mer: 
- senker risiko: kan automatisk oppdage feil som blir introdusert
- reduserer kognitiv belastning for utviklere, for testene husker for deg
- dokumentasjon: hva gjør egentlig koden din
- fokusere på behov og ønsket resultat (ikke selvsagt, må jobbes med)
- guide for å skrive kode som er løsere koblet (fører til bedre kvalitet)
- guide for å skrive brukbar kode fordi du tvinges til å bruke din egen kode
- hvilke typer tester finnes? enhet, integrasjon, regresjon, system, akseptanse,
  GUI, sikkerhets/penetrasjonstest, utforskende testing, ytelsestest osv
- kort om hva poenget med de ulike typene tester er
- hva er en god test? Tester oppførsel, tester en ting, avslører antagelser du
  gjør
- Test-drevet utvikling (TDD): Hva er det, hvordan virker det og hvordan
  påvirker det måten vi jobber på? Hva er hensikten? TDD: test først mot
  ikke-eksisterende kode som du skriver etterhvert. Alltid enkleste løsning,
  fiks kode etterhvert ETTER at testene kjører


---

### Refaktorering

Note:
- Hva er refaktorering? endring av kode uten å endre oppførsel
- Hva er hensikten med refaktorering? Øke vedlikeholdbarhet og lesbarhet
- Legge til rette for ny eller endret funksjonalitet
- vanlige problemer med kode: 
- for lange metoder som gjør for mye
- for mange abstraksjonsnivå i funksjon eller klasse
- dårlig navngiving
- feil i kommentarer, kommentarer for å dekke over dårlig navngiving
- hvordan refaktorere? I små steg, fortrinnsvis med tester kjørende hele tiden.
  God testdekning gjør refaktorering tryggere
- Vanlige refaktoreringer: trekke ut kode i metode (evt inline), renaming, lage
  nye klasser for å trekke ut funksjonalitet som hører sammen



---

### SOLID

Note:
- hva er SOLID? Fem prinsipper som hjelper til med å skrive god kvalitet kode
  som er vedlikeholdbar over tid. 
- Hva er kvalitet? Kan bety ulike ting: tenk over hva kvalitet kan innebære.
  Kan være lesbar kode, kode som eksekverer kjapt, kode som ikke har noe særlig
  feil osv. Krav til kvalitet endrer seg over tid også
- hensikt? Forbedre kvalitet og lesbarhet, senker frustrasjonsnivå og
  usikkerhet. Øker vedlikehodbarhet
- hva er SOLID-prinsippene?
- Single Responsibility Principle: en klasse (eller en bit med kode) har bare
  ansvar for en ting (et abstraksjonsnivå også). Kode må være tydelig, slik at
  det er lett å forstå hva koden gjør (tenk: lese en godt skrevet artikkel vs en
  dårlig skrevet artikkel. All informasjon er der, men er ikke like lett å
  forstå)
- Open/Closed principle: koden er åpen for utvidelser, men lukket for
  modifikasjon. Dvs: trenger ikke gjøre noe annet enn å legge til isolert
  funksjonalitet for at resten av koden kan håndtere utvidelsen. I praksis:
  innfør et interface, slik at resten av koden ikke bryr seg om konkret
  implementasjon
- Liskov Substitution Principle: en subtype av en klasse skal kunne byttes ut
  med basetypen. I praksis: bruk interface. Alle metoder tar inn
  interface-klassen, og så sendes det inn reell implementasjon
- Dependency Inversion: høynivå-moduler skal ikke avhenge av lavnivåmoduler.
  Abstraksjoner skal ikke måtte forholde seg til detaljer. Typisk: interface som
  skiller lagene --> fjerner kobling
- Interface segregation: Klienter (brukere av interfaces) skal ikke måtte
  avhenge av metoder de ikke bruker. I praksis: del opp i ulike interfaces som
  er mindre. 
- OBS: Dette er ikke en fasit, og vær obs på tegn på dårlig kvalitet som unødig
  kompleskitet og ugjennomsiktighet (opacity), altså kode som er vanskelig å
  forstå. 




--- 

### Design patterns

Note:
- Hva er et designmønster? Kjente metoder for å løse vanlige problemer i kode. 
- Hensikt: løse problemer. Øke lesbarhet og vedlikeholdbarhet
- Dette er kjente oppskrifter for å få kode som har god kvalitet 
- mange av disse er direkte manifesteringer av SOLID-prinsippene
- 3 hovedkategorier av designmønstre: creational, behavioral og structural
- creational: mønstre som handler om hvordan vi oppretter objekter
- Singleton, når du bare trenger en
- Factory, når du ikke vil eksponere alle mulige implementasjoner
- builder, når du vil kunne bygge komplekse objekter og definere
  defaultoppførsel
- Behavioural: mønstre som handler om å å håndtere oppførsel
- Strategy: handler om å velge oppførsel (algoritme), mye likt som factory.
  Brukes for å bestemme hvilken oppførsel som skal brukes uten å eksponere
  detaljer til resten av koden
- null object: definerer ikke-oppførsel: hva skjer hvis objektet ikke har verdi?
  (løser mange ulike måter å håndtere problemet på i koden, samler alt på ett
  sted)
- structural patterns: handler om å få kommunikasjon mellom ulike deler av koden
  til å bli enklere
- adapter: legger på et nytt lag med programvare for å få konnsepter med ulike
  tenkemåter til å kunne fungere på samme måte (tenk strømadapter). Isolerer
  kompabilitets-problemer i koden
- generelt: hva gjør de ulike mønstrene? Når brukes de? Hva er fordeler? Evt
  ulemper? Hvilket problem løser designmønstrene? 


--- 

### Tips om eksamen

Note: 
- Kan få kode: vurdere kvalitet? Foreslå forbedringer, finne ut hva koden gjør
- Kan få spørsmål om de ulike delene av pensum (hva er de ulike konseptene, hva
  er hensikt, når skal det brukes osv)
- Kan få spørsmål om prosjektet, både teknisk og organisatorisk 



---

### Lykke til!
