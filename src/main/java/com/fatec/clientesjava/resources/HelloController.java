package com.fatec.clientesjava.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //utilizado para criar endpoints
public class HelloController {

    @GetMapping("hello") //nome do endpoint
    public String hello()
    {
        return "Meu primeiro endpoint em Java!!!!!";
    }
    @GetMapping("nostalgia")
    public String secret()
    {
        return "Old Mcdonald had a dog!";
    }
}
