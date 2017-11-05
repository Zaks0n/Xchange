package com.zaksontech.www.xchange.data.model;

import java.util.UUID;



public class Card {
    private String from;
    private String to;
    private double currentRate;
    private UUID uuid;

    public Card(){
        uuid = UUID.randomUUID();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(double currentRate) {
        this.currentRate = currentRate;
    }

    public void setAll(String from, String to, double currentRate, String uuid){
        this.from = from;
        this.to = to;
        this.currentRate = currentRate;
        this.uuid = UUID.fromString(uuid);
    }

    public UUID getUuid() {
        return uuid;
    }
}
