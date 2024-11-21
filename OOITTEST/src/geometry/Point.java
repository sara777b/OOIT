package geometry;

public class Point {

	//u klasi nikad ne dodajemo vrednosti nego ih samo inicilizujemo
	
	private int x;
	private int y;
	private boolean selected;
	
	//konstruktor ide odmah posle atributa, nema povratnu vrednost i prazna je
	public Point() {

	}
	
	//default konstruktor
	public Point (int x, int y) {
		this.x= x;
		this.y = y;
		//ovde se inicijalizuje klasa Point koja ima dve koordinante tacke x i y
	}
	
	public Point (int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
		//ovo pravimo u slucaju da zelimo i nesto sa selected i nesto bez selected da radimo
	}
	
	//metode su public a ono unutar njih private
	
	public double distance (Point p) {
		//kreiramo distancu koja uzima podatke iz pointa
		//double zato sto moze biti decimalni sistem 
		//naziv(distance) moze biti bilo sta
		
		int dx = x - p.x; //dx je razlika izmedju dva objekta
		int dy = y - p.y; //Point je tip parametra a p naziv
		double distance = Math.sqrt(dx*dx + dy*dy); //udaljenost u 2D izmedju (x1,y1) i (x2,y2) = pitagorina t
		return distance;
	}
	public boolean Contains(int x, int y) {
		return distance(new Point(x,y)) <=2;
		//jel ovo 2 proizvoljno ili ima u zadatku?
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y +")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point temp = (Point)obj;
			if(x == temp.getX() && y == temp.getY()) {
				return true;
			}
		}
		return false; //ako nije true vraca false
	}
	//get za vracanje vrednosti
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	//postavljanje nove vrednosti 
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public void setSelected (boolean selected) {
		this.selected = selected;
	}
}
