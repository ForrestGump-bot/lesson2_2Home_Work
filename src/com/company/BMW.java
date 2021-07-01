package com.company;

public class BMW extends Car{

    private int volume;

    public BMW(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Объем: " + volume);
    }
}
