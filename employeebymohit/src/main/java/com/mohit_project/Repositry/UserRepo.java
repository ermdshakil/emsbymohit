package com.mohit_project.Repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mohit_project.Entity.User;

public interface UserRepo extends JpaRepository<User,Long> {
	Optional<User> findByEmailAndPassword(String email, String password);

}
