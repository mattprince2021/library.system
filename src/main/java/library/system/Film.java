package library.system;

import javax.persistence.*;

@Entity
public class Film
{
    private int filmID;
    private String filmTitle;
    private String filmStudio;
    private String filmFormat;
    private String filmGenre;
    private String filmOverview;
    private String filmBarcode;
    private int filmQuantity;
    private String filmAge;

    @Id
    public int getFilmID() { return filmID;}

    public void setFilmID(int newFilmID) { filmID = newFilmID; }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String newFilmTitle) {filmTitle = newFilmTitle;}

    public String getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(String newFilmStudio) { filmStudio = newFilmStudio;}

    public String getFilmFormat() {
        return filmFormat;
    }

    public void setFilmFormat(String newFilmFormat) { filmFormat = newFilmFormat;}

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String newFilmGenre) {
        filmGenre = newFilmGenre;
    }

    public String getFilmOverview() {
        return filmOverview;
    }

    public void setFilmOverview(String newFilmOverview) {
        filmOverview = newFilmOverview;
    }

    public String getFilmBarcode() {
        return filmBarcode;
    }

    public void setFilmBarcode(String newFilmBarcode) { filmBarcode = newFilmBarcode;}

    public int getFilmQuantity() { return filmQuantity; }

    public void setFilmQuantity(int newFilmQuantity) { filmQuantity = newFilmQuantity;}

    public String getFilmAge(){ return filmAge;}
    public void setFilmAge(String newFilmAge){ filmAge = newFilmAge;}
}

