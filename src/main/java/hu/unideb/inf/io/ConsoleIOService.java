package hu.unideb.inf.io;

import java.util.Scanner;

public class ConsoleIOService implements IOService {

    @Override
    public String getPlayerName() {
        System.out.print("Please define your nick: ");
        return new Scanner(System.in).nextLine();
    }
}
