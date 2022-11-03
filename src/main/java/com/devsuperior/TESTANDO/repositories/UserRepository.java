package com.devsuperior.TESTANDO.repositories;

import com.devsuperior.TESTANDO.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
