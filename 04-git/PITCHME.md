---

## Versjonskontroll 

Note: 
- resultat fra metodikk-forelesning-retro
- hva er versjonskontroll? 
- hvem har brukt versjonskontroll?
- hva bruker dere versjonskontroll til?
- versjonskontroll også i mange tjenester nå, feks google suite/ microsoft
  office, en del fildeletjenester har også en form for versjonering


---

### Verden uten versjonskontroll

Note: 
- må kopiere alle filer frem og tilbake
- finnes kanskje bare en kopi, hva skjer hvis disken din ryker?
- må huske hvilken versjon som er den nyeste hele tiden hvis du skal dele
- hva hvis flere er med? enda vanskeligere å vite hva som er nyeste
- kan være lurt å ha sentralt sted alle kopierer fra, men trenger fortsatt en
  lur måte å spore endringer på: versjons-kontroll
- versjonskontroll er omtrent en selvfølge for utviklere og IT-nære personer,
  men feks kunder, domeneeksperter vet gjerne ingenting


---

### Versjonskontroll? Yes, please

Note:
- finnes flere verktøy enn git, men git er omtrent bransjestandard 
- lagrer filene dine
- lagrer hva som har blitt endret, når det har blitt endret, og hvem som endret
  det
- legger til rette for å dele
- legger til rette for å spore endringer
- legger til rette for å håndtere konflikter i ulike versjoner av filene
- versjonskontroll endrer arbeidshverdagen din
- backup om du jobber alene, og trygghet om du jobber på ulike enheter
- legger til rette for samarbeid
- reduserer risiko og øker trygghet
- to siste punktene er viktige, fordi:
- lettere å utforske når man er avslappet (utvikling er et kreativt yrke)
- lettere å holde oversikt på hva som skjer


---

### Organisert historie

Note: 
- hvem har gjort hva, og når? 
- i hvilken rekkefølge er arbeid blitt gjort?


---

### Relaterte endringer grupperes

Note: 
- kan eksplisitt si "disse endringene hører sammen". Eks: endre prosentsats på
  lån i dokumentasjon: alle vet hvor i dokumentet akkurat det tallet befinner
  seg. Eks: endre forretningslogikk i kode over flere filer: alle vet at alle
  disse endringene er nødvendige for å endre funksjonalitet. Lignende endringer
  kan bruke tidligere commit som utgangspunkt
- bruker verktøy (enten grafisk eller kommandolinjebasert) for å visualisere
  endringene fra en versjon til neste
- enklere å diskutere konsekvenser av endring når alt samles på ett sted
- å se sammenhenger i koden gir en pekepinn på kvalitet på kodebasen. Dersom en
  endring i funksjonalitet berører fryktelig mange filer: sykdomstegn på koden?
  Hjelper teamet å vurdere kodekvalitet
- hva hvis endringen viser seg å være uønsket? Siden alt er gruppert et sted (en
  commit), kan den lett fjernes igjen (eks oppgradering av pakker som gikk galt)



---

### Eksperimenter kontrollert

Note: 
- noen endringer er store. Stort er skummelt og det er lett å gå seg vill. 
- hva er en stor endring? Kan måle i tid, kompleksitet i koden (feks hvor mange
  eksekveringsstier som påvirkes av en endring) eller antall linjer
- versjonskontroll lar deg utføre ett steg om gangen --> bedre kontroll
- arbeidsflyt: gjør en endring du har kontroll på, commit. Gjør en ny, liten
  endring, commit. 
- ved å committe små steg er det lett å gå tilbake. 
- små endringer medfører liten risiko, fordi du vet nøyaktig hva du endrer og
  hvilken konsekvens det får
- hvis du ser at det går feil vei, kan du kaste kun koden som førte deg på
  villspor. Hvis du ser at det går lenger tilbake, kast alle commits som har
  ført deg på feilspor (feks git revert).  


---

### Garantert samme versjon

Note:
- en commit av et prosjekt er garantert lik uansett hvor den er sjekket ut
- alle som bruker er repository er trygge på at de jobber på samme versjon
- alle er trygge på at delene de bidrar med tas med, kan verifisere med historie
  (OBS: det er mulig å skrive om historie)

