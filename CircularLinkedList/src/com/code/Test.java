package com.code;

public class Test {

	public static void main(String[] args) {
		CircularLinkedList c1 = new CircularLinkedList();
		c1.insert(10);
		c1.insert(20);
		c1.insert(30);
		c1.insert(40);
		c1.insert(50);
		c1.display();
		c1.insert(60, 1);
		c1.insert(70, 3);
		c1.insert(80, 5);
		c1.insert(90, 7);
		c1.display();
		c1.deleteByVal(70);
		c1.deleteByVal(80);
		c1.display();
		c1.deleteByPosition(1);
		c1.deleteByPosition(4);
		c1.display();
		c1.reverse();
		c1.display();



	}

}
