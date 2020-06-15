package com.example.springboot05.repository;

import com.example.springboot05.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo  extends CrudRepository<User, Long> {
    Iterable<User> findUserByName(String name);
}
