package com.bensemi.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author koumotoj
 */
@Stateless
public class EventDb {
    @PersistenceContext
    private EntityManager em;
    
    public void create(Event event){
        em.persist(event);
    }
}
