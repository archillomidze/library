/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.mziuri.book.model;

/**
 *
 * @author user
 */
public class Book {
    
    private int id;
    private String name;
    private int year;
    private int raiting;
    private int author_id;

    public Book() {
    }

    public Book(int id, String name, int year, int raiting, int author_id) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.raiting = raiting;
        this.author_id = author_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", year=" + year + ", raiting=" + raiting + ", author_id=" + author_id + '}';
    }
    
    
    
}
