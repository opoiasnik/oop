package com.company.space;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Vesmir {
    private boolean state;
    private long size;
    private String nameAuthor;

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
        new Thread(() -> {
            while (state) {
                try {
                    size += 999_000;
                    System.out.println("Current size: " + size + " km³");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }


    public void endVesmir() {
        state = false;

        System.out.println("Vesmir ended");
        GetSize();
    }


    public long GetSize() {
        System.out.println("Current size: " + size + " km³");
        return size;
    }


    public boolean GetState() {
        return state;
    }

    public void decreaseSize (long num) {
        size -= num;
    }
}
