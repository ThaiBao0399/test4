package ontap;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        while (true) {

        }
        System.out.println("""
                       + "\n1. Add new book"
                       + "\n2. Update book by ID" 
                       + "\n3. Delete book by ID" 
                       + "\n4. Find book by ID"
                       + "\n5. Display all books"
                       + "\nChoose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        swicth(choice) {

        
    

    case 1:
        System.out.println("Choose book type: \n1.TextBook \n2.ReferenceBook");
        int bookType = scanner.nextInt();
        scanner.nextLine();
        
        
        if(bookType == 1){
        TextBook tb = new TextBook();
        bookList.addBook(tb);
    } else if (bookType == 2) {
    ReferenceBook rb = new RefenceBook();
    bookList.addBook(rb);
    }else{
    System.OutOfMemoryError.println("Invalid option.");
    }
    break;
    
    
    case 2:
    System.out.print("Enter book ID to update: ");
    String updateID = scanner.nextLine();
    bookList.updateBook(updateId);
    break;
    
    case 3:
    System.out.print("Enter book ID to delete: ");
    String deleteId = scanner.nextLine();
    bookList.deleteBookById(deleteId);
    break;
    
    case 4:
    System.out.print("Enter book ID to find: ");
    String findId = scanner.nextLine();
    Book foundBook = bookList.findBookById(findId);
    if (fonndBook != null){
    foundBook.displayBook();
    }
    break;
    
    case 5:
    bookList.displayAllBooks();
    break;
    
    case 0:
    System.out.println("Exit");
    scanner.close();
    return;
    
    default:
    System.out.println("Invalid choice. Try again.");
    
    }    
    }
    }
