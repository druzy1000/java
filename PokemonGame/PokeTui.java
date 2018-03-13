/*
*The PokeTui, the text based interface.
*This is what the client sees of the actual game. Also gives the user the option to 
*fight or defend.
*/

import java.util.Scanner;

public class PokeTui {
	
	private int op1;
	private int op2;
	private int test;
	private PokemonGame game;
	private Scanner input;
	

		public PokeTui(){
			input = new Scanner(System.in); //scanner user input.
			System.out.println("\nPokemon! Gotta catch them all! Are you ready to game?");
			
			game = new PokemonGame(); //creates a new PokemonGame
			op1 = 0; //option 1 for user
			op2 = 0; //option 2 for user
			test = 0;
		}
		
		//Starts the game, Are you ready to Play.
		public void startGame(){
			while(test == 0){
				while(op1 != 1 && op1 != 2){
					System.out.println("\nPlayer 1, \nPlease enter 1 to attack.");
					System.out.println("Please enter 2 to defend.");
					op1 = input.nextInt();
				}
				game.setPlayer1(op1);
				op1 = 0;
				
				while(op2 != 1 && op2 != 2){
					System.out.println("\nPlayer 2, \nPlease enter 1 to attack.");
					System.out.println("Please enter 2 to defend.");
					op2 = input.nextInt();
				}
				game.setPlayer2(op2);
				op2 = 0;
				
				test = game.playRound();
			whatsHappening();
			}
			if(test == 1)
				System.out.print("PLAYER 1 WINS");
			if (test ==2)
				System.out.print("PLAYER 2 WINS");
			
			
		}
				//Returns the to String method and shows how the pokemon are doing.
		public void whatsHappening(){
			System.out.println(game.charizard.toString());
			System.out.println(game.pikachu.toString());
		}
}