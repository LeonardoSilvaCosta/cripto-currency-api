package com.criptocurrency.api.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CriptoCurrencyQuotes {
    @JsonProperty("USD")
    private USDCriptoCurrency USD;
}
