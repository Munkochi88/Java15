package oop.inheritance4;

public class Test {
    public static void main(String[] args) {
        Book book = new Book(200, "Java","Coding");
        System.out.println(book.pageCount);
        System.out.println(book.getPageCount());
        Notebook notebook = new Notebook();
        System.out.println(notebook.pageCount);
        System.out.println(notebook.getPageCount());

        book.pageCount = 404;
        System.out.println(notebook.pageCount);
        System.out.println(book.pageCount);

        book.read();
        notebook.read();
        Book.read();
        Notebook.read();
        System.out.println("===========");


    }

}
