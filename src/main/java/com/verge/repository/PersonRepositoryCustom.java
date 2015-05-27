package com.verge.repository;

import com.verge.entity.Person;

import java.util.List;

public interface PersonRepositoryCustom {

    public List<Person> surnameLike(String surname);
}
