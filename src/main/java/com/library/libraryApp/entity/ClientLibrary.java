package com.library.libraryApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_library")
public class ClientLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "library_id",nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    public ClientLibrary(){}

    public void setId(Long id) {this.id = id;}
    public void setBook(Book book) {this.book = book;}
    public void setClient(Client client) {this.client = client;}

    public Long getId() {return id;}
    public Book getBook(){return book;}
    public Client getClient() {return client;}
}
/**
 * library_id int auto_increment primary key,
 * book_id int,
 * client_id int,
 * * foreign key(book_id)references book(book_id) on delete cascade,
 * foreign key(client_id)references client(client_id) on delete cascade
 */