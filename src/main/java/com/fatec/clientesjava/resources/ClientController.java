package com.fatec.clientesjava.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.clientesjava.entities.Client;

@RestController
public class ClientController {

    @GetMapping("clients")
    public List<Client> getClients()
    {
        List<Client> clients = new ArrayList<Client>();
        Client obj;
        for(int i = 0; i < 10; i++)
        {
            obj = new Client(i, "Pedro", "pedro@pedro");
            clients.add(obj);
        }
        return clients;
    }
}
