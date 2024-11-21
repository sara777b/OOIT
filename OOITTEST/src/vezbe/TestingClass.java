package vezbe;
import geometry.Point; //moramo importovati point i ostale 
import geometry.Line;
import geometry.Rectangle;
import geometry.Circle;
public class TestingClass {

	public static void main(String[] args) {
		
		//Points
		Point p1 = new Point();
		Point p2 = new Point();
		//treba nam dva pointa za zadatak
		
		p1.setX(20);
		p2.setX(30);
		
		System.out.println("Razmak je " + p1.distance(p2));
		
		//Line
		Line l1 = new Line();
		
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		
		Circle c1 = new Circle(new Point (50,50),20);
		Rectangle r1 = new Rectangle(new Point(25,25),40,40);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(r1);
		
		System.out.println(p1 instanceof Object); // Object je root klasa 
		Object obj = new Circle();
		System.out.println(obj instanceof Circle);
		
		System.out.println(p1.equals(p2));
	}

}
