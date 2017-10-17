import java.util.Scanner;

public class CarApp {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String favcar;
        Vehicle corvette = new Vehicle();
        corvette.setName("Corrvette");
        corvette.setColor("is green");
        corvette.setStarting("is starting");
        corvette.setAcceleration("is accelerating");
        corvette.setSpeed("is going 100 mph");
        corvette.setStop("is stopped");


        System.out.println(corvette.vecdetails());

        Vehicle lambo = new Vehicle();
        lambo.setName("Lambo");
        lambo.setColor("is Red");
        lambo.setStarting("is starting");
        lambo.setAcceleration("is accelerating");
        lambo.setSpeed("is going 100 mph");
        lambo.setStop("is stopped");

        System.out.println(lambo.vecdetails());


        Car bike = new Car();
        bike.setName("Honda x250");
        bike.setColor("is Blue");
        bike.setStarting("is Starting");
        bike.setAcceleration("is accelerating");
        bike.setSpeed("is going 25mph");
        bike.setStop("is stopped");

        System.out.println(bike.vecdetails());
    }
}
