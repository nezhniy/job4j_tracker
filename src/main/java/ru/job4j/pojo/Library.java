package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book history = new Book("History", 300);
        Book fantasy = new Book("Fantasy", 300);
        Book romance = new Book("Romance", 300);
        Book clean = new Book("Clean code", 300);

        Book[] arrayOfBooks = new Book[4];
        arrayOfBooks[0] = history;
        arrayOfBooks[1] = fantasy;
        arrayOfBooks[2] = romance;
        arrayOfBooks[3] = clean;

        for (int i = 0; i < arrayOfBooks.length; i++) {
            Book book = arrayOfBooks[i];
            System.out.println(book.getName() + " - " + book.getPages() + " pages");
        }

        arrayOfBooks[0] = clean;
        arrayOfBooks[3] = history;

        for (Book book: arrayOfBooks) {
            System.out.println(book.getName() + " - " + book.getPages() + " pages");
        }

        for (int i = 0; i < arrayOfBooks.length; i++) {
            Book book = arrayOfBooks[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages() + " pages");
            }
        }
    }
}
