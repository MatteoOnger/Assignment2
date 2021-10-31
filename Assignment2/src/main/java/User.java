import java.util.Date;

public class User {
	
	protected String id;
	protected String name;
	protected String surname;
	protected String residence;
	protected Date birthday;
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getResidence() {
		return this.residence;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}	
}
