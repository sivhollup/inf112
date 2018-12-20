---

## Versjonskontroll og git

---

### Verden uten versjonskontroll

Note: 

- må kopiere alle filer frem og tilbake
- må ha Internet
- må huske hvilken versjon som er den nyeste hele tiden

---

### Git? Yes, please

- Filer
- Endringer
- Hvem og når


Note:
- finnes flere enn git, men omtrent alle bruker git. 
- lagrer filene dine
- lagrer endringer
- legger til rette for å dele
- legger til rette for å håndtere konflikter i filer

---

### Versjonskontroll endrer arbeidshverdag

- Gruppering
- Eksperimentering

Note: 
- gruppere endringer som hører sammen. Enklere å se sammenhenger, feks om koden
  din får dårlig kvalitet, men også se hva som skal til for å gjøre en endring
- lettere å fjerne en endring hvis det viser seg at det var en dårlig ide
- ved å committe små steg er det lett å gå tilbake. Gjør at du trygt kan
  eksperimentere med kodeendringer. 
- større endringer i kodebasen kan gjøres tryggere, ved at den gjøres i små
  steg. Mindre endringer fører til mindre risiko ved hver endring.

---

### Git lokalt

Note: 
- lag et repository av en katalog du har lokalt: git init
- ls -la viser .git-katalog
- git status
- vim .gitignore (legg til .swp)
- git add . (legger til alle filer fra der du står og nedover)
- git commit -m "Ignorere .swp-filer"
- git log (commit-melding er kommet med, hash for commit vises)

---?image=https://git-scm.com/book/en/v2/images/areas.png&size=60%

Note:
- Staging: git registrerer endringer som skal legges til i repository
- staging er også kalt index
- Mellomsteg for å kun få med de rette tingene
- git add . legger til alt, men det går også an å legge til bare noen få linjer
  eller bare noen spesifikke filer
- Gir mulighet til å se over hvilke endringer som kommer inn (egen code review)
- commit lagrer endringene av filene (evt nye filer) i lokalt repository

---

### 6a1f07c3c5f23fd53bdba0d816b8b971f433a37a

Note: 
- id til commiten
- SHA1-hash
- beregnes basert på innhold i filer og kataloger. Uendret fil --> uendret hash
- hash er unik
- commit med samme hash på to maskiner: garanterer at filene er like, OG at alle
  forrige versjoner er like (historien er lik)
- detaljer om hvordan git lagrer data: https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell#ch03-git-branching

---?image=https://git-scm.com/book/en/v2/images/snapshots.png&size=60%

Note: 
- en commit er et snapshot av alle filene. Hvis en fil ikke er endret lagres kun
  en referanse til filen i den forrige commit-en
- stiplede linjer: referanser til tidligere versjon av en fil (fordi hash er lik
  som forrige)
- git er mer som et filsystem

---

### Flere commits

Note: 
- lag en fil, legg til, commit
- git log <-- viser antall commits, nyeste øverst
- Men ok: jeg vil samarbeide med noen! Evt bare ha tilgang til mine filer fra et
  annet sted. 

---

### Git != github

- Git: versjonskontroll
- Github: distribusjonskanal for git-repositories

Note: 
- git kan installeres lokalt, får eget, lokalt repository. 
- lokalt repository kan kobles mot sentralt repository, feks github. 
- gitlab er også brukt, men i mye mindre grad

---

### Del via github

Note: 
- https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
- Opprett githubkonto
- Create repository on github
- No README, no .gitignore, no nothing. Tomt repository
- kopier adresse (enten https eller ssh) til repository
- git remote <-- tom
- git remote add <adresse> (feks git remote add origin
  git@github.com:sivhollup/v19-test.git)
- git remote -v 
- git push -u origin master (-u setter upstream repository url, push dytter til
  en remote)
- sjekk at filene er kommet opp på github

---

### Begynn med github

Note:
- Opprett repository på github, gjerne med .gitignore og README
- klon repositoriet ned til din maskin
- da får du lokal kopi og upstream (sentralt githubrepo) er satt for deg
- sjekk med git remote
- Konvensjon: Der du har klonet fra er origin

---

### Jobbe i steg uten å forstyrre andre: branching

Note:
- git checkout -b <navn-på-branch> 
- git commit 
- git checkout master
- git merge <navn-på-branch>
- Ved endringer i master, merge master, evt rebase din branch på master mens du
  jobber. jo lenger du venter jo verre blir konfliktene. 
- Alternativ til merge: rebase. 

---

### Pull requests

Note: 
- Lag fork av prosjekt til din egen konto, du får da ditt eget prosjekt
- Klon ditt prosjekt ned til din maskin
- Lag en branch
- Gjør commits, push branch til ditt sentrale github-repository
- Gå til original-prosjektet og lag en pull request (PR)
- Noen må da merge denne inn 

--- 

### Best practices

Note: 
- rebase før du merger noe som helst
- kjør alltid testene etter rebase
- se alltid over kodeendringer før commit
- få noen til å se over koden med deg
- sørg for å gruppere commits slik at alle endringene henger sammen
- tidlig i prosjekt: kanskje trunk based (bare på master, evt med brancher på
  prosjektet)
- PR gir større mulighet for kontroll på endringer som blir merget inn, github
  tilbyr feks visuell oversikt over endringer
