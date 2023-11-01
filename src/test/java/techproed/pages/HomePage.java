package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import techproed.utilities.Driver;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']") public WebElement loginButton;
    @FindBy(xpath = "//*[@class='header_link me-2']") public WebElement registerButton;
    @FindBy(xpath = "//*[@id='username']") public WebElement loginUserName;
    @FindBy(xpath = "//*[@id='password']") public WebElement loginPassword;
    @FindBy(xpath = "(//*[text()='Login'])[2]") public WebElement loginEkraniLoginButton;
    @FindBy(xpath = "//*[@id='surname']") public WebElement registerSurnameText;
    @FindBy(xpath = "//*[@id='name']") public WebElement registerNameText;







  //Mehmet-30
    @FindBy(xpath = "(//body)[1]//tr//td[3]") public List<WebElement> ogretmenListesiME;
    @FindBy(xpath = "(//body)[1]//tr//td[4]") public List<WebElement> gunListesiME;
    @FindBy(xpath = "(//body)[1]//tr//td[5]") public List<WebElement> startTimeListesiME;
    @FindBy(xpath = "(//body)[1]//tr//td[6]") public List<WebElement> stopTimeListesiME;
    @FindBy(xpath = "//*[@type='checkbox']") public List<WebElement> dersSecmeCheckboxME;
    @FindBy(xpath = "//*[text()='Submit']") public WebElement dersSecmeSubmitME;
    @FindBy(xpath = "(//tbody)[1]") public List<WebElement> tumDerslerListesiME;






























































































    //İsmailAlmalıoglu-130
    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']") public WebElement studentInfoManagment_is;
    @FindBy(xpath = "//select[@id='lessonId']") public WebElement chooseLessonBox_is;
    @FindBy(xpath = "//select[@id='studentId']") public WebElement chooseStudentBox_is;
    @FindBy(xpath = "//select[@id='educationTermId']") public WebElement chooseEducationTermBox_is;
    @FindBy(xpath = "//input[@id='absentee']") public WebElement absenteeBox_is;
    @FindBy(xpath = "//input[@id='midtermExam']") public WebElement midtermExamBox_is;
    @FindBy(xpath = "//input[@id='finalExam']") public WebElement finalExamBox_is;
    @FindBy(xpath = "//input[@id='infoNote']") public WebElement infoNoteBox_is;
    @FindBy(xpath = "//button[.='Submit']") public WebElement submitButon_is;
    @FindBy(xpath = "//h5[.='Student Info List']") public WebElement studentInfoList_is;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]") public WebElement edit1_is;
    @FindBy(xpath = "(//i[@class='fa-solid fa-trash'])[1]") public WebElement delete1_is;
    @FindBy(xpath = "//div[text()='Student Info saved Successfully']") public  WebElement studentInfoSavedYazisi_is;

   
  



















































































  //Büşra-230



































































































    //Cihan-330
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tab-lessonProgram\"]") public WebElement lessonprogramButton;
    @FindBy(xpath = "//*[@class=' css-1jqq78o-placeholder']") public WebElement lessonddm;
    @FindBy(xpath = "//*[@id=\"react-select-2-input\"]") public WebElement lessonddm2;
    @FindBy(xpath = "//*[@id='react-select-2-input']") public WebElement inputTag;
    @FindBy(xpath = "//*[@id='react-select-2-listbox']") public WebElement SelectSecim;
    @FindBy(xpath = "//*[@id=\"educationTermId\"]") public WebElement chooseEducationddm;
    @FindBy(xpath = "//*[@id='day']") public WebElement chooseDayddm;
    @FindBy(xpath = "//*[@id='startTime']") public WebElement startTimeddm;
    @FindBy(xpath = "//*[@id='stopTime']") public WebElement stopTimeddm;
    @FindBy(xpath = "(//button[@type='button'])[30]") public WebElement submitbutton;
    @FindBy(xpath = "//*[@id=\"teacherId\"]") public WebElement chooseTeacher;
    @FindBy(xpath = "//*[@id=\"teacherId\"]") public WebElement chooseTeacher2;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[3]/div/div/div[2]/div[2]/button")
    public WebElement assignmmentSubmit;
    @FindBy(xpath = "//*[@id=\"teacherId\"]") public WebElement chooselessonbox;



















































































   //Saadet-430
   @FindBy(xpath = "//*[@class='header_link me-2']") public WebElement registerButtonSG;
    @FindBy(xpath = "//*[@id='username']") public WebElement loginUserNameSG;
    @FindBy(xpath = "//*[@id='password']") public WebElement loginPasswordSG;
    @FindBy(xpath = "(//*[text()='Login'])[2]") public WebElement loginEkraniLoginButtonSG;
    @FindBy(xpath = "(//*[@id='name']") public WebElement registerNameTextSG;
    @FindBy(xpath = "//*[@id='surname']") public WebElement registerSurnameTextSG;
    @FindBy (xpath = "//*[@class='fa fa-lock']") public WebElement girisloginButtonSG;
    @FindBy(xpath = "(//*[@type='button'])[1]") public WebElement menuButtonSG;
    @FindBy (xpath = "(//*[text ()='Student Management'])") public WebElement studentManagementSG;
    @FindBy (xpath = "//*[@id='advisorTeacherId']") public WebElement contactTeacherSG;
    @FindBy(xpath = "//input[@placeholder='Name']") public WebElement namePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Surname']") public WebElement SurnamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Birth Place']") public WebElement BirthPlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Email Address']") public WebElement EmailPlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Phone Number']") public WebElement PhonePlaceHolderSG;
    @FindBy (xpath = "//input[@value='FEMALE']") public WebElement FemaleRadioButtonSG;
    @FindBy (xpath = "//input[@value='MALE']") public WebElement maleRadioButtonSG;
    @FindBy (xpath = "(//*[@class='form-control is-invalid'])[1]") public WebElement DateOfBirthSG;
    @FindBy(xpath = "//input[@placeholder='ssn']") public WebElement ssnPlaceHolderSG;
    @FindBy(css = "#username") public WebElement usernamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Father Name']") public WebElement fathernamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Mother Name']") public WebElement mothernamePlaceHolderSG;
    @FindBy(xpath = "//input[@placeholder='Password']") public WebElement passwordPlaceHolderSG;
    @FindBy (xpath = "(//*[text ()='Submit'])") public WebElement SubmitbuttonSG;
    @FindBy (xpath = "(//*[@class='page-link'])[5]") public WebElement lastPageButtonSG;
    @FindBy (xpath = "//*[@class='table-group-divider']") public WebElement studentliSTSG;
    @FindBy (xpath = "(//*[text()='Required'])[1]") public WebElement nameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[2]") public WebElement SurnameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[3]") public WebElement BirthPlaceRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[4]") public WebElement EmailRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[5]") public WebElement phoneRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[6]") public WebElement dateofbirthRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[7]") public WebElement ssnRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[8]") public WebElement usernameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[9]") public WebElement fathernameRequiredSG;
    @FindBy (xpath = "(//*[text()='Required'])[10]") public WebElement motnameRequiredSG;
    @FindBy (xpath = "//*[text()='Enter your password']") public WebElement passwordRequiredSG;
    @FindBy (xpath = "//*[text ()='Contact Get All']") public WebElement contactgetallButtonSG;
    @FindBy (xpath = "//*[text()='Name']") public   WebElement getAllNameSG;
    @FindBy (xpath = "//*[text()='Email']") public   WebElement getAllEmailSG;
    @FindBy (xpath = "//*[text()='Date']") public   WebElement getAllDateSG;
    @FindBy (xpath = "//*[text()='Subject']") public   WebElement getAllSubjectSG;
    @FindBy (xpath = "//*[text()='Message']") public   WebElement getAllMessageSG;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement verifyMessageSG;























































    //Ayşe-530