---

### Git lokalt

Note: 
- vise dette live
- demoI
- installer git på maskinen
- lag et repository av en katalog du har lokalt: git init
- ls -la viser .git-katalog (.git/objects/ inneholder basis og alle endringer
  som binærfiler )
- git status (viser hvilke filer som ikke er lagt til i git, hvilke filer som er
  i git som er endret, og hva som er lagt til i staging. Samt hvilken branch du
  er på)
- vim .gitignore (legg til .swp, inneholder alt git ikke skal bry seg om)
- git add . (legger til alle filer fra der du står og nedover)
- git commit -m "Ignorere .swp-filer"
- git log (commit-melding er kommet med, hash for commit vises)


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/04-git/img/git_staging_area.png&size=60%

Note: 
- sentrale konsepter i git: working directory, staging area, repository
- working directory: konteksten du jobber i, lokalt på din maskin
- staging area: preview av en commit, også lokalt på din maskin
- repository: summen av alle filene og endringene


---

#### Working directory: arbeidskontekst

Note: 
- definisjon: en spesifikk kontekst, samt endringer som gjøres i den konteksten
- lag et repo lokalt --> working directory
- klon et repository til maskinen din: --> working directory
- working directory er en samling av endringer på toppen av en commit
- sjekk hvilken commit du er på med git log -1
- hvis du sjekker ut en annen commit eller branch, endres working directory
- DemoII: vis i nerdschool-repo all-about-testing
- endrer filene på disk
- på toppen av commit kommer dine endringer


---

#### Staging area: preview av commit

Note:
- git add legger til endringer du har gjort til staging area
- summen av alle endringer i staging area gir deg en ny commit (både id og
  innhold)
- virtuelt: finnes ikke fysisk representasjon av dette
- git lagrer endringene lagt til her i index-filen sin
- derfor kalles også å stage å legge til å index
- ombestemmer du deg kan du fjerne fra indexen og dermed la være å ta med
  spesifikke endringer
- brukes til å få oversikt over hva som skal med på en commit
- har du lagt til for mye? brukt git reset for å fjerne filer fra index-en


---

#### 6a1f07c3c5f23fd53bdba0d816b8b971f433a37a

Note: 
- git log gir masse informasjon: hvem, når, id til commiten
- id til commiten er en unik SHA1-hash
- Når fil legges til i index, beregnes en hash på denne filen som legges i
  objects-katalogen
- Uendret fil --> uendret hash, legges ikke til på index 
- hash beregnes også på snapshot: summen av alle endringer i staging area
- commit med samme hash på to maskiner: garanterer at filene er like, OG at alle
  forrige versjoner er like (historien er lik)
- detaljer om hvordan git lagrer data: https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell#ch03-git-branching
- også https://www.daolf.com/posts/git-series-part-1/


---

#### Repository: filene, endringene og historien

Note: 
- kan ligge lokalt eller sentralt
- ligger i .git i topp-katalogen din 
- repoet kan deles ved kloning


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/04-git/img/git_staging_area.png&size=60%

Note:
- Oversikt over sentrale konsepter i git
- Working directory: katalogen du står i, inneholder din lokale kopi av et
  spesifikt punkt i historien (altså den commiten du er på)
- Staging area: "virtuelt" område (lokalt) hvor git registrerer endringer som
  skal legges til i repository (også kalt index)
- Staging: Mellomsteg for å kun få med ønskede endringer. Git add legger til
  endringer/filer til staging area
- git add . legger til alt, men det går også an å legge til bare noen få linjer
  eller bare noen spesifikke filer
- Gir mulighet til å se over hvilke endringer som kommer inn (egen code review)
- summen av alle endringene i staging gir deg id-en til commiten
- commit lagrer endringene av filene (evt nye filer) i lokalt repository
- Repository: der git lagrer alle data, både filer og endringer som er gjort på
  filer
- gått gjennom hva git er og hva de mest sentrale begrepene er
- hva skal inn i versjonskontroll? 
- kildekode, dokumentasjon, figurer, oppsett/konfigurasjon om bygg/deploy/miljø,
  tester, testdata... 
