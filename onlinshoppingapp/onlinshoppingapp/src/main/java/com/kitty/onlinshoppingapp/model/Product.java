package com.kitty.onlinshoppingapp.model;

public class Product {
    private int id;
    private double price;
    private String name;
    private String description;

    public Product() {

    }

    public Product(int id, double price, String name, String description) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(id);
        sb.append(":");
        sb.append(name);
        sb.append(":");
        sb.append(price);
        sb.append(":");
        sb.append(description);
        return sb.toString();
    }
}
