package com.kitty.onlinshoppingapp.model;

public class Order {
    private int id;
    private int userId;
    private int productId;


    public Order(int id, int userId, int productId) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(id);
        sb.append(";");
        sb.append(userId);
        sb.append(";");
        sb.append(productId);
        return sb.toString();
    }
}

