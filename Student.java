public class Student extends Borrower {
  private String OSIS, lname , fname, grade, homeroom;
  
  
  public Student(String osis,String lastname,String firstname,String Grade,String offlClass){
     OSIS = osis; lname = lastname; fname = firstname;grade = Grade; homeroom = offlClass;
  }
  
  public String getOSIS(){ return OSIS;}
  public String getLName(){return lname;}
  public String getFName(){return fname;}
  public String getGrade(){return grade;}
  public String getHroom(){return homeroom;}
  
  
  
  
  
  
  
}