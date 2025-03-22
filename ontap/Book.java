package ontap;

import java.util.Date;

public abstract class Book implements IBook {

    protected String bookId;
    protected String publisher;
    protected Date entryDate;
    protected double unitPrice;
    protected double quantity;

    public Book() {
        this.bookId = "";
        this.publisher = "";
        this.entryDate = new Date();
        this.unitPrice = 0.0;
        this.quantity = 0.0;
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public void displayBook() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId
                + ", Publisher: " + publisher
                + ", Entry Date: " + entryDate
                + ", Unit Price: " + unitPrice
                + ", Quantity: " + quantity;
    }

    @Override
    public abstract void addBook();

    @Override
    public abstract void updateBook(String id);
}
