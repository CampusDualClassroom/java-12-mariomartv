package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;

    String gear = "";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand=brand;
        this.model=model;
        this.fuel=fuel;
    }

    public Car() {
        // Constructor sin parámetros
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0 && this.tachometer==1000) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public boolean testTachometer(){
        return this.tachometer == 0;
    }

    public void accelerate() {
        if(this.tachometer==0){
            System.out.println("El coche tiene que estar encendido");
        }else if(this.speedometer>=this.MAX_SPEED){
            System.out.println("La velocidad no puede superar los 120");

        }else{
            this.speedometer+=20;
            System.out.println("Acelerando");
        }
    }

    public void brake() {
        if(this.tachometer==0){
            System.out.println("El coche tiene que estar encendido");
        }else if(this.speedometer==0){
            System.out.println("El coche ya está parado");
        }
        else{
            this.speedometer-=20;
            System.out.println("Frenando");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if(angle >45){
            System.out.println("No se puede girar más de 45 grados");
            this.wheelsAngle=45;
        }else if(angle<-45){
            System.out.println("No se puede girar menos de -45 grados");
            this.wheelsAngle=-45;
        }
        else {
            this.wheelsAngle = angle;
            System.out.println("Has girado las ruedas en un angulo de: " + angle);
        }
    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer >0;
    }

    public boolean isTachometerEqualToZero(){
        return this.tachometer==0;
    }






    public void setReverse(boolean reverse) {
        if(this.speedometer>0){
            System.out.println("Tienes que estar parado");
        }else{
            this.reverse=reverse;
            if(this.gear.equals("")){
                this.gear="R";
            }else{
                this.gear="";
            }
        }

    }

    public void showDetails() {
        // ...
    }

    public static void main(String[] args) {
        // ...
    }
}
