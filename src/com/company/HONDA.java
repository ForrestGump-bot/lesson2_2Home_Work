package com.company;

public class HONDA extends Car{
    private int peopiles;

    public HONDA(String name, int peopiles) {
        super(name);
        this.peopiles = peopiles;
    }
    public HONDA(String name){
        super(name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("вместимость чел." + peopiles);
    }
}
