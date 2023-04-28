package library.system;

public class Film {
    //instance variable
    private String filmTitle, filmActor, filmFormat, filmGenre, filmOverview, filmBarcode;

    //constructor
    public Film(String fTitle, String fActor, String fFormat, String fGenre, String fOverview,
                  String fBarcode)
    {
        filmTitle = fTitle;
        filmActor = fActor;
        filmFormat = fFormat;
        filmGenre = fGenre;
        filmOverview = fOverview;
        filmBarcode = fBarcode;
    }

    //methods


    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmArtist() {
        return filmActor;
    }

    public String getFilmFormat() {
        return filmFormat;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmOverview() {
        return filmOverview;
    }

    public void setFilmOverview(String filmOverview) {
        this.filmOverview = filmOverview;
    }

    public String getFilmBarcode() {
        return filmBarcode;
    }

    public String getFilmInformation()
    {
        String filmInformation = filmTitle + "; ";
        filmInformation += filmActor + "; ";
        filmInformation += filmFormat + "; ";
        filmInformation += filmGenre + "; ";
        filmInformation += filmBarcode + "; ";
        filmInformation += filmOverview;
        return filmInformation;
    }
}

