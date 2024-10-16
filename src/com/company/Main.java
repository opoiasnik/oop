package com.company;

import com.company.space.Hmlovina;
import com.company.space.Vesmir;
import com.company.vesmirnetelesa.Planeta;
import com.company.vesmirnetelesa.Hviezda;
import com.company.vesmirnetelesa.Slnecna_sustava;

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
        vesmir.decreaseSize(500000);
        System.out.println("Updated size of universe after decrease:");
        vesmir.GetSize();

        Hmlovina orionNebula = new Hmlovina("Orion's Gravitational Pull");
        orionNebula.setX(100);
        orionNebula.setY(200);
        orionNebula.setZ(300);
        orionNebula.setSize(100000);
        orionNebula.setLivingTime(500000);
        System.out.println("Orion's Nebula - Coordinates: (" + orionNebula.getX() + ", " + orionNebula.getY() + ", " + orionNebula.getZ() + ")");
        System.out.println("Nebula size: " + orionNebula.getSize() + ", Living Time: " + orionNebula.getLivingTime());
        Planeta[] solarSystemPlanets = new Planeta[8];

        solarSystemPlanets[0] = new Planeta("Mercury", 330.2, 4879);
        solarSystemPlanets[1] = new Planeta("Venus", 4867.5, 12104);
        solarSystemPlanets[2] = new Planeta("Earth", 5973.6, 12742);
        solarSystemPlanets[3] = new Planeta("Mars", 641.7, 6779);
        solarSystemPlanets[4] = new Planeta("Jupiter", 1898600, 139820);
        solarSystemPlanets[5] = new Planeta("Saturn", 568460, 116460);
        solarSystemPlanets[6] = new Planeta("Uranus", 86832, 50724);
        solarSystemPlanets[7] = new Planeta("Neptune", 102430, 49244);

        Hviezda sun = new Hviezda("Sun", 1989, 100, 5778);
        System.out.println("Star: " + sun.getName() + ", Mass: " + sun.getWeight() +
                "  kg, Temperature: " + sun.getTemperature() + " K");
        sun.increaseWeight(5);
        sun.increaseTemperature(500);
        System.out.println("Updated Sun - Mass: " + sun.getWeight() + "  kg, Temperature: " + sun.getTemperature() + " K");

        Planeta earth = new Planeta("Earth", 5000.97, 12742);
        System.out.println("Planet: " + earth.getName() + ", Mass: " + earth.getWeight() + "  kg, Diameter: " + earth.getDiameter() + " km");

        earth.setPlanetaryWeight(earth.getWeight() - 2000);
        System.out.println("After initial weight change attempt, Earth: " + earth.getWeight() );

        System.out.println("\nAttempt to increase Earth's weight by 500 kg:");
        earth.setPlanetaryWeight(earth.getWeight() + 500);
        System.out.println("After weight increase, Earth: " + earth.getWeight() );

        System.out.println("\nAttempt to decrease Earth's weight by 1500 kg:");
        earth.setPlanetaryWeight(earth.getWeight() - 1500);
        System.out.println("After weight decrease, Earth: " + earth.getWeight() );

        System.out.println("Initial gravity on Earth: " + earth.getGravitacia());
        earth.increaseGravitacia(0.2);
        System.out.println("Gravity after increase: " + earth.getGravitacia());
        earth.decreaseGravitacia(0.1);
        System.out.println("Gravity after decrease: " + earth.getGravitacia());

        System.out.println("\nAttempting to increase Sun's weight near Supernova limit:");
        sun.increaseWeight(10);
        System.out.println("Final Sun - Mass: " + sun.getWeight() + "  kg");

        Slnecna_sustava slnecnaSustava = new Slnecna_sustava();
        for(int i = 0; i < solarSystemPlanets.length; i++){
            if(solarSystemPlanets[i].getName() != "Mars" && solarSystemPlanets[i].getName() != "Venus"){
                slnecnaSustava.addTeleso(solarSystemPlanets[i]);
            }
        }
        slnecnaSustava.printSlnecna_sustava();


        System.out.println("\nProgram completed.");
    }
}
