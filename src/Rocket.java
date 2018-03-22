/**
 * Created by yurezzz13 on 22.03.18.
 */
public abstract class Rocket {

    public static final int ORBITAL_SPEED = 800000000;

    static class Cabin{

        Engine engine = new Engine();

        public void start(int rocketPower, int rocketWeight, int destination){

            int fuelConsumption = rocketPower*rocketWeight;



            if(engine.getFuel()/fuelConsumption >= destination){
                System.out.println("You've got " + engine.getFuel() + " gallons of fuel");
                System.out.println("Value of fuel consumption " + fuelConsumption +
                        " gallons per mile");
                System.out.println("We are going to Mars");

            }

            else {
                System.out.println("Sorry, you stay at home");
                System.out.println("You've got " + engine.getFuel() + " gallons of fuel");
                System.out.println("You should know " +
                        "value of fuel consumption in this case might be " +
                        fuelConsumption + " gallons per mile");

            }

        }

    }


}
