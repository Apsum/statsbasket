package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class League {
    @JsonProperty("id")
    private Integer idLeague ;
    private String logo ;
    private String name ;

    public Integer getIdLeague() {
        return idLeague;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public void setIdLeague(Integer idLeague) {
        this.idLeague = idLeague;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setLogo(String logo) {
        this.logo = logo;
    }

}
