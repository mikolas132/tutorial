package com.training.PolymorphismTest;

public class Manager extends Functionary {
    private double  participacionProfit;

    public Manager(String name, double salary,double participacionProfit) {
        super(name, salary);
        this.participacionProfit = participacionProfit;
    }

    public void payCalculation() {
        this.salary = this.salary+participacionProfit;
    }


    public double getParticipacionProfit() {
        return participacionProfit;
    }

    public void setParticipacionProfit(double participacionProfit) {
        this.participacionProfit = participacionProfit;
    }
}
