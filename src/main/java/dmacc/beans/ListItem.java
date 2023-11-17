/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Oct 25, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * 
 */
public class ListItem {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	private Address address;

	// no arg constructor
	public ListItem( ) {
		super();
		this.relationship = "spouse";
	}

	public ListItem(String name) {
		this.name = name;
	}
	public ListItem(String name, String phone, String relationship) {
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}
	
	public ListItem(int id, String name, String phone, String relationship) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}

	//create getters and setters too

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return "Contact [id = “ + id + “, name=" + name + ", phone=" + phone + ", relationship=" + relationship + ", address=" + address + "]";
	}
	
	

}
