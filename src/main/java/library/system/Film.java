package library.system;

public class Film {
    //instance variable
    private String filmTitle, filmStudio, filmFormat, filmGenre, filmOverview, filmBarcode;
    private int filmQuantity;

    //constructor
    public Film(String fTitle, String fStudio, String fFormat, String fGenre, String fOverview,
                  String fBarcode, int fQuantity)
    {
        filmTitle = fTitle;
        filmStudio = fStudio;
        filmFormat = fFormat;
        filmGenre = fGenre;
        filmOverview = fOverview;
        filmBarcode = fBarcode;
        filmQuantity = fQuantity;
    }

    //methods


    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmStudio() {
        return filmStudio;
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

    public int getFilmQuantity() { return filmQuantity; }

    public void setFilmQuantity() { this.filmQuantity = filmQuantity;}

//    public String getFilmInformation()
//    {
//        String filmInformation = filmTitle + "; ";
//        filmInformation += filmStudio + "; ";
//        filmInformation += filmFormat + "; ";
//        filmInformation += filmGenre + "; ";
//        filmInformation += filmBarcode + "; ";
//        filmInformation += filmQuantity + "; ";
//        filmInformation += filmOverview;
//        return filmInformation;
//    }
}

