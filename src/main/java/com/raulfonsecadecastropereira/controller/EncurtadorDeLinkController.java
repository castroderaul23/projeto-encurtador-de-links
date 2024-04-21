package com.raulfonsecadecastropereira.controller;

import com.raulfonsecadecastropereira.model.Url;
import com.raulfonsecadecastropereira.model.UrlEncurtada;
import com.raulfonsecadecastropereira.model.UrlProcessada;
import com.raulfonsecadecastropereira.service.EncurtadorDeLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/encurtador-de-links")
public class EncurtadorDeLinkController {

    @Autowired
    private EncurtadorDeLinkService encurtadorDeLinkService;

    @PostMapping
    public UrlEncurtada encurtarUrl(@RequestBody Url url) {
        return encurtadorDeLinkService.encurtarUrl(url);
    }

    @GetMapping
    public List<UrlProcessada> listarTodasUrlsEncurtadas() {
        return encurtadorDeLinkService.obterTodasUrlsProcessadas();
    }

}
