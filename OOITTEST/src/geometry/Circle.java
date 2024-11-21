package geometry;

public class Circle {

	private int radius;
	private Point center;
	private boolean selected;
	
	public Circle() {
		
	}
	//defualt konstruktor
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
	}
	public Circle(Point center, int radius, boolean selected) {
		this(center,radius);
		this.selected = selected;
	}
	
	public double Area() {
		return radius*radius * Math.PI;
	}
	public double Circumference() {
		return 2*radius* Math.PI;
	}
	public boolean Contains(int x, int y) {
		return center.distance(new Point (x,y)) <= radius;
	}//razmak od centra do radiusa da bismo videli gde je nova tacka (Point x,y) smestena
	
	
	@Override
	public String toString() {
		return "Center: (" + center.getX() + ", " + center.getY()
		+ "), radius = " + radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp = (Circle)obj;
			if(radius == temp.radius) {
				return true;
			}
		}
		return false;
	}
	//geteri
	public int getRadius() {
		return radius;
	}
	public Point getCenter() {
		return center;
	}
	public boolean isSelected() {
		return selected;
	}
	//setteri
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
