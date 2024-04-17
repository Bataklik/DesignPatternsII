package domain;

public class ImageViewerProxy implements ImageViewer {

    private RealImageViewer viewer;
    private String imageName;
    private boolean isLoaded = false;

    public ImageViewerProxy(String imageName) {
        this.imageName = imageName;
    }

    public void displayImage() throws InterruptedException {
        if (!isLoaded) {
            viewer = new RealImageViewer(imageName);
            isLoaded = true;
        }
        viewer.displayImage();
    }

}