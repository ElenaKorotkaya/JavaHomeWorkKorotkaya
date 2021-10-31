package com.pb.korotkaya.hw5;

public class Library {

    public static void main(String[] args) {

        //МАССИВ КНИГ
        Book book1 = new Book("The old man and the sea", "Hemingway", 1975);
        Book book2 = new Book("The House on Mango Street", "Cisneros", 1991);
        Book book3 = new Book("Thirteen Reasons Why","Asher",2011);
        Book book4 = new Book("Peter Pan", "Barrie",2014);
        Book book5 = new Book("The Giver", "Lowry",1993);
        Book book6 = new Book("Number the Stars", "Lowry",2011);

        Book[] books = {book1, book2, book3, book4, book5, book6};

    for(Book book : books){
        System.out.println(book.toString());
    }

    //МАССИВ ЧИТАТЕЛЕЙ
    Reader reader1 = new Reader("Petrov C.C.", 1, "economy", "12.06.2001", "0973650732");
    Reader reader2 = new Reader("Ivanov V.V.", 2, "economy", "25.05.2000", "0673417532");
    Reader reader3 = new Reader("Sidorov D.D.", 3, "economy", "20.07.2002", "0958794523");

    Reader[] readers = {reader1, reader2, reader3};

    for(Reader reader : readers){
        System.out.println(reader.toString());
    }
        /*
        String[] list = {reader1.toString(), reader2.toString(), reader3.toString()};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
         */
        reader1.takeBook(1);                                 //кто сколько книг взял
        reader2.takeBook(3);
        reader3.takeBook(2);

        reader1.returnBook(0);                               //кто сколько книг вернул
        reader2.returnBook(2);
        reader3.returnBook(1);

        reader1.takeBook(books[0].getNameBook());               //взятые книги по названию
        reader2.takeBook(books[1].getNameBook(), books[2].getNameBook(), books[3].getNameBook());
        reader3.takeBook(books[4].getNameBook(), books[5].getNameBook());

        reader1.returnBook((String) null);           //возвращенные книги по названию
        reader2.returnBook(books[2].getNameBook(), books[3].getNameBook());
        reader3.returnBook(books[5].getNameBook());

        reader1.takeBook(books[0]);
        reader2.takeBook(books[1], books[2], books[3]);
        reader3.takeBook(books[4], books[5]);

        reader1.returnBook((Book) null);
        reader2.returnBook(book3, book4);
        reader3.returnBook(book6);
    }
}
