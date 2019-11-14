package com.websystique.SpringBootCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.SpringBootCRUD.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);


}
