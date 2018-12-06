package com.dbms.triplehao.entity;

public class RegionStore {
    private Integer productId;

    private String name;

    private String url;

    private double price;

    private Integer inventoryAmount;

    private String category;

    int regionId;

    String regionName;

    String regionManager;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionManager() {
        return regionManager;
    }

    public void setRegionManager(String regionManager) {
        this.regionManager = regionManager;
    }

    public Integer getProductID() {
        return productId;
    }

    public void setProductID(Integer productID) {
        this.productId = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(Integer inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

}
