package com.vieira.dsclient.resources;

import com.vieira.dsclient.dtos.ClientDTO;
import com.vieira.dsclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    ClientService service;

    /*@GetMapping
    public ResponseEntity<Page<Client>> findAllPaged(@RequestParam PageRequest pageRequest){
        Page<ClientDTO> list = service.findAll(pageRequest);
        //return ResponseEntity.ok().body(list);
    }*/

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
