package org.estilolibre.demo.company.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Department dept;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dept
	 */
	public Department getDept() {
		return dept;
	}

	/**
	 * @param dept
	 *            the dept to set
	 */
	public void setDept(Department dept) {
		this.dept = dept;
	}

}
