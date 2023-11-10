package techproed.pojos.student;

import java.io.Serializable;

public class LessonNamePojo implements Serializable {
	private int creditScore;
	private boolean compulsory;
	private int lessonId;
	private String lessonName;

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
	}

	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	@Override
 	public String toString(){
		return 
			"LessonNamePojo{" + 
			"creditScore = '" + creditScore + '\'' + 
			",compulsory = '" + compulsory + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}