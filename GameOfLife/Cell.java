/**
 *A class that represents a cell, which implements Serializable
 *it serializes any data in cell.
 *
 *Class: Cell
 *Author: Andrew Reyes
 *09/18/15
 **/
import java.io.Serializable;
public class Cell implements Serializable {

    private boolean isAlive;

    public Cell() {
        this.isAlive = false;
    }

    // public query method to ask cell if it is alive
    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean val) {
        this.isAlive = val;
    }
    
    public String toString() {
        String returnVal = "-";
        if (isAlive)
           returnVal = "O"; 
        return returnVal;
    }

    public boolean equals(Object o) {
        boolean returnVal = false;
        if (o instanceof Cell)
            returnVal = (this.isAlive == ((Cell)o).isAlive());
        return returnVal;
    }
}