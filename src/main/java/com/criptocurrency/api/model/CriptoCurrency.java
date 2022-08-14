package com.criptocurrency.api.model;

import lombok.Data;

import java.util.List;

@Data
public class CriptoCurrency {
    private Long id;
    private String name;
    private String symbol;
    private String slug;
    private int num_market_pairs;
    private String data_added;
    private List<String> tags;
    private Long max_supply;
    private Long circulating_supply;
    private Long total_supply;
    private int cmc_rank;
}