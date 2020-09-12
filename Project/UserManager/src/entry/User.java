package entry;

public class User {

	private String username = null;
	private String password = null;
	private Integer qq = null;
	private Integer phone = null;
	public User() {}
	public User(String username, String password, Integer qq, Integer phone) {
		super();
		this.username = username;
		this.password = password;
		this.qq = qq;
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getQq() {
		return qq;
	}
	public void setQq(Integer qq) {
		this.qq = qq;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
}
