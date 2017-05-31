package com.zimov.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by PC on 19.12.2016.
 */
public class Books implements Serializable {
    private int id;
    private int isbn;
    private int year;
    private String title;
    private String languages;
    private String author;
    private String publisher;
    private String booksStatus;
    private CatalogBooks catalogBooks;

    public Books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBooksStatus() {
        return booksStatus;
    }

    public void setBooksStatus(String booksStatus) {
        this.booksStatus = booksStatus;
    }

    public CatalogBooks getCatalogBooks() {
        return catalogBooks;
    }

    public void setCatalogBooks(CatalogBooks catalogBooks) {
        this.catalogBooks = catalogBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id &&
                isbn == books.isbn &&
                year == books.year &&
                Objects.equals(title, books.title) &&
                Objects.equals(languages, books.languages) &&
                Objects.equals(author, books.author) &&
                Objects.equals(publisher, books.publisher) &&
                Objects.equals(booksStatus, books.booksStatus) &&
                Objects.equals(catalogBooks, books.catalogBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, year, title, languages,
                author, publisher, booksStatus, catalogBooks);
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", languages='" + languages + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", booksStatus='" + booksStatus + '\'' +
                ", catalogBooks=" + catalogBooks +
                '}';
    }
}