- men ikke alt skal i versjonskontroll... 


---

### Genererte data skal ikke i versjonskontroll

Note:
- filer som kan genereres endres gjerne ofte
- filer som kan genereres trengs ikke i versjonskontroll siden de kan genereres
- prosjektfiler som genereres av IDE skal ikke i versjonskontroll, disse vil
  endre seg fra maskin og maskin og vil alltid være med.
- genererte filer som endrer seg skaper støy i prosjektet, gjemmer vekk de
  virkelige endringene
- kompilert kode (vil kunne endre seg fra maskin til maskin, kan genereres på
  ny maskin uansett)
- biblioteker og avhengigheter (skal lastes ned når prosjektet bygges)
- finnes det unntak? Kanskje på data generert som del av forskning, må vurderes
  (koster det feks et halvt år å generere på nytt? Kanskje verdt å legge inn)


---

### Hemmeligheter skal ikke i versjonskontroll

Note:
- hva regnes som hemmeligheter?
- private nøkler
- passord 
- konfigurasjon til produksjon: porter, adresser, IP-adresser? 
- mange repository er offentlig tilgjengelig, da får hvem som helst tilgang på
  dette
- ofte er et testoppsett tilgjengelig (merk at dette testmiljøet helst bør være
  beskyttet slik at ikke hvem som helst kan utnytte det)
- Hvordan virker git?


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/04-git/img/git_file_commits.png&size=60%

@snap[north]
### Versjonshistorikk
@snapend

Note: 
- Bilde av versjonshistorikk
- En rad: en fil
- En kolonne: en versjon av repositoriet (tidsakse)
- en commit er et snapshot av alle filene. 
- Hvis en fil er uendret lagres kun en referanse til filen i den forrige
  commit-en, feks endres ikke fil B før i 4. versjon
- stiplede linjer: referanser til tidligere versjon av en fil (fordi hash er lik
  som forrige)
- git er som et filsystem mhp referanser til ulike versjoner


---

- git add
- git status
- git commit
- git log
- git reset
- git init

Note: 
- Oppsummering av kommandoene vi har sett på til nå
- Men ok: jeg vil samarbeide med noen! Evt bare ha tilgang til mine filer fra et
  annet sted. 


---

### git clone

Note:
- For å dele et repository brukes git clone
- Lager katalog med samme navn som repository, legger inn .git (altså,
  repositoriet) i katalogen og sjekker ut alle filene i et nytt arbeidsområde
- laster automatisk inn siste versjon (HEAD) av det som er satt opp som
  hovedbranch, som oftest master
- Setter samtidig opp en remote som heter origin, som peker på der du sjekket ut
  repositoriet fra
- remote er bare et repository som ikke er det lokale
- et prosjekt kan ha flere remotes
- Hvis du har repository på en USB-pinne, kan du bruke den som origin (offline
  samarbeid feks)


--- 

git clone repositoryURL navn

Note: 
- kan gi sti til repository
- kan gi URL til repository
- vanligvis bruker vi git clone til å klone ned fra et repository som er
  tilgjengelig online, feks på github
- remote tilfører nytt lag, og vi trenger nye kommandoer for å dra ned endringer
  fra remote og for å dytte våre endringer til remote


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/04-git/img/git_local_remote.png&size=50%

Note: 
- working dir/staging/repo har vi allerede sett på
- for å interagere med remote repository finnes det egne kommandoer i git: pull
  og push
- git pull: drar ned endringer i lokalt repository (i din katalog) fra et remote
  repository
- git push: dytter dine endringer (alle commits siden forrige pull) fra ditt
  lokalte repository til remote repository
- Finnes mange skytjenester som tillater deling av git-repositories, det er her
  github kommer inn i bildet.


---

### Git != github

Note: 
- Oppgave: Hva er forskjell på git og github? 
- Git: versjonskontroll
- Github: distribusjonskanal for git-repositories
- git kan installeres lokalt, får eget, lokalt repository. 
- lokalt repository kan kobles mot sentralt repository, feks github. 
- gitlab, bitbucket andre varianter
- github: har git installert på sine servere, bygger mye god funksjonalitet på
  toppen