@FindBy(xpath = "//*[@id='name']")
public WebElement nameKutusu;
@FindBy(xpath = "//*[@id='surname']")
public WebElement surnameKutusu;
@FindBy(xpath = "//*[@id='birthPlace']")
public WebElement birthPlaceKutusu;
//US07
@FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
public WebElement menuButton;
@FindBy(xpath = "(//*[@role='button'])[11]")
public WebElement  contactGetAllButton;
@FindBy(xpath = "//tbody//tr[1]/td[1]/span[1]")
public WebElement nameColumn;
@FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]")
public WebElement emailColumn;
@FindBy(xpath = "//tbody/tr[2]/td[3]/span[1]")
public WebElement dateColumn;
@FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]")
public WebElement subjectColumn;
@FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]")
public WebElement messageColumn;































































































//Elif-630
  @FindBy(xpath = "(//*[@type='button'])[3]") public WebElement registerbutonEB;
  @FindBy(xpath ="//*[text()='Guest User registered.']" ) public WebElement guestUserRegisteredEB;//"//div[@role='alert']"

 @FindBy(xpath = "//*[@id='phoneNumber']") public  WebElement phoneNumberEB;





























































































 //MeryemAkbayır-730



































































































 //MeryemOzgun-830
    @FindBy(xpath = "//*[@class='header_link ms-2']") public WebElement loginButton_mo;
    @FindBy(xpath = "//*[@id='username']") public WebElement loginUserName_mo;
    @FindBy(css = "nav>button") public WebElement menuButton_mo;
    @FindBy(xpath = "(//*[@class='nav-link'])[7]") public WebElement meetManagement_mo;
    @FindBy(xpath = "//*[@id='react-select-2-input']") public WebElement chooseStudentsBox;
    @FindBy(xpath = "//*[@id='date']") public WebElement dateBox;
    @FindBy(xpath = "//*[@id='startTime']") public WebElement startTimeBox;
    @FindBy(xpath = "//*[@id='stopTime']") public WebElement stopTimeBox;
    @FindBy(xpath = "//*[@id='description']") public WebElement descriptionBox;
    @FindBy(xpath = "(//*[@type='button'])[5]") public WebElement submitButton_mo;
    @FindBy(xpath = "(//*[text()='ileri bir tarih olmalı'])[1]") public WebElement ileriBirTarihOlmalıMesaji;
    @FindBy(xpath = "(//*[text()='Meet Saved Successfully'])[2]") public WebElement meetSavedSuccessfullyMesaj;
    @FindBy(xpath = "//*[text()='Required']") public WebElement requiredUyarisi;
    @FindBy(xpath = "(//*[text()='Error: start time must not be greater than or equal to stop time'])[1]") public WebElement startveStopTimeAynıiseHataMesaji;
    @FindBy(xpath = "(//span)[9]") public WebElement studensGorunurlugu;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]") public WebElement editButton;
    @FindBy(xpath = "(//*[@aria-hidden='true'])[21]") public WebElement editChooseStudentSilme;
    @FindBy(xpath = "//*[@id='react-select-3-input']") public WebElement editChooseStudents;
    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement editSubmit;
    @FindBy(xpath = "(//*[text()='Meet Updated Successfully'])[2]") public WebElement editMeetUpdateSuccesfullMesaji;
    @FindBy(xpath = "(//*[@class='form-control'])[5]") public WebElement editDateOfMeet;
    @FindBy(xpath = "(//*[@id='description'])[2]") public WebElement editDescription;
    @FindBy(xpath = "//*[@class='btn btn-danger']") public WebElement deleteButton_mo;
    @FindBy(xpath = "(//div)[69]") public WebElement meetDeleteSuccesfullMesaji;


























































    //Taha-930
    @FindBy(xpath = "//*[@id='root']/div/header/div[1]/div/div/div[2]/a[2]")
    public WebElement LoginTE;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement UserNameTE;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement PasswordTE;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement LoginButtonTE;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement MenuTE;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[1]")
    public WebElement LessonManagementTE;

    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement LessonsTE;

    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement LessonNameTE;

    @FindBy(xpath = "//*[@id='compulsory']")
    public WebElement CompulsoryTE;

    @FindBy(xpath = "//*[@id='creditScore']")
    public WebElement CreditScoreTE;

    @FindBy(xpath = "  (//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement SubmitButtonTE;////*[@id='6']

    @FindBy(xpath = "//*[@id='6']")
    public WebElement LessonCreatedyazisi;






























































































































}

