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
    @FindBy(xpath = "(//tbody)[1]//tr") public List<WebElement> tumDerslerListesiME;
    @FindBy(xpath = "(//tbody)[2]//tr") public List<WebElement> secilenDerslerListesiME;
    @FindBy(xpath = "//*[@id='name']") public WebElement adminNameTextBoxME;
    @FindBy(xpath = "//*[@role='alert']") public WebElement adminSavedVerifyME;
    @FindBy(xpath = "//*[text()='Required']") public WebElement adminDontSavedVerifyME;
    @FindBy(xpath = "//*[text()='Enter your password']") public WebElement adminDontSavedVerifyPwdME;
    @FindBy(xpath = "//*[text()='At least 8 characters']") public WebElement adminDontSavedVerifyPwdSekizKarakterME;
    @FindBy(xpath = "//*[text()='Please enter valid phone number']") public WebElement adminDontSavedVerifyHataliTelefonME;
    @FindBy(xpath = "(//tbody)[1]//tr//td[position() >1]") public List<WebElement> tumDerslerListesiPositionME;
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']") public WebElement studentMenuButtonME;
    @FindBy(xpath = "//*[text()='Grades and Announcements']") public WebElement gradesButtonME;
    @FindBy(xpath = "(//tbody)[1]//tr") public List<WebElement> studentInfoListME;
    @FindBy(xpath = "(//tbody)[2]//tr") public List<WebElement> studentMeetListME;
















































































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
    @FindBy(xpath = "//*[@id='lessonId']") public WebElement chooseLessonDDMenu_is;
    @FindBy(xpath = "//*[@id='studentId']") public WebElement chooseStudentDDMenu_is;
    @FindBy(xpath = "//*[@id='educationTermId']") public WebElement chooseEdTermDDMenu_is;
    @FindBy(xpath = "//*[@id='absentee']") public WebElement absenteeNote_is;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']") public WebElement studentNoteSubmitButton_is;
    @FindBy(xpath = "(//*[@class='Toastify__toast-body'])[1]") public WebElement infoAlert_is;
    @FindBy(xpath = "//table//tr") public List<WebElement> tableRows_is;
    @FindBy(xpath = "//*[.='Required']") public WebElement requiredInfo_is;
    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[1]") public WebElement notEditButton_is;
    @FindBy(xpath = "(//*[@class='mt-2 col-md-auto'])[1]") public WebElement notEditStudentNameInfo_is;
    @FindBy(xpath = "(//*[@id='lessonId'])[2]") public WebElement notEditChooseLessonMenu_is;
    @FindBy(xpath = "(//*[@class='form-select'])[4]") public WebElement notEditSecilenDers_is;
    @FindBy(xpath = "(//*[@id='educationTermId'])[2]") public WebElement notEditEducationTermMenu_is;
    @FindBy(xpath = "(//*[@id='absentee'])[2]") public WebElement notEditAbsenteeInfo_is;
    @FindBy(xpath = "(//*[@id='midtermExam'])[2]") public WebElement notEditMidtermInfo_is;
    @FindBy(xpath = "(//*[@id='finalExam'])[2]") public WebElement notEditFinalInfo_is;
    @FindBy(xpath = "(//*[@id='infoNote'])[2]") public WebElement notEditInfoNoteInfo_is;
    @FindBy(xpath = "(//table//td[2])[1]") public WebElement tableLessonInfo_is;
    @FindBy(xpath = "(//table//td[3])[1]") public WebElement tableAbsenteeInfo_is;
    @FindBy(xpath = "(//table//td[7])[1]") public WebElement tableInfoNoteInfo_is;
    @FindBy(xpath = "(//table//td[1])[1]") public WebElement tableStudentName_is;
    @FindBy(xpath = "(//*[@class='btn-close'])[3]") public WebElement closeEditWindowButton_is;
    @FindBy(xpath = "//*[@class='btn btn-danger']") public WebElement deleteStudentInfoButton_is;
    @FindBy(xpath = "//table//tr") public List<WebElement> tableRowsis;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement notEditSubmitButton_is;
    @FindBy(xpath = "//*[@id='6']/div[1]/div[2]") public WebElement notEditDonemDogrulama_is;
    @FindBy(xpath = "(//*[@class='form-select'])[5]") public WebElement notEditsecilenDonem_is;
    @FindBy(xpath = "(//table//td[4])[1]") public WebElement tableMidTermNote_is;
    @FindBy(xpath = "(//table//td[5])[1]") public WebElement tableFinalExamNote_is;

























































    //Büşra-230
  @FindBy(xpath = "//a[@class='header_link ms-2']") public WebElement loginButtonBI;
  @FindBy(xpath = "//input[@id='username']") public WebElement loginUsernameButtonBI;
  @FindBy(xpath = "//input[@id='password']") public WebElement loginPasswordButtonBI;
  @FindBy(xpath = "//button[text()='Login']") public WebElement loginSubmitButtonBI;
  @FindBy(xpath = "//button[text()='Menu']") public WebElement menuButtonBI;
  @FindBy(xpath = "//a[text()='Teacher Management']") public WebElement teacherManagementButtonBI;
  @FindBy(xpath = "//h5[text()='Add Teacher']") public WebElement addTeacherTitleBI;
  //@FindBy(xpath = "//div[@class=' css-13cymwt-control']") public WebElement addSelectLessonDdmBI;
  @FindBy(xpath = "//div[@id='react-select-3-placeholder']") public WebElement addSelectLessonDdmBI;
  @FindBy(xpath = "//input[@id='name']") public WebElement addNameBoxBI;
  @FindBy(xpath = "//input[@id='surname']") public WebElement addSurnameBoxBI;
  @FindBy(xpath = "//input[@id='birthPlace']") public WebElement addBirthPlaceBoxBI;
  @FindBy(xpath = "//input[@id='email']") public WebElement addEmailBoxBI;
  @FindBy(xpath = "//input[@id='phoneNumber']") public WebElement addPhoneBoxBI;
  @FindBy(xpath = "//input[@id='isAdvisorTeacher']") public WebElement addAdvisorTeacherCheckBoxBI;
  @FindBy(xpath = "//input[@value='FEMALE']") public WebElement addGenderFemaleRadioButtonBI;
  @FindBy(xpath = "//input[@value='MALE']") public WebElement addGenderMaleRadioButtonBI;
  @FindBy(xpath = "(//input[@class='form-control is-invalid'])[1]") public WebElement addDateOfBirthBoxBI;
  @FindBy(xpath = "//input[@id='ssn']") public WebElement addSsnBoxBI;
  @FindBy(xpath = "//input[@id='username']") public WebElement addUsernameBoxBI;
  //@FindBy(xpath = "(//input[@class='form-control is-invalid'])[2]") public WebElement addPasswordBoxBI;
  @FindBy(xpath = "//input[@id='password']") public WebElement addPasswordBoxBI;
  @FindBy(xpath = "//button[text()='Submit']") public WebElement addSubmitBoxBI;
  @FindBy(xpath = "//div[text()='Teacher saved successfully']") public WebElement addTeacherSuccessfulTextBI;
  @FindBy(xpath = "//div[@role='alert']") public WebElement noChoiceLessonAlertTextBI;
  @FindBy(xpath = "(//div[text()='Required'])[1]") public WebElement requiredNameAlertTextBI;
  @FindBy(xpath = "(//div[text()='Required'])[2]") public WebElement requiredSurnameAlertTextBI;
  @FindBy(xpath = "(//div[text()='Required'])[3]") public WebElement requiredBirthPlaceAlertTextBI;
  @FindBy(xpath = "(//div[text()='Required'])[4]") public WebElement requiredEmailAlertTextBI;
  @FindBy(xpath = "(//div[text()='Required'])[5]") public WebElement requiredPhoneAlertTextBI;
  @FindBy(xpath = "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']") public WebElement requiredGenderAlertTextBI;
 @FindBy(xpath = "(//div[text()='Required'])[6]") public WebElement requiredDateOfBirthAlertTextBI;
 @FindBy(xpath = "(//div[text()='Required'])[7]") public WebElement requiredSsnAlertTextBI;
 @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']") public WebElement requiredSsnMinimumCharacterAlertTextBI;
 @FindBy(xpath = "(//div[text()='Required'])[8]") public WebElement requiredUsernameAlertTextBI;
 @FindBy(xpath = "//div[text()='Enter your password']") public WebElement requiredPasswordAlertTextBI;
 @FindBy(xpath = "//div[text()='At least 8 characters']") public WebElement requiredPasswordMinimumCharacterAlertTextBI;
 @FindBy(xpath = "//div[text()='One lowercase character']") public WebElement requiredPasswordLowerCharacterAlertTextBI;
 @FindBy(xpath = "//div[text()='One uppercase character']") public WebElement requiredPasswordUpperCharacterAlertTextBI;
 @FindBy(xpath = "//h5[text()='Teacher List']") public WebElement teacherListTitleBI;
 @FindBy(xpath = "//th[text()='Name']") public WebElement nameTeacherListTitleBI;
 @FindBy(xpath = "//th[text()='Phone Number']") public WebElement phoneNumberTeacherListTitleBI;
 @FindBy(xpath = "(//th[text()='Ssn'])[1]") public WebElement ssnTeacherListTitleBI;
 @FindBy(xpath = "//th[text()='User Name']") public WebElement usernameTeacherListTitleBI;
 @FindBy(xpath = "(//a[@class='page-link'])[4]") public WebElement pageNextEndButtonBI;
 @FindBy(xpath = "(//i[@class='fa-solid fa-pencil'])[20]") public WebElement editButtonListEndBI;
 @FindBy(xpath = "//div[text()='Select lesson']") public WebElement editListChooseLessonsBI;
 @FindBy(xpath = "(//input[@id='name'])[2]") public WebElement editListNameBI;
 @FindBy(xpath = "(//input[@id='surname'])[2]") public WebElement editListSurnameBI;
 @FindBy(xpath = "(//input[@id='birthPlace'])[2]") public WebElement editListBirthPlaceBI;
 @FindBy(xpath = "(//input[@id='email'])[2]") public WebElement editListEmailBI;
 @FindBy(xpath = "(//input[@id='phoneNumber'])[2]") public WebElement editListPhoneBI;
 @FindBy(xpath = "(//input[@id='ssn'])[2]") public WebElement editListSsnBI;
 @FindBy(xpath = "(//input[@type='radio'])[3]") public WebElement editListFemaleRadioBI;
 @FindBy(xpath = "(//input[@type='radio'])[4]") public WebElement editListMaleRadioBI;
 @FindBy(xpath = "(//input[@id='birthDay'])[2]") public WebElement editListDateOfBirthBI;
 @FindBy(xpath = "(//input[@id='username'])[2]") public WebElement editListUsernameBI;
 @FindBy(xpath = "(//input[@id='password'])[2]") public WebElement editListPasswordBI;
 @FindBy(xpath = "(//button[text()='Submit'])[2]") public WebElement editListSubmitBI;
 @FindBy(xpath = "//div[text()='Teacher updated Successful']") public WebElement editTeacherSuccessfulTextBI;
 @FindBy(xpath = "(//button[@aria-label='Close'])[3]") public WebElement editTeacherCloseBI;






































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
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[3]/div/div/div[1]/table/tbody/tr[247]")
    public WebElement dersdogrulama;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[3]/div/div/div[2]/div[2]/button")
    public WebElement assignmmentSubmit;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[2]/div/div/table/thead")
    public WebElement dersgorunurluk;
    @FindBy(xpath = "//*[@id=\"11\"]/div[1]/div[2]/text()")
    public WebElement nullyazisi;

    @FindBy(xpath = "//*[@id=\"lessonProgramId\"]") public List<WebElement> chooselessonbox;
    @FindBy(xpath = "//*[@id=\"6\"]/div[1]/div[2]") public WebElement lessonaddyazisi;
    @FindBy(xpath = "//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[12]") public WebElement logoutbutton;
    @FindBy(xpath = "(//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[3])[2]") public WebElement logoutbutton2;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[1]/button") public WebElement yesbutton;
    @FindBy(xpath = "(//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[5])[2]") public WebElement logouttbutton3;









































































  //Saadet-430
    @FindBy(xpath = "//*[@class='header_link me-2']") public WebElement registerButtonSG;
    @FindBy(xpath = "//*[@id='username']") public WebElement loginUserNameSG;
    @FindBy(xpath = "//*[@id='password']") public WebElement loginPasswordSG;
    @FindBy(xpath = "(//*[text()='Login'])[2]") public WebElement loginEkraniLoginButtonSG;

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
    @FindBy (xpath = "//*[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']") public WebElement genderAlertSG;
    @FindBy (xpath = "//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']") public WebElement teacherAlert2SG;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[7]") public WebElement ssnminkarakterAlertSG;
    @FindBy (xpath = "//*[text()='At least 8 characters']") public WebElement passwordatleastAlertSG;
    @FindBy (xpath = "//*[text()='One uppercase character']") public WebElement passwordoneUpperAlertSG;
    @FindBy (xpath = "//*[text()='One lowercase character']") public WebElement passwordoneLowerAlertSG;
    @FindBy (xpath = "//*[text()='One number']") public WebElement passwordonenumberAlertSG;
    @FindBy (xpath = "//*[@class='d-flex justify-content-start ps-5 col']") public WebElement PagebuttonSG;
    @FindBy (xpath = "(//*[@type='button'])[5]") public WebElement adminsubmitButtonSG;
    @FindBy ( xpath = "(//*[@class='nav-link'])[11]") public WebElement adminstudentManagementSG;
    @FindBy (xpath = "//*[@class='form-select']") public WebElement teacherseçmeButonuSG;












































    //ayseebrar_530
    @FindBy(xpath = "(//*[text()='Vice Dean Management'])[2]")public WebElement viceDeanManagementHomePage_aeo;
    @FindBy(xpath = "//*[@id='name']")public WebElement nameKutusu_aeo;
    @FindBy(xpath = "//*[@id='surname']")public WebElement surnameKutusu_aeo;
