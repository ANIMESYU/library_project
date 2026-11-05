package com.library.libraryApp.repository;

import com.library.libraryApp.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    boolean existsByEmail(String email);
    boolean existsByName(String name);

    Optional<Client> findByName(String name);//для поиска пользователей в дальнейшем(добавление в друзья пользователя-пользователем)
    Optional<Client> findByEmail(String email);//для регистрации
}
