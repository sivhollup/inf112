# Obligatorisk oppgave 2

## Deloppgave 1: Prosjekt og prosjektstruktur

* Hvordan fungerer rollene i teamet? Trenger dere å oppdatere hvem som er teamlead eller kundekontakt?
* Trenger dere andre roller? Skriv ned noen linjer om hva de ulike rollene faktisk innebærer for dere.
* Er det noen erfaringer enten team-messig eller mtp prosjektmetodikk som er verdt å nevne? Synes teamet
at de valgene dere har tatt er gode? Hvis ikke, hva kan dere gjøre annerledes for å forbedre måten teamet
fungerer på?
* Hvordan er gruppedynamikken?
* Hvordan fungerer kommunikasjonen for dere?
* Gjør et kort retrospektiv hvor dere vurderer hva dere har klart til nå, og hva som kan forbedres. Dette skal
handle om prosjektstruktur, ikke kode. Dere kan selvsagt diskutere kode, men dette handler ikke om
feilretting, men om hvordan man jobber og kommuniserer.
* Under vurdering vil det vektlegges at alle bidrar til kodebasen. Hvis det er stor forskjell i hvem som
committer, må dere legge ved en kort forklaring for hvorfor det er sånn. Husk å committe alt. (Også
designfiler)
* Referat fra møter siden forrige leveranse skal legges ved.
* Bli enige om maks tre forbedringspunkter fra retrospektivet, som skal følges opp under neste sprint.


## Deloppgave 2: krav

* For hvert krav dere jobber med, må dere lage 1) ordentlige brukerhistorier, 2) akseptansekriterier og 3) arbeidsoppgaver. Husk at akseptansekriterier ofte skrives mer eller mindre som tester
* Dersom dere har oppgaver som dere skal til å starte med, hvor dere har oversikt over både brukerhistorie, akseptansekriterier og arbeidsoppgaver, kan dere ta med disse i innleveringen også.
* Forklar kort hvordan dere har prioritert oppgavene fremover
* Har dere gjort justeringer på kravene som er med i MVP? Forklar i så fall hvorfor. Hvis det er gjort endringer i rekkefølge utfra hva som er gitt fra kunde, hvorfor er dette gjort?
* Oppdater hvilke krav dere har prioritert, hvor langt dere har kommet og hva dere har gjort siden forrige
gang. 
* Husk å skrive hvilke bugs som finnes i de kravene dere har utført (dersom det finnes bugs). 
* Kravlista er lang, men det er ikke nødvendig å levere på alle kravene hvis det ikke er realistisk. Det er
viktigere at de oppgavene som er utført holder høy kvalitet. Utførte oppgaver skal være ferdige.


## Deloppgave 3: kode

* Dere må dokumentere hvordan prosjektet bygger, testes og kjøres, slik at det er lett for gruppelederne å bygge, teste og kjøre koden deres. Under vurdering kommer koden også til å brukertestes.
* Prosjektet skal kunne bygge, testes og kjøres på Linux, Windows og OSX.
* Lever klassediagram. (Hvis det er veldig mange klasser, lager dere for de viktigste.) Det er ikke nødvendig å ta med alle metoder og feltvariabler med mindre dere anser dem som viktige for helheten. 
* Kodekvalitet og testdekning vektlegges. Dersom dere ikke har automatiske tester for GUI-et, lager dere manuelle tester som gruppelederne kan kjøre basert på akseptansekriteriene. 
* Automatiske tester skal dekke forretningslogikken i systemet (unit-tester). 
* Utførte oppgaver skal være ferdige.


## Vurderingskriterier og vekting

* I denne leveransen blir det ingen presentasjon.
* Om teamet ønsker, kan all tekst leveres på engelsk.
* Vurderingskriterier ligger på Mitt.Uib

**Innleveringsfrist: 05. mars 2021, klokken 16.00**

For å få oppgaven godkjent, må gruppen:
* Skrive fornuftige Commit meldinger når endringer lastes opp i gruppens repo.
* Laste opp de etterspurte resultatene i repo.
* Laste opp leveransen til github i markdown-format.
* Leveransen skal lastes opp i egen mappe i repoet, som heter "Deliverables". Hver oblig blir da "ObligX.md"
i den mappen. Eventuelle slides kan lastes inn opp til samme mappe.
* Tag en commit av kildekoden som er leveransen til hver oblig. Dette gjør det enklere for de som skal vurdere å gjøre det på riktig tidspunkt.

**I tillegg til koden, vil dere også vurderes på teamarbeidet gjennom semesteret.**

For å få oppdraget godkjent, må hvert lagmedlem:
* Møte og delta aktivt i minst 75% av ukentlige møter med deres TA og oblig.2 presentasjonen.
* Utføre de tildelte oppgavene under og mellom disse ukentlige møtene, som avtalt i teamet.
* Rapportere tilbake til teamet om framdrift og/eller problemer som oppstår, som avtalt i teamet.

**Vektlegging:** Denne leveransen teller 12,5% av sluttkarakteren.

## Tips
* Husk å lese gjennom retteskjema for å få med alle punktene vi gir poeng for. 
* Mockito kan være et bra mock-rammeverk i tillegg til JUnit. Generelt sett er det også mulig å skrive manuelle
tester. Husk at testene dere skriver skal brukes. (Som nevnt i deloppgave 3)
* Travis og Codacy kan være til god hjelp for å sjekke at koden bygger før dere pusher til master.
* Husk å kjøre programmet før dere lager en tag til levering slik at dere vet at det kjører. 