@FindBy(xpath = "//*[@type='button']")public WebElement menuButton_aeo;
@FindBy(xpath = "//h3")public WebElement adminManagementDogrulama_aeo;
@FindBy(xpath = "(//*[@role='button'])[11]")public WebElement deanManagementMenuButton_aeo;
@FindBy(xpath = "//*[text()='Add Dean']")public WebElement deanListYazisi_aeo;
@FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]/button[1]")public WebElement deanteam08Edit_aeo;
@FindBy(xpath = "//*[@id='name']")public WebElement viceDeanName_aeo;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")public WebElement viceDeanrequiredName_aeo;
@FindBy(xpath = "//*[@id='surname']")public WebElement viceDeanSurname_aeo;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")public WebElement viceDeanRequiredSurname_aeo;
@FindBy(xpath = "//*[@placeholder='Birth Place']")public WebElement viceDeanBirthPlace_aeo;
@FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")public WebElement viceDeanRequiredBirthPlace_aeo;
@FindBy(xpath ="//*[@value='FEMALE']" )  public WebElement femaleRadioButton_aeo;
@FindBy(xpath = "//*[@value='MALE']")  public WebElement maleRadioButton_aeo;
@FindBy(xpath = "//*[@type='date']")public WebElement dateOfBirth_aeo;
@FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")public WebElement requiredDateOfBirth_aeo;
@FindBy(xpath = "//*[@id='phoneNumber']")public WebElement viceDeanPhoneNumber_aeo;
@FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")public WebElement requiredPhoneNumber_aeo;
@FindBy(xpath = "//*[@id='ssn']")public WebElement viceDeanSsnNo_aeo;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")public WebElement requiredSsn_aeo;
    @FindBy(xpath = "//*[@id='username']")public WebElement viceDeanUsername_aeo;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")public WebElement requiredUsername_aeo;
