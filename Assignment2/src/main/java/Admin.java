import java.util.List;

public class Admin extends User {
	
	private String password;
	private List<String> sessionsOwned;
	
	public List<String> getSessionsOwned() {
		return this.sessionsOwned;
	} 	
}
