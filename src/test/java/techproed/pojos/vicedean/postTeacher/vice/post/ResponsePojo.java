package techproed.pojos.vicedean.postTeacher.vice.post;

import techproed.pojos.vicedean.postTeacher.vice.post.ObjectPojo;

import java.io.Serializable;

public class ResponsePojo implements Serializable {
	private static ObjectPojo object;
	private String message;
	private String httpStatus;

	public ResponsePojo() {
	}

	public ResponsePojo(ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public static ObjectPojo getObject(){
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
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}