package com.raulfonsecadecastropereira.controller;

import com.raulfonsecadecastropereira.model.Ajuda;
import com.raulfonsecadecastropereira.service.AjudaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajuda")
public class AjudaController {

    @Autowired
    private AjudaService ajudaService;

    @GetMapping
    public Ajuda ajuda() {
        return ajudaService.obterAjuda();
    }

}
