package com.zimov.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by PC on 20.12.2016.
 */
public final class User implements Serializable {
    private int id;
    private UserType userType;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String eMail;
    private String password;


}
