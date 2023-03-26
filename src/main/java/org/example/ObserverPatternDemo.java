package org.example;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        GameConsole gameConsole = new GameConsole();
        Observer player = new Player();
        Observer journalist = new Journalist();
        Observer developer = new Developer();

        gameConsole.addObserver(player);
        gameConsole.addObserver(journalist);
        gameConsole.addObserver(developer);

        gameConsole.setGameInfo("Game Title", "Game Description", "Technical Data");
    }
}
