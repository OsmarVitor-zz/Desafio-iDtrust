package com.mycompany.desafio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BOOK")
public class Book{

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nameBook")
    private String nameBook;

    @Column(name = "autoBook")
    private String authorBook;

    @Column(name = "isbn")
    private String isbn;

    public Book(long id, String nameBook, String authorBook, String isbn) {
        this.isbn = isbn;
        this.id = id;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
    }
    
    public long getId() {
        return id;
    }
    
    public String getNameBook() {
        return nameBook;
    }
    
    public String getAuthorBook() {
        return authorBook;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    
    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
