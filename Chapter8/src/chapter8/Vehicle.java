
package chapter8;


public class Vehicle {
    private String name;
    private double kilometersPerLiter;
    private double gasTankCapacityInLiters;
    private double gasInTankInLiters;

    public Vehicle(String name, double kilometersPerLiter, double gasTankCapacityInLiters) {
        this.name = name;
        this.kilometersPerLiter = kilometersPerLiter;
        this.gasTankCapacityInLiters = gasTankCapacityInLiters;
        gasInTankInLiters = 0;
    }
    
    public boolean drive(double kilometers){
        if ( kilometers < 0 ){
            return false;
        }
        
        double litersOfGasUsed = kilometers / kilometersPerLiter;
        
        gasInTankInLiters -= litersOfGasUsed;
        
        if ( gasInTankInLiters < 0 ){
            gasInTankInLiters = 0;
            return false;
        }
        
        return true;
    }
    
    public boolean addGas(double liters){
        if ( liters < 0 ){
            return false;
        }
        gasInTankInLiters += liters;
        
        if ( gasInTankInLiters > gasTankCapacityInLiters ){
            gasInTankInLiters = gasTankCapacityInLiters;
            return false;
        }
        
        return true;
    }

    public String getName() {
        return name;
    }

    public double getKilometersPerLiter() {
        return kilometersPerLiter;
    }

    public double getGasTankCapacityInLiters() {
        return gasTankCapacityInLiters;
    }

    public double getGasInTankInLiters() {
        return gasInTankInLiters;
    }
    
    
}
