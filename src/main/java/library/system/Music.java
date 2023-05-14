package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

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

    @Id
    public int getMusicID() {
        return musicID;
    }

    public void setMusicID(int newMusicID) {
        musicID = newMusicID;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String newMusicTitle) {
        musicTitle = newMusicTitle;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(String newMusicArtist) {
        musicArtist = newMusicArtist;
    }

    public String getMusicFormat() {
        return musicFormat;
    }

    public void setMusicFormat(String newMusicFormat) {
        musicFormat = newMusicFormat;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getMusicBarcode() {
        return musicBarcode;
    }

    public void setMusicBarcode(String newMusicBarcode) {
        musicBarcode = newMusicBarcode;
    }

    public int getMusicQuantity() {
        return musicQuantity;
    }

    public void setMusicQuantity(int newMusicQuantity) {
        musicQuantity = newMusicQuantity;
    }

    public void setMusicQuantity() {
        this.musicQuantity = musicQuantity;
    }

    public String getMusicOverview() {
        return musicOverview;
    }

    public void setMusicOverview(String musicOverview) {
        this.musicOverview = musicOverview;
    }

}
