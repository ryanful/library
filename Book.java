import java.util.*;
public class Book {
  private String ISBN, title, author, category, status;
  private boolean open; private int stock;
  private ArrayList<Book> books = new ArrayList<Book>();
  
  public Book(String isbn,String name,String auth,String cat,String stat, int stock){
    ISBN = isbn; title = name; author = auth; category = cat; status = stat;
  }
  
  public String getISBN(){ return ISBN;}
  public String getTitle(){return title;}
  public String getAuthor(){return author;}
  public String getCategory(){return category;}
  public String getStatus(){return status;}
  public boolean isAvailable(){return open;}
  public int getStock(){return stock;}
  public ArrayList<Book> getCatalog(){return books;}
 
}