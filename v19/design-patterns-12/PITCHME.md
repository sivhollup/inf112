---

### Designmønstre

Note: 
- Vanlige, etablerte løsninger på velkjente problemer innen programvareutvikling
- Typisk en klasseoppdeling med navnekonvensjon i realiteten
- Konkrete fremgangsmåter for å følge SOLID-prinsippene
- En god ressurs i tillegg til læreboken:
  https://sourcemaking.com/design_patterns (inneholder korte forklaringer på
  mange ulike design patterns og hvordan de brukes, samt kodeeksempler)

---

### Creational patterns

Note:
- designmønstre som handler om hvordan vi oppretter objekter

---

### Singleton

Note:
- Hva er singleton?
- En måte å bare opprette *ett* objekt på
- Hvilket problem løser singleton?
- når vi ikke kan ha mange instanser av en klasse liggende
- feks: tilstandsobjekt for et spill, hvis vi har flere tilstandsmaskiner blir
  tilstand i spillet udefinert 
- mer generelt: hvis en instans av et objekt kan knyttes direkte til ressursbruk
  (minne, CPU, koblinger over nett osv), kan dette være et tegn på at mengden
  instanser skal begrenses
- hvis en instans av en klasse holder på tilstand i et system (flere instanser
  kan føre til race conditions eller ugyldige tilstander i programmet)
- alle i systemet må få tilgang til instansen
- kan styre når instansen skal tilordnes og initialiseres
- hvis man feks bruker Spring-rammeverket vil den håndtere å lage Singletons for
  deg, du kan bruke annotasjoner i koden for å oppgi hva som skal være
  singleton. Opprettes da ved oppstart av systemet. 
- Hvordan implementerer vi en singleton?
- klasse (<navn>Singleton), har private static feltvariabel for instans som skal
  være singleton
- klassen har privat konstruktør (dette gjør at ingen kan kalle den, og den kan
  heller ikke subklasses)
- public static-metode for å hente ut instansen, ofte kalt getInstance(), som
  oppretter instans når den trengs og ellers returnerer instansen
- singleton brukes gjerne av mer avanserte designmønstre
- alternativ implementasjon: lag en enum med bare en type (som er instansen
  du skal opprette)
- Kodeeksempel: singleton-pakken i demo-prosjektet


---

### Factory

Note:
- en måte å lage instanser av subklasser på uten å eksponere dem til toppklasser
- Hvilket problem løser Factory?
- lar høynivåklasser få tilgang til subklasser uten å måtte avhenge av de
  spesifikke subklassene
- dependency inversion: klasser skal avhenge av abstrakte klasser eller
  interfaces, ikke spesifikke implementasjoner (klasser skal avhenge av
  konsepter)
- finnes flere varianter av denne, klassisk Factory, Factory method m.fl.
- Hvordan implementerer vi Factory?
- lager et interface som heter <navn>Factory
- lag en metode for hver konkrete klasse som finnes
- disse metodene implementeres i en konkret Factory-klasse. Hver metode
  returnerer en instans av den konkrete klassen som ønskes
- metodene returnerer supertypen (feks Shape), slik at toppklassen som kaller
  metoden ikke trenger å forholde seg til hvilken konkret implementasjon som
  brukes
- eksempel på dette: Collection i java
- Factory Method: instansiere objekter av
  konkrete klasser, men finner ut hvilken konkret klasse som skal returneres på
  egen hånd. Kan være basert på filnavn, oppgitt enum eller en eller annen
  egenskap 
- I dette tilfellet har du bare en metode, men den må
  utvides/endres hver gang en ny klasse kommer til eller faller fra
- Kodeeksempel: factory-pakken i demo-prosjektet


---

### Builder

Note:
- Hva er builder?
- en måte å lage objekter på som frakobler parametre fra konstruktør
- Hvilket problem løser Builder?
- opprettelse av objekt med mange parametre som kan kombineres på ulike måter 
- opprette objekter der det er mange optional-parametre
- brukes ofte i forbindelse med testing
- må lage egen klasse, så kontekstuelt litt mer avansert å forholde seg til, men
  kan gi større klarhet i kode fordi det er lett å lage objekter med riktige
  parametre som ikke gjemmes vekk for andre som leser koden (hvis man feks må
  oppgi 10 parametre mens det egentlig bare er fem som er viktige for den
  instansen)
- Hvordan gjøres dette?
- Du lager en privat konstruktør i klassen din (hvis du vil tvinge frem bruk av
  builderen). Husk: ingen subklassing hvis privat konstruktør
- Du lager en Builder-klasse inne i klassen din
- Du kaller konstruktøren til Builder-klassen, og den returnerer et
  Builder-objekt 
