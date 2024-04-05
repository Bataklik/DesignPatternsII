package cui;

import Domain.Singleton;

public class Client {


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }

}