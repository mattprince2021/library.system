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

    public String getGamesAges() {
        return gamesAges;
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

    public String getGamesBarcode() {
        return gamesBarcode;
    }

    public String getGamesOverview() {
        return gamesOverview;
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
