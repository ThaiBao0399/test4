package ontap;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {
    private String status;
    private String bookId;
    private String publisher;
    private double unitPrice;
    private double quantity;


    public TextBook() {
        super();
        this.status = "";
    }

    
    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập Book ID: ");
        this.bookId = sc.nextLine();

        System.out.print("Nhập Publisher: ");
        this.publisher = sc.nextLine();

        System.out.print("Nhập Unit Price: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Lỗi! Vui lòng nhập số.");
            sc.next();
        }
        this.unitPrice = sc.nextDouble();

        System.out.print("Nhập Quantity: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Lỗi! Vui lòng nhập số.");
            sc.next();
        }
        this.quantity = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Nhập Status (Mới/Cũ): ");
        this.status = sc.nextLine();
    }

    
    public void updateBook(String id) {
        if (this.bookId.equals(id)) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Cập nhật Publisher: ");
            this.publisher = sc.nextLine();

            System.out.print("Cập nhật Unit Price: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Lỗi! Vui lòng nhập số.");
                sc.next();
            }
            this.unitPrice = sc.nextDouble();

            System.out.print("Cập nhật Quantity: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Lỗi! Vui lòng nhập số.");
                sc.next();
            }
            this.quantity = sc.nextDouble();
            sc.nextLine();

            System.out.print("Cập nhật Status (Mới/Cũ): ");
            this.status = sc.nextLine();

            System.out.println("Cập nhật sách thành công!");
        } else {
            System.out.println("Không tìm thấy sách với ID: " + id);
        }
    }

   
    public void displayBook() {
        System.out.println(this);
    }

   
    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}
