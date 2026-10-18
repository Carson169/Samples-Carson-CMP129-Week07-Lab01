//Carson Samples
//Lab Assignment 11A
//10.16.26
//Course CMP-129-80231
import java.util.ArrayList;
public class Library 
{
    private String name;
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library(String name) 
    {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book) 
    {
        books.add(book);
    }
    public void registerMember(Member member) 
    {
        members.add(member);
    }
    public Book findBookByIsbn(String isbn) 
    {
        for (Book book : books) 
        {
            if (book.getIsbn().equals(isbn)) 
            {
                return book;
            }
        }
        return null;
    }
    public Member findMemberById(String membershipId) 
    {
        for (Member member : members)
        {
            if (member.getMembershipId().equals(membershipId)) 
            {
                return member;
            }
        }
        return null;
    }
    public boolean borrowBook(String membershipId, String isbn) 
    {
        Member member = findMemberById(membershipId);
        Book book = findBookByIsbn(isbn);
        if (member == null) 
        {
            System.out.println("Member ID " + membershipId + " not found.");
            return false;
        }
        if (book == null) 
        {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return false;
        }
        return member.borrowBook(book);
    }
    public boolean returnBook(String membershipId, String isbn) 
    {
        Member member = findMemberById(membershipId);
        Book book = findBookByIsbn(isbn);
        if (member == null) 
        {
            System.out.println("Member ID " + membershipId + " not found.");
            return false;
        }
        if (book == null) 
        {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return false;
        }
        return member.returnBook(book);
    }
    public void displayBooks() 
    {
        System.out.println("Books in " + name + ":");
        for (Book book : books) 
        {
            book.displayInfo();
        }
        System.out.println();
    }
    public void displayMembers() 
    {
        System.out.println("Members of " + name + ":");
        for (Member member : members) 
        {
            member.displayInfo();
        }
        System.out.println();
    }
}
