package com.javisIA.javisIA;

import com.javisIA.javisIA.comunicacaoIA.JarvisBot;
import com.javisIA.javisIA.service.imp.ConexaoGPTServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class JavisIaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavisIaApplication.class, args);
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new JarvisBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	@Bean
	public ConexaoGPTServiceImp conexaoGPTServiceImp() {
		return new ConexaoGPTServiceImp();
	}

}
