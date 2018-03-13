/*
*This class is the implementation for the actual pokemon.
*It gives speed, the name, the tolerance, power, and if it is defending.
*/

import java.util.*;
 
public class Pokemon {
	
	  /* instance variables -- ADD MORE AS NECESSARY!!! */

	private int tolerance; /* @invariant: tolerance >= 0 && tolerance <= 100 */
	private int speed;    /* @invariant: speed >= 1 && speed <= 100 */
	private int power;     /* @invariant: power >= 1 && power <= 20 */
	private String name;
	private boolean isDefending; // if true, Pokemon is defending, if false, Pokemon is attacking
	
	public Pokemon(String name, int initialTolerance, int initialSpeed, int initialPower) {
 
		this.name = name;
		this.tolerance = initialTolerance;
		this.power = initialPower;
		this.speed = initialSpeed;
		this.isDefending = false;
	}
	 
	public int tolerance() {

		return this.tolerance;
	}

	public int speed() {

		return this.speed; 
	}
	  
	public int power() {

		return this.power;
	}

	public String name() {

	    return this.name;
	}

	public boolean getIsDefending(){
		
		return this.isDefending;  
	}
	  

			  
	private void getHit(int amountOfHit) {
		
		this.tolerance = tolerance - amountOfHit;  
	}  

	public void attack() {
		
		this.isDefending = false;
	}

	public void defend() {

		this.isDefending = true;
	  
	}
		//Prints out each Pokemon and their current stat. 
	public String toString() {
		  
		String s1 = "\nPokemon:" + name + "\nTolerance:" + tolerance + "\nSpeed:"+ speed + "\nPower:"+ power;
		return s1;
	}

	public void attack(Pokemon otherPokemon){
		
		if(otherPokemon.getIsDefending() == true ){
		
		Random ran = new Random();
		int ranNumber = ran.nextInt(99);
		  
		  if(ranNumber < 24){
			  getHit((int)(.25*power));
		  }else if(ranNumber < 49){
			  otherPokemon.getHit((int)(.25*power));
		  }
		}
		  else{
			  otherPokemon.getHit(this.power);
		  } 	  
	}
}