package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Game {
    @JsonProperty("id")
    private  String idGames;
    private String status ;
    private String date;
    private Teams teamsHome ;
    private Teams teamsAway ;
    private String scoreHome;
    private String scoreAway;

    public String getIdGames() {
        return idGames;
    }

    public void setIdGames(String idGames) {
        this.idGames = idGames;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   public Teams getTeamsHome() {
        return teamsHome;
    }

    public void setTeamsHome(Teams teamsHome) {
        this.teamsHome = teamsHome;
    }

    public Teams getTeamsAway() {
        return teamsAway;
    }

    public void setTeamsAway(Teams teamsAway) {
        this.teamsAway = teamsAway;
    }

    public String getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(String scoreHome) {
        this.scoreHome = scoreHome;
    }

    public String getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(String scoreAway) {
        this.scoreAway = scoreAway;
    }
}

