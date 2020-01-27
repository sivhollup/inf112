### Spesifisering

Note:
- beskrivelsen av et system
- beskrivelse av et problem
- beskrivelse av en løsning på et problem
- beskrivelse av en eller flere oppgaver
- Poenget: 
- Handler om å finne ut HVEM vi lager en løsning for
- Handler om å finne ut HVORFOR vi løser et problem
- Handler om å finne ut HVILKET problem vi prøver å løse
- Sånn sett: Handler om det å finne ut HVA som skal lages, men det er et
  resultat av punktene over


---

### En spesifikasjon bør beskrive ønsket oppførsel

Note: 
- systemet skal oppfylle et behov.
- som oftest ligger et forretningsmål til grunn for det vi trenger å lage (ofte
  penger spart, tjent eller tid spart)
- kjært barn har mange navn/relaterte konsepter: kravspesifikasjon, usecase,
  user story, funksjonelle krav, ikke-funksjonelle krav, behov
- ikke direkte overlapp mellom uttrykkene


---

### Hvor kommer en spesifikasjon fra? 

Note: 
- som oftest fra en kunde som har et behov de ønsker å få oppfylt
- kan komme direkte fra en bruker
- kan komme fra bruker via andre lag (salgs/anbudsavdeling, ett eller flere lag
  med sjefer)


---

### Krav

Note:
- engelsk: requirements
- et krav er akkurat det det høres ut som, noe systemet skal gjøre
- Deler disse inn i to hovedtyper, funksjonelle og ikkefunksjonelle krav
- Funksjonelle krav: presis beskrivelse av hva et system skal gjøre, ofte gitt i
  form av hvilken output en bestemt input gir
- Eksempel: Systemet skal la en student melde seg opp i et fag
- Eksempel: Systemet skal la foreleser sende ut beskjeder til alle som tar
  faget
- Ikke-funksjonelle krav: beskrivelse av begrensninger eller krav til systemet
  som ikke direkte omhandler hvilke oppgaver systemet skal utføre
- Handler om feks responstid, oppetid, sikkerhet, integrasjoner mot andre
  systemer, hvilke platformer tjenesten er tilgjengelig på osv. 
- Eksempel: Systemet skal være brukbart for blinde
- Eksempel: Systemet skal ha oppetid på mer enn 99,99%
- Mange har tidligere skilt veldig på funksjonelle krav og ikke-funksjonelle
  krav, men i praksis havner alle kravene i samme spesifikasjon
- OBS: Beskriver sjelden behov/problemer som skal løses, hopper rett i
  løsningsmodus
- Eksempel løsningsmodus: "Systemet skal fungere både på Android og iOS"
- Eksempel behovsmodus: "Systemet skal fungere på mobil for minst 97% av
  brukerne"
- Krav handler ofte om HVA
- Krav er ofte overordnede, men kan også være svært detaljerte. Andre skiller på
  krav, use cases og brukerhistorier


---

### Use case

Note:
- presisering av et krav
- her er det med detaljer, og det er rom for mer beskrivelse av kontekst
- skal ha med hvem som er brukere av kravet, hvem krav eller resultat av krav
  kan være interessant for
- kan inneholde hva input og output skal være
- mye brukt før, ikke så mye nevnt i dag, ganske formelt og kan være et rigid
  system
- greit å kjenne til uttrykket 


--- 

### Brukerhistorier

Note: 
- engelsk: user stories
- Vanlig måte å formidle spesifisering på, mye brukt i industrien
- en brukerhistorie er nettopp: en kort historie
- Følger en bestemt form: 


---

Som @color[green](rolle) trenger jeg @color[green](funksjonalitet) for å
@color[green](oppnå nytteverdi)

Note: 
- veldig vanlig format for krav/usecase/userstory
- skal inneholde HVEM som har behovet
- skal inneholde HVA behovet er (HVILKET problem skal løses/hvilken
  funksjonalitet som trengs)
- skal inneholde HVORFOR en rolle har behovet
- introdusert noen nye konsepter her, gå mer i dybden på roller


---

### Roller 

Note: 
- kalles også aktører
- noen som skal bruke systemet
- noen system har bare en type bruker, de fleste har flere
- Oppgave: Mitt UiB. Hvilke roller har dette systemet? (2 min)
- Studieadministrasjon
- Foreleser
- Gruppeleder
- Student
- Dette er hovedgruppene av roller. I tillegg finnes det "subgrupper" av roller,
  fordi folk bruker systemene på ulike måter. 


