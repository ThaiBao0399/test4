package ontap;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Thêm sách thành công!");
    }

    
    public void updateBook(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                book.updateBook(id);
                return;
            }
        }
        System.out.println("Không tìm thấy sách với ID: " + id);
    }

    
    public void deleteBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                bookList.remove(book);
                System.out.println("Xóa sách thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sách với ID: " + id);
    }

    
    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    
    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Danh sách sách trống.");
        } else {
            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }

    
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- QUẢN LÝ SÁCH -----");
            System.out.println("1. Thêm sách giáo khoa");
            System.out.println("2. Thêm sách tham khảo");
            System.out.println("3. Cập nhật sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm sách theo ID");
            System.out.println("6. Hiển thị tất cả sách");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    TextBook textBook = new TextBook();
                    textBook.addBook();
                    bookList.addBook(textBook);
                    break;
                case 2:
                    ReferenceBook referenceBook = new ReferenceBook();
                    referenceBook.addBook();
                    bookList.addBook(referenceBook);
                    break;
                case 3:
                    System.out.print("Nhập ID sách cần cập nhật: ");
                    String updateId = sc.nextLine();
                    bookList.updateBook(updateId);
                    break;
                case 4:
                    System.out.print("Nhập ID sách cần xóa: ");
                    String deleteId = sc.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 5:
                    System.out.print("Nhập ID sách cần tìm: ");
                    String searchId = sc.nextLine();
                    Book foundBook = bookList.findBookById(searchId);
                    if (foundBook != null) {
                        foundBook.displayBook();
                    } else {
                        System.out.println("Không tìm thấy sách.");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}
