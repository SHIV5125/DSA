package com.code;

public class Test {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.display();
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		
	    l1.display();
	    l1.Reverse(l1.getHead());
	    
		
	    l1.insert(70, 1);
	    l1.insert(80, 3);
	    l1.insert(90, 5);
	    l1.insert(100, 7);
	    l1.insert(110, 9);
	    
        l1.display();
        
        l1.deletByVal(70);
        l1.deletByVal(110);
        l1.display();
        l1.deletbyPosition(6);
        l1.display();
        l1.reverse();
        l1.display();
        l1.reverse();
        l1.display();
       
	}

}
