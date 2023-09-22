package service;

import Model.EngineType;
import Model.Vehicle;
import Model.VehicleType;


public class VehicleService {
    public static Vehicle createVehicle(int id, double price, double drivingDistanceKm, double drivingDistanceMiles, int yearOfAdmission, VehicleType vehicleType, EngineType engineType) {
        validateEngineType(engineType, vehicleType);
//        (int id, String address, int phoneNumber, List<LibraryItems> libraryItems)
        return new Vehicle(id, price, drivingDistanceKm, drivingDistanceMiles, yearOfAdmission, vehicleType, engineType);
    }

    private static void validateEngineType(EngineType engineType, VehicleType vehicleType) {
        if (vehicleType == VehicleType.TRUCK && engineType ==  EngineType.ELECTRIC) {
            throw new IllegalArgumentException("Amount is not within the valid range [0, 3].");
        }
    }
}

//        Cars and motorcycles can have an engine of type gasoline, electric or petrol, Trucks can only be of type gasoline or petrol.