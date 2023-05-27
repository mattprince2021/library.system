package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class models a Film held in the Library. A film has a unique library ID, unique barcode, title, film studio,
 * format, genre, overview, age rating and quantity.
 *
 * @author matthewprince
 * @version 1.0
 */

@Entity
public class Film {
    private int filmID;
    private String filmTitle;
    private String filmStudio;
    private String filmFormat;
    private String filmGenre;
    private String filmOverview;
    private String filmBarcode;
    private int filmQuantity;
    private String filmAge;

    /**
     * @param fID       unique ID
     * @param fTitle    title of the film
     * @param fStudio   the publishing studio for the film
     * @param fFormat   the format of the physical film (DVD or Blu-Ray)
     * @param fGenre    the genre of the film (e.g. Comedy, Thriller)
     * @param fOverview a brief synopsis of the film
     * @param fBarcode  the barcode of the film
     * @param fQuantity the total volume of copies
     * @param fAge      the age rating of the film
     */

    public Film(int fID, String fTitle, String fStudio, String fFormat, String fGenre, String fOverview,
                String fBarcode, int fQuantity, String fAge) {
        filmID = fID;
        filmTitle = fTitle;
        filmStudio = fStudio;
        filmFormat = fFormat;
        filmGenre = fGenre;
        filmOverview = fOverview;
        filmBarcode = fBarcode;
        filmQuantity = fQuantity;
        filmAge = fAge;
    }

    public Film() {

    }

    /**
     * Gets the ID of the Film
     *
     * @return the ID of the Film
     */

    @Id
    public int getFilmID() {
        return filmID;
    }

    /**
     * Setting the Film ID is controlled by the controller, this increments the most recent Film ID by 1
     */
    public void setFilmID(int newFilmID) {
        filmID = newFilmID;
    }

    /**
     * Gets the Title of the Film
     *
     * @return the Title of the Film
     */
    public String getFilmTitle() {
        return filmTitle;
    }

    /**
     * Sets the Title of the Film
     */
    public void setFilmTitle(String newFilmTitle) {
        filmTitle = newFilmTitle;
    }

    /**
     * Gets the Studio of the Film
     *
     * @return the Studio of the Film
     */
    public String getFilmStudio() {
        return filmStudio;
    }

    /**
     * Sets the Studio of the Film
     */
    public void setFilmStudio(String newFilmStudio) {
        filmStudio = newFilmStudio;
    }

    /**
     * Gets the Format of the Film
     *
     * @return the Format of the Film
     */
    public String getFilmFormat() {
        return filmFormat;
    }

    /**
     * Sets the Format of the Film
     */
    public void setFilmFormat(String newFilmFormat) {
        filmFormat = newFilmFormat;
    }

    /**
     * Gets the Genre of the Film
     *
     * @return the Genre of the Film
     */
    public String getFilmGenre() {
        return filmGenre;
    }

    /**
     * Sets the Genre of the Film
     */
    public void setFilmGenre(String newFilmGenre) {
        filmGenre = newFilmGenre;
    }

    /**
     * Gets the Overview of the Film
     *
     * @return the Overview of the Film
     */
    public String getFilmOverview() {
        return filmOverview;
    }

    /**
     * Sets the Overview of the Film
     */
    public void setFilmOverview(String newFilmOverview) {
        filmOverview = newFilmOverview;
    }

    /**
     * Gets the Barcode of the Film
     *
     * @return the Barcode of the Film
     */
    public String getFilmBarcode() {
        return filmBarcode;
    }

    /**
     * Sets the Barcode of the Film
     */
    public void setFilmBarcode(String newFilmBarcode) {
        filmBarcode = newFilmBarcode;
    }

    /**
     * Gets the Quantity of Film copies
     *
     * @return the Quantity of Film copies
     */
    public int getFilmQuantity() {
        return filmQuantity;
    }

    /**
     * Sets the Quantity of Film copies
     */
    public void setFilmQuantity(int newFilmQuantity) {
        filmQuantity = newFilmQuantity;
    }

    /**
     * Gets the Age Rating of the Film
     *
     * @return the Age Rating of the Film
     */
    public String getFilmAge() {
        return filmAge;
    }

    /**
     * Sets the Age Rating of the Film
     */
    public void setFilmAge(String newFilmAge) {
        filmAge = newFilmAge;
    }
}

