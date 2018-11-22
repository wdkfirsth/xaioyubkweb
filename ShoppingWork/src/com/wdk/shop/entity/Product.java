package com.wdk.shop.entity;

public class Product {
    private int prodId;
    private String prodName;
    private  String prodDesc;
    private float prodPrice;
    private int prodStock;//数量
    private int pcId;//分类号
    private int pcChildId;//具体商品编号;
    private String prodFileName;

    public Product(){

    }

    //添加商品
    public Product(int prodId,String prodName,String prodDesc,float prodPrice,int prodStock,int pcId,int pcChildId,String prodFileName){
        this.prodId=prodId;
        this.prodName=prodName;
        this.prodDesc=prodDesc;
        this.prodPrice=prodPrice;
        this.prodStock=prodStock;
        this.pcId=pcId;
        this.pcChildId=pcChildId;
        this.prodFileName=prodFileName;

    }


    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public float getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(float prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdStock() {
        return prodStock;
    }

    public void setProdStock(int prodStock) {
        this.prodStock = prodStock;
    }

    public int getPcId() {
        return pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    public int getPcChildId() {
        return pcChildId;
    }

    public void setPcChildId(int pcChildId) {
        this.pcChildId = pcChildId;
    }

    public String getProdFileName() {
        return prodFileName;
    }

    public void setProdFileName(String prodFileName) {
        this.prodFileName = prodFileName;
    }
}
