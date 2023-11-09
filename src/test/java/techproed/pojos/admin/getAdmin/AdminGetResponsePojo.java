package techproed.pojos.admin.getAdmin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminGetResponsePojo implements Serializable {
	private List<ContentPojo> content;

	public AdminGetResponsePojo(List<ContentPojo> content) {
		this.content = content;
	}

	public AdminGetResponsePojo() {
	}


	public void setContent(List<ContentPojo> content){
		this.content = content;
	}

	public List<ContentPojo> getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"AdminGetResponsePojo{" + 
			"content = '" + content + '\'' + 
			"}";
		}
}