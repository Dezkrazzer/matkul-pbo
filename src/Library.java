// Library Item
class LibraryItem {
    private String id;
    private String title;
    protected boolean isAvailable;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Display Info
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }

    // Calculate
    public double calculateLateFee(int daysLate) {
        return 0.0;
    }
}

// Book
class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String id, String title, String author, int pages) {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1000;
    }
}
// DVD
class DVD extends LibraryItem {
    private int duration;
    private String director;

    public DVD(String id, String title, int duration, String director) {
        super(id, title);
        this.duration = duration;
        this.director = director;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration);
        System.out.println("Director: " + director);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2000;
    }
}
// Borrower
class Borrower {
    private String memberId;
    private String name;
    private LibraryItem[] borrowedItems;
    private int itemCount;

    public Borrower(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems = new LibraryItem[5];
        this.itemCount = 0;
    }

    public boolean borrowItem(LibraryItem item) {
        if(itemCount < borrowedItems.length && item.isAvailable()) {
            borrowedItems[itemCount] = item;
            item.isAvailable = false;
            itemCount++;
            return true;
        }
        return false;
    }

    public void returnItem(LibraryItem item) {
        for(int i = 0; i < itemCount; i++) {
            if(borrowedItems[i] == item) {
                item.isAvailable = true;
                for(int j = i; j < itemCount - 1; j++) {
                    borrowedItems[j] = borrowedItems[j + 1];
                }
                borrowedItems[itemCount - 1] = null;
                itemCount--;
                break;
            }
        }
    }

    public void displayBorrowedItems() {
        System.out.println("Items borrowed by " + name + ":");
        for(int i = 0; i < itemCount; i++) {
            borrowedItems[i].displayInfo();
        }
    }
}

public class Library {
    public static void main(String[] args) throws Exception{
        Book buku1 = new Book("B001", "Java Programming", "John Doe", 400);
        Book buku2 = new Book("B002", "Python Programming", "Jane Smith", 100);

        DVD dvd1 = new DVD("D001", "Introduction to OOP", 120, "Prof. Johnson");

        buku1.displayInfo();
        buku2.displayInfo();
        dvd1.displayInfo();

        Borrower borrower = new Borrower("M001", "Alice");
        borrower.borrowItem(buku1);
        borrower.borrowItem(buku2);

        borrower.displayBorrowedItems();

        borrower.returnItem(buku1);
        borrower.displayBorrowedItems();

        System.out.println("Book late fee for Book " + buku2.getId() + ": " + buku2.calculateLateFee(5));
    }
}
