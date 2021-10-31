import java.util.Date;

public class User {
	
	protected int id;
	protected String name;
	protected String surname;
	protected String residence;
	protected Date birthday;
	
	public int getId() {
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
