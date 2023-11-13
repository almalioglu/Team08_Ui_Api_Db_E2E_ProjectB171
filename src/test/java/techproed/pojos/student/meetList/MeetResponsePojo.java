package techproed.pojos.student.meetList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MeetResponsePojo implements Serializable {
	private String date;
	private String teacherSsn;
	private int advisorTeacherId;
	private String teacherName;
	private String description;
	private List<StudentsPojo> students;
	private String startTime;
	private String stopTime;
	private int id;

	public MeetResponsePojo() {
	}

	public MeetResponsePojo(String date, String teacherSsn, int advisorTeacherId, String teacherName, String description, List<StudentsPojo> students, String startTime, String stopTime, int id) {
		this.date = date;
		this.teacherSsn = teacherSsn;
		this.advisorTeacherId = advisorTeacherId;
		this.teacherName = teacherName;
		this.description = description;
		this.students = students;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.id = id;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setTeacherSsn(String teacherSsn){
		this.teacherSsn = teacherSsn;
	}

	public String getTeacherSsn(){
		return teacherSsn;
	}

	public void setAdvisorTeacherId(int advisorTeacherId){
		this.advisorTeacherId = advisorTeacherId;
	}

	public int getAdvisorTeacherId(){
		return advisorTeacherId;
	}

	public void setTeacherName(String teacherName){
		this.teacherName = teacherName;
	}

	public String getTeacherName(){
		return teacherName;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setStudents(List<StudentsPojo> students){
		this.students = students;
	}

	public List<StudentsPojo> getStudents(){
		return students;
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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"MeetResponsePojo{" + 
			"date = '" + date + '\'' + 
			",teacherSsn = '" + teacherSsn + '\'' + 
			",advisorTeacherId = '" + advisorTeacherId + '\'' + 
			",teacherName = '" + teacherName + '\'' + 
			",description = '" + description + '\'' + 
			",students = '" + students + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}