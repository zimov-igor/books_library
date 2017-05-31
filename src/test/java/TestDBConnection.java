import com.zimov.DAO.BooksDAO;
import com.zimov.DAO.DAOFactory;
import com.zimov.DAO.inerfaces.IBooksDAO;
import com.zimov.DAO.inerfaces.ICatalogBooksDAO;
import com.zimov.dataBaseSource.DBConnection;
import com.zimov.exeption.DAOExeption;
import com.zimov.model.Books;
import com.zimov.model.CatalogBooks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by PC on 23.12.2016.
 */
public class TestDBConnection {
    public static void main(String[] args) {
        String INSERT = "INSERT INTO catalog_books(description) VALUES(?)";
        Connection connection = null;
        Statement statement = null;
        PreparedStatement prStat;

        CatalogBooks catalogBooks = new CatalogBooks();
        catalogBooks.setId(3);
        catalogBooks.setDescription("Horror");

         try {
           connection = DBConnection.getInstance().getConnection();
           //statement = connection.createStatement();
             //statement.execute(INSERT);
            prStat = connection.prepareStatement(INSERT);
            prStat.setString(1,catalogBooks.getDescription());
            prStat.execute();
             //if(!connection.isClosed()) System.out.println("Yes");
             // Statement statement = connection.createStatement();
             //ResultSet s=  statement.executeQuery("SELECT * FROM user");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
             try {
                 connection.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
             /*try {
                 statement.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }*/
         }

        /*CatalogBooks catalogBooks = new CatalogBooks();
        catalogBooks.setId(3);
        catalogBooks.setDescription("Horror");
        ICatalogBooksDAO iCatalogBooksDAO = DAOFactory.getCatalogBooksDao();
        try {
            iCatalogBooksDAO.insert(catalogBooks);
        } catch (DAOExeption daoExeption) {
            daoExeption.printStackTrace();
        }*/
    }
}
