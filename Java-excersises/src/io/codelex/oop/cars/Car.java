package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private int year;
    private List<Manufacturer> manufacturers;
    private EngineType engine;

    public Car(String name, String model, BigDecimal price, int year, List<Manufacturer> manufacturers, EngineType engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.manufacturers = manufacturers;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufacturers, car.manufacturers) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, year, manufacturers, engine);
    }

    @Override
    public String toString() {
        return  name +
                " " + model +
                ", price=$" + price +
                ", year=" + year +
                ", engine=" + engine;
    }
}
