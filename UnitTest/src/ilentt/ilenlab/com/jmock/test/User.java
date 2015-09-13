package ilentt.ilenlab.com.jmock.test;

import java.util.Date;

public class User {
	private long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	public User() {
		this.setUserName("");
		this.setPassword("");
		this.setFirstName("");
		this.setLastName("");
		this.setDateOfBirth(new Date());
	}
	
	public User(String userName, String password, String firstName, String lastName, Date dateOfBirth) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDateOfBirth(dateOfBirth);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
