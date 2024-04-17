package com.example.form.form.repository;

import com.example.form.form.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository  extends JpaRepository<User , Integer> {
    Optional<User>  findByUsernameOrEmail(String usernameOrEmail, String orEmail);

    User findByUsername(String username);
}
