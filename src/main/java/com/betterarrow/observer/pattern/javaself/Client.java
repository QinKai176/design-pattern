package com.betterarrow.observer.pattern.javaself;

public class Client {
    public static void main(String[] args) {
        WeatherStand weatherStand = new WeatherStand();
        Alibaba alibaba = new Alibaba();
        Tencent tencent = new Tencent();
        weatherStand.addObserver(alibaba);
        weatherStand.addObserver(tencent);
        weatherStand.setData(11d,12d,13d);
        System.out.println(weatherStand.countObservers());
        System.out.println(weatherStand.toString());
        System.out.println(alibaba);
        System.out.println(tencent);
    }
}
