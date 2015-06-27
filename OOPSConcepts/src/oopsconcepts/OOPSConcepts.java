package oopsconcepts;

public class OOPSConcepts {
    
    public static void main(String[] args) {
	Children children = new Children();
	children.inheritProperties();
	GrandParent grandpa = new GrandParent();
	Parent father = new Parent();
	System.out.println(grandpa.getProfession());
	System.out.println(father.getProfession());
	System.out.println(children.getProfession());
	
	Shape rectangle = new Shape();
	System.out.println(rectangle.getArea(100, 20));
	Shape circle = new Shape();
	System.out.println(circle.getArea(10));
    }
}
