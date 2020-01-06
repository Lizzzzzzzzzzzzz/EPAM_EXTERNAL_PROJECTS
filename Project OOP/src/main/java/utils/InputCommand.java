package utils;

import java.util.Scanner;

public class InputCommand {
    int command;

    public int getCommand() {
        while (command < -1 && command > 4) {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();
            System.out.println("Input correct command");
        }

        return command;

    }
}
