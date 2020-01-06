package Controller;

import View.PrintCommands;
import View.PrintCommands.*;
import utils.InputCommand;
import Model.AudioDisc;
import java.util.Random;
import View.PrintResults;
import Controller.Actions.*;

public class Controller {

    public void start() {

        InputCommand inputCommand = new InputCommand();
        AudioDisc audioDisc = new AudioDisc();
        Random random = new Random();
        PrintResults printResults = new PrintResults();
        CountDuration countDuration = new CountDuration();
        SortByStyle sortByStyle = new SortByStyle();
        FindByDuration findByDuration = new FindByDuration();
        while (inputCommand.getCommand() != 0)
        PrintCommands.printComands();
            switch (inputCommand.getCommand()) {
                case 1:
                    printResults.printRes(audioDisc.writeDownAudioRecords(random.nextInt()).toString());
                case 2:
                    printResults.printRes(countDuration.action().toString());
                case 3:
                    printResults.printRes(sortByStyle.action());
                case 4:
                    printResults.printRes((findByDuration.action(3.45, 4.00)));
                case 0:
                    break;
            }
        }
}

