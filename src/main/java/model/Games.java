package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Games {
    @JsonProperty("response")
    private List<Game> games ;

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }


}
