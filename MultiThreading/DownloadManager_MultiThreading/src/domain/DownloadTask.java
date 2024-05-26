package domain;

import java.security.SecureRandom;

public class DownloadTask implements Runnable {

    private String URL;
    private String filename;


    public DownloadTask(String url, String filename) {
        this.URL = url;
        this.filename = filename;
    }

    public void download() throws InterruptedException {
        System.out.println("Downloading " + URL + " in " + filename);
        Thread.sleep(new SecureRandom().nextInt(1000,10000));
        System.out.println("Downloading " + URL + " completed in " + filename);
    }

    @Override
    public void run() {
        try {
            download();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}