- når du legger et git-repository til på github lagrer de .git-katalogen for deg
  og lar deg skrive til og lese fra den, samt de du tillater å gjøre det samme


---

### Del repository via github

Note: 
- https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
- Opprett githubkonto
- Create repository on github
- No README, no .gitignore, no nothing. Tomt repository
- kopier adresse (enten https eller ssh) til repository
- git remote gir tom liste
- git remote add <adresse> <navn> (feks git remote add origin
  git@github.com:sivhollup/v19-test.git)
- git remote -v 
- git push -u origin master (-u setter upstream repository url, push dytter til
  en remote)
- sjekk at filene er kommet opp på github
- DemoIII


---

### git remote

Note: 
- Peker på et repository på github, bitbucket, gitlab osv
- Konvensjon: Der du har klonet fra heter origin
- en remote har et navn og en URL der repositoriet ligger
- du trenger to "varianter", en for fetch (henting) og en for push
- git remote add legger til begge 
- avhengig av strukturen trenger du kanskje flere remotes
- hvis du har laget en fork bør du ha to remotes, origin er din fork på github,
  mens upstream er originalrepositoriet du ønsker å hente ned endringer fra
- hva er en fork? En kopi av et repository på github som har en peker til det
  originale repositoriet (upstream). Opererer helt uavhengig av upstream-repo,
  men kan også både ta ned endringer fra upstream, og levere endringer *til*
  upstream-repo


---

### Klon repository fra github

Note:
- Opprett repository på github, gjerne med .gitignore og README
- klon repositoriet ned til din maskin
- git clone <url> <navn>
- hvis navn ikke er oppgitt får katalogen samme navn som repositoriet har på
  github
- da får du lokal kopi og upstream (sentralt githubrepo) er satt for deg
- sjekk med git remote
- nå skal vi se på ulike måter å bruke git på 


---

### Trunk based commits

Note: 
- mange måter å bruke git og github på
- et repository har en hovedgren (branch): master
- et repository kan ha mange branches
- enkleste: commit direkte til trunk (altså master-branch)
- Tegne på tavlen: trunk based commit linje
- DemoIV: git-kata (a-b)
- Min personlige favoritt


---

### Branching

Note: 
- det er veldig enkelt å jobbe trunk based, lite å holde styr på
- hva om du skal lage noe litt større som du vil isolere fra resten av
  prosjektet noen dager/uker?
- lag en branch
- en branch er en peker til en commit (altså en versjon av repositoriet ditt)
- kan utvikle seg uavhengig av resten av repositoriet sine grener
- brukes for å gjøre uavhengig arbeid i en kort periode
- hvordan lage en branch?
- git checkout -b <navn>
- kan gjøre commits på denne branchen, de lever separat fra master
- tegne på tavlen: branch som lever parallelt
- for å bytte mellom grener: git checkout <branchname>
- når du er klar for å ta den nye funksjonaliteten inn er det to måter å samle
  grenene på: merge og rebase
- DemoIV: git-kata (c-f)


---?image=https://raw.githubusercontent.com/sivhollup/inf112/master/04-git/img/git_merging_graph.png&size=65%

@snap[north]
#### Merge
@snapend

Note: 
- for å avslutte en branch og ta vare på innholdet, merges grenen inn i master
  (eller andre grener)
- merge: en ny commit lages ved å sette sammen tilstand i repositoriet du er og
  tilstanden på den siste commiten i grenen som merges inn
- kommando: i grenen du vil ha endringene INN i: git merge <branchname>
- git prøver å finne ut hva som er likt og ulikt mellom de ulike filene i de
  ulike grenene
- hvis det er tydelig hva som er forskjeller merger git automatisk
- hvis det er endringer der git ikke tydelig oppdager hva som bør være
  gjeldende, får du merge-konflikt
- ved konflikt: du må finne ut hva som skal være riktig, og fortsette merge
- https://www.atlassian.com/git/tutorials/using-branches/git-merge


---

