package homework3;

public class Gamer implements Entity {
	private int id;
	private String firsName;
	private String lastName;
	private int birthYear;
	public Gamer(int id,String firsName, String lastName, int birthYear) {
		this.id=id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
