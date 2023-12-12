package ru.javapractic.bot;

import ru.javapractic.bot.Logic.BotRequest;

public interface MessageHandler {
    void handle(BotRequest request, AnswerWriter writer);
}
