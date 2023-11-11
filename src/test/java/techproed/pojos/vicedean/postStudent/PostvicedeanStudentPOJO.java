package techproed.pojos.vicedean.postStudent;

import java.io.Serializable;

public class PostvicedeanStudentPOJO implements Serializable {
	private ObjectPOJO object;
	private String message;


	public PostvicedeanStudentPOJO() {
	}

	public PostvicedeanStudentPOJO(ObjectPOJO object, String message) {
		this.object = object;
		this.message = message;

	}

	public void setObject(ObjectPOJO object){
		this.object = object;
	}

	public ObjectPOJO getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"PostvicedeanStudentPOJO{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}