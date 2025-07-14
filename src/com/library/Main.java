package com.library;

public class Main {
    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();

        // Books
        Book b1 = new Book("Wings of Fire", "B101", "A.P.J. Abdul Kalam", "9788173711466");
        Book b2 = new Book("The Alchemist", "B102", "Paulo Coelho", "9780061122415");
        Book b3 = new Book("Malgudi Days", "B103", "R.K. Narayan", "9780143031031");
        Book b4 = new Book("The Da Vinci Code", "B104", "Dan Brown", "9780307474278");
        Book b5 = new Book("Atomic Habits", "B105", "James Clear", "9780735211292");

        // Magazines
        Magazine m1 = new Magazine("National Geographic", "M201", "NatGeo", "Issue 120");
        Magazine m2 = new Magazine("TIME", "M202", "Time Inc.", "Issue 98");
        Magazine m3 = new Magazine("Forbes", "M203", "Forbes Media", "Issue 210");
        Magazine m4 = new Magazine("Vogue", "M204", "Condé Nast", "Issue 77");
        Magazine m5 = new Magazine("Scientific American", "M205", "Springer Nature", "Issue 132");

        // DVDs
        DVD d1 = new DVD("Avengers: Endgame", "D306", "Anthony and Joe Russo", 181);
        DVD d2 = new DVD("Harry Potter and the Sorcerer's Stone", "D307", "Chris Columbus", 152);
        DVD d3 = new DVD("Titanic", "D308", "James Cameron", 195);
        DVD d4 = new DVD("Interstellar", "D309", "Christopher Nolan", 169);
        DVD d5 = new DVD("Kung Fu Panda", "D310", "Mark Osborne and John Stevenson", 92);

        system.addItem(b1);
        system.addItem(b2);
        system.addItem(b3);
        system.addItem(b4);
        system.addItem(b5);

        system.addItem(m1);
        system.addItem(m2);
        system.addItem(m3);
        system.addItem(m4);
        system.addItem(m5);

        system.addItem(d1);
        system.addItem(d2);
        system.addItem(d3);
        system.addItem(d4);
        system.addItem(d5);


        Student s1 = new Student("Alice", "U001");
        Faculty f1 = new Faculty("Dr. Rao", "U002");
        Librarian l1 = new Librarian("Mr. Iyer", "U003");

        system.addUser(s1);
        system.addUser(f1);
        system.addUser(l1);

        
        system.borrowItem("U001", "Wings of Fire");
        system.borrowItem("U002", "National Geographic");
        system.borrowItem("U003", "Interstellar"); 


        system.searchByTitle("geo");
        system.showReport();

        system.returnItem("U001", "Wings of Fire", 2); 
    }
}
