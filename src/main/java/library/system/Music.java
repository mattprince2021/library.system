package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * This class models Music held in the Library. Music has a unique library ID, unique barcode, title, artist, format
 * genre, overview and quantity.
 *
 * @author matthewprince
 * @version 1.0
 */
@Entity
public class Music {
    //instance variable
    private int musicID;
    private String musicTitle;
    private String musicArtist;
    private String musicFormat;
    private String musicGenre;
    private String musicOverview;
    private String musicBarcode;
    private int musicQuantity;

    /**
     * @param mID unique OD of the music item
     * @param mTitle title of the music item
     * @param mArtist artist that recorded the music item
     * @param mFormat the format of the music item (e.g. CD, Vinyl)
     * @param mGenre the genre of the music item
     * @param mOverview a brief synopsis of the music item
     * @param mBarcode the barcode of the music item
     * @param mQuantity the total volume of copies
     */
    public Music(int mID, String mTitle, String mArtist, String mFormat, String mGenre, String mOverview,
                 String mBarcode, int mQuantity){
        musicID = mID;
        musicTitle = mTitle;
        musicArtist = mArtist;
        musicFormat = mFormat;
        musicGenre = mGenre;
        musicOverview = mOverview;
        musicBarcode = mBarcode;
        musicQuantity = mQuantity;
    }

    public Music(){

    }
    /**
     * Gets the ID of the Music item
     *
     * @return the ID of the Music item
     */
    @Id
    public int getMusicID() {
        return musicID;
    }
    /**
     * Setting the Music ID is controlled by the controller, this increments the most recent Music ID by 1
     */
    public void setMusicID(int newMusicID) {
        musicID = newMusicID;
    }
    /**
     * Gets the Title of the Music item
     *
     * @return the Title of the Music item
     */
    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String newMusicTitle) {
        musicTitle = newMusicTitle;
    }
    /**
     * Gets the Artist of the Music item
     *
     * @return the Artist of the Music item
     */
    public String getMusicArtist() {
        return musicArtist;
    }
    /**
     * Sets the Artist of the Music item
     */
    public void setMusicArtist(String newMusicArtist) {
        musicArtist = newMusicArtist;
    }
    /**
     * Gets the Format of the Music item
     *
     * @return the Format of the Music item
     */
    public String getMusicFormat() {
        return musicFormat;
    }
    /**
     * Sets the Format of the Music item
     */
    public void setMusicFormat(String newMusicFormat) {
        musicFormat = newMusicFormat;
    }
    /**
     * Gets the Genre of the Music item
     *
     * @return the Genre of the Music item
     */
    public String getMusicGenre() {
        return musicGenre;
    }
    /**
     * Sets the Genre of the Music item
     */
    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }
    /**
     * Gets the Barcode of the Music item
     *
     * @return the Barcode of the Music item
     */
    public String getMusicBarcode() {
        return musicBarcode;
    }
    /**
     * Sets the Barcode of the Music item
     */
    public void setMusicBarcode(String newMusicBarcode) {
        musicBarcode = newMusicBarcode;
    }
    /**
     * Gets the Quantity of the Music item
     *
     * @return the Quantity of the Music item
     */
    public int getMusicQuantity() {
        return musicQuantity;
    }
    /**
     * Sets the Quantity of the Music item
     */
    public void setMusicQuantity(int newMusicQuantity) {
        musicQuantity = newMusicQuantity;
    }
    /**
     * Gets the Overview of the Music item
     *
     * @return the Overview of the Music item
     */
    public String getMusicOverview() {
        return musicOverview;
    }
    /**
     * Sets the Overview of the Music item
     */
    public void setMusicOverview(String musicOverview) {
        this.musicOverview = musicOverview;
    }

}
