package com.server.TC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.server.TC.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
