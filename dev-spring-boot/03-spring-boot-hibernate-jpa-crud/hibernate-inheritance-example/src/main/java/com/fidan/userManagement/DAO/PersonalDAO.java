package com.fidan.userManagement.DAO;

import com.fidan.userManagement.entity.Personal;

import java.util.List;

public interface PersonalDAO {
    void save(Personal personal);
    void update(Personal personal);
    void delete(int i);
    List<Personal> findAll();
    Personal findById(int id);
}
