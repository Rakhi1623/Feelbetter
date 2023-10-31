package com.canddella.FeelBetter.repositary;


import com.canddella.FeelBetter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByUsername(String username);
    Boolean existsByPassword(String password);


    User findByUsername(String username);
}
