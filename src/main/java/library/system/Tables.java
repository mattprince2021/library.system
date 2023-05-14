package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tables {

    //instance variable
    private int tablesID;
    private String tablesSize;
    private int tablesPlayers;
    private int tablesQuantity;

    //constructor
    @Id
    public int getTablesID() {
        return tablesID;
    }

    public void setTablesID(int newTablesID) {
        tablesID = newTablesID;
    }

    public String getTablesSize() {
        return tablesSize;
    }

    public void setTablesSize(String newTablesSize) {
        tablesSize = newTablesSize;
    }

    public int getTablesPlayers() {
        return tablesPlayers;
    }

    public void setTablesPlayers(int newTablesPlayers) {
        tablesPlayers = newTablesPlayers;
    }

    public int getTablesQuantity() {
        return tablesQuantity;
    }

    public void setTablesQuantity(int newTablesQuantity) {
        tablesQuantity = newTablesQuantity;
    }
}
