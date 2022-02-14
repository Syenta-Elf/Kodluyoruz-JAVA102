import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("bookname - 1","authorname - 1",100,2003));
        books.add(new Book("bookname - 2","authorname - 2",20,2005));
        books.add(new Book("bookname - 3","authorname - 3",303,2020));
        books.add(new Book("bookname - 4","authorname - 4",40,2010));
        books.add(new Book("bookname - 5","authorname - 5",505,2030));

        HashMap<String,String> dict = new HashMap<String,String>();
        books.stream().forEach(book -> dict.put(book.getBookName(),book.getAuthorName()));

        for (String book : dict.keySet()) {
            System.out.println(book + dict.get(book));
        }

        books.stream().filter( num -> num.pageCount >= 100 ).forEach(num -> System.out.println(num.getBookName()));
        
    }
}
