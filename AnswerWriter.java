package ru.javapractic.bot;

import ru.javapractic.bot.Logic.BotResponse;

public interface AnswerWriter {
    void writeAnswer(BotResponse response);
}
