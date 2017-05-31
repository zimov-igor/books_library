package com.zimov.DAO;

import com.zimov.DAO.inerfaces.IBooksDAO;
import com.zimov.exeption.DAOExeption;
import com.zimov.model.Books;

import java.util.List;

/**
 * Created by PC on 25.12.2016.
 */
public class BooksDAO extends BasicDAO implements IBooksDAO {
    @Override
    public void insert(Books books) throws DAOExeption {

    }

    @Override
    public Books getById(long id) throws DAOExeption {
        return null;
    }

    @Override
    public void update(Books books) throws DAOExeption {

    }

    @Override
    public void delete(Books books) throws DAOExeption {

    }

    @Override
    public List<Books> getAll() throws DAOExeption {
        return null;
    }

    @Override
    public List<Books> getAllBooksByTitle(String title) {
        return null;
    }
}
