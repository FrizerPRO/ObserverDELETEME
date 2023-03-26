package org.example;

class Journalist implements Observer {
    @Override
    public void update(String gameTitle, String gameDescription, String technicalData) {
        System.out.println("New game released: " + gameTitle);
        System.out.println("Brief information about the game: " + gameDescription);
    }
}
