package org.example;

class Player implements Observer {
    @Override
    public void update(String gameTitle, String gameDescription, String technicalData) {
        System.out.println("Game title: " + gameTitle);
        System.out.println("Achievements unlocked: ..."); // display player achievements
    }
}
