# Opgave: Bankrekening Synchronisatie

Je taak is om een eenvoudig programma te schrijven dat een bankrekening simuleert en waarbij meerdere threads geld kunnen storten en opnemen. Om ervoor te zorgen dat de bankrekening correct wordt bijgewerkt en om race conditions te voorkomen, moet je het `synchronized`-woord gebruiken.

## Specificaties

1. **Bankrekeningklasse (`BankAccount`)**:
   - Maak een klasse `BankAccount` met een saldo en methoden om geld te storten en op te nemen.
   - Gebruik het `synchronized`-woord om ervoor te zorgen dat de methoden `deposit` en `withdraw` thread-safe zijn en race conditions voorkomen.

2. **Threadklassen (`DepositThread` en `WithdrawThread`)**:
   - Maak twee threadklassen, `DepositThread` en `WithdrawThread`, die respectievelijk geld storten en opnemen van de bankrekening.
   - Elke thread voert meerdere stortingen of opnames uit, waarbij elk verzoek een willekeurig bedrag is tussen een bepaald minimum en maximum.

3. **Hoofdprogramma (`Main`)**:
   - Schrijf een hoofdprogramma dat een bankrekening maakt en meerdere instanties van `DepositThread` en `WithdrawThread` start.
   - Start de threads en laat ze tegelijkertijd werken om stortingen en opnames uit te voeren.
   - Zorg ervoor dat het programma wacht tot alle threads zijn voltooid voordat het afsluit.

## Randvoorwaarden

- Zorg ervoor dat je het `synchronized`-woord gebruikt op de juiste manier om de kritieke secties van de code te beschermen.
- Implementeer foutafhandeling om ervoor te zorgen dat de bankrekening niet in een inconsistente toestand wordt achtergelaten, bijvoorbeeld door te voorkomen dat er meer geld wordt opgenomen dan beschikbaar is.
- Gebruik Java's multithreading-API's om de threads te maken en te beheren.
- 