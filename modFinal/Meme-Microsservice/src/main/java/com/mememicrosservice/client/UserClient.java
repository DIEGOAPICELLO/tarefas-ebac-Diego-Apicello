package com.mememicrosservice.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

    private final RestTemplate restTemplate;
    private final String userServiceUrl = "http://localhost:8081/usuarios";

    public UserClient() {
        this.restTemplate = new RestTemplate();
    }

    public boolean userExist (Long userId) {
        try {
            restTemplate.getForObject(userServiceUrl + "/" + userId, String.class);
            return true;
        } catch (HttpClientErrorException.NotFound e){
            return false;
        } catch (Exception e){
            throw new RuntimeException("Erro ao conectar com usario-service", e);
        }
    }
}
