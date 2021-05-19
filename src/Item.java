

public class Item {
	private String jmeno;
	private String popis;
	private ItemType typ;
	
	public Item(String jmeno, String popis, ItemType typ) {
		this.jmeno = jmeno;
		this.popis = popis;
		this.typ = typ;
	}
	
	public ItemType getTyp() {
		return typ;
	}

	public void setTyp(ItemType typ) {
		this.typ = typ;
	}

	@Override
	public String toString() {
		return jmeno + " - " + popis;
	}
}
