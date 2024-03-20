package com.javisIA.javisIA.comunicacaoIA;

import com.javisIA.javisIA.controller.JarvisComunicacaoController;
import com.javisIA.javisIA.service.response.ResponseMessage;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class JarvisBot extends TelegramLongPollingBot {

    JarvisComunicacaoController jarvisComunicacaoController = new JarvisComunicacaoController();
    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());

        if (message.toLowerCase().contains("jarvis")) {
            try {
                ResponseMessage responseMessage = jarvisComunicacaoController.enviaMensagem
                        (message);
                sendMessage.setText(responseMessage.getContent());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        try {
            execute(sendMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getBotUsername() {
        return System.getenv("TELEGRAM_NOME_BOT");
    }
    @Override
    public String getBotToken() {
        return System.getenv("TELEGRAM_TOKEN");
    }
}
