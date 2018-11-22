package com.wdk.shop.entity;

public class ProductCategory {
    private int pcId;
    private String pcName;
    private int pcParentId;
    public ProductCategory(int pcId,String pcName,int pcParentId){
        this.pcId=pcId;
        this.pcName=pcName;
        this.pcParentId=pcParentId;
    }

    public int getPcId() {
        return pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public int getPcParentId() {
        return pcParentId;
    }

    public void setPcParentId(int pcParentId) {
        this.pcParentId = pcParentId;
    }
}
