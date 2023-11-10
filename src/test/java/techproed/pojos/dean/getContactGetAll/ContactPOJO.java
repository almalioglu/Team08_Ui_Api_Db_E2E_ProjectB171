package techproed.pojos.dean.getContactGetAll;

import java.io.Serializable;

public class ContactPOJO implements Serializable {
	private String email;
	private String message;
	private String name;
	private String subject;

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public ContactPOJO() {
	}

	public ContactPOJO(String email, String message, String name, String subject) {
		this.email = email;
		this.message = message;
		this.name = name;
		this.subject = subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	@Override
 	public String toString(){
		return 
			"ContactPOJO{" + 
			"email = '" + email + '\'' + 
			",message = '" + message + '\'' + 
			",name = '" + name + '\'' + 
			",subject = '" + subject + '\'' + 
			"}";
		}
}