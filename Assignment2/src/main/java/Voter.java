import java.util.List;

public class Voter extends User {
	
	private int password;
	private List<String> sessionsVoted;
	
	public List<String> getSessionsVoted() {
		return this.sessionsVoted;
	}
	
}
