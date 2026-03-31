package LibraryManagementSystem;

import java.util.UUID;

public class BorrowTransaction {
    private UUID id;
    private User user;
    private BookItem bookItem;
    private TransactionStatus status;
}
