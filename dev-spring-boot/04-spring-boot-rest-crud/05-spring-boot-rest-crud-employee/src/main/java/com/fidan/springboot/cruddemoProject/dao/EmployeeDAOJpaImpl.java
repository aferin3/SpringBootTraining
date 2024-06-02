package com.fidan.springboot.cruddemoProject.dao;

import com.fidan.springboot.cruddemoProject.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    //define field for entity manager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }
    // we don't use @Transactional at DAO layer. It will be handled at service layer
    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }
    // we don't use @Transactional at DAO layer. It will be handled at service layer
    @Override
    public void delete(Employee employee) {
        Employee theEmployee = findById(employee.getId());
        entityManager.remove(theEmployee);
    }
}
