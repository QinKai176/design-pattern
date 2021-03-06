package com.betterarrow.observer.pattern.javaself;

import java.util.Observable;

public class WeatherStand extends Observable {

    private double temperature;

    private double humidity;

    private double pressure;

    public void setData(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
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

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
