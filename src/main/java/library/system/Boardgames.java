package library.system;

public class Boardgames {
    //instance variable
    private String gamesTitle, gamesAges, gamesMinPlayers, gamesGenre, gamesOverview, gamesBarcode;
    private int gamesQuantity;

    //constructor
    public Boardgames(String gTitle, String gAges, String gMin, String gGenre, String gOverview,
                      String gBarcode, int gQuantity)
    {
        gamesTitle = gTitle;
        gamesAges = gAges;
        gamesMinPlayers = gMin;
        gamesGenre = gGenre;
        gamesOverview = gOverview;
        gamesBarcode = gBarcode;
        gamesQuantity = gQuantity;
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

    public String getGamesMinPlayers() {
        return gamesMinPlayers;
    }

    public void setGamesMinPlayers(String gamesMinPlayers) { this.gamesMinPlayers = gamesMinPlayers; }

    public String getGamesGenre() {
        return gamesGenre;
    }

    public void setGamesGenre(String gamesGenre) {
        this.gamesGenre = gamesGenre;
    }

    public String getGamesBarcode() {
        return gamesBarcode;
    }

    public void setGamesBarcode(String gamesBarcode) {
        this.gamesBarcode = gamesBarcode;
    }

    public String getGamesOverview() {
        return gamesOverview;
    }

    public void setGamesOverview(String gamesOverview) {
        this.gamesOverview = gamesOverview;
    }

    public int getGamesQuantity() { return gamesQuantity; }

    public void setGamesQuantity(int gamesQuantity) { this.gamesQuantity = gamesQuantity; }
}
