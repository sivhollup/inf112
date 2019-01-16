---

## Versjonskontroll og git

---

### Verden uten versjonskontroll

Note: 
- må kopiere alle filer frem og tilbake
- finnes kanskje bare en kopi, hva skjer hvis disken din ryker?
- må huske hvilken versjon som er den nyeste hele tiden hvis du skal dele
- hva hvis flere er med? enda vanskeligere å vite hva som er nyeste
- kan være lurt å ha sentralt sted alle kopierer fra, men trenger fortsatt en
  lur måte å spore endringer på: versjons-kontroll


---

### Versjonskontroll? Yes, please

Note:
- finnes flere verktøy enn git, men git er omtrent bransjestandard 
- lagrer filene dine
- lagrer endringer
- lagrer hva som har blitt endret, når det har blitt endret, og hvem som endret
  det
- legger til rette for å dele
- legger til rette for å spore endringer
- legger til rette for å håndtere konflikter i ulike versjoner av filene


---

### Versjonskontroll endrer arbeidshverdag

Note: 
- oversikt over endringer (hva og når)
- gjør det enklere å jobbe fra ulike enheter
- backup hvis du deler mellom ulike enheter
- gjør det enklere å samarbeide
- reduserer risiko
- øker trygghet
- to siste punktene er viktige, fordi:
- lettere å utforske når man er avslappet (utvikling er et kreativt yrke)
- lettere å holde oversikt på hva som skjer


---

### Gruppering av relaterte endringer

Note: 
- kan eksplisitt si "disse endringene hører sammen". Eks: endre prosentsats på
  lån i dokumentasjon: alle vet hvor i dokumentet akkurat det tallet befinner
  seg. Eks: endre forretningslogikk i kode over flere filer: alle vet at alle
  disse endringene er nødvendige for å endre funksjonalitet. Lignende endringer
  kan bruke tidligere commit som utgangspunkt
- bruker verktøy (enten grafisk eller kommandolinjebasert) for å visualisere
  endringene fra en versjon til neste
- enklere å diskutere konsekvenser av endring når den kan ses på i sin helhet
- å se sammenhenger i koden gir en pekepinn på kvalitet på kodebasen. Dersom en
  endring i funksjonalitet berører fryktelig mange filer: sykdomstegn på koden?
  Hjelper teamet å vurdere kodekvalitet
- hva hvis endringen viser seg å være uønsket? Siden alt er gruppert et sted (en
  commit), kan den lett fjernes igjen



---

### Kontrollerte eksperimenter

Note: 
- noen endringer er store. Stort er skummelt og det er lett å gå seg vill. 
- versjonskontroll lar deg utføre ett steg om gangen --> bedre kontroll
- ved å committe små steg er det lett å gå tilbake. 
- små endringer medfører liten risiko, fordi du vet nøyaktig hva du endrer og
  hvilken konsekvens det får
- hvis du ser at det går feil vei, kan du kaste kun koden som førte deg på
  villspor


---

### Git lokalt

Note: 
- installer git på maskinen
- lag et repository av en katalog du har lokalt: git init
- ls -la viser .git-katalog
- git status
- vim .gitignore (legg til .swp)
- git add . (legger til alle filer fra der du står og nedover)
- git commit -m "Ignorere .swp-filer"
- git log (commit-melding er kommet med, hash for commit vises)

---?image=https://git-scm.com/book/en/v2/images/areas.png&size=60%

Note:
- Oversikt over sentrale konsepter i git
- Working directory: katalogen du står i
- Repository: der git lagrer alle data
- Staging area: "virtuelt" område hvor git registrerer endringer som skal legges
  til i repository (også kalt index)
- Staging: Mellomsteg for å kun få med ønskede endringer. Git add legger til
  endringer/filer til staging area
- git add . legger til alt, men det går også an å legge til bare noen få linjer
  eller bare noen spesifikke filer
- Gir mulighet til å se over hvilke endringer som kommer inn (egen code review)
- commit lagrer endringene av filene (evt nye filer) i lokalt repository


---

#### 6a1f07c3c5f23fd53bdba0d816b8b971f433a37a

Note: 
- git log gir masse informasjon: hvem, når, id til commiten
- id til commiten er eh SHA1-hash
- beregnes basert på innhold i filer og kataloger.
- hash er unik
- Uendret fil --> uendret hash
- commit med samme hash på to maskiner: garanterer at filene er like, OG at alle
  forrige versjoner er like (historien er lik)
- detaljer om hvordan git lagrer data: https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell#ch03-git-branching


---

- git add
- git status
- git commit
- git log
- git init

---?image=https://git-scm.com/book/en/v2/images/snapshots.png&size=60%

Note: 
- Mer detaljer om versjoner på filer
- En rad: en fil
- En kolonne: en versjon av repositoriet (tidsakse)
- en commit er et snapshot av alle filene. 
- Hvis en fil er uendret lagres kun en referanse til filen i den forrige
  commit-en, feks endres ikke fil B før i 4. versjon
