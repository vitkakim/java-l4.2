package ru.netology.domain;

public class Ticket {
    private int id;
    private int price;
    private String fromAirport;
    private String toAirport;
    private int travelTime;

    public Ticket() {
    }

    public Ticket(int id, int price, String fromAirport, String toAirport, int travelTime) {
        this.id = id;
        this.price = price;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.travelTime = travelTime;
    }

    public boolean matches(String from, String to) {
        if (fromAirport.contains(from) && toAirport.contains(to)) {
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }
}
