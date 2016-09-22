package com.example.hsport.catalog;

   class Product {

    private String productId;
    private String name;
    private String description;
    private double price;

    protected String getProductId() {
        return productId;
    }

    protected String getName() {
        return name;
    }

    protected String getDescription() {
        return description + "\n";
    }

    protected double getPrice() {
        return price;
    }
    protected Product(String productId, String name, String description, double price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
