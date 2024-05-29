package practice.Impl;

import java.time.LocalDate;

import practice.Product;

public class HotDrink extends Product {
    private float volume;
    private Integer temperature;


    public HotDrink(String name, double price, LocalDate releaseDate, Integer temperature, float volume){
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
    }


    public float getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }


}
