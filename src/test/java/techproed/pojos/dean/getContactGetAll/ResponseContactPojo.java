package techproed.pojos.dean.getContactGetAll;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseContactPojo implements Serializable {
	private String email;
	private String message;
	private String name;
	private String subject;

	public ResponseContactPojo() {
	}

	public ResponseContactPojo(String email, String message, String name, String subject) {
		this.email = email;
		this.message = message;
		this.name = name;
		this.subject = subject;
	}

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

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	@Override
 	public String toString(){
		return 
			"ResponseContactPojo7Pojo{" + 
			"email = '" + email + '\'' + 
			",message = '" + message + '\'' + 
			",name = '" + name + '\'' + 
			",subject = '" + subject + '\'' + 
			"}";
		}
}