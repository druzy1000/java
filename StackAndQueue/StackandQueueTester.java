/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 7
 *04/15/15
 **/

public class StackandQueueTester{
	
	public static void main(String[] args){
		Stack stack = new Stack();
		Queue queue = new Queue();
		System.out.println("My Stack!");
		System.out.println("Initially Empty? : " + stack.isEmpty());
		System.out.println("Push : 'red'");
		stack.push("red");
		System.out.println("Still Empty? : " + stack.isEmpty());
		System.out.println("Push : 'blue'");
		stack.push("blue");
		System.out.println("Push : 'yellow'");
		stack.push("yellow");
		System.out.println("Push : 'green'");
		stack.push("green");
		System.out.println("It grew!");
		System.out.println("Size expected(4) : actual(" + stack.size() + ")");
		System.out.println("Peek : " + stack.peek());
		System.out.println("Pop : " + stack.pop());
		System.out.println("Peek : " + stack.peek());
		System.out.println("Pop : " + stack.pop());
		System.out.println("Pop : " + stack.pop());				
		System.out.println("Pop : " + stack.pop());
		System.out.println("Still Empty? : " + stack.isEmpty());
		System.out.println("Size expected(0) : actual(" + stack.size() + ")");
		
		System.out.println();
		
		System.out.println("My Queue!");
		System.out.println("Initially Empty? : " + queue.isEmpty());
		System.out.println("Add: 'Red'");
		queue.add("Red");
		System.out.println("Still Empty? : " + queue.isEmpty());
		System.out.println("Add: 'Blue'");
		queue.add("Blue");
		System.out.println("Add: 'Yellow'");
		queue.add("Yellow");
		System.out.println("Add: 'Green'");
		queue.add("Green");
		System.out.println("It grew!");
		System.out.println("Size expected(4) : actual(" + queue.size() + ")");
		System.out.println("Peek : " + queue.peek());
		System.out.println("Remove : " + queue.remove());
		System.out.println("Peek : " + queue.peek());
		System.out.println("Remove : " + queue.remove());
		System.out.println("Remove : " + queue.remove());				
		System.out.println("Remove : " + queue.remove());
		System.out.println("Still Empty? : " + queue.isEmpty());
		System.out.println("Size expected(0) : actual(" + queue.size() + ")");




	}
}