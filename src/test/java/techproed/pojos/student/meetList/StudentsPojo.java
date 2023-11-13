package techproed.pojos.student.meetList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentsPojo implements Serializable {
	private String birthDay;
	private String fatherName;
	private String gender;
	private int studentNumber;
	private String motherName;
	private boolean active;
	private String ssn;
	private String birthPlace;
	private String phoneNumber;
	private String surname;
	private String name;
	private int id;
	private String email;
	private String username;

	public StudentsPojo() {
	}

	public StudentsPojo(String birthDay, String fatherName, String gender, int studentNumber, String motherName, boolean active, String ssn, String birthPlace, String phoneNumber, String surname, String name, int id, String email, String username) {
		this.birthDay = birthDay;
		this.fatherName = fatherName;
		this.gender = gender;
		this.studentNumber = studentNumber;
		this.motherName = motherName;
		this.active = active;
		this.ssn = ssn;
		this.birthPlace = birthPlace;
		this.phoneNumber = phoneNumber;
		this.surname = surname;
		this.name = name;
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}

	public String getFatherName(){
		return fatherName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setStudentNumber(int studentNumber){
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber(){
		return studentNumber;
	}

	public void setMotherName(String motherName){
		this.motherName = motherName;
	}

	public String getMotherName(){
		return motherName;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"StudentsPojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",fatherName = '" + fatherName + '\'' + 
			",gender = '" + gender + '\'' + 
			",studentNumber = '" + studentNumber + '\'' + 
			",motherName = '" + motherName + '\'' + 
			",active = '" + active + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",surname = '" + surname + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}