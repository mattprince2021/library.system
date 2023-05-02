package library.system;

public class Music {
    //instance variable
    private String musicTitle, musicArtist, musicFormat, musicGenre, musicOverview, musicBarcode, musicQuantity;

    //constructor
    public Music(String mTitle, String mArtist, String mFormat, String mGenre, String mOverview,
                 String mBarcode, String mQuantity)
    {
        musicTitle = mTitle;
        musicArtist = mArtist;
        musicFormat = mFormat;
        musicGenre = mGenre;
        musicOverview = mOverview;
        musicBarcode = mBarcode;
        musicQuantity = mQuantity;
    }

    //methods

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) { this.musicTitle = musicTitle; }

    public String getMusicArtist() {
        return musicArtist;
    }

    public String getMusicFormat() {
        return musicFormat;
    }

    public String getMusicGenre() { return musicGenre; }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getMusicBarcode() {
        return musicBarcode;
    }

    public String getMusicQuantity() {
        return musicQuantity;
    }

    public void setMusicQuantity() { this.musicQuantity = musicQuantity; }

    public String getMusicOverview() {
        return musicOverview;
    }

    public void setMusicOverview(String musicOverview) {
        this.musicOverview = musicOverview;
    }

//    public String getMusicInformation()
//    {
//        String musicInformation = musicTitle + "; ";
//        musicInformation += musicArtist + "; ";
//        musicInformation += musicFormat + "; ";
//        musicInformation += musicGenre + "; ";
//        musicInformation += musicBarcode + "; ";
//        musicInformation += musicQuantity + "; ";
//        musicInformation += musicOverview;
//        return musicInformation;
//    }
}
