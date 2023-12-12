package ru.javapractic.bot.Logic;

public class BotRequest {
    public String userInput;

    public BotRequest(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }
}
