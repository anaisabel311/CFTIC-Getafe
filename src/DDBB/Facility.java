package DDBB;

public class Facility {

	private int id;
	private double guid;
	private String name;
	private String description;
	private String category;
	private String address;
	private double heigh;
	
// CONSTRUCTOR	
	
	public Facility(int id, double guid, String name, String description, String category, String address, double heigh) {
		super();
		this.id = id;
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.category = category;
		this.address = address;
		this.heigh = heigh;
	}

// GETTERS AND SETTERS	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGuid() {
		return guid;
	}

	public void setGuid(double guid) {
		this.guid = guid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}
	
	
	@Override
	public String toString() {
		return "Facility [id=" + id + ", guid=" + guid + ", name=" + name + ", description=" + description
				+ ", category=" + category + ", address=" + address + ", heigh=" + heigh + "]";
	}
	
	
	
}
