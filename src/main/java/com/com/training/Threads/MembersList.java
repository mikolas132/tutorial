package com.com.training.Threads;


import java.util.LinkedList;
import java.util.Queue;

public class MembersList {
    private Queue<String> emails = new LinkedList<String>();
    private boolean open=true;

    public int getPendingEmails(){
        synchronized (emails){
            return this.emails.size();
        }
    }
    public boolean isOpen(){
        return open;
    }

    public String getMemberEmail(){
        String mail = null;
        try {
            synchronized (this.emails){
                while (this.emails.size()==0){
                    if (!open) return null;
                    System.out.println("List is empty, add a thread "+Thread.currentThread().getName()+" waiting");
                    this.emails.wait();
                }
                mail=this.emails.poll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            this.emails.add(email);
            System.out.println("Add email to list!");
            System.out.println("Notify all the thread still waiting");
            this.emails.notifyAll();
        }
    }
    public void closeList() {
        System.out.println("Notify all the thread, and close the list");
        open = false;
        synchronized (this.emails) {
            this.emails.notifyAll();
        }
    }
}
