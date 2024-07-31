package com.Sintaxy.biblitecaSintaxy.repository;

import com.Sintaxy.biblitecaSintaxy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
