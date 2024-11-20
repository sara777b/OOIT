package samostalni_zadaci;

public class SamostalniTest {

	public static void main(String[] args) {
		
		
		Auto auto = new Auto("Mercedes");
		
		auto.oAutu(null); //ovo mi je on suggestovao
		auto.setUkljucen(true);

		auto.Ubrzaj(60);
		auto.oAutu(null);
		
		auto.Ubrzaj(110);
		auto.oAutu(null);
		
		auto.setBrzina(110);
		auto.oAutu(null);
		
		auto.Stani(60);


	}

}
