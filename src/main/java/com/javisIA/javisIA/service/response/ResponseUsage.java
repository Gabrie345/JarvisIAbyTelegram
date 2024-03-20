package com.javisIA.javisIA.service.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ResponseUsage implements Serializable {
    @JsonProperty("prompt_tokens")
    private int promptTokens;
    @JsonProperty("completion_tokens")
    private int completionTokens;
    @JsonProperty("total_tokens")
    private int totalTokens;
}
