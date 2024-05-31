package com.fidan.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fidan.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDAOImpl implements StudentDAO {

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    // implement save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //create query
        TypedQuery<Student> query = entityManager.createQuery("FROM Student order by lastName", Student.class); // student which is after from is an entity , not table name
        //return query results
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String stringlastName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student where lastName = :lname", Student.class);
        query.setParameter("lname", stringlastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);

    }
    @Override
    @Transactional
    public void delete(int id) {

        Student theStudent = entityManager.find(Student.class, id);
        entityManager.remove(theStudent);
        
    }
    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }
}
