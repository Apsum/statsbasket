package model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Leagues {
    @JsonProperty("response")
    private List<League> leagues ;

    public List<League> getLeagues() {
        return leagues;
    }
//private List<T> response ;
}
