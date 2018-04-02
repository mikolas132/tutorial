package com.com.training.Threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class NamesList{
    private List<String> names = new LinkedList<String>();

    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void removeFrist(){
        if(names.size()>0){
            System.out.println(names.remove(0));
        }
    }
}
public class ThreadSafeTest {
    public static void main(String[] args) {
        final NamesList name = new NamesList();
        name.add("Willian Suane");
        class NamesRemover extends Thread{
            public void run(){
                name.removeFrist();
            }
        }
        new NamesRemover().start();
        new NamesRemover().start();
    }
}
