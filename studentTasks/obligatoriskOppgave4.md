# Obligatorisk oppgave 4

## Deloppgave 1: Team og prosjekt

* Referat fra møter siden forrige leveranse skal legges ved. 
* Hvordan fungerer rollene i teamet? Trenger dere å oppdatere hvem som er teamlead eller kundekontakt?
* Er det noen erfaringer enten team-messig eller mtp prosjektmetodikk som er verdt å nevne? Synes teamet at de valgene dere har tatt er gode? Hvis ikke, hva kan dere gjøre annerledes for å forbedre måten teamet fungerer på?
* Gjør et retrospektiv hvor dere vurderer prosjektet har gått. Hva har dere gjort bra, hva hadde dere gjort annerledes hvis dere begynte på nytt? 
* Legg ved skjermdump av project board ved innlevering. Sørg for at det er oppdatert med siste status ved innlevering. 
* Hvordan fungerer gruppedynamikken og kommunikasjonen nå i forhold til i starten?


## Deloppgave 2: Krav

* Oppdater hvilke krav dere har prioritert, hvor langt dere har kommet og hva dere har gjort siden forrige gang. 
* For hvert krav dere jobber med, må dere lage 1) ordentlige brukerhistorier, 2) akseptansekriterier og 3) arbeidsoppgaver. Husk at akseptansekriterier ofte skrives mer eller mindre som tester
* Dersom dere har oppgaver som dere skal til å starte med, hvor dere har oversikt over både brukerhistorie, akseptansekriterier og arbeidsoppgaver, kan dere ta med disse i innleveringen også.
* Husk å skrive hvilke bugs som finnes i de kravene dere har utført (dersom det finnes bugs). 
* Kravlista er lang, men det er ikke nødvendig å levere på alle kravene hvis det ikke er realistisk. Det er viktigere at de oppgavene som er utført holder høy kvalitet. Utførte oppgaver skal være ferdige (spillbare).


## Deloppgave 3: Produktleveranse og kodekvalitet

* Dere må dokumentere hvordan prosjektet bygger, testes og kjøres, slik at det er lett for gruppelderne å bygge, teste og kjøre koden deres. Under vurdering kommer koden også til å brukertestes.
* Prosjektet skal kunne bygge, testes og kjøres på Linux, Windows og OSX.
* Lever klassediagram. (Hvis det er veldig mange klasser, lager dere for de viktigste.)
* Kodekvalitet og testdekning vektlegges. Merk at testene dere skriver skal brukes i produktet. Det kan være smart å skrive manuelle tester for å teste det som er grafisk. 
* Utførte oppgaver skal være ferdige.
* Hvis dere tester manuelt: lever beskrivelser av hvordan testen foregår, slik at gruppeleder kan utføre testen selv.
* Under vurdering vil det vektlegges at alle bidrar til kodebasen. Hvis det er stor forskjell i hvem som committer, må dere legge ved en kort forklaring for hvorfor det er sånn. Husk å committe alt. (Også designfiler)
* Prosjektpresentasjon teller ved denne leveransen (holdes etter dere har levert). Dere skal ha med demo av spillet, en beskrivelse av det viktigste dere har lært, ville dere gjort noe annerledes om dere hadde gjort det igjen, samt en liten vurdering av hvordan det ville vært å gjennomføre prosjektet med fysisk tilstedeværelse. 


## Vurderingskriterier og vekting

* Om teamet ønsker, kan all tekst leveres på engelsk.
* Vurderingskriterier ligger på Mitt.Uib

**Innleveringsfrist: fredag 23. april 2021, klokken 16.00**

For å få oppgaven godkjent, må gruppen:
* Skrive fornuftige Commit meldinger når endringer lastes opp i gruppens repo.
* Laste opp de etterspurte resultatene i repo.
* Laste opp leveransen til github i markdown-format.
* Leveransen skal lastes opp i egen mappe i repoet, som heter "Deliverables". Hver oblig blir da "ObligX.md" i den mappen. Eventuelle slides kan lastes inn opp til samme mappe.
* Tag en commit av kildekoden som er leveransen til hver oblig. Dette gjør det enklere for de som skal vurdere å gjøre det på riktig tidspunkt.

**I tillegg til koden, vil dere også vurderes på teamarbeidet gjennom semesteret.**

For å få oppdraget godkjent, må hvert lagmedlem:
* Møte og delta aktivt i minst 75% av ukentlige møter med deres TA og presentasjon av prosjektet til slutt.
* Utføre de tildelte oppgavene under og mellom disse ukentlige møtene, som avtalt i teamet.
* Rapportere tilbake til teamet om framdrift og/eller problemer som oppstår, som avtalt i teamet.

**Vektlegging:** Denne leveransen teller 12,5% av sluttkarakteren.

## Tips
* Husk å lese gjennom retteskjema for å få med alle punktene vi gir poeng for. 
* Mockito kan være et bra mock-rammeverk i tillegg til JUnit. Generelt sett er det også mulig å skrive manuelle tester. Husk at testene dere skriver skal brukes. (Som nevnt i deloppgave 3)
* Travis og Codacy kan være til god hjelp for å sjekke at koden bygger før dere pusher til master.
* Husk å kjøre programmet før dere lager en tag til levering slik at dere vet at det kjører. 

## Retteskjema

| Retteskjema for oblig 4   | Max   |
| --- | --- |
| **Team og prosjekt** | **20** |
| Møtereferat (hvem var med, når, hva ble bestemt osv) | 5 |
| Retrospektiv (skal inneholde beskrivelse av hva som var planlagt å bruke av metodikk, hva de faktisk bruker, og hvorfor) + forbedringspunkter fra retrospektiv  | 5 |
| Project board er oppdatert | 5 |
| Kommunikasjon (spesifisere kunnskapsoverføring og hvordan kunnskapsoverføring gjøres) | 5 |
| **Krav** | **15** |
| Brukerhistorier (også akseptansekriterier og arbeidsoppgaver) | 15 |
| **Produktleveranse** | **30** |
| Klassediagram | 5 |
| Koden sjekker ut, bygger og kjører og prosessen er dokumentert | 10 |
| Kompletthet av implementerte krav | 15 |
| **Kodekvalitet** | **45** |
| Navngivning | 5 |
| Testkvalitet | 5 |
| Kodekvalitet | 5 |
| Abstraksjon (SRP) | 5 |
| Kommentarer | 5 |
| Hvor stor andel av koden brukes i praksis: (trekk hvis de har mye kode som ikke brukes) | 5 |
| Testdekning (både automatiske og manuelle tester) | 15 |
| **Git** | **10** |
| Commits er ryddige, leveransen er tagget riktig, og levert i riktig format. Commit meldinger er meningsfulle | 5 |
| Jevn fordeling av commits blant teammedlemmer | 5 |
| **Presentasjon** | **5** |
| Skal inneholde demo av spillet, en beskrivelse av det viktigste dere har lært, ville dere gjort noe annerledes om dere hadde gjort det igjen, samt en liten vurdering av hvordan det ville vært å gjennomføre prosjektet med fysisk tilstedeværelse.  | 5 |
| **Totalt antall poeng** | **125** |