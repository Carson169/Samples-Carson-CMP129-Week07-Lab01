//Carson Samples
//Lab Assignment 11A
//10.16.26
//Course CMP-129-80231
public class LibraryTest 
{
    public static void main(String[] args) 
    {
        System.out.println("Library Test\n");
        Library Libarby = new Library("Test Library");
        Book book1 = new Book("Food Book", "Chris Griffin", "123456789");
        Book book2 = new Book("My Book", "Author of My Book", "987654321");
        Book book3 = new Book("3rd Book", "3rd guy", "333333333");
        Libarby.addBook(book1);
        Libarby.addBook(book2);
        Libarby.addBook(book3);
        Libarby.displayBooks();
        Member member1 = new Member("Lady McPerson", "1");
        Member member2 = new Member("Friend", "2");
        Libarby.registerMember(member1);
        Libarby.registerMember(member2);
        Libarby.displayMembers();
        boolean test1 = Libarby.borrowBook("1", "123456789");
        System.out.println("Test [Borrow Available Book] Result: " + (test1 == true ? "PASS" : "FAIL") + "\n");
        boolean test2 = Libarby.borrowBook("2", "123456789");
        System.out.println("Test [Borrow Unavailable Book] Result: " + (test2 == false ? "PASS" : "FAIL") + "\n");
        boolean test3 = Libarby.returnBook("1", "123456789");
        System.out.println("Test [Return Borrowed Book] Result: " + (test3 == true ? "PASS" : "FAIL") + "\n");
        boolean test4 = Libarby.borrowBook("2", "123456789");
        System.out.println("Test [Borrow Returned Book] Result: " + (test4 == true ? "PASS" : "FAIL") + "\n");
        boolean test5 = Libarby.borrowBook("1", "999999999");
        System.out.println("Test [Borrow Invalid ISBN] Result: " + (test5 == false ? "PASS" : "FAIL") + "\n");
        boolean test6 = Libarby.borrowBook("999", "987654321");
        System.out.println("Test [Borrow Invalid Member ID] Result: " + (test6 == false ? "PASS" : "FAIL") + "\n");
        System.out.println("\nFinal Books and Members:");
        Libarby.displayBooks();
        Libarby.displayMembers();
    }
}