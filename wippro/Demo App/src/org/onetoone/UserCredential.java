package org.onetoone;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_credential")
public class UserCredential {
	@OneToOne
	private UserProfile profile;
private String username;
private String password;
private String status;

public UserProfile getProfile() {
	return profile;
}
public void setProfile(UserProfile profile) {
	this.profile = profile;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
