package techproed.pojos.vicedean.getlessonteacher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetlessonsResponsePojo implements Serializable {
	private List<Integer> lessonProgramId;
	private String startTime;
	private String stopTime;
	private List<LessonNamePojo> lessonName;
	private List<TeachersPojo> teachers;
	private List<Object> students;
	private String day;

	public GetlessonsResponsePojo() {
	}

	public GetlessonsResponsePojo(List<Integer> lessonProgramId, String startTime, String stopTime, List<LessonNamePojo> lessonName, List<TeachersPojo> teachers, List<Object> students, String day) {
		this.lessonProgramId = lessonProgramId;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lessonName = lessonName;
		this.teachers = teachers;
		this.students = students;
		this.day = day;
	}

	public void setLessonProgramId(List<Integer> lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public List<Integer> lessonProgramId(){
		return lessonProgramId;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	public void setLessonName(List<LessonNamePojo> lessonName){
		this.lessonName = lessonName;
	}

	public List<LessonNamePojo> getLessonName(){
		return lessonName;
	}

	public void setTeachers(List<TeachersPojo> teachers){
		this.teachers = teachers;
	}

	public List<TeachersPojo> getTeachers(){
		return teachers;
	}

	public void setStudents(List<Object> students){
		this.students = students;
	}

	public List<Object> getStudents(){
		return students;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"GetlessonsResponsePojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			",teachers = '" + teachers + '\'' + 
			",students = '" + students + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}