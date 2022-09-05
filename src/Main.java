import com.tamerb.ComparatorSecond;
import com.tamerb.Book;


import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // 1.sorts the book by name from A to Z.
        TreeSet<Book> bookName = new TreeSet<Book>();

        bookName.add(new Book("Ben robot", 248, "Isaac Asimov",
                "Aralık 1950"));

        bookName.add(new Book("Vakıf\t", 304, "Isaac Asimov",
                "Mayıs 1942"));

        bookName.add(new Book("Dune\t", 712, "Frank Herbert",
                "Ağustos 1965"));

        bookName.add(new Book("Kozmos\t", 100, "Carl Sagan",
                "\tEkim 1980"));


        System.out.println("// 1.sorts the book by name from A to Z.");
        System.out.println("Book Name\t\tNumber of page\t\tName of the author\t\tDate of publication");
        System.out.println("------------------------------------------------------------------------");

        for (Book books : bookName) {
            books.display();
        }


        // 2.sorts the book by pages from 1 to N.
        TreeSet<ComparatorSecond> bookPages = new TreeSet<ComparatorSecond>();

        bookPages.add(new ComparatorSecond("Ben Robot", 248, "Isaac Asimov",
                "Aralık 1950"));

        bookPages.add(new ComparatorSecond("Vakıf\t", 304, "Isaac Asimov",
                "Mayıs 1942"));

        bookPages.add(new ComparatorSecond("Dune\t", 712, "Frank Herbert",
                "Ağustos 1965"));

        bookPages.add(new ComparatorSecond("Kozmos\t", 100, "Carl Sagan",
                "\tEkim 1980"));


        System.out.println("\n// 2.sorts the book by pages from 1 to N.");
        System.out.println("Book Name\t\tNumber of page\t\tName of the author\t\tDate of publication");
        System.out.println("------------------------------------------------------------------------");

        for (ComparatorSecond books : bookPages) {

            books.display();

        }


    }
}
