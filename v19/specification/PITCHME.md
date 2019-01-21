### Spesifisering


---

https://bit.ly/

Note: 
- url til forelesningsnotatene
- slides finner du her: 


---

### Hva er spesifisering?

Note:
- beskrivelsen av et system
- beskrivelse av et problem
- beskrivelse av en løsning på et problem
- beskrivelse av en eller flere oppgaver
- Handler om det å finne ut HVA som skal lages
- Handler om å finne ut HVEM vi lager en løsning for
- Handler om å finne ut HVORFOR vi løser et problem
- Handler om å finne ut HVILKET problem vi prøver å løse
- Mange ulike ord og uttrykk rundt spesifisering


---

### Krav
#### Funksjonelle og ikke-funksjonelle

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


--- 

### Brukerhistorier

Note: 
- engelsk: user stories
- Vanlig måte å beskrive krav på er gjennom brukerhistorier
- Bestemt form


---

Som @color[green](rolle) trenger jeg @color[green](funksjonalitet) for å
@color[green](oppnå nytteverdi)

Note: 
- finnes andre måter å beskrive krav på også, men de fleste følger omtrent
  formen til brukerhistorier
- skal snakke mer om hva en god brukerhistorie er litt senere
- først, litt om "universet" brukerhistorier, og krav, befinner seg i

---

### Størrelsesorden

Note: 
- epics eller features
- brukerhistorier skal ikke være epics
- epics beskriver hovedfunksjonalitet, egentlig mer et sett av brukerhistorier
- Eksempel på epic: en bruker skal kunne tweete
- hvorfor er dette en epic? Det er mange veier til mål, kanskje mange måter å
  tweete på, alle må beskrives. Finnes mange regler som skal oppfylles feks.
- Eksempel på epic: en bruker skal kunne starte spillet 
- en brukerhistorie er spesifikk


---

### Roller 

Note: 
- de som skal bruke systemet
- noen har bare en type bruker, de fleste har flere
- husk at selv om ønsket funksjonalitet er det samme, er ikke nødvendigvis
  bruksmønster det samme
- eksempel: universell utforming. Lager du en nettside for en offentlig etat, må
  blinde/svaksynte kunne bruke skjermleser for å bruke systemet
- ofte lager vi personas for å få frem ulike typer brukere, feks eldre folk som
  taster sakte, ekspertbrukere som vil ha hurtigtaster og krever at systemet
  svarer fort
- personas kan også være brukere som trenger å bruke systemet på ulikt vis, feks
  forelesere vs studenter vs studieadministrasjon i Mitt UiB


---

### Hvor kommer krav fra?

Note: 
- krav kommer fra kunden
- kommer IKKE ferdigtygde, spesifikke krav eller brukerhistorier
- hvis det gjør det, er de som oftest dårlige, mangelfulle eller feile
- årsakene er mange: 
- kunden vet ikke hva kunden trenger
- kunden vet ikke hvordan løsningen bør være
- kunden tror de trenger noe annet
- kunden sier ikke tydelig hva som er viktig og hva som er detaljer
- kunden er ikke trent i å skrive spesifikke krav
- kunden bruker upresist språk
- hvorfor er krav så dårlige?


--- 

### Implementasjonsdetaljer 

Note: 
- inneholder implementasjonsdetaljer
- inneholder spesifikke løsninger/teknologier som skal brukes
- Hvorfor er dette et problem?
- krav skal omhandle problemet som skal løses, ikke hvordan det skal løses
- ved å beskrive løsning, begrenser man hvilke løsninger man leter etter
- kanskje løsningen kunden ser for seg ikke faktisk løser problemet de har?
- kanskje løsningen ikke er den beste? 


---

### Manglende krav

Note:
- krav mangler
- hvorfor skjer dette? Kanskje de ikke tenkte på det?
- kravet kan ha kommet til i etterkant
- kunden har ikke klart å se alle detaljene rundt behovet de har


---

### Uklare krav

Note: 
- krav kan bety flere ting
- de som skriver krav til et system er mennesker, og bruker språk, språk er
  upresist. Krever mye trening å skrive presist

---

### Mellom maskin og menneske

Note: 
- krav, eller spesifikasjon, ligger akkurat i grenselandet mellom mennesker og
  maskiner
- mennesker er upresise, uklare og antar en haug med ting
- maskiner er presise, veldefinerte, antar overhodet ingenting, må fortelles
  absolutt alt
- som utviklere er det viktig å forstå begge disse verdenene. Vi må guide kunder
  (og oss selv) til å skrive krav på en slik måte at de gir mening i begge
  kontekster 
- noen vanlige antipatterns


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
- Problem: en enorm brukerhistorie som er 80% ferdig (kaaanskje??) er IKKE det
  samme som 8/10 brukerhistorier som er 100% implementert. 
- Hvordan fikser vi dette?
- også eksempel: automatisk packer på slutten av en seksjon. 

---

### Bryt opp

Note: 
- Bryt opp. Grav i brukerhistoriene. Spesifiser bedre på hver historier
- feedback på mindre historier kommer raskere, lettere å få gode prioriteringer


--- 

### Kråkesølv

Note: 
- de som ser ut som om de gir verdi, men som ikke gjør det
- eks: som et webgrensesnitt ønsker jeg et REST-API for å hente ut en liste med
  selskaper slik at jeg kan få autocomplete i søkefeltet
- hvorfor er dette et problem? Gir ingen verdi for kunden
- skal lande et sted mellom kråkesølv og isfjell



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


---

### Ubiquituous language

Note: 
- hvis kunden snakker om sviskeindeks, da snakker dere også om sviskeindeksen
- når dere snakker om kode, skal dere snakke om forretningslogikken på det
  språket forretningssiden gjør
- eks: to utviklere snakker om en implementasjonsdetalj i beregning av rente, en
  forretningsekspert går forbi og hører hva de snakker om, og kan umiddelbart
  greie ut i misforståelsen de har hatt fordi de beskriver det faktiske domenet
  koden kjører i
- oppnår dette ved å snakke med brukerne og forretningseksperter gjennom hele
  prosjektet


---

### Når er et krav oppfylt?

Note: 
- Krav skal formuleres slik at de kan verifiseres, helst med en test
- Definition of done (handler ofte om mer tekniske aspekter også, som
  kodekvalitet)
- Jo mer presist, jo bedre, slik at det er lett å vite når man er ferdig
- Spesifisitet er viktig, ellers skapes det usikkerhet rundt når man er ferdig
  med en oppgave, og hva en oppgave faktisk innebærer


---

### Hva er mest viktig?

Note: 
- prioritering av krav er kritisk, og må gjøres kontinuerlig
- prioritering endrer seg
- velg de med høyest risiko først, altså: hva MÅ systemet kunne gjøre?
  Vanskeligst/mest virksomhetskritisk først



