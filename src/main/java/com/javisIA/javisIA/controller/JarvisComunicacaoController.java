package com.javisIA.javisIA.controller;


import com.javisIA.javisIA.service.imp.ConexaoGPTServiceImp;
import com.javisIA.javisIA.service.response.ResponseMessage;


public class JarvisComunicacaoController {
    public ResponseMessage enviaMensagem(String mensagem) throws Exception {
        ConexaoGPTServiceImp conexaoGPTServiceImp = new ConexaoGPTServiceImp();
        ResponseMessage responseMessage = conexaoGPTServiceImp.sendRequestGPT(mensagem);
        return responseMessage;
    }

}
