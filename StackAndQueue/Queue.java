/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 7
 *04/15/15
 **/

public class Queue extends AbstractCollection{

	public Queue(){
		super();
		super.array = new String[3];
		// int bottom = 0;
	}

	public void add(String i){
		if(super.top == super.array.length){
			super.grow();
		}
		super.top++;
		super.array[super.size]= i;
		super.size++;
	}

	public String remove(){
		String data = null;
		if(!super.isEmpty()){
			data = super.array[super.bottom];
			super.bottom ++;
			super.size --;
		}
		return data;	
	}
	// public String peek(){
	// 	return array[bottom];	
	// }
}