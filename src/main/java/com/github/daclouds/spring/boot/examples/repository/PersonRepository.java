package com.github.daclouds.spring.boot.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.daclouds.spring.boot.examples.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
