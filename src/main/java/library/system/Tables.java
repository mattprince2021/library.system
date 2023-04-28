package library.system;

public class Tables {

    //instance variable
    private String tablesNumber, tablesSize, tablesPlayers;

    //constructor
    public Tables(String tTable, String tSize, String tPlayers)
    {
        tablesNumber = tTable;
        tablesSize = tSize;
        tablesPlayers = tPlayers;
    }

    //methods


    public String getTablesNumbers() {
        return tablesNumber;
    }

    public String getTablesSize() {
        return tablesSize;
    }

    public String getTablesPlayers() {
        return tablesPlayers;
    }

    public String getTablesInformation()
    {
        String tablesInformation = tablesNumber + "; ";
        tablesInformation += tablesSize + "; ";
        tablesInformation += tablesNumber + "; ";
        return tablesInformation;
    }
}
