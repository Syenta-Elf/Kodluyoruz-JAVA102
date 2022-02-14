public class Book {
    private String bookName;
    private String authorName;
    int pageCount;
    private int date;

    
    public Book(String bookName, String authorName, int pageCount, int date) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageCount = pageCount;
        this.date = date;
    }



    public int getDate() {
        return date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
