package com.zimov.DAO;

import com.zimov.DAO.inerfaces.ICatalogBooksDAO;
import com.zimov.exeption.DAOExeption;
import com.zimov.model.CatalogBooks;

import java.util.List;

/**
 * Created by PC on 25.12.2016.
 */
public class CatalogBooksDAO extends BasicDAO implements ICatalogBooksDAO {
    @Override
    public void insert(CatalogBooks catalogBooks) throws DAOExeption {

    }

    @Override
    public CatalogBooks getById(long id) throws DAOExeption {
        return null;
    }

    @Override
    public void update(CatalogBooks catalogBooks) throws DAOExeption {

    }

    @Override
    public void delete(CatalogBooks catalogBooks) throws DAOExeption {

    }

    @Override
    public List<CatalogBooks> getAll() throws DAOExeption {
        return null;
    }
}
