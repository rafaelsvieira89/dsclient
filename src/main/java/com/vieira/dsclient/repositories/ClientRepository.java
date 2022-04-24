package com.vieira.dsclient.repositories;

import com.vieira.dsclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
