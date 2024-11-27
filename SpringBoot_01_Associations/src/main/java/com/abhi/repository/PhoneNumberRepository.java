package com.abhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.PhoneNumber;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {

}
