package com.inerxiait.apirestdemo.controller.cliente;

import com.inerxiait.apirestdemo.model.dto.client.ClientDto;
import com.inerxiait.apirestdemo.service.client.ClientService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.reflect.Type;
import java.util.List;


@RestController
@RequestMapping(path = "/api")
@Validated
public class ClientController {


    private ClientService clientService;
    private ModelMapper modelMapper;

    public ClientController(ClientService clientService, ModelMapper modelMapper) {
        this.clientService = clientService;
        this.modelMapper = modelMapper;
    }

    @GetMapping(value = "/v1/clients")
    @Secured("ROLE_ADMIN")
    public List<ClientDto> findAll() {
        Type listType = new TypeToken<List<ClientDto>>(){}.getType();
        List<ClientDto> proveedorDtoList = modelMapper.map(clientService.findAll(),listType);
        return proveedorDtoList;
    }
}
