package com.cafeumg.cdfs.repository;

import com.cafeumg.cdfs.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByEmail(String email);
}