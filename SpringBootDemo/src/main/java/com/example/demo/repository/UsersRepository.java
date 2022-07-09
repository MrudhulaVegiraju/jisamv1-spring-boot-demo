package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.UsersData;

@Repository
public interface UsersRepository extends JpaRepository<UsersData, Long>{

}
