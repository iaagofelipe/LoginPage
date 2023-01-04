package com.app.loginpage.repository;

import com.app.loginpage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
