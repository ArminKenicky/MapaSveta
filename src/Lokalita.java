import java.io.Serializable;
import java.util.ArrayList;

public class Lokalita implements Serializable {
/*
	private String nazev;
	private int id;

	int[] smery = new int[4];

	public Lokalita(String nazev, int id) {
		this.nazev = nazev;
		this.id = id;
	}

	public void pripojLokalitu(int smer, int kam) {
		smery[smer] = kam;
	}

	public String toString() {
		return nazev;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSmer(int smer) {
		return smery[smer];
	}
	*/
	private String jmeno;
	private ArrayList<Npc> npcs=new ArrayList<>();
	private ArrayList<Item> items=new ArrayList<>();

	public ArrayList<Npc> getNpcs() {
		return npcs;
	}
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setNpcs(ArrayList<Npc> npcs) {
		this.npcs = npcs;
	}

	@Override
	public String toString() {
		return jmeno+"("+this.npcs+")"+"["+this.items+"]";
	}

	public Lokalita(String jmeno) {
		super();
		this.jmeno = jmeno;
	}
	public void pripojLokalitu(int i, int parseInt) {
		// TODO Auto-generated method stub
		
	}
	public int getSmer(int smer) {
		// TODO Auto-generated method stub
		return 0;
	}
}
