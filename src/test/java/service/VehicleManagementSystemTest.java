package service;

import Model.EngineType;
import Model.Vehicle;
import Model.VehicleType;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class VehicleManagementSystemTest {

//
//    private Vehicle vehicle1;
//    private Vehicle vehicle2;
//    private Vehicle vehicle3;
//    private Vehicle vehicle4;
    private VehicleManagementSystem vehicleManagementSystem;
    private List<Vehicle> vehicles;
    private Vehicle vehicleOne;
    private Vehicle vehicleTwo;
    private Vehicle vehicleThree;
    private Vehicle vehicleFour;
    @BeforeEach
    void setUp() {

        vehicles = new ArrayList<>();

        int yearOfAdmissionOne = 2022;
        int yearOfAdmissionTwo = 2018;
        int yearOfAdmissionThree = 2020;
        int yearOfAdmissionFour = 2021;

        BigDecimal num1 = new BigDecimal("60000.00");
        Vehicle truck = VehicleService.createVehicle(1,20000,200,20,2000,VehicleType.TRUCK, EngineType.GASOLINE);

        vehicleOne = new Vehicle(1, 60000.00, 20, 15, yearOfAdmissionOne, VehicleType.MOTORCYCLE, EngineType.GASOLINE);
        vehicleTwo = new Vehicle(2, 25000, 25, 20, yearOfAdmissionTwo, VehicleType.CAR, EngineType.ELECTRIC);
        vehicleThree = new Vehicle(3, 30000, 30, 25, yearOfAdmissionThree, VehicleType.TRUCK, EngineType.GASOLINE);
        vehicleFour = new Vehicle(4, 18000, 18, 14, yearOfAdmissionFour, VehicleType.MOTORCYCLE, EngineType.PETROL);

        vehicles.add(vehicleOne);
        vehicles.add(vehicleTwo);
        vehicles.add(vehicleThree);
        vehicles.add(vehicleFour);
        vehicleManagementSystem = new VehicleManagementSystem();
    }
    @org.junit.jupiter.api.Test
    void getAllVehiclesAdmissionBeforeCertainYear() {
        //        - Get all Vehicles which have a year of admission before 2019

        List<Vehicle> actualVehicle = vehicleManagementSystem.getAllVehiclesAdmissionBeforeCertainYear( vehicles,  2019);
        System.out.println("actualVehicle = " + actualVehicle);
        List<Vehicle> expected = List.of( vehicleTwo);
        assertEquals( expected , actualVehicle);

    }

    @org.junit.jupiter.api.Test
    void getVehiclesEngineGasolineandCostLessThanCertainAmount() {
        //                - Get all vehicles of engine type gasoline and which cost less than 50.000 Euro
        List<Vehicle> actualVehicle = vehicleManagementSystem.getVehiclesEngineGasolineandCostLessThanCertainAmount(vehicles, 50000);
        List<Vehicle> expected = List.of(   vehicleThree);
        assertEquals(expected , actualVehicle);
    }

    @org.junit.jupiter.api.Test
    void mostExpensiveVehicle() {
        //                - Get the most expensive vehicle in your system
        Optional<Vehicle> actualVehicle = vehicleManagementSystem.mostExpensiveVehicle(vehicles);

        assertEquals( Optional.of(vehicleOne),actualVehicle );
    }
}