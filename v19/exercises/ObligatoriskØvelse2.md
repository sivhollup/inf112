# Obligatorisk Øvelse 2: Robo Rally

Dette semesterets programmeringsprosjekt er å lage en digital versjon av RoboRally. I RoboRally plasseres en serie flagg ut på spillebrettet, og så er det spillernes oppgave å navigere brettet for å komme til alle flaggene raskest mulig. Selve navigeringen gjøres ved å legge programkortene hver spiller får utdelt i ønsket sekvens, "kompilere" sekvensen og la robotene rundevis utføre instruksjonssettet.

Regelboken finner du [her](https://www.wizards.com/avalonhill/rules/roborally.pdf).

Spillet skal skrives i Java, med spillmotoren [LibGdx](https://libgdx.badlogicgames.com/). For testing skal JUnit brukes.

Dere står fritt til å velge mellom maven og gradle som build system. Det er vedlagt et skjelettprosjekt med libgdx, JUnit og maven, som kan brukes. Dette er helt frivillig, og dere kan også sette opp prosjektet selv.

## Deloppgave 1: Organiser teamet 

Gruppen trenger:  

* Et navn til gruppen.
* En teamlead, som sørger for å følge opp oppgaver og prosjektboard.
* En kundekontakt, som blir gruppens hovedekspertise på domenet.
 
Kartlegg også hvilken kompetanse de ulike medlemmene i gruppen har, og skriv en kort oppsummering.

Dere må finne ut hvilke tekniske verktøy dere vil bruke. En mulighet er å bruke et github project board eller trello. Dette må settes opp, og det er viktig at alle i gruppen vet hvordan de bruker verktøyene dere velger.

## Deloppgave 2 - Få oversikt over forventet produkt

Dette semesterets programmeringsprosjekt er å lage en digital versjon av roborally. Denne versjonen skal inkludere de fleste av roborallys funksjoner som prossesskort, mekanismer på spillbrettet mulighet for å spille flere sammen.

Dere skal lage en spesifikasjonen som skal inneholde:

* En kort beskrivelse av det overordnede målet for applikasjonen.
* En liste over krav til systemet basert på høynivåkravene gjennomgått i forelesning.
* En prioritert liste over hvilke krav dere vil ha med i første iterasjon (altså frem til levering av denne obligen).

## Deloppgave 3 - Velg og tilpass en prosess for laget

Dere må finne ut om dere vil følge en bestemt prosjektmetodikk (XP, Scrum, Kanban), evt hvilke elementer fra ulike prosjektmetodikker (parprogrammering, testing osv) dere vil ha med.

Diskuter i teamet hvilke metoder som hjelper teamet med å utvikle fungerende og veldokumentert programvare under programmeringsprosjektet. Diskuter også hvilke tilpassninger som trenges for å fungere godt i et slikt studentprosjekt. Involver gjerne TA i diskusjonen om mulige problemer.

Vurder viktige aspekter ved prosessen, for eksempel (ikke uttømmende liste), hvordan organisere møter, definisjon og tildeling av oppgaver, oppfølging av arbeid,
hvilke programvareutviklingsaktiviteter som trengs (og når),hvilke prosjekteringsaktiviteter som trengs (og når). Skriv en kort beskrivelse av prosessen i prosess- og prosjektplanen.

Diskuter i teamet hvordan der skal organisere dere under prosjektet. Noen viktige eleementer:

* Møter, og hyppighet av dem
* Kommunikasjon mellom møter
* Arbeidsfordeling
* Oppfølging av arbeid.  
* Deling og oppbevaring av felles dokumenter, diagram og kodebase.
  
Skriv en kort beskrivelse av hvordan teamet ditt planlegger å organisere programmeringsprosjektet den første tiden.

## Deloppgave 4 -kode

Innen fristen for denne oppgaven skal en liten del av denne leveransen være kode.

Et par gode "første steg" er å vise et todimensjonelt spillbrett, og plassere en brikke på brettet.

Hovedvekten av vurderingen på sluttproduktet ligger på spillmekanikken, så det er ok å bruke [Open Game Art](https://opengameart.org/) for grafikk. Hvis gruppen har tid mot slutten, er det opp til dere om dere ønsker å bruke dette, eller om dere vil produsere noe selv.

## Oppsummering

Utfør et kort prosjekt-retrospektiv og diskuter hva som gikk bra, det som ikke fungerte helt som forventet, hva (om noe) som ikke virket i det hele tatt, og eventuelle nye aktiviteter
eller verktøy som teamet vil prøve ut i løpet av neste øvelse (oblig 3). Diskuter hvorfor ting fungerte eller ikke fungerte. Skriv opp en kort oppsummering av diskusjonen, og last
opp til team repo-et.

På slutten av denne obligen kan dere gjøre en liten vurdering av hvor bra dere traff. Dette kan de bruke til å justere hvor mange oppgaver dere tenker å få inn i neste iterasjon, som da leveres med oblig 3.

## Presentasjon

Forebered en kort presentasjon, maks. 10 minutter, av hovedresultatene, utfordringene og løsningene som ble funnet under denne øvelsen. Ta med et sammendrag av retrospektiv-møtet
og eventuelle endringer som er planlagt for første iterasjon av programmeringsprosjektet.
Last opp lysbildene som skal brukes til presentasjonen i lagets repo, før innleveringsfristen.

## Vurderingskriterier og vekting

for å få oppgaven godkjent, må gruppen:

* Opprette en repo-struktur som beskrevet i oppgave 1.
* Skrive fornuftige Commit meldinger når endringer lastes opp i gruppens repo.
* Laste opp de etterspurte resultatene i repo.
* Laste opp leveransen til github i markdown-format.
* Leveransen skal lastes opp i egen mappe i repoet, som heter "Deliverables". Hver oblig blir da "ObligX.md" i den mappen. Eventuelle slides kan lastes inn opp til samme mappe.
* Tag en commit av kildekoden som er leveransen til hver oblig. Dette gjør det enklere for de som skal vurdere å gjøre det på riktig tidspunkt.

For å få oppdraget godkjent, må hvert lagmedlem:

* Møte og delta aktivt i minst 75% av ukentlige møter med deres TA og oblig.2 presentasjonen. 
* Utføre de tildelte oppgavene under og mellom disse ukentlige møtene, som avtalt i teamet.
* Rapportere tilbake til teamet om framdrift og/eller problemer som oppstår, som avtalt i teamet.

**Vektlegging:** Denne leveransen teller 12,5% av sluttkarakteren.
