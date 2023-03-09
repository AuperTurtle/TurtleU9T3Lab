public class VehicleRunner {
    public static void main (String[] args) {

        Vehicle vehicle = new Vehicle("temp1", 420.69, 0);
        Car car = new Car("temp2", 420.69, 0, false);
        Truck truck = new Truck("temp3", 420.69, 0, Integer.MAX_VALUE, true);
        Taxi taxi = new Taxi("temp4", 420.69, 0, true, Integer.MIN_VALUE);

        boolean temp1 = vehicle.isPersonalUseVehicle();
        boolean temp2 = car.isPersonalUseVehicle();
        boolean temp3 = truck.isPersonalUseVehicle();
        boolean temp4 = taxi.isPersonalUseVehicle();

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);

    }
}
