package com.zimov.exeption;

/**
 * Created by PC on 24.12.2016.
 */
public class DAOExeption extends Exception {
    private String massage;

    public DAOExeption() {
        massage = "DAO connection problems";
    }

    public String getMassage() {
        return massage;
    }
}
