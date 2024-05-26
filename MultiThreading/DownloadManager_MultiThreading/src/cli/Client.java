package cli;

import domain.DownloadManager;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://example.com/file1.txt",
                "https://example.com/file2.txt",
                "https://example.com/file3.txt",
                "https://example.com/file4.txt",
                "https://example.com/file5.txt"

        );
        List<String> filenames = Arrays.asList(
                "file1.txt",
                "file2.txt",
                "file3.txt",
                "file4.txt",
                "file5.txt"
        );

        DownloadManager downloadManager = new DownloadManager(urls.size());
        for (int i = 0; i < urls.size(); i++) {
            downloadManager.addTask(urls.get(i), filenames.get(i));
        }

        downloadManager.downloadTasks();
    }

}