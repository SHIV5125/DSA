package com.code;

public class Test {
	public static void main(String[] args) {
		DLInkedList l1 = new DLInkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.display();
	    l1.insert(60,1);
	    l1.insert(70,3);
	    l1.insert(80,5);
	    l1.display();
	    l1.deleteByVal(70);
	    l1.deleteByVal(80);
	    l1.display();
	    l1.deleteByPosition(1);
	    l1.display();
	    l1.displayRev();
	    

	}

}
