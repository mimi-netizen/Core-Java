package day19;

//Multi Level Inheritance

class X
{ //Parent
	
	int x = 10;
	void display() {
		System.out.println(x);
	}
}

class Y extends X
{ //Child1
	int y = 20;
	void print() {
		System.out.println(y);
	}
}

class Z extends Y
{//child2
	
	int z = 30;
	void present() {
		System.out.println(z);
	}
	
}

public class InheritanceDemo2 {
	
	public static void main(String[] args) {
		
		/*
		Y object = new Y(); //Child1
		System.out.println(object.x); //parent
		object.display(); //parent
		System.out.println(object.y); //child1
		object.print(); //child1
		
		*/
		
		Z object2 = new Z();// child2
		
		System.out.println(object2.x); //parent
		object2.display(); //parent
		System.out.println(object2.y); //child1
		object2.print(); //child1
		System.out.println(object2.z); //child2
		object2.present(); //child2
		
	}

}
