import com.tamerb.ComparatorSecond;
import com.tamerb.Book;



import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // 1.sorts the book by name from A to Z.
        TreeSet<Book> bookName = new TreeSet<>();

        bookName.add(new Book("I Robot\t", 248, "Isaac Asimov",
                " 1950"));

        bookName.add(new Book("Faundation", 304, "Isaac Asimov",
                " 1942"));

        bookName.add(new Book("Dune\t", 712, "Frank Herbert",
                " 1965"));

        bookName.add(new Book("Cosmos\t", 100, "Carl Sagan",
                "\t 1980"));


        System.out.println("// 1.sorts the book by name from A to Z.");
        System.out.println("Book Name\t\tNumber of page\t\tName of the author\t\tDate of publication");
        System.out.println("------------------------------------------------------------------------");

        for (Book books : bookName) {
            books.display();
        }


        // 2.sorts the book by pages from 1 to N.
        TreeSet<ComparatorSecond> bookPages = new TreeSet<>();

        bookPages.add(new ComparatorSecond("I Robot\t", 248, "Isaac Asimov",
                "1950"));

        bookPages.add(new ComparatorSecond("Faundation", 304, "Isaac Asimov",
                "1952"));

        bookPages.add(new ComparatorSecond("Dune\t", 712, "Frank Herbert",
                "1965"));

        bookPages.add(new ComparatorSecond("Cosmos\t", 100, "Carl Sagan\t",
                "1980"));


        System.out.println("\n// 2.sorts the book by pages from 1 to N.");
        System.out.println("Book Name\t\tNumber of page\t\tName of the author\t\tDate of publication");
        System.out.println("------------------------------------------------------------------------");

        for (ComparatorSecond books : bookPages) {

            books.display();

        }


    }
}
