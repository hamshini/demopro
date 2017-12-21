package org.enumerator;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class UserInfo {
	@Enumerated(EnumType.STRING)	
private String name;
private String emailid;
private LoginType Login;

public LoginType getLogin() {
	return Login;
}

public void setLogin(LoginType login) {
	Login = login;
}

public UserInfo() {
	super();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
