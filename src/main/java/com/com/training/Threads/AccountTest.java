package com.com.training.Threads;

public class AccountTest implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();

        Thread willian = new Thread(accountTest,"Willian");
        Thread anna = new Thread(accountTest,"Anna");
        willian.start();
        anna.start();
    }

    private synchronized void raise(int value){
        if(account.getBalance()>=value){
            System.out.println(Thread.currentThread().getName()+" its going up");
            account.raise(value);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" finish raise " + account.getBalance());
        }else{
            System.out.println("Without money to "+Thread.currentThread().getName()+" finish the raise, balance:" + account.getBalance());
        }
    }
    public void run(){
        for (int i = 0; i<5;i++){
            raise(10);
            if(account.getBalance()<0){
                System.out.println("NICE JOB U ARE STUPID "+Thread.currentThread().getName());
            }
        }
    }
}
