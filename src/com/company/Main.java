package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("BMW").print();
        createObject("Honda").print();
        createObject("Mers").print();
    }

    private static Printable createObject(String name) {
        Printable temp = null;
        switch(name) {
            case "BMW":
            temp = new BMW("BMW", 3);
            break;

            case "Honda":
                temp = new HONDA("Honda", 8);
                break;

            case "Mers":
                temp = new MERC("Mers", 200);
                break;
            default:
                return temp;
        }
        return temp;
    }
}
