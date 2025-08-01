package com.cafeumg.cdfs.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_type")
    private Typ type;

    @ManyToOne
    @JoinColumn(name = "id_presentation")
    private Presentation presentation;

    private BigDecimal purchase_price;

    @Column(nullable = false)
    private Integer stock = 0;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public Product() {}

    public Product(Integer id_product, Typ type, Presentation presentation, BigDecimal purchase_price, Integer stock, Category category) {
        this.id_product = id_product;
        this.type = type;
        this.presentation = presentation;
        this.purchase_price = purchase_price;
        this.stock = stock;
        this.category = category;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public Typ getType() {
        return type;
    }

    public void setType(Typ type) {
        this.type = type;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public BigDecimal getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(BigDecimal purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}