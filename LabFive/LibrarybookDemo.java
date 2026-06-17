class LibraryBook {  
String 
String 
int bookID;  
title;     
author;     
// Constructor using this keyword  
LibraryBook(String title, String author, int bookID) {         
this.title = title;         
this.author = author;         
this.bookID = bookID;  
}  
// Method to display book information     
void displayBookInfo() {  
System.out.println("Book Title: " + title);  
System.out.println("Author: " + author);  
System.out.println("Book ID: " + bookID);  
System.out.println("---------------------------");     
}  
}  
public class LibraryBookDemo {  
public static void main(String[] args) {  
LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 
101);  
LibraryBook book2 = new LibraryBook("Data Structures", "Mark Allen Weiss", 
102);  
book1.displayBookInfo();         
book2.displayBookInfo();  
} 
}  
