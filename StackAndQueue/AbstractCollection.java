/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 7
 *04/15/15
 **/

public abstract class AbstractCollection implements Collection{

	protected String[] array;
	protected int top = 0;
	protected int size = 0;
	protected int bottom = 0;
	public String peek(){
		return array[top];	
	}
	public String peek(){
		return array[bottom];	
	}

	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;	
	}
	
	protected void grow(){
		String[] data = new String[array.length * 2];
		for(int i = 0; i < array.length; i++){
			data[i] = array[i];
		}
		array = data;
	}
}