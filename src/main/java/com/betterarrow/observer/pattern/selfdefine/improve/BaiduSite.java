package com.betterarrow.observer.pattern.selfdefine.improve;

public class BaiduSite implements Observer {

	private float temperature;
	private float pressure;
	private float humidity;

	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("===�ٶ���վ====");
		System.out.println("***�ٶ���վ ���� : " + temperature + "***");
		System.out.println("***�ٶ���վ ��ѹ: " + pressure + "***");
		System.out.println("***�ٶ���վ ʪ��: " + humidity + "***");
	}

}
