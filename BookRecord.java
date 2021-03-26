class Book
{
    String name;
        int bookId;
    String authorName;
    String Version;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getVersion() {
        return Version;
    }
    public void setVersion(String Version) {
        this.Version = Version;
    }
    Book(String name, int bookId, String authorName, String Version)
    {
        this.name = name;
        this.bookId = bookId;
        this.authorName = authorName;
        this.Version = Version;        
    }
}
public class BookRecord
{
    private void detailsOfBook(Book book)
    {
System.out.println("       HALTON      WALDROF       SCHOOL        ");   
System.out.println("            LIBRARY  MANAGEMENT ");
System.out.println(" ");

        System.out.println("Name of Book= "+ book.getName());
        System.out.println("Id of Book= "+ book.getBookId());
        System.out.println("Author Name of Book=" + book.getAuthorName());
        System.out.println("Version of Book= "+ book.getVersion());
System.out.println(" ");
    }

    public static void main (String arg[])
    {
        Book book1 = new Book("Digital & Logics", 101, " RUSHDA", "6");
        Book book2 = new Book("Operating System", 102, "RAVIKANTH", "4");

  Book book3 = new Book("C++", 103, "NIROSHAN", "1");
  Book book4 = new Book("O", 104, "AISHWARYA", "2");

Book book5 = new Book("DATA STRUCTURES", 105, "NIMRA", "3");
  Book book6 = new Book("VISUAL PROGRAMMING", 106, "VINOD", "5");
        
        BookRecord bookRecord = new BookRecord();
        bookRecord.detailsOfBook(book1);
        bookRecord.detailsOfBook(book2);
bookRecord.detailsOfBook(book3);
        bookRecord.detailsOfBook(book4);
bookRecord.detailsOfBook(book5);
        bookRecord.detailsOfBook(book6);
    }    
}