package com.zimov.dataBaseSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
    private String DB_DRIVER_CLASS = resourceBundle.getString("DB_DRIVER_CLASS");
    private String DB_URL = resourceBundle.getString("DB_URL");
    private String DB_USERNAME = resourceBundle.getString("DB_USERNAME");
    private String DB_PASSWORD = resourceBundle.getString("DB_PASSWORD");

    private static DBConnection dbConnection = null;

    private DBConnection() {
        try {
            Class.forName(DB_DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    }

    public static synchronized DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }


}


/*You can use the same example application as above (asuming you create the required DB instance, tables etc.) replacing the Datasource code with something like

Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();
//etc.*/