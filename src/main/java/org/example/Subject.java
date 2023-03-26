package org.example;

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String gameTitle, String gameDescription, String technicalData);
}
