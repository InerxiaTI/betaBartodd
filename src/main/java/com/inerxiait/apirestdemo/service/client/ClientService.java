package com.inerxiait.apirestdemo.service.client;

import com.inerxiait.apirestdemo.model.entity.client.Client;
import com.inerxiait.apirestdemo.model.repository.client.IClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private IClient clientRepository;
    private ModelMapper modelMapper;

    public ClientService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ClientService() {
    }


    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }



}
