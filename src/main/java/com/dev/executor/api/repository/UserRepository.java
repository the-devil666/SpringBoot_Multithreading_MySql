package com.dev.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