---

### Personas

Note: 
- bruksmønsteret er ulikt for ulike mennesker
- Oppgave: finn eksempler på hvordan samme brukerrolle har ulike behov (2 min)
- Svaksynt/blind 
- Snakker ikke samme språk som hoveddelen av brukerne
- dyslektiker
- fargeblind
- hva hvis du taster veldig sakte av en eller annen grunn? Mange felt autolagrer
  etter en viss tid, men hvis du taster veldig sent kan det få konsekvenser
- noe av dette handler om universell utforming, noe alle offentlige nettsider er
  lovpålagt å følge (det finnes teknikker for å tilrettelegge websider for
  skjermleser, feks. Men selve bruksopplevelsen er annerledes, feks ved søk)
- Oppgave: hvilke roller finnes for twitter? (2-3 min) skriv resultat ned på
  tavlen
- Tweeter (innholdsprodusent?), tilhører, moderator, ikke-person-brukere som
  systemer som ønsker å tweete på vegne av noen, eller konsumere ulike typer
  tweets 
- en rolle trenger ikke være en person, det kan også være et system
- ofte lager vi personas for å få frem ulike typer brukere, feks eldre folk som
  taster sakte, ekspertbrukere som vil ha hurtigtaster og krever at systemet
  svarer fort. Disse gjenbrukes i brukerhistoriene og alle som jobber med
  utviklingen av systemet "kjenner" de ulike profilene
- Eksempel: Karen, 49, fargeblind. 
- Eksempel: Petter, 53, kjempestore hender og fingre som ikke treffer tastaturet
  ordentlig. Jobber fysisk, sitter så lite foran skjerm som mulig, og har
  problemer med å gjøre finmotoriske bevegelser 


---

Som @color[green](rolle) trenger jeg @color[green](funksjonalitet) for å
@color[green](oppnå nytteverdi)

Note:
- Oppgave: lage brukerhistorier for twitter (4 min, så samle inn fra alle)
- ser veldig enkelt og greit ut, ikke sant? Det å lage en god kravspesifikasjon
  er VANSKELIG (tenk håndverksanalogi)
- Nå skal vi snakke mer om hva som gjør en spesifikasjon god, og så ser vi om vi
  kan forbedre brukerhistoriene våre


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/misunderstanding.jpg&position=right&size=55% 100%

@snap[span-40 west]
#### Krav er @color[orange](mangelfulle), @color[orange](uklare) eller @color[orange](direkte feil)
@snapend

Note:
- Får ofte beskjed om at "dette er ferdig tenkt", "bare lag dette". Nesten aldri
  sant. 
- kommer IKKE ferdigtygde, uansett om de er formet som spesifikke krav eller
  brukerhistorier
- årsakene er mange: 
- kunden vet ikke hva de trenger
- kunden vet ikke hvordan løsningen bør være
- kunden tror de trenger noe annet enn det de faktisk behøver
- kunden sier ikke tydelig hva som er viktig og hva som er detaljer
- tar feil om hva som er viktig og hva som er detaljer
- kunden er ikke trent i å skrive krav
- kunden bruker upresist språk
- de som skriver kravene er ikke de som bruker systemet (mange har egne folk som
  skriver anbud, dette er folk som kanskje aldri har tatt i domenet eller
  problemet som skal løses)
- hvilke problemer møter vi ofte på?


---

### Problem: Å skyte fra hoften

Note: 
- Krav/brukerhistorier kommer ofte frem i samtale
- svare uten å tenke seg om
- svarer kanskje på noe litt annet enn du egentlig spør om (og ikke sikkert
  dette oppfattes)
- mangler gjerne kontekst
- mangler det store bildet 


---

### Løsning: Logikk

Note: 
- når noe ikke gir mening, spør hvorfor
- spør til du forstår hele sammenhengen
- still det som ikke henger sammen opp og eksponer det for kunden på en
  ordentlig måte
- her er kommunikasjon viktig
- hvis du ikke forstår når dette skal brukes: spør om når det er aktuelt
  (kontekst)


---

### Problem: Manglende krav

Note:
- de fleste behov er komplekse, fordi verden er kompleks
- de fleste klarer ikke å se alt som trengs
- noen behov blir ikke tydelig før andre er oppfylt
- kravet kan ha kommet til i etterkant
- verden endrer seg
- kunden har ikke klart å se det reelle omfanget av behovet de har


