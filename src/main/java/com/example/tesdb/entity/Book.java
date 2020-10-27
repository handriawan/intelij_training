package com.example.tesdb.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String isbn;

    @ManyToOne
    @JoinColumn
    private BookCategory bookCategory;

    public Book(){

    }

    public Book(String title, String writer, String isbn) {
        this.title = title;
        this.writer = writer;
        this.isbn = isbn;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
//        StringBuilder builder  =  new StringBuilder();
//        builder.append("Id : ").append(Id)
//                .append(", Title : ").append(title)
//                .append(", Writer :").append(writer)
//                .append(", ISBN : ").append(isbn);
//
//        return builder.toString();

        return "Data buku : [ id = " + Id + '\''+ ", title = " + title+ '\''+ ", writer = " + writer
                + '\''+ ", isbn = " + isbn;
    }
    //
//    @Override
//    public String toString() {
//
//         var builder = new StringBuilder();
//        builder.append("City{id=").append(id).append(", name=")
//                .append(name).append(", population=")
//                .append(population).append("}");
//
//        return builder.toString();
//    }
}
