package library.system;

public class Boardgames {
    //instance variable
    private String gamesTitle, gamesAges, gamesMaxPlayers, gamesMinPlayers, gamesGenre, gamesOverview, gamesBarcode;

    //constructor
    public Boardgames(String gTitle, String gAges, String gMax, String gMin, String gGenre, String gOverview,
                      String gBarcode)
    {
        gamesTitle = gTitle;
        gamesAges = gAges;
        gamesMaxPlayers = gMax;
        gamesMinPlayers = gMin;
        gamesGenre = gGenre;
        gamesOverview = gOverview;
        gamesBarcode = gBarcode;
    }

    //methods


    public String getGamesTitle() {
        return gamesTitle;
    }

    public void setGamesTitle(String gamesTitle) {
        this.gamesTitle = gamesTitle;
    }

    public String getGamesAges() {
        return gamesAges;
    }

    public void setGamesAges(String gamesAges) {
        this.gamesAges = gamesAges;
    }

    public String getGamesMaxPlayers() {
        return gamesMaxPlayers;
    }

    public String getGamesMinPlayers() {
        return gamesMinPlayers;
    }
    public String getGamesGenre() {
        return gamesGenre;
    }

    public void setGamesGenre(String gamesGenre) {
        this.gamesGenre = gamesGenre;
    }

    public String getGamesBarcode() {
        return gamesBarcode;
    }

    public String getGamesOverview() {
        return gamesOverview;
    }

    public void setGamesOverview(String gamesOverview) {
        this.gamesOverview = gamesOverview;
    }

    public String getGamesInformation()
    {
        String gamesInformation = gamesTitle + "; ";
        gamesInformation += gamesAges + "; From ";
        gamesInformation += gamesMinPlayers + " to ";
        gamesInformation += gamesMaxPlayers + "players; ";
        gamesInformation += gamesGenre + "; ";
        gamesInformation += gamesBarcode + "; ";
        gamesInformation += gamesOverview;
        return gamesInformation;
    }
}
