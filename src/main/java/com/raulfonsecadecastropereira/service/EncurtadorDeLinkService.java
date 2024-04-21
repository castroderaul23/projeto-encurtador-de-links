package com.raulfonsecadecastropereira.service;

import com.raulfonsecadecastropereira.model.Url;
import com.raulfonsecadecastropereira.model.UrlEncurtada;
import com.raulfonsecadecastropereira.model.UrlProcessada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class EncurtadorDeLinkService {

    @Autowired
    private RestTemplate restTemplate;

    private final List<UrlProcessada> urlsProcessadas = new ArrayList<>();

    public UrlEncurtada encurtarUrl(Url url) {

        try {
            ResponseEntity<UrlEncurtada> urlEncurtadaResultado = restTemplate.postForEntity("https://api.encurtador.dev/encurtamentos", url, UrlEncurtada.class);
            UrlEncurtada urlEncurtada = urlEncurtadaResultado.getBody();
            UrlProcessada urlProcessada = new UrlProcessada();
            urlProcessada.setUrlOriginal(url.getUrl());
            urlProcessada.setUrlEncurtada(urlEncurtada.getUrlEncurtada());
            urlsProcessadas.add(urlProcessada);
            return urlEncurtada;
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao chamar API Externa de encurtador a url: "+ url);
        }
    }

    public List<UrlProcessada> obterTodasUrlsProcessadas() {
        return urlsProcessadas;
    }
}
