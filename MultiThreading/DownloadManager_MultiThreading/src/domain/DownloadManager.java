package domain;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DownloadManager {

    private BlockingQueue<DownloadTask> tasks;

    public DownloadManager(int size) {
        this.tasks = new ArrayBlockingQueue<>(size);
    }

    public void addTask(String url, String filename) {
        this.tasks.add(new DownloadTask(url,filename));
    }

    public void downloadTasks() {
        while (true) {
            try {
                DownloadTask task = tasks.take();
                Thread thread = new Thread(task);
                thread.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }


}