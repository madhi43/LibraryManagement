public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "The Girl in room 105", 2011, "Chethan Bagath");
        Magazine magazine1 = new Magazine(2, "Harry Potter", 1997, 1);
        System.out.println("Book details:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("\nMagazine details:");
        System.out.println("Title:"+magazine1.getTitle());
        System.out.println("issue:"+magazine1.getIssue());
    }
}
class LibraryItem {
    private int id;
    private String title;
    private int year;
    LibraryItem(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
}
class Book extends LibraryItem {
    private String author;
    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
class Magazine extends LibraryItem {
    private int issue;
    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year);
        this.issue = issue;
    }
    public int getIssue() {
        return issue;
    }
}