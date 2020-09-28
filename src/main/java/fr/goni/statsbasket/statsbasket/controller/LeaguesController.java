package fr.goni.statsbasket.statsbasket.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Leagues;
import model.League;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;

@RestController
public class LeaguesController {

    @Autowired
    private ObjectMapper mapper;
    OkHttpClient Client = new OkHttpClient();

    @GetMapping("/leagues/{name}")
    public List<League> getLeaguesByName(@PathVariable("name") String nameLeague) throws IOException {

        HttpUrl url1 = new HttpUrl.Builder()
                .scheme("https")
                .host("api-basketball.p.rapidapi.com")
                .addPathSegment("leagues")
                .addQueryParameter("search", nameLeague)
                .addQueryParameter("season", "2019-2020")
                .build();
        System.out.println(url1);
        Request requete1 = new Request.Builder()
                .url(url1)
                .header("x-rapidapi-host", "api-basketball.p.rapidapi.com")
                .header("x-rapidapi-key", "3a586b092dmsh57a6c61dcaa955ap19ef2ajsn2655e4fd3202")
                .build();
        try{

            Response response = Client.newCall(requete1).execute();
            Leagues league1 = mapper.readValue(response.body().byteStream(), Leagues.class);
            return league1.getLeagues();
        }
        catch (IOException e){
            System.out.println("Erreur réseau");
            e.printStackTrace();
            throw new IOException("Erreur réseau");
        }



    }
}
