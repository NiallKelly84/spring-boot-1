package com.verge.repository;

import com.verge.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByFirstName(@Param("query") String query);

    @Query("SELECT p from Person p WHERE p.surname LIKE %:query%")
    List<Person> surnameLike(@Param("query") String query);

}
