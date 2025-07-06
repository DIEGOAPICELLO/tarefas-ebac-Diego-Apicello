package com.categoriaMicrosservice.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class UsuarioClient {

    private final RestTemplate restTemplate;
    private final String usuarioServiceUrl = "http://localhost:8081/usuarios";

    public UsuarioClient() {
        this.restTemplate = new RestTemplate();
    }

    public boolean usuarioExiste (Long userId) {
        try {
            restTemplate.getForObject(usuarioServiceUrl + "/" + userId, String.class);
            return true;
        } catch (HttpClientErrorException.NotFound e) {
            return false;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar com usuario-service", e);
        }
    }
}
