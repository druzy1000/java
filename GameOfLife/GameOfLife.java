/**
 *A class that runs the Game of Life program and gives the user options
 *to choose and option.
 *
 *Class: GameOfLife
 *Author: Andrew Reyes
 *09/18/15
 **/
import java.util.Scanner;
public class GameOfLife {
    public static void main(String[] args) throws InterruptedException {
       
       Scanner input = new Scanner(System.in);  
       GameOfLifeTUI theTUI = new GameOfLifeTUI(40,40);
       
       while(true){

        theTUI.printMenu();
        int choice = input.nextInt();
        boolean loop = true;
        
        if(choice == 1){ //runs simulation
            theTUI.run();
        }
        else if(choice == 2){ //reads in a the Life1.06
            theTUI.readInFormat();
        }
        else if(choice == 3){ //Serializes objects 
            theTUI.Serializable(); 
        }
        else if(choice == 4){ //Deserializes the objects 
            theTUI.Deserializable();
        }
      }
    }
}