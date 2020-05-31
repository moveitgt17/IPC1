package Clases;

public class Sala {
     private int colums, rows,  ID, branch;
    public Sala() {
    }

    public Sala(int colums, int rows, int ID, int branch) {
        this.colums = colums;
        this.rows = rows;
        this.ID = ID;
        this.branch = branch;

    }

    /**
     * @return the colums
     */
    public int getColums() {
        return colums;
    }

    /**
     * @param colums the colums to set
     */
    public void setColums(int colums) {
        this.colums = colums;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the branch
     */
    public int getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(int branch) {
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "Sala{" + "colums=" + colums + ", rows=" + rows + ", ID=" + ID + ", branch=" + branch + ", movie=" +  '}';
    }
     
     
}
