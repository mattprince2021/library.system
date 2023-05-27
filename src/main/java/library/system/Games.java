package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class models a Game held in the Library. A game has a unique library ID, unique barcode, title, age rating,
 * minimum number of players, genre, overview and quantity.
 *
 * @author matthewprince
 * @version 1.0
 */

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

    /**
     * @param gID unique ID of the game in teh library
     * @param gQuantity the total volume of copies
     * @param gTitle title of the game
     * @param gAges the manufacturers recommended minimum age for players
     * @param gMinPlayers the manufacturers recommended minimum number of players
     * @param gGenre the genre of the game
     * @param gOverview a brief synopsis of the game
     * @param gBarcode the barcode of the game
     */
    //methods
    public Games(int gID, int gQuantity, String gTitle, String gAges, String gMinPlayers, String gGenre,
                 String gOverview, String gBarcode) {
        gamesID = gID;
        gamesTitle = gTitle;
        gamesAges = gAges;
        gamesMinPlayers = gMinPlayers;
        gamesGenre = gGenre;
        gamesOverview = gOverview;
        gamesBarcode = gBarcode;
        gamesQuantity = gQuantity;
    }

    public Games() {

    }

    /**
     * Gets the ID of the Game
     *
     * @return the ID of the Game
     */
    @Id
    public int getGamesID() {
        return gamesID;
    }
    /**
     * Setting the Game ID is controlled by the controller, this increments the most recent Game ID by 1
     */
    public void setGamesID(int newGamesID) {
        gamesID = newGamesID;
    }
    /**
     * Gets the Overview of the Game
     *
     * @return the Overview of the Game
     */
    public String getGamesOverview() {
        return gamesOverview;
    }

    public void setGamesOverview(String newGamesOverview) {
        gamesOverview = newGamesOverview;
    }
    /**
     * Gets the Title of the Game
     *
     * @return the Title of the Game
     */
    public String getGamesTitle() {
        return gamesTitle;
    }
    /**
     * Sets the Title of the Game
     */
    public void setGamesTitle(String newGamesTitle) {
        gamesTitle = newGamesTitle;
    }
    /**
     * Gets the Minimum Age for the Game
     *
     * @return the Minimum Age for the Game
     */
    public String getGamesAges() {
        return gamesAges;
    }
    /**
     * Sets the Minimum Age of the Game
     */
    public void setGamesAges(String newGamesAges) {
        gamesAges = newGamesAges;
    }
    /**
     * Gets the Minimum Number Of Players for the Game
     *
     * @return the Minimum Number Of Players for the Game
     */
    public String getGamesMinPlayers() {
        return gamesMinPlayers;
    }
    /**
     * Sets the Minimum Number Of Players for the Game
     */
    public void setGamesMinPlayers(String newGamesMinPlayers) {
        gamesMinPlayers = newGamesMinPlayers;
    }
    /**
     * Gets the Genre of the Game
     *
     * @return the Genre of the Game
     */
    public String getGamesGenre() {
        return gamesGenre;
    }
    /**
     * Sets the Genre of the Game
     */
    public void setGamesGenre(String newGamesGenre) {
        gamesGenre = newGamesGenre;
    }
    /**
     * Gets the Barcode of the Game
     *
     * @return the Barcode of the Game
     */
    public String getGamesBarcode() {
        return gamesBarcode;
    }
    /**
     * Sets the Barcode of the Game
     */
    public void setGamesBarcode(String newGamesBarcode) {
        gamesBarcode = newGamesBarcode;
    }
    /**
     * Gets the Quantity of Game copies
     *
     * @return the Quantity of Game copies
     */
    public int getGamesQuantity() {
        return gamesQuantity;
    }
    /**
     * Sets the Quantity of Game copies
     */
    public void setGamesQuantity(int newGamesQuantity) {
        gamesQuantity = newGamesQuantity;
    }
}
