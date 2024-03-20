package com.javisIA.javisIA.service.imp;

import com.javisIA.javisIA.service.response.ResponseGPT;
import com.javisIA.javisIA.service.response.ResponseMessage;
import com.javisIA.javisIA.service.viewModel.GPTRequestViewModel;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConexaoGPTServiceImp {

    private WebClient webClient = WebClient.create("https://api.openai.com");
    private final String OPENAI_API_ENDPOINT = "/v1/chat/completions";

    public ResponseMessage sendRequestGPT(String mensagem) throws Exception {
        GPTRequestViewModel requestBody = new GPTRequestViewModel(mensagem);
        System.out.println(requestBody);

        Mono<ResponseGPT> request = webClient.post()
                .uri(OPENAI_API_ENDPOINT)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + System.getenv("GPT_TOKEN"))
                .body(Mono.just(requestBody), GPTRequestViewModel.class)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, response -> {
                    return Mono.error(new RuntimeException("Server error"));
                })
                .bodyToMono(ResponseGPT.class);
        ResponseMessage message = request.block().getChoices().get(0).getMessage();
        return message;
    }
}
