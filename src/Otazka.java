
public class Otazka {
	private String otazka;
	private String[] mozneOdpovedi;
	private int spravne;
	
	public Otazka(String otazka, String[] mozneOdpovedi, int spravne) {
		super();
		this.otazka = otazka;
		this.mozneOdpovedi = mozneOdpovedi;
		this.spravne = spravne;
	}
	
	public Otazka(String otazka, int pocetOdpovedi, int spravne) {
		super();
		this.otazka = otazka;
		this.mozneOdpovedi = new String[pocetOdpovedi];
		this.spravne = spravne;
	}
	
	
	public Otazka(int pocetOdpovedi) {
		super();
		this.mozneOdpovedi = new String[pocetOdpovedi];
	}

	public String getOtazka() {
		return otazka;
	}

	public void setOtazka(String otazka) {
		this.otazka = otazka;
	}

	public void setMoznaOdpoved(String moznaOdpoved, int index) {
		this.mozneOdpovedi[index] = moznaOdpoved;
	}
	
	public String getMoznaOdpoved(int i) {
		return this.mozneOdpovedi[i];
	}

	public int getSpravne() {
		return spravne;
	}

	public void setSpravne(int spravne) {
		this.spravne = spravne;
	}



}
