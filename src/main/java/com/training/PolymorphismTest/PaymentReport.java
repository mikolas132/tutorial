package com.training.PolymorphismTest;

public class PaymentReport {
    public void paymentReportManager(Manager manager){
        System.out.println("Manager Payment Report");
        manager.payCalculation();
        System.out.println("Name: "+manager.getName());
        System.out.println("Salary: "+ manager.getSalary());
    }
    public void paymentReportManager(Salesman salesman){
        System.out.println("Salesman Payment Report");
        salesman.payCalculation();
        System.out.println("Name: "+salesman.getName());
        System.out.println("Salary: "+ salesman.getSalary());
    }
    public void paymentReport(Functionary functionary){
        System.out.println("Generate Payment Report");
        functionary.payCalculation();
        System.out.println("Name: "+functionary.getName());
        System.out.println("Salary: "+ functionary.getSalary());
        if( functionary instanceof Manager){
            Manager m = (Manager) functionary;
            System.out.println("Participation on profit: "+m.getParticipacionProfit());
        }
        if( functionary instanceof Salesman){
            Salesman s = (Salesman) functionary;
            System.out.println("Total Sales: "+ s.getTotalsales());
        }
    }
}
