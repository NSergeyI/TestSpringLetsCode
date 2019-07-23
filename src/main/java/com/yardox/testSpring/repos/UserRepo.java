package com.yardox.testSpring.repos;

import com.yardox.testSpring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
