package library.system;

import javax.persistence.*;
@Entity
public class Games {
    //instance variable
    private int gamesID;
    private String gamesTitle;
    private String gamesAges;
    private String gamesMinPlayers;
    private String gamesGenre;
    private String gamesOverview;
    private String gamesBarcode;
    private int gamesQuantity;

    //methods
    @Id
    public int getGamesID(){return gamesID;}
    public void setGamesID(int newGamesID) {gamesID = newGamesID;}
    public String getGamesOverview() {
        return gamesOverview;
    }
    public void setGamesOverview(String newGamesOverview) {
        gamesOverview = newGamesOverview;
    }
    public String getGamesTitle() {
        return gamesTitle;
    }
    public void setGamesTitle(String newGamesTitle) {
        gamesTitle = newGamesTitle;
    }
    public String getGamesAges() {
        return gamesAges;
    }
    public void setGamesAges(String newGamesAges) {
        gamesAges = newGamesAges;
    }
    public String getGamesMinPlayers() {
        return gamesMinPlayers;
    }
    public void setGamesMinPlayers(String newGamesMinPlayers) { gamesMinPlayers = newGamesMinPlayers; }
    public String getGamesGenre() {
        return gamesGenre;
    }
    public void setGamesGenre(String newGamesGenre) {
        gamesGenre = newGamesGenre;
    }
    public String getGamesBarcode() {
        return gamesBarcode;
    }
    public void setGamesBarcode(String newGamesBarcode) {gamesBarcode = newGamesBarcode;}
    public int getGamesQuantity() { return gamesQuantity; }
    public void setGamesQuantity(int newGamesQuantity) { gamesQuantity = newGamesQuantity; }
}
