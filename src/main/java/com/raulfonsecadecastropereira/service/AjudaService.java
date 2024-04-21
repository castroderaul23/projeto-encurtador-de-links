package com.raulfonsecadecastropereira.service;

import com.raulfonsecadecastropereira.model.Ajuda;
import org.springframework.stereotype.Service;

@Service
public class AjudaService {

    public Ajuda obterAjuda() {
        return new Ajuda("Raul Fonseca de Castro Pereira", "projeto-encurtador-de-links");
    }
}
