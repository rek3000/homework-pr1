package w7.Act4;

public class Car {
    double efficiency;
    double fuel;

    public Car(double efficiency) {
        this.efficiency = efficiency;
        this.fuel = 0;
    }

    public void drive(double distance) {
        this.fuel -= distance / this.efficiency;
    }

    public double getGasInTank() {
        return this.fuel;
    }

    public void addGas(double liter) {
        this.fuel += liter;
    }


}
