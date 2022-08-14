package com.criptocurrency.api.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
public class CoinMarketResponseStatusData {
    private OffsetDateTime timestamp;
    @JsonProperty("error_code")
    private int errorCode;
    @JsonProperty("error_message")
    private String errorMessage;
    private int elapsed;
    @JsonProperty("credit_count")
    private int creditCount;
    private String notice;
    @JsonProperty("total_count")
    private int totalCount;
}
