package com.company;

public class MERC extends Car{

    private int speed;

    public MERC(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Максимальная скорость: " + speed);
    }
}
