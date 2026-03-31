package LibraryManagementSystem;

import java.util.UUID;

public class BookItem {

    private UUID id;
    private Book book;
    private BookStatus bookStatus;

    public BookItem(Book book) {
        this.book = book;
        id=UUID.randomUUID();
        bookStatus=BookStatus.AVAILABLE;
    }

    public UUID getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
