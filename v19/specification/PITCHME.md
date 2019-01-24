### Spesifisering

Note:
- presentasjonsslides: 
- https://bit.ly/2R1tZpT


---

### Hva er spesifisering?

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
- kjært barn har mange navn/relaterte konsepter: kravspesifikasjon, usecase,
  user story, funksjonelle krav, ikke-funksjonelle krav


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
- Krav handler ofte om HVA


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
- personer som skal bruke systemet
- noen system har bare en type bruker, de fleste har flere
- Oppgave: Mitt UiB. Hvilke roller har dette systemet?
- Studieadministrasjon
- Foreleser
- Gruppeleder
- Student
- Dette er hovedgruppene av roller. I tillegg finnes det "subgrupper" av roller,
  fordi folk bruker systemene på ulike måter. 
- bruksmønsteret er ulikt for ulike mennesker
- eksempel: hva hvis du er svaksynt eller blind? 
- eksempel: hva hvis du ikke snakker norsk?
- eksempel: hva hvis du har dysleksi?
- eksempel: hva hvis du er fargeblind?
- hva hvis du taster veldig sakte av en eller annen grunn? Mange felt autolagrer
  etter en viss tid, men hvis du taster veldig sent kan det få konsekvenser
- noe av dette handler om universell utforming, noe alle offentlige nettsider er
  lovpålagt å følge (det finnes teknikker for å tilrettelegge websider for
  skjermleser, feks. Men selve bruksopplevelsen er annerledes, feks ved søk)
- Oppgave: hvilke roller finnes for twitter?
- Tweeter (innholdsprodusent?), tilhører, moderator, ikke-person-brukere som
  systemer som ønsker å tweete på vegne av noen, eller konsumere ulike typer
  tweets 
- en rolle trenger ikke være en person, det kan også være et system
- ofte lager vi personas for å få frem ulike typer brukere, feks eldre folk som
  taster sakte, ekspertbrukere som vil ha hurtigtaster og krever at systemet
  svarer fort. Disse gjenbrukes i brukerhistoriene og alle som jobber med
  utviklingen av systemet "kjenner" de ulike profilene


---

Som @color[green](rolle) trenger jeg @color[green](funksjonalitet) for å
@color[green](oppnå nytteverdi)

Note:
- ser veldig enkelt og greit ut, ikke sant? Det å lage en god kravspesifikasjon
  er VANSKELIG (tenk håndverksanalogi)
- Oppgave: Alle kjenner twitter?
- Twitter: skrive ned brukerhistorier for twitter
- skal snakke om hva en god spesifikasjon er, kommer til å bruke brukerhistorier
  som eksempel, men først: 


---

### Hvor kommer en spesifikasjon fra? 

Note: 
- som oftest fra en kunde som har et behov de ønsker å få oppfylt
- Får ofte beskjed om at "dette er ferdig tenkt", "bare lag dette". Nesten aldri
  sant. 


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/misunderstanding.jpg&position=right&size=55% 100%

@snap[span-40 west]
#### Krav er @color[orange](mangelfulle), @color[orange](uklare) eller @color[orange](direkte feil)
@snapend

Note:
- kommer IKKE ferdigtygde, uansett om de er formet som spesifikke krav eller
  brukerhistorier
- årsakene er mange: 
- kunden vet ikke hva kunden trenger
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

### Løsninger forkledd som behov

Note: 
- inneholder spesifikke løsninger/teknologier i beskrivelse av behov
- Eksempel: 
- Som student vil jeg se en liste over alle fagene jeg tar
- Liste? Hvorfor det? Ingen har behov for å se en liste. En oversikt kanskje. 
- Hvorfor er dette et problematisk?
- må skille mellom problem/behov, og en måte å løse det problemet på
- krav skal omhandle problemet som skal løses, ikke hvordan det skal løses
- kanskje liste ikke er beste måten å vise fag på? Hvis du har få fag, hva skal
  du med en liste? Kanskje det er "kort" som Mitt UiB? 
