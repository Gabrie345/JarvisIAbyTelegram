package com.javisIA.javisIA.service.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class ResponseGPT implements Serializable {
    @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("created")
    private long created;
    @JsonProperty("model")
    private String model;
    @JsonProperty("choices")
    private List<ResponseChoice> choices;
    @JsonProperty("usage")
    private ResponseUsage usage;
    @JsonProperty("system_fingerprint")
    private String systemFingerprint;

    public ResponseGPT(String id, String object, long created, String model, List<ResponseChoice> choices, ResponseUsage usage, String systemFingerprint) {
        this.id = id;
        this.object = object;
        this.created = created;
        this.model = model;
        this.choices = choices;
        this.usage = usage;
        this.systemFingerprint = systemFingerprint;
    }

    public ResponseGPT() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ResponseChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<ResponseChoice> choices) {
        this.choices = choices;
    }

    public ResponseUsage getUsage() {
        return usage;
    }

    public void setUsage(ResponseUsage usage) {
        this.usage = usage;
    }

    public String getSystemFingerprint() {
        return systemFingerprint;
    }

    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }
}
