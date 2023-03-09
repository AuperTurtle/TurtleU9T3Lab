public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public void printInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Toll Fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }
    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int newPassengers) {
        passengers = newPassengers;
    }

    public void discountTollFee() {
        tollFee *= 0.5;
    }

    public boolean isPersonalUseVehicle() {
        System.out.println("The license plate of this vehicle is " + licensePlate + " and it is for personal use primarily.");
        return true;
    }
}