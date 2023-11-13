package techproed.pojos.vicedean.postContactGetAll;

import java.io.Serializable;

public class ContactGetAllResponse implements Serializable {
	private ObjectResponse object;
	private String message;
	private String httpStatus;

	public ContactGetAllResponse(ObjectResponse object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public ContactGetAllResponse() {
	}

	public void setObject(ObjectResponse object){
		this.object = object;
	}

	public ObjectResponse getObject(){
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
			"ContactGetAllResponse{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}