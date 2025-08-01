package com.cafeumg.cdfs.repository;

import com.cafeumg.cdfs.entities.Orders;
import com.cafeumg.cdfs.entities.Client;
import com.cafeumg.cdfs.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findByClient(Client client);
    List<Orders> findByProduct(Product product);
}