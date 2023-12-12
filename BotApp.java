package ru.javapractic.bot;
import ru.javapractic.bot.AnswerWriter;
import ru.javapractic.bot.Console.ConsoleInputReader;
import ru.javapractic.bot.Console.ConsoleAnswerWriter;
import ru.javapractic.bot.InputReader;
import ru.javapractic.bot.Logic.BotRequest;
import ru.javapractic.bot.Logic.EchoMessageHandler;
import ru.javapractic.bot.MessageHandler;

public class BotApp {
    public static void main(String[] args) {
        InputReader inputReader = new ConsoleInputReader();
        AnswerWriter answerWriter = new ConsoleAnswerWriter();
        MessageHandler messageHandler = new EchoMessageHandler();

        while (true) {
            BotRequest request = inputReader.getUserInput();
            messageHandler.handle(request, answerWriter);
        }
    }

}
