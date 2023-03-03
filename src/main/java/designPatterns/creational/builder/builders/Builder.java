package designPatterns.creational.builder.builders;

import designPatterns.creational.builder.cars.CarType;
import designPatterns.creational.builder.components.Engine;
import designPatterns.creational.builder.components.GPSNavigator;
import designPatterns.creational.builder.components.Transmission;
import designPatterns.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
