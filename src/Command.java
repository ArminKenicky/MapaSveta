import java.util.ArrayList;

public interface Command {
	public boolean isMatch(ArrayList<Argument> list);

	public void execute();
}
