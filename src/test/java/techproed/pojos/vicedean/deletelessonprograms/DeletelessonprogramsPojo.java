package techproed.pojos.vicedean.deletelessonprograms;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeletelessonprogramsPojo implements Serializable {
	private String message;
	private String httpStatus;

	public DeletelessonprogramsPojo() {
	}

	public DeletelessonprogramsPojo(String message, String httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
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
			"DeletelessonprogramsPojo{" + 
			"message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}