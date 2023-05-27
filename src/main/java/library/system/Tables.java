package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class models the physical tables that are available for games session rental at the Library. Tables have a
 * unique table ID, size, number of players and quantity.
 *
 * @author matthewprince
 * @version 1.0
 */
@Entity
public class Tables {

    //instance variable
    private int tablesID;
    private String tablesSize;
    private int tablesPlayers;
    private int tablesQuantity;

    //constructor

    /**
     * @param tID       the unique ID of the table
     * @param tSize     the size of the table (e.g. small, medium, large)
     * @param tPlayers  the maximum number of players that the table can accommodate
     * @param tQuantity how many tables there are in this configuration
     */
    public Tables(int tID, String tSize, int tPlayers, int tQuantity) {
        tablesID = tID;
        tablesSize = tSize;
        tablesPlayers = tPlayers;
        tablesQuantity = tQuantity;
    }

    public Tables() {

    }

    /**
     * Gets the ID of the Table
     *
     * @return the ID of the Table
     */
    @Id
    public int getTablesID() {
        return tablesID;
    }

    /**
     * Setting the Table ID is controlled by the controller, this increments the most recent Table ID by 1
     */
    public void setTablesID(int newTablesID) {
        tablesID = newTablesID;
    }

    /**
     * Gets the Size of the Table
     *
     * @return the Size of the Table
     */
    public String getTablesSize() {
        return tablesSize;
    }

    /**
     * Sets the Size of the Table
     */
    public void setTablesSize(String newTablesSize) {
        tablesSize = newTablesSize;
    }

    /**
     * Gets the number of players accommodated at the Table
     *
     * @return the number of players accommodated at the Table
     */
    public int getTablesPlayers() {
        return tablesPlayers;
    }

    /**
     * Sets the number of players accommodated at the Table
     */
    public void setTablesPlayers(int newTablesPlayers) {
        tablesPlayers = newTablesPlayers;
    }

    /**
     * Gets the number of Tables
     *
     * @return the number of Tables
     */
    public int getTablesQuantity() {
        return tablesQuantity;
    }

    /**
     * Sets the number of the Tables
     */
    public void setTablesQuantity(int newTablesQuantity) {
        tablesQuantity = newTablesQuantity;
    }
}
