## Uloha 2

Vytvorte novú triedu s názvom Uloha2, ktorá obsahuje nasledovné premenné a funkcie 

1. static final premennú s názvom CAPACITY typu int, ktorú inicializujte na hodnotu 10
2. funkciu printArrays
– bez návratovej hodnoty<br>
– aso vstupmi int[] n a String[] s, ktorá pomocou funkcie Arrays.toString() vypíše na konzolu obsah n a obsah s <br>
3. funkciu initArrays
– bez návratovej hodnoty<br>
– so vstupmi int[] n a String[] s, ktorá vo for cykle zmení hodnotu n[i] na i+1 a hodnotu s[i] na "*"<br>
4. funkciu changeOdd
– bez návratovej hodnoty<br>
– so vstupmi int[] n a String[] s, ktorá vo for cykle postupne prejde prvky v n a v prípade, že je hodnota n[i] nepárna a zároveň je väčšia ako 5, zmení sa hodnota reťazca s[i] na ”odd”<br>
5. funkciu changeEven
– bez návratovej hodnoty<br>
– so vstupmi int[] n a String[] s, ktorá vo for cykle postupne prejde prvky v n a v prípade, že je hodnota n[i] párna a zároveň je menšia ako 5, zmení sa hodnota reťazca s[i] na ”even’<br>
6. funkciu sum
– s návratovou hodnotou typu int<br>
– so vstupmi String[] in a StringBuilder out, ktorá vo for cykle postupne prejde prvky pola in a v prípade, že je hodnota in[i] je<br>
(a) ”odd”, tak pridá hodnotu 1 do výstupu a pridá reťazec ”+1” do out<br>
(b) ”even”, tak pridá hodnotu 2 do výstupu a pridá reťazec ”+2” do out<br>
(c) v inom prípade odráta hodnotu 1 do výstupu a pridá reťazec ”-1” do out<br>
– Vytvorte funkciu main v ktorej vytvorte pole typu int s názvom numbers s veľkosťou CAPACITY a pole typu String s názvom strings s veľkosťou CAPACITY.<br>

Postupne vo funkcii main pridajte kód


1. Zavolajte funkciu printArrays s parametrami numbers a strings.
2. Zavolajte funkciu initArrays s parametrami numbers a strings a ešte raz zavolajete funkciu printArrays s parametrami numbers a strings.
3. Zavolajte funkcie changeOdd, changeEven a printArrays s parametrami numbers a strings.
4. Vytvorte novú premennú sb - inštanciu typu StringBuilder. Zavolajte funkciu sum, s parametrami strings a sb. Vypíšte do konzoly návratovú hodnotu funkcie a obsah premennej sb.
