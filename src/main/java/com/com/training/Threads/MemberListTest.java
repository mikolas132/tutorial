package com.com.training.Threads;

import javax.swing.*;

public class MemberListTest {
    public static void main(String[] args) {
        MembersList membersList = new MembersList();
        Thread t1 = new Thread(new Deliveryman(membersList), "DeliveryMan 1");
        Thread t2 = new Thread(new Deliveryman(membersList), "DeliveryMan 2");
        t1.start();
        t2.start();
        while (true) {
            String mail = JOptionPane.showInputDialog("Write member email");
            if ((mail == null )) {
                membersList.closeList();
                break;
            }
            membersList.addMemberEmail(mail);
        }
    }
}
