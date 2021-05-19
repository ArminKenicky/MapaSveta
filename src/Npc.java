import java.util.ArrayList;

public class Npc {

	private String jemno;
	private String popis;

	public Npc(String jemno, String popis) {
		super();
		this.jemno = jemno;
		this.popis = popis;
	}

	@Override
	public String toString() {
		return jemno + ": \n" + popis;

	}

	public String getJemno() {
		return jemno;
	}

	private ArrayList<Npc> npccka = new ArrayList<Npc>();

	public void pridejNpc(Npc npc) {
		npccka.add(npc);
	}

	public Npc odchodNpc(int index) {
		Npc npc = npccka.get(index);
		npccka.remove(index);
		return npc;
	}

	public String toString1() {

		String vypis = jemno + "\n";
		for (Npc np : npccka) {
			vypis += np.getJemno() + ", ";
		}
		return vypis;
	}
}
