package com.company;

import com.company.space.Hmlovina;
import com.company.space.Vesmir;

public class Main {
    public static void main(String[] args) {

        Vesmir vesmir = new Vesmir();

        vesmir.SetName();

        vesmir.startVesmir();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        vesmir.endVesmir();
        Hmlovina hmlovina = new Hmlovina();
    }
}
