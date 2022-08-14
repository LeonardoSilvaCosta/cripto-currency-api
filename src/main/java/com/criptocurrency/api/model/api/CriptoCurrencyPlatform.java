package com.criptocurrency.api.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CriptoCurrencyPlatform {
    private Long id;
    private String name;
    private String symbol;
    private String slug;
    @JsonProperty("token_address")
    private String tokenAddress;
}
