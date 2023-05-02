package library.system;

public class Tables {

    //instance variable
    private String tablesNumber, tablesSize, tablesPlayers;
    private int tablesQuantity;

    //constructor
    public Tables(String tTable, String tSize, String tPlayers, int tQuantity)
    {
        tablesNumber = tTable;
        tablesSize = tSize;
        tablesPlayers = tPlayers;
        tablesQuantity = tQuantity;
    }

    //methods

    public String getTablesNumber() { return tablesNumber; }

    public void setTablesNumber(String tablesNumber) { this.tablesNumber = tablesNumber; }
    public String getTablesNumbers() {
        return tablesNumber;
    }

    public String getTablesSize() {
        return tablesSize;
    }

    public void setTablesSize(String tablesSize) {
        this.tablesSize = tablesSize;
    }

    public String getTablesPlayers() {
        return tablesPlayers;
    }

    public void setTablesPlayers(String tablesPlayers) {
        this.tablesPlayers = tablesPlayers;
    }

    public int getTablesQuantity() {return tablesQuantity;}

    public void setTablesQuantity(int tablesQuantity){ this.tablesQuantity = tablesQuantity;}

//    public String getTablesInformation()
//    {
//        String tablesInformation = tablesNumber + "; ";
//        tablesInformation += tablesSize + "; ";
//        tablesInformation += tablesNumber + "; ";
//        tablesInformation += tablesQuantity;
//        return tablesInformation;
//    }
}
