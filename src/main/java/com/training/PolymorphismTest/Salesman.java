package com.training.PolymorphismTest;

public class Salesman extends Functionary{
    private double totalsales;

    public Salesman(String name, double salary,double totalsales) {
        super(name, salary);
        this.totalsales = totalsales;
    }

    public double getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(double totalsales) {
            this.totalsales = totalsales;
    }

    public void payCalculation() {
        this.salary = this.salary + (totalsales*0.05);
    }
}
