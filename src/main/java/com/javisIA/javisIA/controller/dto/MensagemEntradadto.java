package com.javisIA.javisIA.controller.dto;


import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MensagemEntradadto implements Serializable {

    @JsonProperty("mensagem")
    public String mensagem;
    @JsonProperty("idUsuario")
    public String idUsuario;

    public MensagemEntradadto(String mensagem, String idUsuario) {
        this.mensagem = mensagem;
        this.idUsuario = idUsuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
