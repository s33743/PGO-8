public class LibraryAccount {
    private String readerName;
    private int borrowedBooks;
    private int lateDays;

    public LibraryAccount(String readerName, int borrowedBooks, int lateDays) {
        this.readerName = readerName;
        this.borrowedBooks = borrowedBooks;
        this.lateDays = lateDays;
    }

    class FineCalculator {
        double calculate() {
            return borrowedBooks * lateDays * 1.50;
        }
    }


    public String getReaderName() {
        return readerName;
    }
}

@FunctionalInterface
interface MessagePrinter {
    void print(String message);
}

