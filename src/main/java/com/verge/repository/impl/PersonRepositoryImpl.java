package com.verge.repository.impl;

import com.verge.entity.Person;
import com.verge.repository.PersonRepositoryCustom;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepositoryCustom {

    private static Logger logger = Logger.getLogger(PersonRepositoryImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Person> surnameLike(String surname) {
        logger.info("****CALLING CUSTOM REPOSITORY METHOD****");
        Query query = em.createQuery("SELECT p from Person p WHERE p.surname LIKE :surname")
                .setParameter("surname", "%" + surname + "%");
        List<Person> people = query.getResultList();
        return people;
    }
}
