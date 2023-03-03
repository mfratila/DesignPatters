package designPatterns.creational.builder;


import designPatterns.creational.builder.builders.CarBuilder;
import designPatterns.creational.builder.builders.CarManualBuilder;
import designPatterns.creational.builder.cars.Car;
import designPatterns.creational.builder.cars.CarManual;
import designPatterns.creational.builder.director.Director;

public class ExampleApp {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built: " + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        CarManual carManual = carManualBuilder.getResult();

        System.out.println("\nCar manual built:\n" + carManual.print());
    }


}
