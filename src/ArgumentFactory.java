
public class ArgumentFactory {
	public static Argument createArgument(String strArgument, Player character) throws Exception {

		Argument arg = new ItemInInventar(strArgument, character.getInventory());
		if (arg.exists()) {
			return arg;
		}
		// nenalezne
		throw new Exception("Neplatny prikaz");

	}

}
