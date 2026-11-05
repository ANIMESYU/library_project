package com.library.libraryApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",nullable = false)
    private Long id;

    @Column(name = "book_name",nullable = false)
    private String name;

    @Column(name = "publish_home",nullable = false)
    private String publishHome;

    @Column(name = "rating")
    private Integer rating=0;

    public Book(){}

    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPublishHome(String publishHome) {this.publishHome = publishHome;}
    public void setRating(Integer rating) {this.rating = rating;}

    public Integer getRating() {return rating;}
    public Long getId() {return id;}
    public String getName(){return name;}
    public String getPublishHome(){return publishHome;}
}
/**
 * book_id int auto_increment primary key,
 * book_name varchar(200) not null,
 * publish_home varchar(200) not null,
 * rating int default 0
 */
