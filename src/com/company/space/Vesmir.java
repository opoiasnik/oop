package com.company.space;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Vesmir {
    private boolean state;
    private long size;
    private String nameAuthor;
    private Timer timer;

    // Конструктор
    public Vesmir() {
        state = false;
        size = 0;
    }


    public void SetName() {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        nameAuthor = sc.nextLine();
    }


    public String GetName() {
        System.out.println(nameAuthor);
        return nameAuthor;
    }


    public void startVesmir() {
        state = true;
        System.out.println("Vesmir started");
        timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                if(state){
                    size += 999_000;
                    System.out.println("Current size: " + size + " km³");
                }
            }
        };
        timer.schedule(task, 0, 1000);

    }


    public void endVesmir() {
        state = false;
        if (timer != null) {
            timer.cancel();
        }
        System.out.println("Vesmir ended");
        GetSize();
    }


    public void GetSize() {
        System.out.println("Current size: " + size + " km³");
    }


    public boolean GetState() {
        return state;
    }

    public void decreaseSize (long num) {
        size -= num;
    }
}
