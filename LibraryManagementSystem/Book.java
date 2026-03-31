package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Book {

    private UUID id;
    private String title;
    private String authorName;
    List<BookItem> physicalCopy;
    private BookCategory type;

    public Book(String title, String authorName, BookCategory type) {
        this.title = title;
        this.authorName = authorName;
        this.type = type;
        physicalCopy=new ArrayList<>();
        id=UUID.randomUUID();
    }

    public void  addCopy(BookItem bookItem){
       physicalCopy.add(bookItem);
    }
    public BookItem getBook(Book book){

        for(BookItem bookItem:book.getPhysicalCopy()){
            if(bookItem.getBookStatus()==BookStatus.AVAILABLE){
                return bookItem;
            }
        }
        return null;

    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<BookItem> getPhysicalCopy() {
        return physicalCopy;
    }

    public void setPhysicalCopy(List<BookItem> physicalCopy) {
        this.physicalCopy = physicalCopy;
    }

    public BookCategory getType() {
        return type;
    }

    public void setType(BookCategory type) {
        this.type = type;
    }
}
