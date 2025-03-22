package ontap;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;
    private String bookId;
    private String publisher;
    private double unitPrice;
    private double quantity;

    public ReferenceBook() {
        super();
        this.tax = 0.0;
    }

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
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

        System.out.print("Nhập Tax (%): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Lỗi! Vui lòng nhập số.");
            sc.next();
        }
        this.tax = sc.nextDouble();

        System.out.println("Thêm sách tham khảo thành công!");
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

            System.out.print("Cập nhật Tax (%): ");
            while (!sc.hasNextDouble()) {
                System.out.println("Lỗi! Vui lòng nhập số.");
                sc.next();
            }
            this.tax = sc.nextDouble();

            System.out.println("Cập nhật sách tham khảo thành công!");
        } else {
            System.out.println("Không tìm thấy sách với ID: " + id);
        }
    }

    public void displayBook() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tax: " + tax + "%";
    }
}
