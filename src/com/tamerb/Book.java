package com.tamerb;


import lombok.Data;

@Data
public class Book implements Comparable<Book> {

    private String nameOfTheBook;
    
    private int numberOfPage;

    private String nameOfTheAuthor;

    private String dateOfPublication;

    public Book(String bookName, int numberOfPage, String nameOfTheAuthor, String dateOfPublication) {

        this.nameOfTheBook = bookName;
        this.numberOfPage = numberOfPage;
        this.nameOfTheAuthor = nameOfTheAuthor;
        this.dateOfPublication = dateOfPublication;

    }

    public void display() {

        System.out.println(getNameOfTheBook() + "\t\t" +
                getNumberOfPage() + "\t\t\t\t\t" + getNameOfTheAuthor() + "\t\t\t" +
                getDateOfPublication());

    }

    @Override
    public int compareTo(Book name) {

        return getNameOfTheBook().compareTo(name.getNameOfTheBook());

    }

}
