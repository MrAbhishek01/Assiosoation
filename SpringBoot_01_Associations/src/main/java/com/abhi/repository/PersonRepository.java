package com.abhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
