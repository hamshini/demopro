package org.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Profile")
public class UserProfile {
	@OneToOne(mappedBy="profile")
	private UserCredential credential;
	@Id
	@GeneratedValue
	@Column(name="Profid")
private int pid;
	@Column(name="fname")
private String firstName;
	@Column(name="lname")
private String Lname;
	@Column(name="email")
private String email;
	@Column(name="pno")
private String pno;

public UserCredential getCredential() {
		return credential;
	}
	public void setCredential(UserCredential credential) {
		this.credential = credential;
	}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPno() {
	return pno;
}
public void setPno(String pno) {
	this.pno = pno;
}

}
