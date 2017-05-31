package com.zimov.DAO;

/**
 * Created by PC on 25.12.2016.
 */
public class DAOFactory {
    public static BooksDAO getBooksDao(){
        return new BooksDAO();
    }
    public static CatalogBooksDAO getCatalogBooksDao(){
        return new CatalogBooksDAO();
    }
}
