package ru.javapractic.bot.Console;

import ru.javapractic.bot.AnswerWriter;
import ru.javapractic.bot.Logic.BotResponse;

public class ConsoleAnswerWriter  implements AnswerWriter {
    @Override
    public void writeAnswer(BotResponse response) {
        System.out.println("Ответ бота: " + response.getResponse());
    }

}
