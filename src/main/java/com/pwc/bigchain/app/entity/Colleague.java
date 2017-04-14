/**
 * 
 */
package com.pwc.bigchain.app.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lokeshk025
 *
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Colleague")
public class Colleague {

	@Id
	private String id;

	private String name;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@DBRef
	private Address Address;

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return Address;
	}

	/**
	 * @return the recognitions
	 */
	public Recognitions[] getRecognitions() {
		return recognitions;
	}

	/**
	 * @param recognitions
	 *            the recognitions to set
	 */
	public void setRecognitions(Recognitions[] recognitions) {
		this.recognitions = recognitions;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		Address = address;
	}

	@DBRef
	private Recognitions[] recognitions;

	public Colleague() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Colleague [id=" + id + ", name=" + name + ", Address=" + Address + ", recognitions=" + recognitions
				+ "]";
	}
}