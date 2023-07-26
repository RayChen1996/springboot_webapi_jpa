package com.soca.webapi.dao;

import com.soca.webapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    User save(User user);
    User findById(int id);
    List<User> findAll();
    void delete(User user);
}
