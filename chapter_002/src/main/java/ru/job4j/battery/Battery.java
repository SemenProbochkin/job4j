package ru.job4j.battery;

public class Battery {
    private int load;
    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another){
        this.load=another.load + this.load;


    }
    public static void main(String[] args) {
        Battery battery1 = new Battery(10);
        battery1.exchange(battery1);
System.out.println(battery1.load);

    }
}
