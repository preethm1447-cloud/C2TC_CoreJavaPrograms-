package com.tnsif.multipleinheritance;
//two interface
interface square {
	void show ();
	
}
interface circle {
	void display ();
}
//implement the two above interface to another class
class Shape implements square, circle{
	@Override
	public void show () {
		System.out.println("Square has 4 sides");
	}
	
	@Override 
	public void display () {
		System.out.println("Circle has no sides");
		
	} 
}

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		Shape obj = new Shape ();
		obj.show();
		obj.display();
		
	}

}
