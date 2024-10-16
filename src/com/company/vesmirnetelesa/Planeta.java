package com.company.vesmirnetelesa;

public class Planeta extends Vesmirne_teleso {
    private String name;
    private double weight;
    private double diameter;
    private double gravitacia;
    private boolean weightSet = false;

    public Planeta(String name, double weight, double diameter) {
        setName(name);
        setWeight(weight, true);
        setDiameter(diameter);
        gravitacia = 9.81;
    }

    public Planeta(double gravitacia) {
        this.gravitacia = gravitacia;
    }

    public Planeta() {
        this.name = "Planeta";
        this.weight = 1.0;
        this.diameter = 1.0;
        this.gravitacia = 9.81;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setWeight(double weight, boolean initialSetup) {
        if (!initialSetup && !weightSet) {
            System.out.println("Initial weight not set. Use setPlanetaryWeight to set the initial weight.");
            return;
        }

        if (initialSetup) {
            weightSet = true;
        } else {
            System.out.println((this.weight > weight)
                    ? ((this.weight - weight <= 1000) ? "Ja chudnem" : "Ja chudnem veľmi")
                    : ((weight - this.weight <= 1000) ? "Dokelu, pribrala som" : "Sakra, moooc som pribrala")
            );

            if (this.weight - weight > 1000) {
                decreaseGravitacia(0.1);
            } else if (weight - this.weight > 1000) {
                increaseGravitacia(0.1);
            }
        }

        this.weight = weight;
    }


    private void setWeight(double weight) {
        setWeight(weight, false);
    }

    public double getWeight() {
        return weight;
    }

    private void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    private void setGravitacia(double gravitacia) {
        this.gravitacia = gravitacia;
    }

    public double getGravitacia() {
        return gravitacia;
    }

    public void increaseGravitacia(double add) {
        this.gravitacia += add;
    }

    public void decreaseGravitacia(double add) {
        this.gravitacia -= add;
    }

    public void setPlanetaryWeight(double weight) {
        if (weightSet) {
            setWeight(weight, false);
            weightSet = true;
        } else {
            System.out.println("Weight didnt set");
        }
    }
}
