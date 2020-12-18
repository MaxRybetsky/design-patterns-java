package patterns.creational.builder.builders;

import patterns.creational.builder.cars.*;
import patterns.creational.builder.components.*;

/**
 * Builder interface has all
 * possible steps of product
 * configuration
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
