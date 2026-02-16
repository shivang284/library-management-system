public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean status) {
        this.isBorrowed = status;
    }
}
