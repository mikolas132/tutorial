package com.training.PolymorphismTest;

public class PolymorphismTest {
    public static void main(String[] args) {
        Manager m = new Manager("Micael",5000,2000);
        Salesman s = new Salesman("Zé",2000,20000);
        PaymentReport p = new PaymentReport();

        p.paymentReport(m);
        System.out.println("-----------------------------");
        p.paymentReport(s);


/*        p.paymentReport(m);
        System.out.println("-------------------------------------");
        p.paymentReport(s);*/

/*        Functionary f = m;
        System.out.println("#######################");
        System.out.println(f.getSalary());*/

    }
}
