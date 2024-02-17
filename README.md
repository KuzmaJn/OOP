# oop
Vytvorte novú triedu s názvom Uloha1, ktorá obsahuje nasledovné pre-
menné a funkcie:
1. statickú premennú s názvom x typu int, ktorú inicializujte na hodnotu
100
2. statickú premennú s názvom y typu double, ktorú inicializujte na hod-
notu 2.0
3. statickú funkciu equation1
– so vstupmi int a a double b, ktorá vyráta a-b/(a+b) a vráti vý-
sledok ako double
4. statickú funkciu equation2
– so vstupmi int a a double b, ktorá vyráta a-b/a+b a vráti výsledok
ako double
5. statickú funkciu reportResult
– so vstupom res typu double, ktorá vypíše na konzolu hodnotu pre-
mennej res
6. funkciu main
V tele funkcie main vytvorte novú premennú result typu double. Zavolajte
funkciu equation1 a ako parametre nastavte premenné x a y. Výsledok priraďte
do premennej result. Zavolajte funkciu reportResult so vstupom result. Celý
postup zopakujte s funkciu equation2.
# Úlohy:
1. Skompilujte túto triedu cez konzolu a následne ju spustite.
2. Vytvorte a spustite JAR súbor, ktorý obsahuje triedu Uloha1 a v ktorom
je táto trieda nastavená ako vstupný bod aplikácie.
3. Vytvorte nový projekt v nejakom IDE (napr. IntelliJ IDEA), nahrajte tam
triedu Uloha1 a spustite cez IDE.
4. Vymažte kľúčové slovo static pri funkciách equation1, equation2 a re-
portResult. Upravte funkciu main, aby ste vedeli tieto funkcie zavolať
(treba vytvoriť inštanciu triedy Uloha1).