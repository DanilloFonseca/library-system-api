package com.fonseca.library_api.repository;

import com.fonseca.library_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
