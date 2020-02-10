package com.inerxiait.apirestdemo.model.repository.client;

import com.inerxiait.apirestdemo.model.entity.client.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClient extends CrudRepository<Client, String> {
}
