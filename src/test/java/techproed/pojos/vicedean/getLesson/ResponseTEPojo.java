package techproed.pojos.vicedean.getLesson;

import java.io.Serializable;

public class ResponseTEPojo implements Serializable {
	private ObjectTEPojo object;
	private String message;
	private String httpStatus;

	public ResponseTEPojo() {
	}

	public ResponseTEPojo(ObjectTEPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectTEPojo object){
		this.object = object;
	}

	public ObjectTEPojo getObject(){
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
			"ResponseTEPojo{" +
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}