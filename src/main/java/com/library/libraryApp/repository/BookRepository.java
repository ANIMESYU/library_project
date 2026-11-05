package com.library.libraryApp.repository;

import com.library.libraryApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByNameContainingIgnoreCase(String name);
    List<Book> findByPublishHomeContainingIgnoreCase (String publishHome);//основа поисковой системы

    boolean existsByNameAndPublishHome(String name, String publishHome);//для избавления от двойников в общей базе
}
