package cli;

import domain.Bestand;
import domain.Gebruiker;
import domain.ProxyBestand;

public class Client {


    public static void main(String[] args) throws InterruptedException {
        Gebruiker gebruiker1 = new Gebruiker("Alice", 1);
        Gebruiker gebruiker2 = new Gebruiker("Bob", 2);

        Bestand bestand1 = new ProxyBestand("secret.txt", gebruiker1, 2);
        Bestand bestand2 = new ProxyBestand("public.txt", gebruiker2, 1);

        bestand1.lees();  // Toegang geweigerd voor gebruiker: Alice
        bestand2.lees();  // Lezen van bestand: public.txt

    }

}