package org.example;

class Developer implements Observer {
    @Override
    public void update(String gameTitle, String gameDescription, String technicalData) {
        System.out.println("Technical data for game: " + gameTitle);
        System.out.println(technicalData);
    }
}
