package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        // These don't work, compiler only cares about declared type
//        flier.move();
//        tracked.move();
//        flier.fly();
//        flier.takeOff();
//        tracked.track();
//        flier.land();

//        inFlight(flier);

//        inFlight( new Jet());

        Trackable truck = new Truck();
        truck.track();
    }

    private static void inFlight (FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

}

// We don't have to declare an interface or its methods `abstract`
// `abstract` is already implicitly implied
// In fact, any mtd without a body is really implicitly both public and abstract
interface FlightEnabled{
    void takeOff();
    void land();
    void fly();

}

interface Trackable{

    void track();
}

abstract class Animal{

    public abstract void move();

};

class Bird extends Animal implements FlightEnabled, Trackable{

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " landing");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinated recorded");
    }
}