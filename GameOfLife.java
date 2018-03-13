/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 5
 *03/11/15
 **/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameOfLife
{
    public static void main (String [] args){

        File inputFile = new File (args[0]); // my first command line 
        Scanner input = null;
        
        try {
        input = new Scanner(inputFile);
        }
        catch (FileNotFoundException e){
        e.printStackTrace();
        }

        int gens = Integer.parseInt(args[1]);//parse string to int making this my second command line 
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] board = new int[rows][columns];
        //int[][] futureBoard = new int[rows][columns]; 

        //update the dishes

        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
            board [row][column] = input.nextInt();
            }            
        }

        printBoard(board);

        for(int i = 0; i < gens; i++){
            board = update(board);
            printBoard(board);

        }
    }

    public static void printBoard(int[][] board){
        for(int row = 0; row < board.length; row = row + 1) { 
            for(int column = 0; column < board[0].length; column++) { 
                System.out.print(board[row][column]); 
                } System.out.println(); 
            } System.out.println(); 
    }
       

    public static boolean isItLiving(int[][] board, int row, int column){ //this passes the 2D array, with the rows and columns
        boolean answer = false;
        if(board[row][column] == 1) // if it is 1 it is alive
            {
            answer = true;
    }
        else if(board[row][column] == 0){
        
        }           
        return answer;
    }
    
/**
* Returns the number of living neighbors of a particular cell in the
*board
**/
    
    public static int[][] update(int[][] board){
        int[][] futureBoard = new int[board.length][board[0].length];
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if(isItLiving(board, row, column) == true && (checkNeighbors(board, row, column) <2))
                    futureBoard[row][column] = 0; //dead
                if (isItLiving(board, row, column) == false && (checkNeighbors(board, row, column) == 3))
                    futureBoard[row][column] = 1; //alive
                if(isItLiving(board, row, column) == true && (checkNeighbors(board, row, column) >3))
                    futureBoard[row][column] = 0; //dead
                if(isItLiving(board, row, column) == true && (checkNeighbors(board, row, column) == 2) || (checkNeighbors(board, row, column) == 3))
                    futureBoard[row][column] = 1; //alive
                }
                
        }

        return futureBoard;   
    }
   


    public static int checkNeighbors(int[][] board, int row, int column){
        int count = 0; 

        if(board[validateRow(board, row -1)][validateColumn(board, column -1)] == 1) //passes method to validate rows 
            count++; //increment aliveCount
        if(board[validateRow(board, row)][validateColumn(board, column -1)] == 1)
            count++;
        if(board[validateRow(board,row +1)][validateColumn(board, column -1)] == 1)
            count++;
        if(board[validateRow(board,row +1)][validateColumn(board, column)] == 1)
            count++;
        if(board[validateRow(board,row +1)][validateColumn(board, column +1)] == 1)
            count++;
        if(board[validateRow(board,row)][validateColumn(board, column +1)] == 1)
            count++;
        if(board[validateRow(board,row -1)][validateColumn(board, column +1)] == 1)
            count++;
        if(board[validateRow(board,row -1)][validateColumn(board, column)] == 1)
            count++;
        if(board[validateRow(board,row)][validateColumn(board, column)] == 1)
            count++;


        return count;

    }

    public static int validateRow(int[][] board, int row){
        if(row == -1)
            row = board.length -1;
        if(row == board.length)
            row = 0;

        return row;

    }

    public static int validateColumn(int[][] board, int column){
        if(column == -1)
            column = board[0].length -1;
        if(column == board[0].length)
            column = 0;

        return column;
    }

}