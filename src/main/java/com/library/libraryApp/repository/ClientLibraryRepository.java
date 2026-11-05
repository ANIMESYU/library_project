package com.library.libraryApp.repository;

import com.library.libraryApp.entity.ClientLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientLibraryRepository extends JpaRepository<ClientLibrary,Long> {
    boolean existsByClientIdAndBookId(Long clientId, Long bookId);//проверка дубликата в личной библиотеке
    List<ClientLibrary> findByClientId(Long clientId);//список добавленных книг у пользователя
}
