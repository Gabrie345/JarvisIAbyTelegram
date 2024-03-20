package com.javisIA.javisIA.service.viewModel;

public class MessageViewModel {
    private String role;
    private String content;

    public MessageViewModel(String role, String content) {
        this.role = role;
        this.content = content;
    }

    // Getters
    public String getRole() {
        return role;
    }

    public String getContent() {
        return content;
    }
}
