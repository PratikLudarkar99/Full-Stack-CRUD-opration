package com.crudoperation.fullstackbackend.repository;


import com.crudoperation.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
