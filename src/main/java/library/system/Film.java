package library.system;

public class Film {
    //instance variable
    private String filmTitle, filmArtist, filmFormat, filmGenre, filmOverview, filmBarcode;

    //constructor
    public Film(String fTitle, String fArtist, String fFormat, String fGenre, String fOverview,
                  String fBarcode)
    {
        filmTitle = fTitle;
        filmArtist = fArtist;
        filmFormat = fFormat;
        filmGenre = fGenre;
        filmOverview = fOverview;
        filmBarcode = fBarcode;
    }

    //methods


    public String getFilmTitle() {
        return filmTitle;
    }

    public String getFilmArtist() {
        return filmArtist;
    }

    public String getFilmFormat() {
        return filmFormat;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public String getFilmOverview() {
        return filmOverview;
    }

    public String getFilmBarcode() {
        return filmBarcode;
    }

    public String getFilmInformation()
    {
        String filmInformation = filmTitle + "; ";
        filmInformation += filmArtist + "; ";
        filmInformation += filmFormat + "; ";
        filmInformation += filmGenre + "; ";
        filmInformation += filmBarcode + "; ";
        filmInformation += filmOverview;
        return filmInformation;
    }
}

