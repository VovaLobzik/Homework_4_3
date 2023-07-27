package com.example.homework_4_3;

public class Car {

    // поля сущности
    private String name; // поле названия машины
    private String carPower; // поле описания животного
    private int carResource; // поле ресурса машины
    private String carPeriod; // поле периода производства

    // конструктор
    public Car(String name, String carPower, int carResource, String carPeriod) {
        this.name = name;
        this.carPower = carPower;
        this.carResource = carResource;
        this.carPeriod = carPeriod;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarPower() {
        return carPower;
    }

    public void setCarPower(String carPower) {
        this.carPower = carPower;
    }

    public int getCarResource() {
        return carResource;
    }

    public void setCarResource(int carResource) {
        this.carResource = carResource;
    }

    public String getCarPeriod() {
        return carPeriod;
    }

    public void setCarPeriod(String carPeriod) {
        this.carPeriod = carPeriod;
    }
}
