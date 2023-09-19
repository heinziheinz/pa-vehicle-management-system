package service;

import Model.EngineType;
import Model.Vehicle;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class VehicleManagementSystem {
    public List<Vehicle> getAllVehiclesAdmissionBeforeCertainYear(List<Vehicle> vehicles, int year){
        //        - Get all Vehicles which have a year of admission before 2019

        return vehicles.stream().filter(vehicle -> vehicle.yearOfAdmission() < year).toList();
    }

    public List<Vehicle> getVehiclesEngineGasolineandCostLessThanCertainAmount(List<Vehicle> vehicles, double costOfCar){
        //                - Get all vehicles of engine type gasoline and which cost less than 50.000 Euro

        return vehicles.stream()
                .filter(vehicle -> vehicle.price() < costOfCar)
                .filter(vehicle -> vehicle.engineType().equals(EngineType.GASOLINE)).toList();

    }

    public Optional<Vehicle> mostExpensiveVehicle(List<Vehicle> vehicles){
        //                - Get the most expensive vehicle in your system
        return vehicles.stream().max(Comparator.comparing(Vehicle::price));
    }
}


//        - Get all Vehicles which have a year of admission before 2019
//                - Get all vehicles of engine type gasoline and which cost less than 50.000 Euro
//                - Get the most expensive vehicle in your system