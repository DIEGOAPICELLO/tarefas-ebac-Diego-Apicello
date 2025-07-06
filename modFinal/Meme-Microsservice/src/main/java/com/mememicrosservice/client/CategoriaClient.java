package com.mememicrosservice.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class CategoriaClient {

    private final RestTemplate restTemplate;
    private final String categoriaServiceUrl = "http://localhost:8082/categorias";

    public CategoriaClient(){
        this.restTemplate = new RestTemplate();
    }

    public boolean categoriaExiste(Long categoriaId) {
        try {
            restTemplate.getForObject(categoriaServiceUrl + "/" + categoriaId, String.class);
            return true;
        } catch (HttpClientErrorException.NotFound e) {
            return false;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar com categoria-service", e);
        }
    }
}
