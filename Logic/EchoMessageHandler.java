package ru.javapractic.bot.Logic;

import ru.javapractic.bot.AnswerWriter;
import ru.javapractic.bot.MessageHandler;

public class EchoMessageHandler implements MessageHandler {
    @Override
    public void handle(BotRequest request, AnswerWriter writer) {
        writer.writeAnswer(new BotResponse(request.getUserInput()));
    }
}
