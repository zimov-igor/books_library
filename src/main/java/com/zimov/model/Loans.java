package com.zimov.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by PC on 20.12.2016.
 */
public final class Loans implements Serializable {
    private int id;
    private Books copies;
    private User user;
    private Date dateOfLoans;
    private String loansStatus;

    public Loans() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books getCopies() {
        return copies;
    }

    public void setCopies(Books copies) {
        this.copies = copies;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateOfLoans() {
        return dateOfLoans;
    }

    public void setDateOfLoans(Date dateOfLoans) {
        this.dateOfLoans = dateOfLoans;
    }

    public String getLoansStatus() {
        return loansStatus;
    }

    public void setLoansStatus(String loansStatus) {
        this.loansStatus = loansStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loans loans = (Loans) o;
        return id == loans.id &&
                Objects.equals(copies, loans.copies) &&
                Objects.equals(user, loans.user) &&
                Objects.equals(dateOfLoans, loans.dateOfLoans) &&
                Objects.equals(loansStatus, loans.loansStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, copies, user, dateOfLoans, loansStatus);
    }

    @Override
    public String toString() {
        return "Loans{" +
                "id=" + id +
                ", copies=" + copies +
                ", user=" + user +
                ", dateOfLoans=" + dateOfLoans +
                ", loansStatus='" + loansStatus + '\'' +
                '}';
    }
}
