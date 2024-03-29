public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Is Electric: " + electric);
        System.out.println("Is Discounted: " + discountApplied);
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        }   else   {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if (!discountApplied && electric) {
            discountTollFee();
            discountApplied = true;
        }
    }

    public void updateDiscount() {
        discountApplied = true;
    }

    @Override
    public double calculateTollPrice() {
        if (getPassengers() > 4) {
            return getTollFee() * 4;
        }
        return super.calculateTollPrice();
    }
}
