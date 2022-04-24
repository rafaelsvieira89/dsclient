package com.vieira.dsclient.services;

import com.vieira.dsclient.dtos.ClientDTO;
import com.vieira.dsclient.entities.Client;
import com.vieira.dsclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    /*@Transactional(readOnly = true)
    public Page<ClientDTO> findAll(PageRequest pageRequest){
        Page<Client> clients = repository.findAll(pageRequest);
        return clients.map(x -> );
    }*/

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> optional = repository.findById(id);
        Client client = optional.get();
        return new ClientDTO(client);
    }

    public void delete(Long id){

    }
}
