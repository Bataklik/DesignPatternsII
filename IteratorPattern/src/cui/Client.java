package cui;

import domain.IProfileIterator;
import domain.Profile;
import domain.SocialIterable;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        SocialIterable socialCollection = new SocialIterable();

        // Add some dummy profiles
        socialCollection.addProfile(new Profile("Alice", "Smith", LocalDate.of(1990, 1, 1)));
        socialCollection.addProfile(new Profile("Bob", "Johnson", LocalDate.of(1985, 5, 12)));
        socialCollection.addProfile(new Profile("Charlie", "Williams", LocalDate.of(2000, 8, 21)));

        System.out.println("Social Profiles:");
        IProfileIterator iterator = socialCollection
                .createProfileIterator();

        while (iterator.hasNext()) {
            Profile profile = iterator.next();
            System.out.println("  - " + profile.getFirstname() + " " + profile.getLastname() + " (born: " + profile.getBirthdate() + ")");
        }
    }
}
