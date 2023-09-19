package Model;

import java.time.LocalDate;

public record Vehicle (int id, double price, double drivingDistanceKm, double drivingDistanceMiles, int yearOfAdmission, VehicleType vehicleType, EngineType engineType ){
}

//        I want a system to manage my fleet of vehicles, which include cars, trucks, and motorcycles.
//                All vehicles have a price, driven distance in km and miles, a year of admission and an ID.
//        Cars and motorcycles can have an engine of type gasoline, electric or petrol, Trucks can only be of type gasoline or petrol.
