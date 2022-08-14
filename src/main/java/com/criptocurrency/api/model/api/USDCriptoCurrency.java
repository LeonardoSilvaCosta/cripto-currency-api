package com.criptocurrency.api.model.api;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class USDCriptoCurrency {
    private BigDecimal price;
    private Long volume_24h;
    private Long volume_change_24h;
    private int percent_change_1h;
    private int percent_change_24h;
    private int percent_change_7d;
    private int percent_change_30d;
    private int percent_change_60d;
    private int percent_change_90d;
    private Long market_cap;
    private int market_cap_dominance;
    private Long fully_diluted_market_cap;
    private Long tvl;
    private OffsetDateTime last_updated;
}