@FindBy(xpath = "//*[@id='password']")public WebElement viceDeanPassword_aeo;
@FindBy(xpath = "//*[text()='Submit']")public WebElement viceDeanSubmitButton_aeo;
@FindBy(xpath = "//*[text()='Minimum 12 character (XXX-XXX-XXXX)']")public WebElement Phone12KarakterEksikUyarisi;
@FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")  public WebElement ssn11KarakterEksikUyarisi;
@FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")    public WebElement passwordGirUyarisi;
    @FindBy(xpath = "//*[text()='At least 8 characters']")
    public WebElement password8KarakterEksikUyarisi;

    @FindBy(xpath = "//*[text()='One uppercase character']")
    public WebElement passwordBuyukHarfEksikUyarisi;

    @FindBy(xpath = "//*[text()='One lowercase character']")
    public WebElement passwordKucukHarfEksikUyarisi;

    @FindBy(xpath = "//*[text()='One number']")
    public WebElement passwordRakamEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your name should be at least 2 characters'])[1]")
    public WebElement name2KarakterEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your surname should be at least 2 characters'])[1]")
    public WebElement surname2KarakterEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your birth place should be at least 2 characters'])[1]")
    public WebElement birthPlace2KarakterEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your username should be at least 4 characters'])[1]")
    public WebElement userName4KarakterEksikUyarisi;


    @FindBy(xpath = "(//*[text()='Phone number should be exact 12 characters'])[1]")
    public WebElement PhoneNumber12KarakterFazlaUyarisi;

    @FindBy(xpath = "(//*[text()='Please enter valid phone number'])[1]")
    public WebElement PhoneNumberDogruDegilUyarisi;


    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement ssnDogruDegilUyarisi;

    @FindBy(xpath = "(//*[text()='Vice dean Saved'])[1]")
    public WebElement viceDeanSavedUyarisi;

    @FindBy(xpath = "(//*[text()='Admin Saved'])[1]")
    public WebElement adminSavedUyarisi;

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")

