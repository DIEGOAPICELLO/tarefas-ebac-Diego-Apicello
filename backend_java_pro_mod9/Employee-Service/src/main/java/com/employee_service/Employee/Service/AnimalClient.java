package com.employee_service.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class AnimalClient {

    @Autowired
    private RestTemplate restTemplate;

    public Long countAnimaisRecebidosPorFuncionario(String nomeRecebedor, LocalDate startDate, LocalDate endDate) {
        String url = "http://localhost:8081/api/animals/count?nomeRecebedor={nomeRecebedor}&startDate={startDate}&endDate={endDate}";
        Map<String, Object> params = new HashMap<>();
        params.put("nomeRecebedor", nomeRecebedor);
        params.put("startDate", startDate);
        params.put("endDate", endDate);
        return restTemplate.getForObject(url, Long.class, params);
    }
}
