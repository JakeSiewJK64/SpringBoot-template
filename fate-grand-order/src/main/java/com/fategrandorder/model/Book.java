package com.fategrandorder.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book implements Serializable {

    @Id
    public String Id;
    public String Name;
    public Double Price;
    public String Category;
    public String Author;

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getPrice() {
        return this.Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getCategory() {
        return this.Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "{" + " Id='" + getId() + "'" + ", Name='" + getName() + "'" + ", Price='" + getPrice() + "'"
                + ", Category='" + getCategory() + "'" + ", Author='" + getAuthor() + "'" + "}";
    }
}