--- 

### Løsning: Avtaleverk

Note: 
- denne er vanskelig å løse, og kan være vanskelig å oppdage
- avtalen om utvikling bør utformes slik at det er rom for å endre på
  prioritering og hva som lages, slik at viktige funksjoner som har blitt glemt
  kan få komme til i ettertid


---

### Problem: Uklare krav

Note: 
- krav kan bety flere ting
- de som skriver krav til et system er mennesker, og bruker språk, språk er
  upresist. Krever mye trening å skrive presist
- I bilutleie: Det skal være lett å bestille bil gjennom appen
- Oppgave: Hva kan dette bety? (2 minutter)
- Egentlig: Den som trenger bil skal lett kunne se hvilke biler som finnes og
  når de er ledige og opptatte, fordi noen kan være fleksible og har mer behov
  for en bestemt bil enn for et gitt tidspunkt


---

### Løsning: Oversetteren

Note: 
- krav, eller spesifikasjon, ligger akkurat i grenselandet mellom mennesker og
  maskiner
- mennesker er upresise, uklare og gjør mange antagelser
- maskiner er presise, veldefinerte, antar overhodet ingenting, må fortelles
  absolutt alt
- som utviklere er det viktig å forstå begge disse verdenene. Vi må guide kunder
  (og oss selv) til å skrive krav på en slik måte at de gir mening i begge
  kontekster 
- vi kan ikke forvente at andre forstår dette


--- 

### Problem: Løsning i behovsklær

Note: 
- (løsning forkledd som behov)
- inneholder spesifikke løsninger/teknologier i beskrivelse av behov
- Eksempel: 
- Som student vil jeg se en liste over alle fagene jeg tar
- Liste? Hvorfor det? Ingen har behov for å se en liste. En oversikt kanskje. 
- Hvorfor er dette et problematisk?



---

### Løsning: Den høflige språkpedanten

Note:
- Krav bør handle om behov
- må skille mellom problem/behov, og en måte å løse det problemet på
- krav skal omhandle problemet som skal løses, ikke hvordan det skal løses
- kanskje liste ikke er beste måten å vise fag på? Hvis du har få fag, hva skal
  du med en liste? Kanskje det er "kort" som Mitt UiB bruker? 
- ved å beskrive løsning, begrenser man hvilke løsninger man leter etter
- kanskje løsningen kunden ser for seg ikke faktisk løser problemet de har?
- kanskje løsningen ikke er den beste som finnes? Går man glipp av den beste
  løsningen fordi vi ser på detaljer først? 
- jobb med språket til behovet er klart beskrevet
- spør om "ok, jeg ser det står liste, er det noen spesiell grunn til det?" 
- eller "hva er det som gjør at du tenker at en liste er nødvendig?" 
- trenger ikke fortelle at noe er feil, bare spør og grav til dere blir enige om
  hva behovet er



---

### Problem: Småbarnsforelderen

Note: 
- (sånn er det bare) (behovet som skal oppfylles mangler)
- eks: som foredragsholder ønsker jeg å logge inn. Eeeh. nei. 
- som foredragsholder ønsker jeg å logge inn slik at jeg kan redigere foredraget
  mitt. Hvorfor må vi logge inn for det? Epler og appelsiner. 
- som foredragsholder ønsker jeg at foredragene mine er passordbeskyttet slik at
  ingen andre enn meg kan redigere dem
- som foredragsholder ønsker jeg at kun jeg har adgang til å redigere
  foredragene mine slik at ingen uvedkommende kan ødelegge foredraget mitt
- hvordan fikse dette?

---

### Løsningen: Femåringen

Note: 
- spør hvorfor
- alle som har en femåring (eller 3åring) vet hvordan de er. Hvorfor hvorfor?
  Hva er det? Hvordan virker dette? Spør og grav. 
- hvis noen ikke kan svare på spørsmålene, finn ut hvem som kan 


---

### Problem: Isfjell

Note: 
- en epic forkledd som en brukerhistorie
- epic: et sett med brukerhistorier. Kalles også capability, feature, evt
  feature set. 
- Som potensiell foredragsholder ønsker jeg å sende inn mine forslag til
  foredrag slik at jeg kan bli med i vurderingen
- Oppgave: diskuter hvilke brukerhistorier som gjemmer seg i denne (3 min)
- hva gjemmer seg her? ulike foredragstyper, trenger de ulike type informasjon?
  Informasjon om foredragsholder? Hva om de sender inn flere foredrag, da
  trenger vi kanskje ikke samme info en gang til? Flere foredragsholdere på
  samme foredrag? Tekniske krav til foredrag? Påmeldt/Ikke påmeldt?
