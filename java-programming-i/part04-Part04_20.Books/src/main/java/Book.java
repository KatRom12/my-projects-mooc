/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
public class Book {
    
    private String name;
    private int pages;
    private int year;
    
    public Book(String bookName, int numberOfPages, int publicationYear) {
        this.name = bookName;
        this.pages = numberOfPages;
        this.year = publicationYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYear() {
        return this.year;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
