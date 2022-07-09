package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.AddressData;

public interface AddressRepository extends JpaRepository<AddressData,Long> {

}
