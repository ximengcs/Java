package servlet.entry;

public class Person {

	private String name = null;
	private String sex = null;
	
	public Person() {}
	
	public Person( String name, String sex ) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
