package techproed.pojos.student;

import java.util.List;
import java.io.Serializable;

public class ChooseLessonsPayloadPojo implements Serializable {
	private List<Integer> lessonProgramId;

	public ChooseLessonsPayloadPojo() {
	}

	public ChooseLessonsPayloadPojo(List<Integer> lessonProgramId) {
		this.lessonProgramId = lessonProgramId;
	}

	public void setLessonProgramId(List<Integer> lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public List<Integer> getLessonProgramId(){
		return lessonProgramId;
	}

	@Override
 	public String toString(){
		return 
			"ChooseLessonsPayloadPojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			"}";
		}
}