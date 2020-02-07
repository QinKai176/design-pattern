package com.betterarrow.observer.pattern.javaself;

import java.util.Observable;
import java.util.Observer;

public class Alibaba implements Observer {

    private double temperature;

    private double humidity;

    private double pressure;

    @Override
    public void update(Observable o, Object arg) {
        Data data = (Data) arg;
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        this.pressure = data.getPressure();
    }

    @Override
    public String toString() {
        return "Alibaba{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
