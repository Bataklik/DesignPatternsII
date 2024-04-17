package cui;

import domain.ImageViewer;
import domain.ImageViewerProxy;
import domain.RealImageViewer;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// Gebruik van RealImageViewer om een afbeelding te laden en weer te geven
		ImageViewer realImageViewer = new RealImageViewer("real_image.jpg");
		realImageViewer.displayImage();

		// Gebruik van ImageViewerProxy om een afbeelding te laden en weer te geven
		ImageViewer imageViewerProxy = new ImageViewerProxy("proxy_image.jpg");
		imageViewerProxy.displayImage();
	}

}