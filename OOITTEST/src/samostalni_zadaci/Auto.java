package samostalni_zadaci;

public class Auto {
	private int brzina;
	private String marka; //string mora biti veliko slovo 
	private boolean ukljucen;
	
	public Auto () {
		
	}
	
	public Auto(String marka) {
		this.marka = marka;
	}
	public void Ubrzaj (int brzina) {
		if (ukljucen) {
			this.brzina += brzina;
			System.out.println("Auto je ubrzao za " + brzina + "." );
		} else {
			System.out.println("Auto nije ukljucen");
		}
		
		//ako bi stavili odma u if (boolean == true) da li ne bi morali imati else
	}
	
	public void Stani (int brzina) {
		if (ukljucen&& brzina < 50) {
			System.out.println("Auto ce se zaustaviti na 4 sekunde");
		} 
		else if (ukljucen&& brzina >= 50 && brzina <=100 ) {
			System.out.println("Auto ce se zaustaviti na 8 sekundi");
		} 
		else if (ukljucen&& brzina > 100) {
			System.out.println("Auto ce se zaustaviti na 12 sekundi");
		}
		else{
			System.out.println("Auto je iskljucen");
		}
	}
	
	public void oAutu(String marka) {
		System.out.println("Marka automobila je " + this.marka + ".");
		if (ukljucen) {
			System.out.println("Auto je ukljucen i trenutna brzina je " + this.brzina + ".");
		}
		else {
			System.out.println("Auto je iskljucen");
		}
	}
	
	public int getBrzina() {
		return brzina;
	}
	
	public boolean isUkljucen() {
		return ukljucen;
	}
	//boolean je uvek is a ne get
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}
	
	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	//set metode moraju biti tipa void
}
