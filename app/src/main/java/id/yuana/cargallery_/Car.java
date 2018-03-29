package id.yuana.cargallery_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on : March 29, 2018
 * Author     : yuana
 * GitHub     : https://github.com/andhikayuana
 */
public class Car {

    private int id;
    private int year;
    private String make;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static List<Car> generateData() {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Car car = new Car();
            car.setId(i);
            car.setMake("Toyota " + i);
            car.setModel("Avanza " + i);
            car.setYear(2000 + i);

            cars.add(car);
        }

        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
