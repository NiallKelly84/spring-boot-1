package com.verge.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseRepository {

    @PersistenceContext
    protected EntityManager em;
}
