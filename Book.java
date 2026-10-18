//Carson Samples
//Lab Assignment 11A
//10.13.26
//Course CMP-129-80231
public class Book 
{
   private String title;
   private String author;
   private String isbn;
   private boolean available;
   public void displayInfo()
   {
      System.out.println("Title: " + title);
      System.out.println("Author: " + author);
      System.out.println("ISBN: " + isbn);
      System.out.println("Book Availability: " + available);
   }
   public Book(String title, String author, String isbn)
   {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.available = true;
   } 
   public void setTitle(String title)
   {
      this.title = title;
   }
   public String getTitle()
   {
      return title;
   }
   public void setAuthor(String author)
   {
      this.author = author;
   }
   public String getAuthor()
   {
      return author;
   }
   public void setIsbn(String isbn)
   {
      this.isbn = isbn;
   }
   public String getIsbn()
   {
      return isbn;
   }
   public void setAvailable(boolean available)
   {
      this.available = available;
   }
   public boolean getAvailable()
   {
      return available; 
   }
}
