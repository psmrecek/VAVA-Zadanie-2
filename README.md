# VAVA-Zadanie-2 IT profesia

## Popis zadania

Vytvorte GUI aplikáciu – dashboard (interaktívna prehľadová obrazovka) pre
personálnu/headhuntingovú agentúru. Aplikácia bude obsahovať informácie o:

1. Špecialistoch (freelanceroch), ktoré agentúra prenajíma
2. Zamestnávateľoch/firmách
3. Pracovných miestach/ponukách

**Aplikácia bude evidovať tieto typy špecialistov** :

- Programátori, o ktorých bude uchovávať nasledujúce informácie
    o Cena za deň/človeko-deň (MD)
    o Dĺžka praxe
    o Najvyššie dosiahnuté vzdelanie
    o Zaradenie/typ (Java, C++, ABAP, VBA, Python, Ruby, iOS, Iné)
    o Certifikáty
- Bezpečnostní konzultanti a špecialisti
    o Cena za deň/človeko-deň (MD)
    o Dĺžka praxe
    o Najvyššie dosiahnuté vzdelanie
    o Certifikáty
    o Je/nie je audítor kybernetickej bezpečnosti NBU
- Administrátori
    o Cena za deň/človeko-deň (MD)
    o Dĺžka praxe
    o Najvyššie dosiahnuté vzdelanie
    o Zaradenie/typ (Aplikačný, Sieťový, SAP, Iné)
    o Certifikáty
    o Preferovaná platforma/systém

**O zamestnávateľoch** bude uchovávať informácie:

▪ Názov
▪ Oblasť podnikania
▪ Počet zamestnancov
▪ Logo

Každý prenájom je vytvorený (prenájmy nech sú tiež reprezentované objektmi):

▪ pre jedného zamestnávateľa (zo zoznamu zamestnávateľov)
▪ na jedného alebo viacero špecialistov (zo zoznamu špecialistov)

**Program** bude umožňovať:

1. Pridávanie vymenovaných typov špecialistov
2. Pridávanie zamestnávateľov
3. Vytvorenie záznamu o prenájme (možno prenajať len špecialistov, ktorí nie sú práve
    prenajatí)
4. Zrušenie záznamu o prenájme špecialistu

Aplikácia bude GUI, musí byť funkčná a ošetrená voči chybným vstupom. Dátové zložky
musia byť zapúzdrenie (všetky private). Využite objektovo orientované princípy a techniky
bez zbytočných duplicít kódu (DRY). Vhodne aplikujte Java kolekcie a ich algoritmy.

V prípade, že použijete súbory a zdrojové kódy z internetu je povinné uvádzať všetky použité
zdroje. Študent musí rozumieť každému riadku daného kódu a orientovať sa v ňom.

Ak nie je v zadaní niečo explicitne určené, môžete si zadanie doplniť a vymyslieť.

Myslite na príjemné používateľské rozhranie na jednej strane a na druhej na dobrý návrh
a štruktúru. Inšpirujte sa https://www.toptal.com/, https://www.titans.sk/sk/,
https://robime.it/pracovne-ponuky/

Všetky časti projektu (zdrojové kódy + JAR spustiteľné súbory aplikácie) sa odovzdávajú do
systému AIS.

## Riešenie
Projekt bol vypracovaný vo verzií JAVA 1.8_281 + Maven. GUI bolo vytvorené v Java Swing.
