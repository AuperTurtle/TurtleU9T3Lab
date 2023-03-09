    public class Taxi extends Car {

        private double fareCollected;

        public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
            super(licensePlate, tollFee, passengers, isElectric);
            this.fareCollected = fareCollected;
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Fare Collected: " + fareCollected);
        }

        public void pickupRiders(int numRiders, double farePerRider) {
            setPassengers(getPassengers() + numRiders);
            fareCollected += farePerRider * numRiders;
            if (!isDiscountApplied() && getPassengers() >= 4) {
                discountTollFee();
                updateDiscount();
            }
        }

        public double getFareCollected() {
            return fareCollected;
        }

        public boolean chargeAndDropOffRiders(double farePerRider) {
            fareCollected += farePerRider * (getPassengers() - 1);
            return dropOffPassengers(getPassengers() - 1);
        }

        @Override
        public boolean isPersonalUseVehicle() {
            System.out.println("The license plate of this vehicle is " + getLicensePlate() + " and it is not for personal use primarily.");
            return false;
        }
    }