- Får ikke oversikt over alle detaljene
- Ofte vanskelig å diskutere disse med kunden, fordi ingen har oversikt (se
  etter dette, ofte irritasjon, krangling pga ulike oppfatninger, eller stillhet
  og unnvikelse)
- Vanskelig å vite når du er ferdig
- Lett å gå seg vill i koden, ting tar plutselig veldig mye lenger tid fordi det
  er for mange uavklarte detaljer
- blir også problematisk i forhold til kunden: de forventer at du leverer. De
  ser ikke hvor mye som egentlig gjemmer seg i denne og lurer på hvorfor du ikke
  blir ferdig. 
- en enorm brukerhistorie som er 80% ferdig (kaaanskje??) er IKKE det
  samme som 8/10 brukerhistorier som er 100% implementert (tegn på tavlen)
- Mindre brukerhistorier gir større forutsigbarhet for kunden og for teamet


---

### Løsning: Motorsag

Note: 
- Bryt opp. Grav i brukerhistoriene. 
- feedback på mindre historier kommer raskere, lettere å få gode prioriteringer
- men husk: ikke bli som han som skulle lage kiste og endte opp med en
  tannpirker 
- brukerhistorier skal omhandle en spesifikk oppgave
- epics, eller features, beskriver hovedfunksjonalitet, egentlig mer et sett av
  brukerhistorier
- Eksempel på feature: som bruker ønsker jeg å tweete en viktig nyhet
- Oppgave: diskuter hvilke brukerhistorier som gjemmer seg i denne? (3 min)
- tweete tekst
- tweete url
- tweete bilde
- hva hvis det er et system som genererer tweets?
- tweete på bestemt tidspunkt?
- tweete med tags
- tweet som er svar på en annen tweet
- tweet som kun er synlig for et subsett av brukere (DM?)


--- 

### Problem: Kråkesølv

Note: 
- de som ser ut som om de gir verdi, men som ikke gjør det
- eks: som et webgrensesnitt ønsker jeg et REST-API for å hente ut en liste med
  selskaper slik at jeg kan få autocomplete i søkefeltet
- hvorfor er dette et problem? Gir ingen verdi for kunden
- skal lande et sted mellom kråkesølv og isfjell


---

### Løsning: Men hva med...

Note:
- ikke prioriter kråkesølvhistorier
- sett dem opp mot andre historier som gir mer verdi, slik at kunden ser hva det
  koster å lage kråkesølv fremfor funksjonalitet som gir reell verdi
- Vi vet nå mye om problematiske brukerhistorier og krav. 


---

### Krav fremmer et spesifikt behov

Note: 
- Vil gjøre forskjell for brukerne av systemet
- behovet forstås av alle, både forretningssiden og utviklerne
- inneholder ikke implementasjonsdetaljer
- Kan vises frem til kunden
- ingenting kan tas vekk uten at den slutter å gi verdi


---

### Krav kan realiseres i løpet av en kort periode

Note: 
- Klarer vi å levere på omtrent en uke?
- Levere == utrede hva som trengs, implementere og teste


---

### Krav er lett å forstå

Note:
- Skjønner hva vi skal gjøre
- minimerer risiko for kommunikasjonssvikt
- Et godt krav har et tydelig språk som lett kan forstås på samme måte av både
  kunde og teammedlem
- oppnås ved å bruke språket til forretningssiden


---

### Ubiquituous language

Note: 
- et språk utviklet av kunde og team i samarbeid der alle ord har en klar
  betydning, dere er enige om hva den betydningen er, og ordene som er brukt gir
  mening i domenet/forretningslogikken
- hvis kunden snakker om flensehyse, da snakker dere også om flensehyse (OK, så
  er kanskje rentesats mer reelt)
- krav skal være på kundens og domenet sitt språk
- dette overføres til kode også, slik at dere snakker på samme måte om krav
  og forretningslogikk som om kode
- Hva oppnår vi med dette?


---

### Kode og forretningslogikk er det samme

Note:
- eks: to utviklere snakker om en implementasjonsdetalj i beregning av
  rentesats, en forretningsekspert går forbi og hører hva de snakker om, og kan
  umiddelbart greie ut i misforståelsen de har hatt fordi de beskriver det
  faktiske domenet
