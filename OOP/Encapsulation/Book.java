package OOP.Encapsulation;


public class Book {

    private String bookName;
    private int pageNumber;

    public Book(String bookName , int pageNumber)
    {
        this.bookName = bookName;
        if(pageNumber <= 0)
        this.pageNumber = 0;
        
        else
        this.pageNumber = pageNumber;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setPageNumber(int pageNumber) {
        if(pageNumber <= 0)
        this.pageNumber = 0;

        else
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }
    
}