### Rebase

Note:
- alternativ til merge
- rebase skriver om historien i repositoriet ditt slik at det ser ut som om dine
  endringer blir gjort etter de fra branchen du rebaser på. Da slipper du merge
- god kotyme: merge eller rebase master inn i branchen du holder på med ofte
- merge master inn som siste steg før du merger inn endringer i master (da
  slipper du konflikt på master-branch)
- bruk tid på merge konflikter. Små commits og rebase ofte reduserer sjansen for
  konflikter
- ulike team velger ulike fremgangsmåter
- tenk over hva som er lurt
- branching introduserer ofte feil fordi grenene divergerer. Behandle med
  forsiktighet. Lett å miste endringer og lett å miste oversikt. 
- git er et veldig nyttig virkemiddel, men det er mye rom for å skyte seg selv i
  foten
- vise merge-konflikt
- demoIV: g -> j 


---

### Pull request (PR)

Note: 
- en Pull Request (PR) en måte å samle endringer på. 
- pull request er IKKE git, men github-funksjonalitet. Bitbucket, gitlab osv har
  lignende funksjonalitet
- en pull request samler alle relevante endringer slik at de kan ses på som en
  helhet (feks en feature)
- ekstra lag med abstraksjon/mulighet for å gruppere endringer
- kan velge mellom å ta inn alle commits i en PR eller samle dem (squashe) til
  en. 
- kan lage en PR fra en branch du har commitet, eller fra en fork
- Demo V: lag branch og PR for fizzbuzz-delen


---

### Fork

Note: 
- du kan lage din egen versjon av et prosjekt, det kalles en fork
- en fork er ditt eget repository, men har alle commits fra upstream (kotyme for
  hva du kaller repositoriet som er basis for ditt)
- mange open source-prosjekter bruker dette, da kan utviklere som ikke er på
  teamet få bidra med kode selv om de ikke har skriverettigheter på prosjektet
- Kan også brukes av teammedlemmer i prosjektet, får ryddigere repository fordi
  det ikke ligger masse branches i hovedrepositoriet


---

### PR, branching eller trunk?

Note:
- ulike arbeidsflyter har gode og dårlige sider
- trunk: veldig enkelt
- trunk: alle endringer er synlige i master
- trunk: Veldig kort feedbackloop
- trunk: færre steder ting kan gå galt
- trunk: krever litt mer å jobbe parallelt (i hvor stor grad skal man jobbe
  parallelt?)
- branching: lar deg arbeide "i fred" på større features uten å ha
  ikke-fungerende funksjonalitet i master/prod. Kan jobbe rundt dette med
  feature toggling, men introduserer ekstra kompleksitet i koden
- branching: må passe på å merge/rebase ofte: god kotyme er å merge inn master i
  branchen din minst en gang for dagen (litt avhengig av aktivitet i master)
- branching: må passe på å ikke ha lengelevende brancher
- PR: tidlig i prosjektet kan PR-måten å jobbe på være tungvint fordi
  feedback-loop blir lang (alle sitter og venter på endringer i oppsett)
- PR: kan skjule kompleksitet og detaljer i utvikling så master blir ryddig
- PR: gir ekstra mulighet til å reviewe større endringer i detalj
- PR: gir andre enn team-medlemmene (de som har skriverettigheter til
  repositoriet) mulighet til å bidra til åpne prosjekter
- PR: komplekst prosjektoppsett med hovedrepository og forks
- PR: må passe på å holde egen fork oppdatert med commits fra remote (Jeg hentet
  alle commits fra upstream og rebaset på dem og dyttet det til min fork på
  github)


---

### Versjonskontroll er nyttig

Note: 
- versjonskontroll gjør at du kan jobbe med filer på ulike steder, gjerne sammen
  med andre, uten å bekymre deg for at du ikke har siste endringer
- garanterer samme tilstand på samme versjon 
- bruk av distribueringskanal som github gir deg backup og et nyttig sted å
  samarbeide mot
- små commits gir trygghet og gjør arbeidet lettere
- bruk branches, forks og pull requests med forsiktighet


---

### Neste: Krav
