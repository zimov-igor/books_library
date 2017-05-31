package com.zimov.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by PC on 20.12.2016.
 */
public final class CatalogBooks implements Serializable {
    private int id;
    private String description;

    public CatalogBooks() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogBooks that = (CatalogBooks) o;
        return id == that.id &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "CatalogBooks{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
