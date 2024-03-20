package com.javisIA.javisIA.service.viewModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GPTRequestViewModel implements Serializable {
    @JsonProperty("model")
    private  String model;
    @JsonProperty("messages")
    private List<MessageViewModel> messages;
    @JsonProperty("temperature")
    private double temperature;
    @JsonProperty("top_p")
    private double topP;
    @JsonProperty("n")
    private int n;
    @JsonProperty("stream")
    private boolean stream;
    @JsonProperty("max_tokens")
    private int maxTokens;
    @JsonProperty("presence_penalty")
    private double presencePenalty;
    @JsonProperty("frequency_penalty")
    private double frequencyPenalty;

    public GPTRequestViewModel(String model, List<MessageViewModel> messages, double temperature, double topP, int n, boolean stream, int maxTokens, double presencePenalty, double frequencyPenalty) {
        this.model = model;
        this.messages = messages;
        this.temperature = temperature;
        this.topP = topP;
        this.n = n;
        this.stream = stream;
        this.maxTokens = maxTokens;
        this.presencePenalty = presencePenalty;
        this.frequencyPenalty = frequencyPenalty;
    }

    public GPTRequestViewModel() {

    }

    public GPTRequestViewModel(String message) {
        this.model = "gpt-3.5-turbo";
        this.messages = new ArrayList<>();
        this.messages.add(new MessageViewModel("user", message));
        this.temperature = 1;
        this.topP = 1;
        this.n = 1;
        this.stream = false;
        this.maxTokens = 250;
        this.presencePenalty = 0;
        this.frequencyPenalty = 0;
    }
    // Getters
    public String getModel() {
        return model;
    }

    public List<MessageViewModel> getMessages() {
        return messages;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getTopP() {
        return topP;
    }

    public int getN() {
        return n;
    }

    public boolean isStream() {
        return stream;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public double getPresencePenalty() {
        return presencePenalty;
    }

    public double getFrequencyPenalty() {
        return frequencyPenalty;
    }
}
