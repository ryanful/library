import java.util.*;

public class Runner
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Borrower or Librarian:");
    String user = scan.nextLine();
    
    if (user.equals("Borrower")){
      System.out.println("Teacher or Student");
      user = scan.nextLine();
      
      if(user.equals(“Teacher”)){
        System.out.println(“return, checkout, or browse”);
        user = scan.nextLine();
        
        if(user.equals(“return”)){
          Teacher.returnBook();
        }
        
      }
      
    }

  }
  
}