- teamet må snakke med brukerne og forretningseksperter gjennom hele
  prosjektet 
- språket vil videreutvikles


---

### Tenk de rette tankene

Note: 
- hvorfor er språk viktig? Navnet er det du forestiller deg når
  du tenker på det. Hvis du forestiller deg et annet konsept enn det faktisk er,
  forstår du ikke konseptet riktig og dermed ikke domenet heller
- kan gi subtile, men kritiske forskjeller (trenger ikke være rente vs saldo,
  for den oppdages fort.)
- finnes tilnærminger til utviklingsløp for prosjekter som bruker dette som
  utgangspunkt, feks domain driven design (DDD). DDD brukes for å gi mening til
  objekt-orienterte løsninger og knytte modell til domenet
- Men OK. Nå har vi fine krav og god forståelse av domenet. Det mangler fortsatt
  en bit


---

### Et godt krav forklarer når vi er ferdige

Note: 
- Krav skal formuleres slik at de kan verifiseres med en test
- Jo mer presist, jo bedre, slik at det er lett å vite når man er ferdig
- Spesifisitet er viktig, ellers skapes det usikkerhet rundt når man er ferdig
  med en oppgave, og hva en oppgave faktisk innebærer
- Kan være mellom utviklere, testere, men også opp mot kunde/endebruker
- teamet og kunde blir enige om hva som skal til for at en oppgave er ferdig
- Må alltid få godkjenning fra kunde før en oppgave faktisk er ferdig


---

### Bruk tid på spesifikasjon

Note: 
- dyrt å ta feil i spesifisering (selv om det gjøres jevnt utover i prosjektet)
- domeneforståelse er viktig, for både kunder og utviklingsteam
- kritisk prosess som legger grunnlaget for at prosjektet blir en suksess


---

### Verden endrer seg

Note:
- en spesifikasjon er ikke skrevet i stein
- endres underveis, noe legges til, noe tas vekk
- hovedfeatures (epics) kan bli irrelevante eller plutselig bli kjempeviktige
- når verden er blitt endret, er det ofte vanskelig å huske at det ikke har vært
  slik hele tiden 
- når en historie er klar havner den i backlog (det gjenstår fortsatt mye arbeid
  før oppgaven kan løses, forelesning i neste uke)


---?image=https://academiccomputing.files.wordpress.com/2012/07/roborally.jpg&position=right&size=55% 100%

@snap[span-40 west]
### Årets prosjekt
@snapend

Note: 
- https://www.youtube.com/watch?v=sVJ6A3OsZig <-- halvtimes demo med forklaring
  av regler og spillsesjon
- https://youtu.be/rlK7tZk41BA <-- kortere demo, også med forklaring av reglene


---?image=https://www.theboardgamefamily.com/wp-content/uploads/2013/03/RoboRallyLaser1.jpg&size=55%

Note: 
- du skal programmere en robot i et produksjonslokale. Det er satt ut flagg
  ulike steder i lokalet
- kort sagt: den som først kommer seg innom alle flaggene i riktig rekkefølge
  vinner
- roboten programmeres ved at du legger ned kort med bevegelser. Dette utgjør
  programmet som roboten kjører etter den runden

---?image=https://www.theboardgamefamily.com/wp-content/uploads/2013/03/RoboRallyCards.jpg

Note:
- enkle bevegelseskort, rotasjon høyre/venstre, 180grader, flytt bakover, flytt
  fremover i ulike varianter
- hvert kort har prioritet, høyest prioritet får bevege seg først
- på brettene finnes samlebånd og tannhjul som roterer, disse vil flytte roboter
  som står oppå på gitte tidspunkt

---?image=https://i0.wp.com/www.luisescobarblog.com/wp-content/uploads/2014/05/Three-Reasons-Robo-Rally-is-a-Must-Own-Board-Game-2.jpg&size=60%

Note:
- masse flere regler og kompliserende faktorer, som at alle robotene har lasere
  og skyter på andre roboter de kan se, roboter kan dette ned i hull og bli
  ødelagt (eller gå av brettet og bli ødelagt)
- legger ut et par lenker med gjennomganger av spillet, slik at dere kan få se
  det i action
- Vi må gjøre noen tilpasninger til reglene slik at det kan fungere digitalt
- Gjennomgang av regler neste uke, og begynne planlegging
- Spillet vil om kort tid være tilgjengelig på lesesalen (echo har bestilt inn)

