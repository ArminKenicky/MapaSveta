import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Okno o1= new Okno();
		//MapaSveta s = new MapaSveta(5,5); 
		try {
			MapaSveta mapa = MapaSveta.nacti("mapa.csv");
			System.out.println("Misto: " + mapa.nazevAktualniPolohy());
			if (!mapa.jdiNa(0)) {
				System.out.println("nejde");
			}
			System.out.println("Misto: " + mapa.nazevAktualniPolohy());
			if (!mapa.jdiNa(3)) {
				System.out.println("nejde");
			}
			System.out.println("Misto: " + mapa.nazevAktualniPolohy());
			if (!mapa.jdiNa(3)) {
				System.out.println("nejde");
			}
			System.out.println("Misto: " + mapa.nazevAktualniPolohy());
			if (!mapa.jdiNa(0)) {
				System.out.println("nejde");
			}
			System.out.println("Misto: " + mapa.nazevAktualniPolohy());
		} catch (FileNotFoundException e) {
			System.out.println("Soubor s mapou hern�ho sv�ta nebyl nalezen.");
		} catch (IOException ex) {
			System.out.println("Nastal probl�m p�i �ten� dat ze souboru.");
		} catch (Exception ex) {
			System.out.println("Data v souboru nep�estavuj� mapu sv�ta.");
			System.out.print("dej n�co jin�ho.");
		}
		SvetoveStrany smer = SvetoveStrany.JIH;

		

	}

}
