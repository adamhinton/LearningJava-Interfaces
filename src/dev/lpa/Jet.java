package dev.lpa;

public class Jet implements FlightEnabled, Trackable{
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
