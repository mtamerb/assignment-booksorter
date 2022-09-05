package com.tamerb;


public class ComparatorSecond extends Book implements Comparable<Book> {

    public ComparatorSecond(String bookName, int numberOfPage, String nameOfTheAuthor, String dateOfPublication) {

        super(bookName, numberOfPage, nameOfTheAuthor, dateOfPublication);

    }


    @Override
    public int compareTo(Book page) {

        return String.valueOf(getNumberOfPage()).compareTo(String.valueOf(page.getNumberOfPage()));

    }
}
