package lesson16WebsiteCode;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class HtmlGetter {


    public void getHtmlAndSaveAsFile(String url, String fileName) throws URISyntaxException, IOException, InterruptedException {
        createFile(fileName, getHtml(url));
    }

    private String getHtml(String url) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(url))
                .GET()
                .build();

        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return httpResponse.body();
    }

    private void createFile(String fileName, String html) throws IOException {
        Path path = Paths.get("src/main/java/lesson16WebsiteCode/"+fileName);
        Files.writeString(path, html, StandardOpenOption.CREATE);
    }


}
