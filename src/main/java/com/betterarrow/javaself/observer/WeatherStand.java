package com.betterarrow.javaself.observer;

import java.util.Observable;

public class WeatherStand extends Observable {

    private double temperature;

    private double humidity;

    private double pressure;

    public void setData(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "WeatherStand{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
