package com.rpgsistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpgsistemas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
