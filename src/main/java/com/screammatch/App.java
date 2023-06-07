package com.screammatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.screammatch.Models.Episode;
import com.screammatch.Models.Movie;
import com.screammatch.Models.Season;
import com.screammatch.Models.TVShow;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        String search = "IT".replace(" ", "+");
        String apiKey = "25b60429";
        String url = "https://www.omdbapi.com/?t=" + search + "&apikey=" + apiKey;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        CompletableFuture<HttpResponse<String>> responseFuture = httpClient.sendAsync(request,
                HttpResponse.BodyHandlers.ofString());

        responseFuture.thenApply(response -> {
            int statusCode = response.statusCode();
            String responseBody = response.body();
            System.out.println("Status Code: " + statusCode);
            System.out.println("Response Body: " + responseBody);
            return responseBody;
        })
                .exceptionally(ex -> {
                    System.err.println("Request failed: " + ex);
                    return null;
                });

        responseFuture.join();
    }

    public void testCreateMovieAndTVShow() {
        List<Movie> movies = new ArrayList<Movie>();
        List<TVShow> tvShows = new ArrayList<TVShow>();
        for (int i = 0; i < 5; i++) {
            List<Season> seasons = new ArrayList<Season>();
            for (int j = 0; j < 5; j++) {
                List<Episode> episodes = new ArrayList<Episode>();
                for (int k = 0; k < 10; k++) {
                    episodes.add(new Episode("Episode " + k, 10));
                }

            }
            movies.add(i, new Movie("Filme" + i, 0, 0, 0, 0, "Diretor"));
            tvShows.add(i, new TVShow("TVShow " + i, 2020, 5.0, 10, seasons));
            System.out.println(movies.get(i).getName());
            System.out.println(tvShows.get(i).getName());
        }
    }

}
