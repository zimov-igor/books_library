package com.zimov.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by PC on 20.12.2016.
 */
public final class UserType implements Serializable {
    private int id;
    private String userType;

    public UserType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserType userType1 = (UserType) o;
        return id == userType1.id &&
                Objects.equals(userType, userType1.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userType);
    }

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                '}';
    }
}