- ved å beskrive løsning, begrenser man hvilke løsninger man leter etter
- kanskje løsningen kunden ser for seg ikke faktisk løser problemet de har?
- kanskje løsningen ikke er den beste som finnes? Går man glipp av den beste
  løsningen fordi vi ser på detaljer først? 


---

### Å skyte fra hoften

Note: 
- svare uten å tenke seg om
- svarer kanskje på noe litt annet enn du egentlig spør om
- mangler gjerne kontekst
- mangler det store bildet 


---

### Manglende krav

Note:
- de fleste behov er komplekse, fordi verden er kompleks
- de fleste klarer ikke å se alt som trengs
- noen behov blir ikke tydelig før andre krav er oppfylt
- kravet kan ha kommet til i etterkant
- verden endrer seg
- kunden har ikke klart å se alle detaljene rundt behovet de har


---

### Uklare krav

Note: 
- krav kan bety flere ting
- de som skriver krav til et system er mennesker, og bruker språk, språk er
  upresist. Krever mye trening å skrive presist
- Oppgave:
- I bilutleie: Det skal være lett å bestille bil gjennom appen
- Egentlig: Den som trenger bil skal lett kunne se hvilke biler som finnes og
  når de er ledige og opptatte, fordi noen kan være fleksible og har mer behov
  for en bestemt bil enn for et gitt tidspunkt


---


### Maskiner og mennesker

Note: 
- krav, eller spesifikasjon, ligger akkurat i grenselandet mellom mennesker og
  maskiner
- mennesker er upresise, uklare og gjør mange antagelser
- maskiner er presise, veldefinerte, antar overhodet ingenting, må fortelles
  absolutt alt
- som utviklere er det viktig å forstå begge disse verdenene. Vi må guide kunder
  (og oss selv) til å skrive krav på en slik måte at de gir mening i begge
  kontekster 


---

### Småbarnsforelderen

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

### Femåringen

Note: 
- spør hvorfor
- alle som har en femåring (eller 3åring) vet hvordan de er. Hvorfor hvorfor?
  Hva er det? Hvordan virker dette? Spør og grav. 


---

### Isfjell

Note: 
- en epic forkledd som en brukerhistorie
- Som potensiell foredragsholder ønsker jeg å sende inn mine forslag til
  foredrag slik at jeg kan bli med i vurderingen
- hva gjemmer seg her? ulike foredragstyper, trenger de ulike type informasjon?
  Informasjon om foredragsholder? Hva om de sender inn flere foredrag, da
  trenger vi kanskje ikke samme info en gang til? Flere foredragsholdere på
  samme foredrag? Tekniske krav til foredrag? Påmeldt/Ikke påmeldt?
- epic: et sett med brukerhistorier. Kalles også capability, feature, evt
  feature set. 
- Hvorfor er dette et problem?
- Får ikke oversikt over alle detaljene
- Vanskelig å vite når du er ferdig
- Lett å gå seg vill i koden, ting tar plutselig veldig mye lenger tid fordi det
  er for mange uavklarte detaljer
- blir også problematisk i forhold til kunden: de forventer at du leverer. De
  ser ikke hvor mye som egentlig gjemmer seg i denne og lurer på hvorfor du ikke
  blir ferdig. 
- en enorm brukerhistorie som er 80% ferdig (kaaanskje??) er IKKE det
  samme som 8/10 brukerhistorier som er 100% implementert. 
- Mindre brukerhistorier gir større forutsigbarhet for kunden og for teamet
- Eksempel: 
- automatisk pakning på slutten av et rør. 


---

### Motorsag

Note: 
- Bryt opp. Grav i brukerhistoriene. Spesifiser bedre på hver historier
- feedback på mindre historier kommer raskere, lettere å få gode prioriteringer
- men husk: ikke bli som han som skulle lage kiste og endte opp med en
  tannpirker 
- brukerhistorier skal omhandle en spesifikk oppgave
- epics, eller features, beskriver hovedfunksjonalitet, egentlig mer et sett av
  brukerhistorier
