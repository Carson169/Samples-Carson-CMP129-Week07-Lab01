Classes:
Book: Represents a individual book in the system, containing the data of title, author, isbn number and avaibility status
Member: Represents a library member, holding name and membership ID as well as tracking the list of books currently checked out by a member
Library: A system that has both book and member objects in it and allows for registering members, adding books, seraching records, and handling borrow and returning
LibraryTest: Has a main method to test the Book, member and Library classes
The attributes are private to restrict any modfication from any other classes to prevent errors, the attributes can only be modified through setter classes and can't be changed like a normal variable
ArrayList was used for dynamic sizing compared to normal java arrays as well as easier built in manipulation methods
The Library class acts as a coordinator between the Member and Book classes. Whenever Member requests a book, Library gets the needed objects and sends them. The Member class also stores Book objects. 
Book availbility is tracked by a boolean attribute named available in the Book class. When it's created, it defaults to true. When Member.borrowBook(book) is called on a available book, available is set to false because the book is added to borrowedBooks. When Member.returnBook(book) is used, the book is removed from borrowedBooks and available resets to True.
Test Table:
------------------------------------------------------------------------------------------------------------------------------------------
Test                   |Expected Result                               |Actual Result                                           |Status|
Add a book             |Book added to library inventory               |Book displayed in library book list via displayBooks()  |Pass  |
Borrow Available Book  |Borrowing succeeds and return status is false |Book added to Member's list and available set to false  |Pass  |
Borrow unavailable book|Borrowing rejected and return status is true  |Operation status and member list unchanged              |Pass  |
Return borrowed book   |Return succeeds and return status is true     |Book removed form member's list and avaiable set to true|Pass  |
Borrow returned book   |Borrowing succeeds for new member             |Book assigned to member successfully                    |Pass  |
Invalid ISBN           |Operation rejected                            |error message displayed                                 |Pass  |
------------------------------------------------------------------------------------------------------------------------------------------
As a conclusion, the library management system was a success and performed as expected across all testing cases. Every core component was tested and verified. 