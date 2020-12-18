package patterns.creational.builder;

import patterns.creational.builder.builders.CarBuilder;
import patterns.creational.builder.builders.CarManualBuilder;
import patterns.creational.builder.cars.Car;
import patterns.creational.builder.cars.Manual;
import patterns.creational.builder.director.Director;

/**
 * Demo class. It all comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        // Director gets concrete builder type from client.
        // It knows what type of builder using to get result product
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        // Builder returns ready product. Director doesn't know about
        // concrete products in common cases.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        CarManualBuilder manualBuilder = new CarManualBuilder();
        // Director knows more than one receipt of building
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual);
    }
}
