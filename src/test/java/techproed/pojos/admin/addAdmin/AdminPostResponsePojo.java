package techproed.pojos.admin.addAdmin;

import java.io.Serializable;

public class AdminPostResponsePojo implements Serializable {
	private ObjectResponsePojo object;
	private String message;
	private String httpStatus;

	public AdminPostResponsePojo() {
	}

	public AdminPostResponsePojo(ObjectResponsePojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectResponsePojo object){
		this.object = object;
	}

	public ObjectResponsePojo getObject(){
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
			"AdminPostResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}