- Eksempel på feature set: en bruker skal kunne tweete
- hvorfor er dette en epic? Det er mange veier til mål, kanskje mange måter å
  tweete på, alle må beskrives. Finnes mange regler som skal oppfylles 
- Oppgave: finne ut hvilke krav som egentlig ligger i denne
- tweete tekst
- tweete url
- tweete bilde
- hva hvis det er et system som genererer tweets?
- tweete på bestemt tidspunkt?
- tweete med tags
- tweet som er svar på en annen tweet
- tweet som kun er synlig for et subsett av brukere (DM?)


--- 

### Kråkesølv

Note: 
- de som ser ut som om de gir verdi, men som ikke gjør det
- eks: som et webgrensesnitt ønsker jeg et REST-API for å hente ut en liste med
  selskaper slik at jeg kan få autocomplete i søkefeltet
- hvorfor er dette et problem? Gir ingen verdi for kunden
- skal lande et sted mellom kråkesølv og isfjell
- løsningen på denne: ikke prioriter den


---

### Gode krav

Note: 
- minimerer risiko for kommunikasjonssvikt
- bruker språket til forretningssiden
- Sjekkliste for gode krav: 
- Kan den testes? 
- Kan den vises frem til kunden?
- Skjønner vi hva vi skal gjøre?
- Klarer vi å levere på under en uke?
- Er det umulig å ta vekk noe fra den uten at den slutter å gi verdi?
- Vil den gjøre forskjell for brukerne av systemet?
- Inneholder ingen implementasjonsdetaljer?
- Et godt krav har et tydelig språk som lett kan forstås på samme måte av både
  kunde og teammedlem


---

### Ubiquituous language

Note: 
- et språk utviklet av kunde og team i samarbeid der alle ord har en klar
  betydning, dere er enige om hva den betydningen er, og ordene som er brukt gir
  mening i domenet/forretningslogikken
- hvis kunden snakker om flensehyse, da snakker dere også om flensehyse (OK, så
  er kanskje rentesats mer reelt)
- krav skal være på kundens og domenet sitt språk
- dette skal overføres til kode også, slik at dere snakker på samme måte om krav
  og forretningslogikk som om kode
- Hva oppnår vi med dette?
- eks: to utviklere snakker om en implementasjonsdetalj i beregning av
  rentesats, en forretningsekspert går forbi og hører hva de snakker om, og kan
  umiddelbart greie ut i misforståelsen de har hatt fordi de beskriver det
  faktiske domenet koden kjører i
- teamet må snakke med brukerne og forretningseksperter gjennom hele
  prosjektet og videreutvikle språket
- hvorfor er dette viktig? Det du navngir noe som er det du forestiller deg når
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

### Når er et krav oppfylt?

Note: 
- Krav skal formuleres slik at de kan verifiseres, helst med en test
- Jo mer presist, jo bedre, slik at det er lett å vite når man er ferdig
- Spesifisitet er viktig, ellers skapes det usikkerhet rundt når man er ferdig
  med en oppgave, og hva en oppgave faktisk innebærer
- Må alltid få godkjenning fra kunde før en oppgave faktisk er ferdig
- Mange opererer med Definition of done (handler ofte om mer tekniske aspekter
  også, som kodekvalitet)
- teamet blir enige om hva som skal til for at en oppgave er ferdig
- testdekning
- kodekvalitetsmetrikker (statisk kildekodeanalyse, linting)
- hvem som bestemmer når oppgaven er ferdig
- hvordan skal funksjonalitet testes


---

### Bruk tid på spesifikasjon

Note: 
- dyrt å ta feil i spesifikasjonsdelen
- her opparbeider teamet seg domeneforståelse
- viktig prosess som legger grunnlaget for at prosjektet blir en suksess


---

### Et krav kan endres

Note:
- en spesifikasjon er ikke skrevet i stein
- endres underveis, noe legges til, noe tas vekk
- spesifikasjon ender ofte i backlog (hvis historiene er gode nok til å
  oversettes direkte til oppgaver)


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
- Gjennomgang av regler på tirsdag, og begynne planlegging

