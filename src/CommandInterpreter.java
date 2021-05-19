import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommandInterpreter {
	private HashMap<String, Command> allCommands = new HashMap<>();

	public void commandParseAndExecute(String commandLine, Player player) {
		commandLine = commandLine.trim();
		String[] tokens = commandLine.split(" ");
		tokens = filterTokens(tokens);
		try {
			ArrayList<Argument> listArgument = getArguments(tokens, player);
			Command cmd = allCommands.get(tokens[0]);
			if (cmd.isMatch(listArgument)) {
				cmd.execute();
			} else {
				player.sendMessage("???");
			}
		} catch (Exception e) {
			player.sendMessage("???");
		}
	}

	private ArrayList<Argument> getArguments(String[] tokens, Player player) throws Exception {
		ArrayList<Argument> list = new ArrayList<>();
		for (int i = 1; i < tokens.length; i++) {
			list.add(ArgumentFactory.createArgument(tokens[i], player));
		}
		return list;
	}

	private String[] filterTokens(String[] tokens) {
		// TODO Auto-generated method stub
		return null;
	}

}
