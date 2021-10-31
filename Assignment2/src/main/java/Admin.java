import java.util.List;

public class Admin extends User {
	
	private String password;
	private List<String> currentSessionsOwned;
	private List<String> oldsessionsOwned;
	
	public List<String> getCurrentSessionsOwned() {
		return currentSessionsOwned;
	}
	
	public List<String> getOldsessionsOwned() {
		return oldsessionsOwned;
	}
}
