package com.zimov.DAO.inerfaces;

import com.zimov.model.Books;

import java.util.List;

/**
 * Created by PC on 24.12.2016.
 */
public interface IBooksDAO extends CRUD<Books> {
    List<Books> getAllBooksByTitle(String title);
}
