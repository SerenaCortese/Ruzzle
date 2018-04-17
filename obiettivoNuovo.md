# Obiettivo Nuovo
Generare matrici Ruzzle in cui la frequenza con cui compaiono le lettere sia pari a quella della lingua italiana.
## Procedura
* **Passo 1:** Calcolare la frequenza di apparizione di ciascuna lettera nella lingua italiana. _Approssimato:_ La frequenza nel dizionario letto da database.

A-->250 su 3500000 -->3% freq('A')

freq('B')

...

freq('Z')

* **Passo 2:** Estrarre una lettera casuale con probabilità pari alle frequenze

A=20%

B=10%

C=30%

D=5%

E=35%

metodo "roulette-wheel"

Generiamo un numero casuale(uniforme) tra 0 e 99: R (random)
Creo slot di ampiezza diversa secondo le frequenza cumulative e a seconda di dove cade la R avrò un risultato

0%---A---20%---B---30%---C---60%---D---65%---E---100%

-------------------^R