package com.example.springboot_jwt_lennguyenvan.repository;
import com.example.springboot_jwt_lennguyenvan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}