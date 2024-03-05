# Uloha3
Vytvorte novú triedu s názvom Uloha3, ktorá obsahuje nasledovné premenné a funkcie:
1. statickú metódu matrixMultiply
s návratovou hodnotou int[][] <br>
so vstupmi int[][] m1 a int[][] m2 <br>
metóda vráti maticu m3, ktorá vznikne vynásobením matíc m1 a m2. Ak tieto matice nie je možné vynásobiť, metóda vráti null. <br>

2. statickú metódu identicalColumns
s návratovou hodnotou boolean <br>
so vstupmi int[][] m, int c1 a int c2 <br>
metóda vráti true, ak platí, že stĺpec s indexom c1 v matici m je rovnaký ako stĺpec s indexom c2 v tejto matici; inak metóda vráti false <br>

3. statickú metódu onlyUpper s návratovou hodnotou String <br>
so vstupom String s <br>
metóda vráti reťazec, ktorý obsahuje všetky veľké písmená z reťazca s; napr. zo vstupu ”StuDenTi” vytvorí výstup ”SDT”. V metóde použite StringBuilder a zamyslite sa nad tým, prečo je v tomto prípade vhodnejší, než String! <br>

4. statickú metódu encryptCaesar s návratovou hodnotou String <br> so vstupmi String text a int k
metóda najprv konvertuje všetky znaky reťazca text na veľké a potom ho zašifruje tak, že každý znak posunie v abecede o k pozícií. Posúvajú sa iba znaky z rozsahu ”A-Z”, iné znaky (napr. medzery)
metóda vynechá. Napr. pre vstupy s=”abz AbC” a k=1 metóda vráti ”BCA BCD”. <br>
– poznámka: jednotlivé znaky (ktoré sú v rozsahu ”A-Z”) postupne

1. pretypujte na int, takto získate jeho číselnú ASCII hodnotu, toto číslo treba konvertovať do okruhu Z26 tak, že odrátate číselnú ASCII hodnotu písmena ”A”
2. po posune (prirátaní int k) výsledne číslo treba zmodulovať (kvôli okruhu Z26)
3. z okruhu Z26 treba číslo naspäť posunúť na správny (ASCII ) interval (čiže o ASCII hodnotu písmena "A"), číslo pretypujte na char

Postupne vo funkcii main pridajte kód:
1. Zavolajte matrixMultiply s parametrami m1 a m2. Vykonajte viacero volaní s rôznymi m1 a m2, aby ste vhodne otestovali funkcionalitu matrixMultiply.
2. Zavolajte funkciu identicalColumns s parametrami m a c1 a c2.
3. Zavolajte funkciu onlyUpper s parametrom s. Otestujte pre rôzne reťazce s.
4. Znova zavolajte funkciu onlyUpper, tentokrát ako jej parameter použite parameter z príkazového riadku (t.j. parameter, ktorý main dostane v poli args).
5. Zavolajte funkciu encryptCaesar s parametrom s a kľúčom k. Uložte si zašifrovanú správu do premennej a zamyslite sa nad tým, ako by ste ju mohli dešifrovať.