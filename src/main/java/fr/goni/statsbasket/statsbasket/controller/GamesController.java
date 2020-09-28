package fr.goni.statsbasket.statsbasket.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Game;
import model.Games;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class GamesController {

    @GetMapping("/todaysgames")
    public Games getTodaysGames(){
        Games g1 = new Games();

        return g1;

    }

    @Autowired
    private ObjectMapper mapper;
    OkHttpClient Client = new OkHttpClient();

    @GetMapping("/games/team/{id}")
    public List<Game> getGamesFromteam(@PathVariable("id") String idTeam) throws IOException {

        HttpUrl url1 = new HttpUrl.Builder()
                .scheme("https")
                .host("api-basketball.p.rapidapi.com")
                .addPathSegment("games")
                .addQueryParameter("league", "12")
                .addQueryParameter("season", "2019-2020")
                .addQueryParameter("team", idTeam)
                .build();
        Request requete1 = new Request.Builder()
                .url(url1)
                .header("x-rapidapi-host", "api-basketball.p.rapidapi.com")
                .header("x-rapidapi-key", "3a586b092dmsh57a6c61dcaa955ap19ef2ajsn2655e4fd3202")
                .build();
        try{

            Response response = Client.newCall(requete1).execute();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Games g1 = mapper.readValue(response.body().byteStream(), Games.class);
            return g1.getGames();
        }
        catch (IOException e){
            System.out.println("Erreur réseau");
            e.printStackTrace();
            throw new IOException("Erreur réseau");
        }
    }

    @GetMapping("games/{id}")
    public Game getGame(@PathVariable("id") String idGame){
        Game g1 = new Game();
        return g1;
    }
}
