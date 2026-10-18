//Carson Samples
//Lab Assignment 11A
//10.16.26
//Course CMP-129-80231
import java.util.ArrayList;
public class Member 
{
    private String name;
    private String membershipId;
    private ArrayList<Book> borrowedBooks;
    public Member(String name, String membershipId)
    {
        this.name = name;
        this.membershipId = membershipId;
        this.borrowedBooks = new ArrayList<>();
    }
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("MembershipId: " + membershipId);
        System.out.println("Borrowed Books:");
        if(borrowedBooks.isEmpty()) 
        {
            System.out.println("  (None)");
        } 
        else 
        {
            for(Book book : borrowedBooks) 
            {
                System.out.println("  - " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")" + " (Author " + book.getAuthor() + ")" );
            }
        }
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getMembershipId()
    {
        return membershipId;
    }
    public void setMembershipId(String membershipId)
    {
        this.membershipId = membershipId;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public boolean borrowBook(Book book) 
    {
        if (book.getAvailable())
        {
            borrowedBooks.add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }
    public boolean returnBook(Book book) 
    {
        if (borrowedBooks.contains(book)) 
        {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }
}
