package com.fidan.userManagement.DAO;

import com.fidan.userManagement.entity.Personal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PersonalMan implements PersonalDAO{

    private EntityManager em;

    @Autowired
    public PersonalMan(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(Personal personal) {
        em.persist(personal);
    }

    @Override
    @Transactional
    public void update(Personal personal) {
        personal = em.merge(personal);
    }


    @Override
    @Transactional
    public void delete(int i) {
        Personal personal = findById(i);
        em.remove(personal);
    }

    @Override
    public List<Personal> findAll() {
        TypedQuery<Personal> query = em.createQuery("select p from Personal p", Personal.class);
        return query.getResultList();
    }

    @Override
    public Personal findById(int id) {

        return em.find(Personal.class, id);
    }
}
