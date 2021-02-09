### Fra brukerhistorie til implementasjon

Note:
- mer detaljering av problemet
- gå i dybden på noen brukerhistorier og gjøre dem om til noe som det går an å
  jobbe med


---

### En god brukerhistorie går gjennom hele stacken

Note:
- eksempel: "vise en spiller på brettet"
- Dette skal ikke handle kun om visning, men også om at spilleren eksisterer i
  systemet og modelleres som alt annet
- hvis du trenger noe i persistenslaget ditt for å få til å vise en spiller,
  skal dette realiseres
- noen ganger er det mulig å lage arbeidsoppgaver utfra akseptansekriterier,
  andre ganger vil ikke det være dekkende


---

### En brukerhistorie trenger akseptansekriterier

Note:
- Hva er et akseptansekriterie? 
- testbart punkt
- klart definert
- utformes gjerne på formen: "gitt x, så skjer y" eller tilsvarende
- kan forstås entydig
- brukerhistorie handler om behov, akseptansekriterie handler om å definere
  hvordan vi måler at vi når behovet (sånn sett nærmere et "krav")
- 1 eller flere
- når akseptansekriteriene er oppnådd, er vi ferdig med brukerhistorien


---

### Akseptansekriterier definerer skop

Note:
- Akseptansekriterier setter rammene for hva som skal med i brukerhistorien og
  ikke
- Akseptansekriterier definerer planlagt feilhåndtering
- Akseptansekriterier sørger for at alle forstår brukerhistorier på samme måte
  (fordi den blir konkretisert)
- Kan være med å lage estimater fordi det blir tydeligere hva som må realiseres
- Pass på at det ikke blir hverken isfjell eller tannpirkere
- Alle skal være enige om akseptansekriteriene
- mer lesestoff: https://www.altexsoft.com/blog/business/acceptance-criteria-purposes-formats-and-best-practices/


---

### Behaviour Driven Development (BDD)

Note:
- utviklingsmetodikk som sentrerer seg rundt akseptansekriterier (så viktige er
  de)
- beskrevet i boken
- eksempeldrevet utvikling
- finner avgrensninger og funksjonalitet i systemet vha konkrete eksempler
- Given, When, Then (Gitt, Når, Så)
- bruke dette når vi lager akseptansekriterier (som også kan bli konkrete,
  kjørbare tester om dere vil)
- verktøy for å ha samtaler om domenet
- capabilities tilsvarer ca epic, feature set
- rules tilsvarer ca krav, brukerhistorier (men ofte formulert som krav heller
  enn brukerhistorier)
- eksempler == scenarier tilsvarer ca akseptansekriterier, som kan tilsvare
  konkrete tester (manuelle eller automatiske)


---

### En brukerhistorie fører til konkrete arbeidsoppgaver

Note:
- arbeidsoppgaver som må utføres for å få kunne oppfylle
  akseptansekriteriene
- Visuelt design
- Interaksjonsdesign (Hvordan brukeren interagerer med systemet)
- Avklaringer teknisk eller funksjonelt
- Konkrete implementasjonsoppgaver i de ulike lagene av applikasjonen. Testkode
  er en del av implementasjonskoden
- Trenger du å utvide persistenslaget? 
- Trenger du ny forretningslogikk?
- Trenger du ny visningslogikk? 
- Trenger du nye konsepter/relasjoner?
- Trenger du nye steg i build/deploy-pipelinen for å realisere oppgaven?
- Trenger du utvidede tester utover de automatiske?


---

### Krav: vegger


Note:
- forretningsreglene for vegger: 
- vegg står mellom to ruter
- vegg kan ikke flyttes på
- vegg stopper robot-bevegelse
- vegg stopper laser
- når vi lager brukerhistorier for denne, hvem er rollen? Robot? Spiller?
- er det en eller flere brukerhistorier for vegger?
- OPPGAVE: forslag til brukerhistorier for vegger, 5 minutter
- hva er funksjonaliteten vi ønsker å få til?
- hvordan vil dere beskrive verdien som oppnås?
- få ned alle brukerhistoriene på delt skjerm
- fellesskap: få brukerhistorie til å gi mening (hva er en god brukerhistorie?)
- hva mener dere er bra med den/de brukerhistoriene vi nå har laget?


---

### Akseptansekriterier: vegger

Note:
- prøve oss på BDD-stil akseptansekriterier
- hva må være satt opp? Brett? Roboter? (Given, precond., arrange, input)
- hva er aksjonen (when, act)?
- hva skal resultatet bli (then, assert, output)?
- OPPGAVE: bruk 5-7 min på å lage forslag til akseptansekriterier for brukerhistorie for
  vegg
- samle akseptansekriterier for brukerhistoriene
- vurdere - er det konkret og tydelig? Forstår alle hvordan de skal modellere
  dette nå?


---

### Utfordre akseptansekriteriene

Note:
- Først og fremst: 
- kan du gi meg et eksempel? <-- gjør det konkret og håndfast
- kan du se for deg en annen kontekst for samme hendelse som gir et annet
  utfall? (kontekst-spørsmål -- context questioning)
- for å avsløre mer om forretningsreglene
- er det noe annet utfall av hendelsen som er viktig? (outcome questioning)
- for å avsløre sideeffekter og få dem med i then 
- hva med våre akseptansekriterier? Kan vi forbedre dem vha disse spørsmålene?


---

### Arbeidsoppgaver: vegger

Note:
- Hva trengs? UI, forretningslogikk. Nye klasser? Nye metoder?
- OPPGAVE: lag arbeidsoppgaver utfra akseptansekriteriene, 5 min
- samle arbeidsoppgaver for brukerhistorie/akseptansekriterier
- planlegg på felles: feks, hvordan skal klasse/objektdiagram se ut? bli enige
  om hvordan implementasjonen skal gjøres


---

#### UML: visualisering av struktur og flyt

Note: 
- UML -- unified modelling language
- visuelt språk for å vise flyt og relasjoner
- vanlige bruksområder: 
- flyt gjennom program
- oppgaverekkefølge
- interaksjonsdesign
- alle disse handler om oppførsel og modellering av oppførsel 
- relasjon mellom klasser/moduler (klassediagram)
- eksempler på objekter med verdier (objektdiagram)
- disse er strukturelle og beskriver sammenheng i kode
- https://tallyfy.com/uml-diagram/
- https://www.smartdraw.com/uml-diagram/


---

### Klassediagram

Note: 
- inneholder klassenavn
- lister viktige variabler/egenskaper ved klassen
- lister viktige metoder 
- som oftest vises ikke alt
- viser relasjon mellom to klasser vha linjer
- hva er en relasjon? "er en", "har en" 
- annotasjoner på linjene definerer hvilken type relasjon to klasser har
- Tegn opp: en til en, en til mange, arv, interface


---

### Objektdiagram

Note:
- representerer en tilstand på et gitt tidspunkt i applikasjonen
- viser klasser som er instansiert til konkrete objekter
- tegn inn hvilke verdier ulike felter i klassene har på det tidspunktet
- brukes ofte for å forklare endringer i tilstand på ulike tidspunkt
- viser relevante feltvariabler (de som er viktig for det man diskuterer)
- viser ikke metodesignaturer
- eksempel på tavlen: brett med ulike typer elementer


---

### Neste forelesning: refaktorering

