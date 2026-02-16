import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public void lendBook(String title, User user){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()){
                book.setBorrowed(true);
                user.borrowBook(book);
                System.out.println(user.getName() + " successfully borrowed " + title);
                return;
            }
        }
        System.out.println("Sorry, book not available.");
    }
}
