package com.betterarrow.observer.pattern.javaself;

import java.util.Observable;
import java.util.Observer;

public class Tencent implements Observer {

    private double temperature;

    private double humidity;

    private double pressure;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherStand) {
            WeatherStand weatherStand = (WeatherStand) o;
            this.temperature = weatherStand.getTemperature();
            this.humidity = weatherStand.getHumidity();
            this.pressure = weatherStand.getPressure();
        }
    }

    @Override
    public String toString() {
        return "Tencent{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
