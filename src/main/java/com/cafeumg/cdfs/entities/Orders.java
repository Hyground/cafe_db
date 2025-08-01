package com.cafeumg.cdfs.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_orders;

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();

    @Column(nullable = false)
    private String status = "pending";

    private Integer quantity;
    private BigDecimal sale_price;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_product")
    private Product product;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_client")
    private Client client;

    public Orders() {}

    public Orders(Integer id_orders, LocalDateTime created_at, String status, Integer quantity, BigDecimal sale_price, Product product, Client client) {
        this.id_orders = id_orders;
        this.created_at = created_at;
        this.status = status;
        this.quantity = quantity;
        this.sale_price = sale_price;
        this.product = product;
        this.client = client;
    }

    public Integer getId_orders() {
        return id_orders;
    }

    public void setId_orders(Integer id_orders) {
        this.id_orders = id_orders;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}