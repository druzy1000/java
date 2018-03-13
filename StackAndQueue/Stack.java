/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 7
 *04/15/15
 **/

public class Stack extends AbstractCollection{


	public Stack(){
		super();
		super.array = new String[3];
	}

	public void push(String i){
		if(super.top == super.array.length){
			super.grow();
		}
		super.top++;
		super.array[super.top]= i;
		super.size++;
	}

	public String pop(){
		String data = null;
		if(!super.isEmpty()){
			data = super.array[super.top];
			super.top --;
			super.size --;
		}
		return data;	
	}
	
}