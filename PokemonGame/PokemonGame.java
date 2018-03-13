/*
*This class is were all the implementation for the pokemon game is for.
*It sets each stat at a random number where each time played they are different.
*Each time the player makes a move,such as attack or defend it will check each stat and return
*its stat.
*/



import java.util.*;
import java.util.Random;

public class PokemonGame {
	Random r;
	
	Pokemon charizard;
	Pokemon pikachu;
	private int player1;
	private int player2;
	
	public PokemonGame(){
		/*
		*	Creates a new random generator, and two new pokemon.
		*	Each pokemon will have a random stat in the beginning.
		*/
		this.r = new Random(); // creating new random generator 
		charizard = new Pokemon("Charizard", r.nextInt(99) + 1, r.nextInt(99) + 1 , r.nextInt(19) +1 );
		pikachu=  new Pokemon("Pikachu", r.nextInt(99) + 1, r.nextInt(99) + 1, r.nextInt(19) +1 );
	}	 

	// Two new players that have the option @param 
	public void setPlayer1(int option){
		player1 = option;
	}
	public void setPlayer2(int option){
		player2 = option;
	}
	
	//This method checks each pokemons tolerance.
	public int checkHealth(){
		if(charizard.tolerance() <= 0){
			return 2;
		}else if(pikachu.tolerance() <=0){
			return 1;
		}else {
			return 0;
		}
	}

	/*
	*Plays the actual game gives the player the option to choose to attack or defend.
	*Each player will get a chance to choose.
	*/

	public int playRound(){
		if(player1 == 1){
			charizard.attack();
		}else if(player2 == 2){
				charizard.defend();
		}
		if(player2 ==1 ){
			pikachu.attack();
		}else if(player2 == 2){
			pikachu.defend();
		}
	
	if(charizard.getIsDefending() == false && pikachu.getIsDefending() == false){
		int holder = r.nextInt(99);
		if(charizard.speed() >= pikachu.speed()){

			if(holder <= 19){
				
				pikachu.attack(charizard);
				if(checkHealth() == 2){
					return 2;
				}
				charizard.attack(pikachu);
				if(checkHealth() == 1){
					return 1;
				}
			}

			else{
				charizard.attack(pikachu);
				if(checkHealth() == 1){
					return 1;
				}
				
				pikachu.attack(charizard);
				if(checkHealth() == 2){
					return 2;
				}
			}
			
		}
		else {
			if(holder <= 19){
				charizard.attack(pikachu);
				if(checkHealth() == 1){
					return 1;
				}
				
				pikachu.attack(charizard);
				if(checkHealth() == 2){
					return 2;
				}
				
				else{
				
				pikachu.attack(charizard);
				if(checkHealth() == 2){
					return 2;
				}
				
				charizard.attack(pikachu);
				if(checkHealth() == 1){
					return 1;
				
				}
				
			}
			
		}
		
	}
		
	}
	
	else if (charizard.getIsDefending() == false && pikachu.getIsDefending() == true){
		charizard.attack(pikachu);
		if(checkHealth() == 1){
			return 1;
		}
		if(checkHealth() == 2){
			return 2;
		}
		
	}
	else if(charizard.getIsDefending() == true && pikachu.getIsDefending() == false){
		pikachu.attack(charizard);
		if(checkHealth() == 1){
			return 1;
		}
		if(checkHealth() == 2){
			return 2;
		}
		
	}
	return 0;
	}
	
}