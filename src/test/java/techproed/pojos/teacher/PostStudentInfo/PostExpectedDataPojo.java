package techproed.pojos.teacher.PostStudentInfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostExpectedDataPojo implements Serializable {
	private int absentee;
	private int educationTermId;
	private double finalExam;
	private String infoNote;
	private int lessonId;
	private double midtermExam;
	private int studentId;

	public PostExpectedDataPojo() {
	}

	public PostExpectedDataPojo(int absentee, int educationTermId, int finalExam, String infoNote, int lessonId, int midtermExam, int studentId) {
		this.absentee = absentee;
		this.educationTermId = educationTermId;
		this.finalExam = finalExam;
		this.infoNote = infoNote;
		this.lessonId = lessonId;
		this.midtermExam = midtermExam;
		this.studentId = studentId;
	}

	public void setAbsentee(int absentee){
		this.absentee = absentee;
	}

	public int getAbsentee(){
		return absentee;
	}

	public void setEducationTermId(int educationTermId){
		this.educationTermId = educationTermId;
	}

	public int getEducationTermId(){
		return educationTermId;
	}

	public void setFinalExam(int finalExam){
		this.finalExam = finalExam;
	}

	public double getFinalExam(){
		return finalExam;
	}

	public void setInfoNote(String infoNote){
		this.infoNote = infoNote;
	}

	public String getInfoNote(){
		return infoNote;
	}

	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setMidtermExam(int midtermExam){
		this.midtermExam = midtermExam;
	}

	public double getMidtermExam(){
		return midtermExam;
	}

	public void setStudentId(int studentId){
		this.studentId = studentId;
	}

	public int getStudentId(){
		return studentId;
	}

	@Override
 	public String toString(){
		return 
			"ExpectedDataPojo{" + 
			"absentee = '" + absentee + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",finalExam = '" + finalExam + '\'' + 
			",infoNote = '" + infoNote + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",midtermExam = '" + midtermExam + '\'' + 
			",studentId = '" + studentId + '\'' + 
			"}";
		}
}