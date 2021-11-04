import java.util.List;

public class Admin extends User {
	
	private String password;
	private List<String> currentSessionsOwned;
	private List<String> oldsessionsOwned;
	
	public List<String> getCurrentSessionsOwned() {
		return this.currentSessionsOwned;
	}
	
	public List<String> getOldsessionsOwned() {
		return this.oldsessionsOwned;
	}
}