- Kall metoder på builder-objektet for å sette nødvendige parametre. Disse
  metodene skal returnere builder-objektet
- Til slutt kaller du build-metoden på Builder-objektet, og denne returnerer
  objektet du egentlig vil lage (siden Builder-klassen er inne i klassen du
  opererer på, får den lov å kalle den private konstruktøren i klassen)
- Litt mer å forstå, men mye mer fleksibel bruk
- gir mulighet for objekter som ikke kan endres, immutable objects
- Kodeeksempel i builder-pakken i demo-prosjektet


---

### Behavioural patterns

Note: 
- handler om å gjøre det enklere å velge riktig type oppførsel ved å innkapsle
  oppførsel i klassestrukturer


---

### Strategy

Note: 
- Hva er Strategy?
- mye tilsvarende til Factory, men for algoritmer
- Hvilket problem løser Strategy: 
- skille virkemåten til en algoritme fra hvordan den brukes
- frikoble valg og bruk av algoritme fra implementasjonen
- når du må bestemme hvilken type algoritme som skal løse et problem runtime
- kunne laget alle algoritmene i en stor if-else med metoder for de ulike
  algoritmene, men det er vanskelig å vedlikeholde over tid (og bryter med
  open/closed-principle)
- eksempel: 
- Fagsystem for produksjon av vinduer (lage tekniske beskrivelser av hvordan
  vinduer skal settes sammen). Noen vinduer har ventiler, men plassering av
  ventil avhenger av hvilken vindustype det er 
- alle vindustyper har sin måte å beregne på, lager en klasse for hver måte
  (hver sin algoritme), hver av disse er en Strategy (VentilStrategy). Velge
  runtime hvilken som er riktig
- Hvordan implementerer vi Strategy?
- Lag et interface, en Strategy, alle klasser implementerer denne. Velg runtime
  hvilken klasse som skal instansieres, mens resten av koden bare forholder seg
  til interface-metodene. 
- Ref eksempelet over: hva hvis det ikke skal være noen ventil? Kan lage Null
  Object 
- Kodeeksempel: strategy-pakken i demo-prosjektet


---

### Null object

Note:
- designmønster som definerer ingen-oppførsel
- Hvis vindu ikke skal ha ventil, så kan det lages en Strategy-implementasjon
  for ingen ventil som rett og slett ikke gjør noe som helst
- blir en egen implementasjonsklasse som da gjerne ikke gjør noe beregning eller
  på annet vis gir en bra (og definert!) behandling av hva som skal skje i
  ikke-tilfellet
- forteller leseren av koden eksplisitt at i dette tilfellet skal det ikke
  gjøres noe
- særlig i Java er null et "eget konsept" som ikke egentlig er et objekt, men
  som kan returneres i stedet for ett. Null object er en vei rundt dette, for å
  gi bedre håndtering av null i koden. 
- hva betyr null? Er det en feil eller er det ok? Må håndteres alle steder det
  objektet hentes i koden (bryter flere SOLID-prinsipper). 
- Kodeeksempel: strategy-pakken i demo-prosjektet (NoDiscountStrategy)

---

### Structural patterns

Note: 
- handler om å få kommunikasjon mellom ulike entiteter til å bli enklere


---

### Adapter

Note:
- Hva er Adapter?
- Legge et nytt lag med programvare for å få konsepter (klasser) med ulike
  tenkemåter til å kunne fungere på samme måte 
- tenk: ulike typer strømadaptere, må legge noe i mellom for å kunne bruke dine
  elektriske duppedingser i ulike land med ulike standarder
- Hvilket problem løser Adapter:
- lar kode som allerede er laget virke sammen sømløst for klienten sin del. 
- isolerer kompabilitetsendringer og gjør det lettere for alle andre
- viser at ulike konsepter er relaterte og kan brukes om hverandre (selv om de
  feks kommer fra ulike biblioteker)
- Eksempel: samme gui-logikk for ulike gui-rammeverk: får en Adapter som
  definerer felles oppførsel, hver implementasjon limer sammen felles
  funksjonalitet med detaljer fra hver rammeverk
- Også mye brukt i testing for å injisere tester der det finnes funksjonalitet
  som ikke under noen omstendigheter må kalles
- Eksempel: 
- Testing av atomvåpen-software: vi har ikke lyst til å faktisk sende avgårde et
  atomvåpen, men vi må teste at systemet virker
- Kodeksempel: 
- https://sourcemaking.com/design_patterns/adapter/java/1
- Kodeeksempel på hvordan vi kan gjøre klart for å bruke adapter: 
- https://github.com/nerdschoolbergen/all-about-testing-code/tree/master/exercise-5

