package com.verge.controller;

import com.google.common.collect.Lists;
import com.verge.entity.Person;
import com.verge.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository repository;

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<Person> getAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @RequestMapping(value = "/people/{id}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable("id") Long id) {
        Person person = repository.findOne(id);
        return person;
    }

    @RequestMapping(value = "/surname", method = RequestMethod.GET)
    public List<Person> surnameLike(@RequestParam("query") String query) {
        return repository.surnameLike(query);
    }

    @RequestMapping(value = "/firstname", method = RequestMethod.GET)
    public List<Person> findByFirstName(@RequestParam("query") String query) {
        return repository.findByFirstName(query);
    }

}