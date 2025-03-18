package p.real_estate.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name="owner")
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int owner_id;
	
	private String name;
	private String lastname;
	
	public Owner(int owner_id, String name, String lastname) {
		this.owner_id = owner_id;
		this.name = name;
		this.lastname = lastname;
	}
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "realestateowner", 
	joinColumns = @JoinColumn(name = "owner_id", referencedColumnName = "owner_id"), 
	inverseJoinColumns = @JoinColumn(name = "realestate_id", referencedColumnName = "realestate_id"))
	
	private Set<RealEstate> realEstate;
	
	public Owner() {
		
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Owner [owner_id=" + owner_id + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	
	
}
