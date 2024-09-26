package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
    Car coche = new Car("Citroen","C5","gasolina");
    coche.testTachometer();
    coche.start();
    coche.start();
    coche.stop();
    coche.start();
    coche.accelerate();
    coche.stop();
    coche.accelerate();
    coche.accelerate();
    coche.accelerate();
    coche.accelerate();
    coche.accelerate();
    coche.accelerate();
    coche.accelerate();
    coche.brake();
    coche.brake();
    coche.brake();
    coche.brake();
    coche.brake();
    coche.brake();
    coche.brake();
    coche.turnAngleOfWheels(20);
    coche.turnAngleOfWheels(60);
    coche.setReverse(true);
    coche.setReverse(false);
    coche.accelerate();
    coche.setReverse(true);


    }

}