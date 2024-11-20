package vezbe;
import geometry.Point; //moramo importovati point i ostale 

public class TestingClass {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		//treba nam dva pointa za zadatak
		
		p1.setX(20);
		p2.setX(30);
		
		System.out.println("Razmak je " + p1.distance(p2));
		
	}

}