- stiplede linjer: referanser til tidligere versjon av en fil (fordi hash er lik
  som forrige)
- git er som et filsystem mhp referanser til ulike versjoner
- Men ok: jeg vil samarbeide med noen! Evt bare ha tilgang til mine filer fra et
  annet sted. 


---

### git clone

Note:
- For å bidra til et repository brukes git clone
- Lager katalog med samme navn som repository, legger inn .git (altså,
  repositoriet) i katalogen og sjekker ut alle filene i et nytt arbeidsområde
- Setter samtidig opp en remote som heter origin, som peker på der du sjekket ut
  repositoriet fra
- Hvis du har repository på en USB-pinne, kan du bruke den som origin (offline
  samarbeid feks)


--- 

git clone repositoryURL

Note: 
- kan gi sti til repository
- kan gi URL til repository


---?image=https://qph.fs.quoracdn.net/main-qimg-d151c0543baa145e6252c1ec95199963&size=65% 

Note: 
- endringer til og fra remote tilfører nytt lag
- git pull: drar ned endringer i repository fra et remote repository
- git push: dytter dine endringer (alle commits siden forrige pull) til remote
  repository
- Finnes mange skytjenester som tillater deling av git-repositories


---

### Git != github

Note: 
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
- Konvensjon: Der du har klonet fra er origin


---

### Trunk based commits

Note: 
- mange måter å bruke git og github på
- et repository har en hovedgren (branch): master
- et repository kan ha mange branches
- enkleste: commit direkte til trunk (altså master-branch)
- demo: git-kata


---?image=https://git-scm.com/book/en/v2/images/basic-merging-2.png&size=65%

@snap[north]
#### Branch, merge og rebase
@snapend

Note: 
- en branch er en peker til en commit (altså en versjon av repositoriet ditt)
- kan utvikle seg uavhengig av resten av repositoriet sine grener
- brukes for å gjøre uavhengig arbeid i en kort periode
- for å avslutte en branch og ta vare på innholdet, merges grenen inn i master
  (eller andre grener)
- merge: en ny commit lages ved å sette sammen tilstand i repositoriet du er og
  tilstanden på den siste commiten i grenen som merges inn
- git prøver å finne ut hva som er likt og ulikt mellom de ulike filene i de
  ulike grenene
- hvis det er tydelig hva som er forskjeller merger git automatisk
- hvis det er endringer der git ikke tydelig oppdager hva som bør være
  gjeldende, får du merge-konflikt
- ved konflikt: du må finne ut hva som skal være riktig, og fortsette merge
- https://www.atlassian.com/git/tutorials/using-branches/git-merge
- alternativ til merge: rebase
- rebase skriver om historien i repositoriet ditt slik at det ser ut som om dine
  endringer blir gjort etter de fra branchen du rebaser på. Da slipper du merge
- god kotyme: merge eller rebase master inn i branchen du holder på med ofte
- merge master inn som siste steg før du merger inn endringer i master (da
  slipper du konflikt på master-branch)
- bruk tid på merge konflikter. Små commits og rebase ofte reduserer sjansen for
  konflikter


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

### git remote

Note: 
- Peker på et repository på github, bitbucket, gitlab osv
- Kotyme: Der du har klonet fra heter origin
- en remote har et navn og en URL der repositoriet ligger
- du trenger to "varianter", en for fetch (henting) og en for push
- slik legger du til en remote (både fetch og pull)
- git remote add <navn> <url>
- hvis du har laget en fork bør du ha to remotes, origin er din fork på github,
  mens upstream er originalrepositoriet du ønsker å hente ned endringer fra


---

### PR, branching eller trunk?

Note:
- ulike arbeidsflyter har gode og dårlige sider
- trunk: veldig enkelt, men høy risiko
- trunk: gir mange commits
- trunk: alle endringer er synlige i master, kan være forvirrende
- trunk: fordel tidlig i prosjektet? Veldig kort feedbackloop
- branching: lar deg arbeide "i fred" på større features uten å ha
  ikke-fungerende funksjonalitet i master/prod. Kan jobbe rundt dette med
  feature toggling, men introduserer ekstra kompleksitet i koden
- branching: må passe på å merge/rebase ofte
- branching: må passe på å ikke ha lengelevende brancher
- PR: tidlig i prosjektet kan PR-måten å jobbe på være tungvint fordi
  feedback-loop blir lang (alle sitter og venter på endringer i oppsett)
- PR: kan skjule kompleksitet og detaljer i utvikling så master blir ryddig
- PR: gir ekstra mulighet til å reviewe større endringer i detalj
- PR: gir andre enn team-medlemmene (de som har skriverettigheter til
  repositoriet) mulighet til å bidra til åpne prosjekter
- PR: komplekst prosjektoppsett med hovedrepository og forks
- PR: må passe på å holde egen fork oppdatert med commits fra remote (Jeg henter
  alle commits fra upstream og rebaser på dem og dytter det til min fork på
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

### Neste: prosjektmetodikk
