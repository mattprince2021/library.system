package library.system;

public class Music {
    //instance variable
    private String musicTitle, musicArtist, musicFormat, musicGenre, musicOverview, musicBarcode;

    //constructor
    public Music(String mTitle, String mArtist, String mFormat, String mGenre, String mOverview,
                 String mBarcode)
    {
        musicTitle = mTitle;
        musicArtist = mArtist;
        musicFormat = mFormat;
        musicGenre = mGenre;
        musicOverview = mOverview;
        musicBarcode = mBarcode;
    }

    //methods

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public String getMusicFormat() {
        return musicFormat;
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

    public String getMusicOverview() {
        return musicOverview;
    }

    public void setMusicOverview(String musicOverview) {
        this.musicOverview = musicOverview;
    }

    public String getMusicInformation()
    {
        String musicInformation = musicTitle + "; ";
        musicInformation += musicArtist + "; ";
        musicInformation += musicFormat + "; ";
        musicInformation += musicGenre + "; ";
        musicInformation += musicBarcode + "; ";
        musicInformation += musicOverview;
        return musicInformation;
    }
}
