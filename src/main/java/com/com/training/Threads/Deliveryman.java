package com.com.training.Threads;

public class Deliveryman implements Runnable{
    private MembersList membersList;

    public Deliveryman(MembersList membersList) {
        this.membersList = membersList;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Starting delivery work");
        int nPending = membersList.getPendingEmails();
        boolean open = membersList.isOpen();
        while (open || nPending > 0) {
            try {
                String email = membersList.getMemberEmail();
                if (email != null) {
                    System.out.println(threadName + " Sending to " + email);
                    Thread.sleep(2000);
                    System.out.println("Send to " + email + " successfully concluded");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            open = membersList.isOpen();
            nPending = membersList.getPendingEmails();
        }
        System.out.println("Atividades finalizadas");
    }
}