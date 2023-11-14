package techproed.pojos.Contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActualResponsePojoEB implements Serializable {
	private ObjectPojoEB object;
	private String message;
	private String httpStatus;

	public ActualResponsePojoEB() {
	}

	public ActualResponsePojoEB(ObjectPojoEB object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojoEB object){
		this.object = object;
	}

	public ObjectPojoEB getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ActualResponsePojoEB{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}