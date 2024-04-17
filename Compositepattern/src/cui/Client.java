package cui;

import domain.ComponentType;
import domain.Folder;
import domain.File;


public class Client {
    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        Folder schoolFolder = new Folder("School");
        Folder asdFolder = new Folder("asd");
        File asdFile = new File(ComponentType.TEXT,"asdFile.txt");
        schoolFolder.addComponent(new File(ComponentType.TEXT,"test.txt"));
        schoolFolder.addComponent(new File(ComponentType.TEXT,"test2.txt"));
        schoolFolder.addComponent(new File(ComponentType.TEXT,"test3.txt"));
        schoolFolder.addComponent(new File(ComponentType.TEXT,"test4.txt"));
        asdFolder.addComponent(asdFile);
        schoolFolder.addComponent(asdFolder);
        schoolFolder.display();
    }
}