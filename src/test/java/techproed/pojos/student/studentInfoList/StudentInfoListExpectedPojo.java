package techproed.pojos.student.studentInfoList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentInfoListExpectedPojo implements Serializable {
	private List<ContentPojo> content;

	public StudentInfoListExpectedPojo() {
	}

	public StudentInfoListExpectedPojo(List<ContentPojo> content) {
		this.content = content;
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
			"StudentInfoListExpectedPojo{" + 
			"content = '" + content + '\'' + 
			"}";
		}
}