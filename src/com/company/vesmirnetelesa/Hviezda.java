package com.company.vesmirnetelesa;

public class Hviezda extends Vesmirne_teleso {
    private String name;
    private double weight;
    private int lightPercentage;
    private double temperature;
    private int supernovaBorder;

    public Hviezda() {
        this.name = "Hviezda";
        this.weight = 100;
        this.lightPercentage = 100;
        this.temperature = 100;
        this.supernovaBorder = 8;
    }

    public Hviezda(String name, double weight, int lightPercentage, double temperature) {
        this.name = name;
        this.weight = weight;
        this.lightPercentage = lightPercentage;
        this.temperature = temperature;
        this.supernovaBorder = 8;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setLightPercentage(int lightPercentage) {
        this.lightPercentage = lightPercentage;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWeight() {
        return weight;
    }

    public int getLightPercentage() {
        return lightPercentage;
    }

    public double getTemperature() {
        return temperature;
    }

    public void increaseWeight(double additionalWeight) {
        double newWeight = this.weight + additionalWeight;
        if (isReadyForSupernova(newWeight)) {
            System.out.println("Hviezda will BOOM, increasing weight to " + newWeight + " is not available due to limit of 'Supernova'");
        } else {
            this.weight = newWeight;
        }
    }

    public void increaseLightPercentage(int lightPercentage) {
        this.lightPercentage += lightPercentage;
    }

    public void increaseTemperature(double temperature) {
        this.temperature += temperature;
    }

    public void decreaseWeight(double weight) {
        this.weight -= weight;
    }

    public void decreaseLightPercentage(int lightPercentage) {
        this.lightPercentage -= lightPercentage;
    }

    public void decreaseTemperature(double temperature) {
        this.temperature -= temperature;
    }

    public int getSupernovaBorder() {
        return supernovaBorder;
    }

    private void setSupernovaBorder(int supernovaBorder) {
        this.supernovaBorder = supernovaBorder;
    }

    public boolean isReadyForSupernova(double weight) {
        return weight > supernovaBorder;
    }
}
