package com.company.vesmirnetelesa;

public class Slnecna_sustava {
    private Hviezda slnko;
    private Planeta Zem;
    private Planeta Mars;
    private Planeta Jupiter;
    private Planeta Saturn;
    private int object_counter;
    private Vesmirne_teleso[] obezne_telesa = new Vesmirne_teleso[15];

    public Slnecna_sustava() {
        this.slnko = new Hviezda();
        setObject_counter(0);
        obezne_telesa[object_counter] = new Planeta("Mars", 432432, 432432);
        object_counter++;
        obezne_telesa[object_counter] = new Planeta("Venus", 55555, 32342);
        object_counter++;
        obezne_telesa[object_counter] = new Hviezda("polarka", 500, 100, 100);
        object_counter++;
        obezne_telesa[object_counter] = new Kometa("Kometa");
        object_counter++;



    }

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }

    public void addTeleso(Vesmirne_teleso nove_teleso){
        obezne_telesa[object_counter] = nove_teleso;
        object_counter++;
    }
    public void printSlnecna_sustava() {

        for (int i = 0; i < object_counter; i++) {
            if (obezne_telesa[i] != null) {
                System.out.println("Object " + (i + 1) + ": " + obezne_telesa[i].getName());
            }
        }
    }

}
