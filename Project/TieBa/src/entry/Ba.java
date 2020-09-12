package entry;

/**
 * 吧信息
 * @author lenovo
 *
 */
public class Ba {

	private int id;
	
	private int masterId;
	
	private String name;
	
	private String icon;
	
	public Ba() { }
	
	public Ba( int id, int masterId, String name, String icon ) {
		this.id = id;
		this.masterId = masterId;
		this.name = name;
		this.icon = icon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMasterId() {
		return masterId;
	}

	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
