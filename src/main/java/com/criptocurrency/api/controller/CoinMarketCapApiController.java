package com.criptocurrency.api.controller;

import com.criptocurrency.api.model.CoinMarketApiData;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/criptoCurrencies")
public class CoinMarketCapApiController {

    private String apiKey = "c4f98fc4-8cf3-413c-bfce-75a6bb5ed3e7";
    private String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";

    @GetMapping
    public ResponseEntity<CoinMarketApiData> makeAPiCall() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-CMC_PRO_API_KEY", apiKey);
        HttpEntity requestEntity = new HttpEntity(headers);
        ResponseEntity<CoinMarketApiData> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, CoinMarketApiData.class);

        return ResponseEntity.ok(response.getBody());
    }
}