public WebElement menuButton;
@FindBy(xpath = "(//*[@role='button'])[11]")
public WebElement  contactGetAllButton;
@FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")public WebElement contactMassageButton;
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
    @FindBy(xpath = "//a[contains(.,'Register')]") public WebElement registerButonEB;
    @FindBy(xpath = "//*[@class='header_link me-2']") public WebElement registerButonEBB;
    @FindBy(xpath = "//*[@id='name']") public WebElement nameButonEB;
    @FindBy(xpath = "//*[@id='surname']") public WebElement surnameButonEB;
    @FindBy(xpath = "//*[@id='birthPlace']") public WebElement birthButonEB;
    @FindBy(xpath = "//*[@id='phoneNumber']") public WebElement phoneButonEB;
    @FindBy(xpath = "(//input[@type='radio'])[1]") public WebElement femaleButonEB;
    @FindBy(xpath = "//input[@type='date']") public WebElement dateofBirthdayButonEB;
    @FindBy(xpath = "//*[@id='ssn']") public WebElement ssNButonEB;
    @FindBy(xpath = "//*[@id='username']") public WebElement userNameButonEB;
    @FindBy(xpath = "//input[@id='password']") public WebElement passwordButonEB;
    @FindBy(xpath = "(//*[@type='button'])[3]") public WebElement registerAltButonEB;
    @FindBy(xpath = "//*[text()='Date Of Birth']") public WebElement dateofbirtEB;
    @FindBy(xpath = "//input[@name='gender' and @value='MALE']")
    public WebElement maleGenderEB;
    @FindBy(xpath = "(//*[text()='Required'])[1]") public WebElement getRequiredNameEB;
    @FindBy(xpath = "(//*[text()='Required'])[2]") public WebElement getRequiredSurameEB;
    @FindBy(xpath = "(//*[text()='Required'])[3]") public WebElement getRequiredBirthPlaceEB;
    @FindBy(xpath = "(//*[text()='Required'])[4]") public WebElement getRequiredPhoneEB;
    @FindBy(xpath = "(//*[text()='Required'])[5]") public WebElement getRequiredDateOfBirthEB;
    @FindBy(xpath = "(//*[text()='Required'])[6]") public WebElement getRequiredSsnEB;
    @FindBy(xpath = "(//*[text()='Required'])[7]") public WebElement getRequiredUserNameEB;
    @FindBy(xpath = "//*[text()='Enter your password']") public WebElement enterYourPasswordEB;
    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']") public WebElement minimum11characterEB;
    @FindBy(xpath = "//*[text()='One lowercase character']") public WebElement lowercaseCharacterYazisiEB;
    @FindBy(xpath = "//*[text()='One number']")public WebElement OneNumberYazisiEB;
    @FindBy(xpath = "//*[text()='At least 8 characters']")public WebElement passwordSekizcharactersUyarisiEB;
    @FindBy(xpath = "//*[text()='Guest User']") public WebElement GuestUserEB;
    @FindBy(xpath = "//*[text()='Name']")public WebElement nameColumnEB;
    @FindBy(xpath = "//*[text()='Phone Number']")public WebElement PhoneNumberColumnEB;
    @FindBy(xpath = "//*[text()='Ssn']")public WebElement SsnColumnEB;
    @FindBy(xpath = "//*[text()='User Name']")public WebElement UserNameColumnEB;
    @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")public WebElement guestUserDeleteButonuEB;
    @FindBy(xpath = "(//*[@class='btn btn-danger'])[5]")public WebElement copButonuEB;
    @FindBy(xpath = "//*[text()='Contact']")public WebElement contactButonEB;
    @FindBy(xpath = "//*[@placeholder='Name']")public WebElement contactNameButonEB;
    @FindBy(xpath = "//*[@placeholder='Email']")public WebElement contactEmailButonEB;
    @FindBy(xpath = "//*[@placeholder='Subject']")public WebElement contactSubjectButonEB;
    @FindBy(xpath = "//*[@placeholder='Message']")public WebElement contactMessageButonEB;
    @FindBy(xpath = "//*[text()='Send Message']")public WebElement SendMessageButonEB;
    @FindBy(xpath = "//div[text()='Contact Message Created Successfully']") public WebElement alertMessageEB;
    @FindBy(xpath = "//*[text()='Please enter valid email']") public WebElement pleaseEnterValidEmailMessageEB;











    //MeryemAkbayır-730
    @FindBy(xpath = "//th[text()='Name']")
    public WebElement nameTittleDL;

    @FindBy(xpath = "//th[text()='Gender']")
    public WebElement genderTittleDL;

    @FindBy(xpath = "//th[text()='Phone Number']")
    public WebElement phoneNumberTittleDL;

    @FindBy(xpath = "//th[text()='Ssn']")
    public WebElement ssnTittleDL;

    @FindBy(xpath = "//th[text()='User Name']")
    public WebElement userNameTittleDL;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement editButtonDL;

    @FindBy(xpath = "//h5[text()='Dean List']")
    public WebElement deanListTittleDL;

    @FindBy(xpath = "//div[text()='Dean Saved']")
    public WebElement deanSavedPopUpMessageDL;

   /* @FindBy(xpath = "")
    public WebElement ;

    @FindBy(xpath = "")
    public WebElement ;

    @FindBy(xpath = "")
    public WebElement ;*/
























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

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement LessonCreatedyazisi;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement RequiredyazisiTE;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement RequiredyazisiCreditScoreTE;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[2]/div/div/div[2]/ul/li[5]/a")
    public WebElement SonSayfaTE;

    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement silmeTE;






























































































































}

