package com.kitty.onlinshoppingapp.model;

public class ProductImage {
    private String url;
    private int productId;

    public ProductImage() {

    }

    public ProductImage(String url, int productId) {
        this.url = url;
        this.productId = productId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(url);
        sb.append(";");
        sb.append(productId);
        return sb.toString();
    }
}
