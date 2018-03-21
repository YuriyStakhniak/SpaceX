/**
 * Created by yurezzz13 on 21.03.18.
 */
public abstract class Rocket implements RocketFunctionality {

   private long destination;
   private int rocketPower;
   private int rocketWeight;


    public Rocket(long destination, int rocketPower, int rocketWeight) {
        this.destination = destination;
        this.rocketPower = rocketPower;
        this.rocketWeight = rocketWeight;
    }

    class Engine{

        int minTankCapacity = 1000000;
        int maxTankCapacity = 5000000;

        int fuel;

        int getFuel(){

            fuel = minTankCapacity + (int) (Math.random() * maxTankCapacity);

            return fuel;
        }

    }

    static class Cabin{

        void start(){

        }

    }

}
