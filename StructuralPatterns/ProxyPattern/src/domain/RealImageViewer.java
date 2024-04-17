package domain;

public class RealImageViewer implements ImageViewer {

    String imageName;


    public RealImageViewer(String imageName) {
        this.imageName = imageName;
    }

    public void displayImage() throws InterruptedException {
        System.out.println("Afbeelding '" + imageName + "' wordt geladen...");
        Thread.sleep(2000);
        System.out.println("Afbeelding '" + imageName + "' wordt weergegeven.");
    }

}