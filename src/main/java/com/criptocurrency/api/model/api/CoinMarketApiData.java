package com.criptocurrency.api.model.api;

import lombok.Data;

import java.util.List;

@Data
public class CoinMarketApiData {

    private CoinMarketResponseStatusData status;
    private List<CriptoCurrency> data;
}
