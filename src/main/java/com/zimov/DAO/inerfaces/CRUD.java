package com.zimov.DAO.inerfaces;

import com.zimov.exeption.DAOExeption;

import java.util.List;

/**
 * Created by PC on 24.12.2016.
 */
public interface CRUD<T> {
    void insert(T t) throws DAOExeption;
    T getById(long id) throws DAOExeption;
    void update(T t) throws DAOExeption;
    void delete(T t) throws DAOExeption;
    List<T> getAll() throws DAOExeption;

}
