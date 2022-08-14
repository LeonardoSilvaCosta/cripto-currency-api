package com.criptocurrency.api.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
public class CriptoCurrency {
    private Long id;
    private String name;
    private String symbol;
    private String slug;
    @JsonProperty("num_market_pairs")
    private int numMarketPairs;
    @JsonProperty("data_added")
    private OffsetDateTime dataAdded;
    private List<String> tags;
    @JsonProperty("max_supply")
    private Long maxSupply;
    @JsonProperty("circulating_supply")
    private Long circulatingSupply;
    @JsonProperty("total_supply")
    private Long totalSupply;
    private CriptoCurrencyPlatform platform;
    @JsonProperty("cmc_rank")
    private int cmcRank;
    @JsonProperty("self_reported_circulating_supply")
    private Long selfReportedCirculatingSupply;
    @JsonProperty("self_reported_market_cap")
    private Long selfReportedMarketCap;
    @JsonProperty("tvl_ratio")
    private int tvlRatio;
    @JsonProperty("last_updated")
    private OffsetDateTime lastUpdated;
    private CriptoCurrencyQuote quote;

}