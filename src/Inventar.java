
import java.util.HashMap;

public class Inventar {
	private HashMap<ItemType, Item> Inventar = new HashMap<>();

	public Inventar() {
		Inventar.put(ItemType.Zbran, null);
		Inventar.put(ItemType.Stit, null);
		Inventar.put(ItemType.Odev, null);
		Inventar.put(ItemType.Sperk, null);
	}
	
	public Item add(Item item) {
		return Inventar.put(item.getTyp(), item);
	}
	
	public Item inInventar(ItemType type) {
		return Inventar.get(type);
	}

	@Override
	public String toString() {
		String vypis = "Výstroj:\n";
		for(ItemType type : Inventar.keySet()) {
			vypis += type.printItemType() +": "+Inventar.get(type).toString()+"\n";
		}
		return vypis;
	}
}
