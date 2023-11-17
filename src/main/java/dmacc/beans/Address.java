/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Oct 25, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	
	public Address() {

	}
	
	public Address(String street, String city, String state) {
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city
				+ ", state=" + state + "]";
	}
}