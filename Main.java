public class Main {
    public static void main(String[] args){
        Library myLibrary = new Library();

        Book b1 = new Book("The Great Gatsby", "F.Scott Fitzgerald");
        User u1 = new User("Alice");

        myLibrary.addBook(b1);
        myLibrary.lendBook("The Great Gatsby", u1);
    }
}