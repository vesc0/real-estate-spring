package p.real_estate.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="realestate")
public class RealEstate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int realestate_id;
	
	private String name;
	private String type;
	private String city;
	private int area;
	private int value;
	
	@ManyToMany(mappedBy = "realEstate")
	private Set<Owner> owner;
	
	public RealEstate(int realestate_id, String name, String type, String city, int area, int value) {
		this.realestate_id = realestate_id;
		this.name = name;
		this.type = type;
		this.city = city;
		this.area = area;
		this.value = value;
	}
	
	public RealEstate() {
			
	}

	public int getRealestate_id() {
		return realestate_id;
	}

	public void setRealestate_id(int realestate_id) {
		this.realestate_id = realestate_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
		
}
