/**
 *This class is the text user interface which has the option to print 
 *and read the 1.06 format and serialize and deserializes both Grid and Cell Class
 *
 *Class: GameOfLifeTUI
 *Author: Andrew Reyes
 *09/18/15
 **/
import java.nio.file.Paths;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class GameOfLifeTUI{

    private Grid myGrid;
    int xDim;
    int yDim;
    Scanner input = new Scanner(System.in);


    public GameOfLifeTUI(int xDim, int yDim) {
        myGrid = new Grid(xDim,yDim);
        myGrid.gliderSetup();
        
    }

    public void run() throws InterruptedException {
       // on purpose an endless loop
       clearScreen();
       while (true) {
          displayGrid();
          myGrid.update();
          Thread.sleep(50);
          clearScreen();
       } 
    }

    public void displayGrid() {
       System.out.print(myGrid);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void readInFormat(){ //Reads in the file for the 1.06 format
      
      System.out.println("Enter the file to read in.");
      Scanner input = new Scanner(System.in);

        try{
            BufferedReader in = new BufferedReader(new FileReader(input.next()));
            String line = in.readLine(); //takes in the file the user puts in.

              while(line != null){
                  if(!line.contains("#")){
                    
                    String[] vals = line.split(" ");
                    int x = Integer.parseInt(vals[0]);
                    int y = Integer.parseInt(vals[1]);
                    myGrid.cellIsAlive(Math.abs(x),Math.abs(y));
                    }
               
               line = in.readLine();
               System.out.println(line);   
              } 
            }
        catch(IOException e){
          e.printStackTrace();
        }
    }

    public void printOutFormat(){
      
        Cell [][] tempGrid = this.myGrid.getItsCurrentState();
        int[][] futureDish = new int [tempGrid.length][tempGrid[0].length];
          
          for(int row = 0; row < tempGrid.length; row = row++){
            for(int column = 0; column < tempGrid.length; column = column++){
                futureDish[row][column] = input.nextInt();
          if (tempGrid[row][column].isAlive()) 
          {
            System.out.println(row + " " + column); //Prints out the format which was read in.
              }
          }
        }
    }

    public void printMenu(){ //Prints the menu 
      
        System.out.println("Welcome to Conway's Game of Life!");
        System.out.println();
        System.out.println("Would you like to: ");
        System.out.println("\t1) Run the simulation?"); 
        System.out.println("\t2) Load a pattern in Life 1.06 format?");
        System.out.println("\t3) Serialize the current simulation to disk?");
        System.out.println("\t4) Load a previously saved simulation (diserialize)?");
    }

    public void Serializable(){ //convert its state to a byte stream.
         
        System.out.println("Please enter a file.");
        String fileName = input.next();

          try{

            FileOutputStream fileOut = new FileOutputStream("/tmp/grid.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myGrid);
            out.close();
            fileOut.close();
            
            System.out.println("Serialized data is saved in " + fileName);

          }
          catch(IOException i){
            i.printStackTrace();
          }
    }
    
    public void Deserializable(){ //reverts the serialized file back to the copy of the object.

        System.out.println("Please enter serialized file.");
        String fileName = input.next();
        
          try{
                
            FileInputStream fileIn = new FileInputStream("/tmp/grid.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            myGrid = (Grid) in.readObject();
            in.close();
            fileIn.close();
                
            System.out.println("Deserialized Data!");
            }
            
            catch(IOException i){
                i.printStackTrace();
                return;
            }
            
            catch(ClassNotFoundException c){
                c.printStackTrace();
                return;
            }
    }

}