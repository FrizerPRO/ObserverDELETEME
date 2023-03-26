package org.example;

import java.util.ArrayList;
import java.util.List;

class GameConsole implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    private String gameTitle;
    private String gameDescription;
    private String technicalData;

    public void setGameInfo(String gameTitle, String gameDescription, String technicalData) {
        this.gameTitle = gameTitle;
        this.gameDescription = gameDescription;
        this.technicalData = technicalData;
        notifyObservers(gameTitle, gameDescription, technicalData);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String gameTitle, String gameDescription, String technicalData) {
        for (Observer observer : observers) {
            observer.update(gameTitle, gameDescription, technicalData);
        }
    }
}
