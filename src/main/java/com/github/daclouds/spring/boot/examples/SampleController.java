package com.github.daclouds.spring.boot.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.daclouds.spring.boot.examples.model.Person;
import com.github.daclouds.spring.boot.examples.repository.PersonRepository;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	Person save() {
		Person person = new Person();
		person.setName("jon");
		person.setAge(25);
		return personRepository.save(person);
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	List<Person> findAll() {
		return personRepository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
	
}
