package com.pluralsight;

public class VehicleInfo {
    public static void main(String[] args) {
        int vehicleIdNumber = 1234567;
        String vehicleMakeModel = "Chevy malibu";
        String vehicleColor = "Black";
        boolean hasTowingPackage = true;
        int odometerReading = 45230;
        double price = 25999.99;
        char qualityRating = 'A';
        String phoneNumber = "704-123-4567";
        String ssn = "123-45-6789";
        String zipCode = "28205";

        System.out.println("Vehicle ID: " + vehicleIdNumber);
        System.out.println("Make/Model: " + vehicleMakeModel);
        System.out.println("Color: " + vehicleColor);
        System.out.println("Towing Package: " + hasTowingPackage);
        System.out.println("Odometer: " + odometerReading);
        System.out.println("Price: $" + price);
        System.out.println("Quality Rating: " + qualityRating);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("SSN: " + ssn);
        System.out.println("Zip Code: " + zipCode);


    }
}
