package ru.javapractic.bot.Console;

import ru.javapractic.bot.InputReader;
import ru.javapractic.bot.Logic.BotRequest;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    public Scanner scanner = new Scanner(System.in);

    public BotRequest getUserInput() {
        System.out.print("Введите сообщение: ");
        String userInput = scanner.nextLine();
        return new BotRequest(userInput);
    }
}